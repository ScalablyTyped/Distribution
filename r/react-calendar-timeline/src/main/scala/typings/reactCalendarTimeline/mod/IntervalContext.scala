package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.AnonEndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalContext extends js.Object {
  var interval: AnonEndTime
  var intervalText: String
}

object IntervalContext {
  @scala.inline
  def apply(interval: AnonEndTime, intervalText: String): IntervalContext = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], intervalText = intervalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalContext]
  }
}

