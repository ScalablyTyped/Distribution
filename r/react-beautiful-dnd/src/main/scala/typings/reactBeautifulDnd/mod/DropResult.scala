package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropResult extends DragUpdate {
  var reason: DropReason = js.native
}

object DropResult {
  @scala.inline
  def apply(
    draggableId: DraggableId,
    mode: MovementMode,
    reason: DropReason,
    source: DraggableLocation,
    `type`: TypeId
  ): DropResult = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
  @scala.inline
  implicit class DropResultOps[Self <: DropResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReason(value: DropReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

