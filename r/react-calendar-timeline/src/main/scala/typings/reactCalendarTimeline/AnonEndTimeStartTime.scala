package typings.reactCalendarTimeline

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndTimeStartTime extends js.Object {
  var endTime: Moment
  var startTime: Moment
}

object AnonEndTimeStartTime {
  @scala.inline
  def apply(endTime: Moment, startTime: Moment): AnonEndTimeStartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndTimeStartTime]
  }
}

