package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTimeSteps extends js.Object {
  var day: Double
  var hour: Double
  var minute: Double
  var month: Double
  var second: Double
  var year: Double
}

object TimelineTimeSteps {
  @scala.inline
  def apply(day: Double, hour: Double, minute: Double, month: Double, second: Double, year: Double): TimelineTimeSteps = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, minute = minute, month = month, second = second, year = year)
  
    __obj.asInstanceOf[TimelineTimeSteps]
  }
}

