package typings.reactCalendarTimeline

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartTime extends js.Object {
  var endTime: Moment
  var startTime: Moment
}

object AnonStartTime {
  @scala.inline
  def apply(endTime: Moment, startTime: Moment): AnonStartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartTime]
  }
}

