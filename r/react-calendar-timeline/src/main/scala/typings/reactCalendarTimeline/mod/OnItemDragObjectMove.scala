package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.reactCalendarTimelineStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnItemDragObjectMove extends OnItemDragObjectBase {
  @JSName("eventType")
  var eventType_OnItemDragObjectMove: move = js.native
  var newGroupOrder: Double = js.native
}

object OnItemDragObjectMove {
  @scala.inline
  def apply(eventType: move, itemId: Id, newGroupOrder: Double, time: Double): OnItemDragObjectMove = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], newGroupOrder = newGroupOrder.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectMove]
  }
  @scala.inline
  implicit class OnItemDragObjectMoveOps[Self <: OnItemDragObjectMove] (val x: Self) extends AnyVal {
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
    def setEventType(value: move): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewGroupOrder(value: Double): Self = this.set("newGroupOrder", value.asInstanceOf[js.Any])
  }
  
}

