package typings.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  var agenda: js.UndefOr[String] = js.native
  var allDay: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var day: js.UndefOr[String] = js.native
  var event: js.UndefOr[String] = js.native
  var month: js.UndefOr[String] = js.native
  var next: js.UndefOr[String] = js.native
  var noEventsInRange: js.UndefOr[String] = js.native
  var previous: js.UndefOr[String] = js.native
  var showMore: js.UndefOr[js.Function1[/* count */ Double, String]] = js.native
  var time: js.UndefOr[String] = js.native
  var today: js.UndefOr[String] = js.native
  var tomorrow: js.UndefOr[String] = js.native
  var week: js.UndefOr[String] = js.native
  var work_week: js.UndefOr[String] = js.native
  var yesterday: js.UndefOr[String] = js.native
}

object Messages {
  @scala.inline
  def apply(): Messages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Messages]
  }
  @scala.inline
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
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
    def setAgenda(value: String): Self = this.set("agenda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgenda: Self = this.set("agenda", js.undefined)
    @scala.inline
    def setAllDay(value: String): Self = this.set("allDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setNoEventsInRange(value: String): Self = this.set("noEventsInRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEventsInRange: Self = this.set("noEventsInRange", js.undefined)
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    @scala.inline
    def setShowMore(value: /* count */ Double => String): Self = this.set("showMore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowMore: Self = this.set("showMore", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    @scala.inline
    def setTomorrow(value: String): Self = this.set("tomorrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTomorrow: Self = this.set("tomorrow", js.undefined)
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    @scala.inline
    def setWork_week(value: String): Self = this.set("work_week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWork_week: Self = this.set("work_week", js.undefined)
    @scala.inline
    def setYesterday(value: String): Self = this.set("yesterday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYesterday: Self = this.set("yesterday", js.undefined)
  }
  
}

