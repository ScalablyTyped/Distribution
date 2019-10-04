package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.move
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
  def apply(eventType: move, itemId: Double, newGroupOrder: Double, time: Double): OnItemDragObjectMove = {
    val __obj = js.Dynamic.literal(eventType = eventType, itemId = itemId, newGroupOrder = newGroupOrder, time = time)
  
    __obj.asInstanceOf[OnItemDragObjectMove]
  }
}

