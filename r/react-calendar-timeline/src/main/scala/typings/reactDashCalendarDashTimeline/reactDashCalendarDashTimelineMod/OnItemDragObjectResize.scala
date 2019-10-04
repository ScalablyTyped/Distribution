package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.resize
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemDragObjectResize extends OnItemDragObjectBase {
  var edge: js.UndefOr[left | right] = js.undefined
  @JSName("eventType")
  var eventType_OnItemDragObjectResize: resize
}

object OnItemDragObjectResize {
  @scala.inline
  def apply(eventType: resize, itemId: Double, time: Double, edge: left | right = null): OnItemDragObjectResize = {
    val __obj = js.Dynamic.literal(eventType = eventType, itemId = itemId, time = time)
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectResize]
  }
}

