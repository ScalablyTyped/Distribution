package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragUpdate extends DragStart {
  // populated when a draggable is dragging over another in combine mode
  var combine: js.UndefOr[Combine] = js.undefined
  var destination: js.UndefOr[DraggableLocation] = js.undefined
}

object DragUpdate {
  @scala.inline
  def apply(
    draggableId: DraggableId,
    mode: MovementMode,
    source: DraggableLocation,
    `type`: TypeId,
    combine: Combine = null,
    destination: DraggableLocation = null
  ): DragUpdate = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (combine != null) __obj.updateDynamic("combine")(combine.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragUpdate]
  }
}

