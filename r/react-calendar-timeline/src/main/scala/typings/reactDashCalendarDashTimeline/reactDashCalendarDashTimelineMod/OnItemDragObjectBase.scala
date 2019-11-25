package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.move
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemDragObjectBase extends js.Object {
  var eventType: move | resize
  var itemId: Double
  var time: Double
}

object OnItemDragObjectBase {
  @scala.inline
  def apply(eventType: move | resize, itemId: Double, time: Double): OnItemDragObjectBase = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnItemDragObjectBase]
  }
}

