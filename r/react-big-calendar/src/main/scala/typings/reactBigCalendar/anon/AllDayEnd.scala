package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDayEnd extends js.Object {
  var allDay: Boolean = js.native
  var end: stringOrDate = js.native
  var start: stringOrDate = js.native
}

object AllDayEnd {
  @scala.inline
  def apply(allDay: Boolean, end: stringOrDate, start: stringOrDate): AllDayEnd = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDayEnd]
  }
  @scala.inline
  implicit class AllDayEndOps[Self <: AllDayEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllDay(value: Boolean): Self = this.set("allDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: stringOrDate): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: stringOrDate): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

