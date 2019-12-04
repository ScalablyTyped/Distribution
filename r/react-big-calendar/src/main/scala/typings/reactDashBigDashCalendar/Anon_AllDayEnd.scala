package typings.reactDashBigDashCalendar

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllDayEnd extends js.Object {
  var allDay: Boolean
  var end: stringOrDate
  var start: stringOrDate
}

object Anon_AllDayEnd {
  @scala.inline
  def apply(allDay: Boolean, end: stringOrDate, start: stringOrDate): Anon_AllDayEnd = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllDayEnd]
  }
}

