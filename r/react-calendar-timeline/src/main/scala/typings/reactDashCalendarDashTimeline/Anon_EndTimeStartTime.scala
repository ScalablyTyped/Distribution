package typings.reactDashCalendarDashTimeline

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndTimeStartTime extends js.Object {
  var endTime: Moment
  var startTime: Moment
}

object Anon_EndTimeStartTime {
  @scala.inline
  def apply(endTime: Moment, startTime: Moment): Anon_EndTimeStartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EndTimeStartTime]
  }
}

