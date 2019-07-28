package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObject extends js.Object {
  var dateString: String
  var day: Double
  var month: Double
  var timestamp: Double
  var year: Double
}

object DateObject {
  @scala.inline
  def apply(dateString: String, day: Double, month: Double, timestamp: Double, year: Double): DateObject = {
    val __obj = js.Dynamic.literal(dateString = dateString, day = day, month = month, timestamp = timestamp, year = year)
  
    __obj.asInstanceOf[DateObject]
  }
}

