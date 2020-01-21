package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemDragObjectBase extends js.Object {
  var eventType: move | resize
  var itemId: Id
  var time: Double
}

object OnItemDragObjectBase {
  @scala.inline
  def apply(eventType: move | resize, itemId: Id, time: Double): OnItemDragObjectBase = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnItemDragObjectBase]
  }
}

