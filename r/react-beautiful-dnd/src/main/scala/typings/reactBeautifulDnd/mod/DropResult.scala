package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropResult extends DragUpdate {
  var reason: DropReason
}

object DropResult {
  @scala.inline
  def apply(
    draggableId: DraggableId,
    mode: MovementMode,
    reason: DropReason,
    source: DraggableLocation,
    `type`: TypeId,
    combine: Combine = null,
    destination: DraggableLocation = null
  ): DropResult = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (combine != null) __obj.updateDynamic("combine")(combine.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
}

