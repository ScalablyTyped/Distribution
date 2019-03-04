package typings
package reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTimeSteps extends js.Object {
  var day: scala.Double
  var hour: scala.Double
  var minute: scala.Double
  var month: scala.Double
  var second: scala.Double
  var year: scala.Double
}

object TimelineTimeSteps {
  @scala.inline
  def apply(
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    month: scala.Double,
    second: scala.Double,
    year: scala.Double
  ): TimelineTimeSteps = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, minute = minute, month = month, second = second, year = year)
  
    __obj.asInstanceOf[TimelineTimeSteps]
  }
}

