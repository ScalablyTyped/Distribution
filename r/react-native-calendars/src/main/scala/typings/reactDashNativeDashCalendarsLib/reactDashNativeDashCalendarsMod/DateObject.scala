package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObject extends js.Object {
  var dateString: java.lang.String
  var day: scala.Double
  var month: scala.Double
  var timestamp: scala.Double
  var year: scala.Double
}

object DateObject {
  @scala.inline
  def apply(
    dateString: java.lang.String,
    day: scala.Double,
    month: scala.Double,
    timestamp: scala.Double,
    year: scala.Double
  ): DateObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dateString")(dateString)
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateObject]
  }
}

