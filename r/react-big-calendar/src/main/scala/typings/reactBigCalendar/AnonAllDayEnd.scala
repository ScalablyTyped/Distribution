package typings.reactBigCalendar

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllDayEnd extends js.Object {
  var allDay: Boolean
  var end: stringOrDate
  var start: stringOrDate
}

object AnonAllDayEnd {
  @scala.inline
  def apply(allDay: Boolean, end: stringOrDate, start: stringOrDate): AnonAllDayEnd = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllDayEnd]
  }
}

