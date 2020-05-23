package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.EndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalContext extends js.Object {
  var interval: EndTime
  var intervalText: String
}

object IntervalContext {
  @scala.inline
  def apply(interval: EndTime, intervalText: String): IntervalContext = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], intervalText = intervalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalContext]
  }
}

