package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

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
    val __obj = js.Dynamic.literal(draggableId = draggableId, mode = mode, reason = reason, source = source)
    __obj.updateDynamic("type")(`type`)
    if (combine != null) __obj.updateDynamic("combine")(combine)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    __obj.asInstanceOf[DropResult]
  }
}

