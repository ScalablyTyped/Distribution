package typings.reactCalendarTimeline.anon

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTime extends js.Object {
  var endTime: Moment
  var startTime: Moment
}

object StartTime {
  @scala.inline
  def apply(endTime: Moment, startTime: Moment): StartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
}

