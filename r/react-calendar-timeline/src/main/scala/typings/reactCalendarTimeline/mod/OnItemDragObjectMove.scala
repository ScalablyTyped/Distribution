package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.reactCalendarTimelineStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemDragObjectMove extends OnItemDragObjectBase {
  @JSName("eventType")
  var eventType_OnItemDragObjectMove: move
  var newGroupOrder: Double
}

object OnItemDragObjectMove {
  @scala.inline
  def apply(eventType: move, itemId: Id, newGroupOrder: Double, time: Double): OnItemDragObjectMove = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], newGroupOrder = newGroupOrder.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnItemDragObjectMove]
  }
}

