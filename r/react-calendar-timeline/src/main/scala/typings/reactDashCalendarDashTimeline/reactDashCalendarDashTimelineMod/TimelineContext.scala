package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineContext extends js.Object {
  var timelineWidth: Double
  var visibleTimeEnd: Double
  var visibletimeStart: Double
}

object TimelineContext {
  @scala.inline
  def apply(timelineWidth: Double, visibleTimeEnd: Double, visibletimeStart: Double): TimelineContext = {
    val __obj = js.Dynamic.literal(timelineWidth = timelineWidth, visibleTimeEnd = visibleTimeEnd, visibletimeStart = visibletimeStart)
  
    __obj.asInstanceOf[TimelineContext]
  }
}

