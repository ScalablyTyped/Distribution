package typings.reactabularDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndMoveEvent extends js.Object {
  var sourceLabel: String = js.native
  var targetLabel: String = js.native
}

object DndMoveEvent {
  @scala.inline
  def apply(sourceLabel: String, targetLabel: String): DndMoveEvent = {
    val __obj = js.Dynamic.literal(sourceLabel = sourceLabel.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DndMoveEvent]
  }
  @scala.inline
  implicit class DndMoveEventOps[Self <: DndMoveEvent] (val x: Self) extends AnyVal {
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
    def setSourceLabel(value: String): Self = this.set("sourceLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetLabel(value: String): Self = this.set("targetLabel", value.asInstanceOf[js.Any])
  }
  
}

