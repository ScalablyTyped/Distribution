package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDay[TEvent /* <: js.Object */] extends js.Object {
  var allDay: Boolean = js.native
  var end: stringOrDate = js.native
  var event: TEvent = js.native
  var start: stringOrDate = js.native
}

object AllDay {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](allDay: Boolean, end: stringOrDate, event: TEvent, start: stringOrDate): AllDay[TEvent] = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDay[TEvent]]
  }
  @scala.inline
  implicit class AllDayOps[Self <: AllDay[_], /* <: js.Object */ TEvent] (val x: Self with AllDay[TEvent]) extends AnyVal {
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
    def setEvent(value: TEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: stringOrDate): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

