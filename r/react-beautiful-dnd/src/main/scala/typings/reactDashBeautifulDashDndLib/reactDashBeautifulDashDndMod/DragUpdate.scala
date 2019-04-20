package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

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
    val __obj = js.Dynamic.literal(draggableId = draggableId, mode = mode, source = source)
    __obj.updateDynamic("type")(`type`)
    if (combine != null) __obj.updateDynamic("combine")(combine)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    __obj.asInstanceOf[DragUpdate]
  }
}

