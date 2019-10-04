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
    val __obj = js.Dynamic.literal(canvasTimeEnd = canvasTimeEnd, canvasTimeStart = canvasTimeStart, timelineWidth = timelineWidth, visibleTimeEnd = visibleTimeEnd, visibleTimeStart = visibleTimeStart)
  
    __obj.asInstanceOf[TimelineContext]
  }
}

