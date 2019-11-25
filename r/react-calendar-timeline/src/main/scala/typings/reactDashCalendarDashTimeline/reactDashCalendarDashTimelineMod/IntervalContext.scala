package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.reactDashCalendarDashTimeline.Anon_EndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalContext extends js.Object {
  var interval: Anon_EndTime
  var intervalText: String
}

object IntervalContext {
  @scala.inline
  def apply(interval: Anon_EndTime, intervalText: String): IntervalContext = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], intervalText = intervalText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntervalContext]
  }
}

