package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDayEnd extends js.Object {
  var allDay: Boolean
  var end: stringOrDate
  var start: stringOrDate
}

object AllDayEnd {
  @scala.inline
  def apply(allDay: Boolean, end: stringOrDate, start: stringOrDate): AllDayEnd = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDayEnd]
  }
}

