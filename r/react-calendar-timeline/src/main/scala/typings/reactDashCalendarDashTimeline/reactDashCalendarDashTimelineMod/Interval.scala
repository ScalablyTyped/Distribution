package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval extends js.Object {
  var endTime: Moment
  var startTime: Moment
}

object Interval {
  @scala.inline
  def apply(endTime: Moment, startTime: Moment): Interval = {
    val __obj = js.Dynamic.literal(endTime = endTime, startTime = startTime)
  
    __obj.asInstanceOf[Interval]
  }
}

