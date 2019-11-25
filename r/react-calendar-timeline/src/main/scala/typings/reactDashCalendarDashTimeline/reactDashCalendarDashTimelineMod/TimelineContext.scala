package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineContext extends js.Object {
  var canvasTimeEnd: Double
  var canvasTimeStart: Double
  var timelineWidth: Double
  var visibleTimeEnd: Double
  var visibleTimeStart: Double
}

object TimelineContext {
  @scala.inline
  def apply(
    canvasTimeEnd: Double,
    canvasTimeStart: Double,
    timelineWidth: Double,
    visibleTimeEnd: Double,
    visibleTimeStart: Double
  ): TimelineContext = {
    val __obj = js.Dynamic.literal(canvasTimeEnd = canvasTimeEnd.asInstanceOf[js.Any], canvasTimeStart = canvasTimeStart.asInstanceOf[js.Any], timelineWidth = timelineWidth.asInstanceOf[js.Any], visibleTimeEnd = visibleTimeEnd.asInstanceOf[js.Any], visibleTimeStart = visibleTimeStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineContext]
  }
}

