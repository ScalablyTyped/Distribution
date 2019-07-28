package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var end: Date
  var start: Date
}

object DateRange {
  @scala.inline
  def apply(end: Date, start: Date): DateRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[DateRange]
  }
}

