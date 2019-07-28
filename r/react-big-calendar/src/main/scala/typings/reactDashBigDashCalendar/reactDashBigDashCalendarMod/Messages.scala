package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  var agenda: js.UndefOr[String] = js.undefined
  var allDay: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var day: js.UndefOr[String] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var noEventsInRange: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
  var showMore: js.UndefOr[js.Function1[/* count */ Double, String]] = js.undefined
  var time: js.UndefOr[String] = js.undefined
  var today: js.UndefOr[String] = js.undefined
  var tomorrow: js.UndefOr[String] = js.undefined
  var week: js.UndefOr[String] = js.undefined
  var work_week: js.UndefOr[String] = js.undefined
  var yesterday: js.UndefOr[String] = js.undefined
}

object Messages {
  @scala.inline
  def apply(
    agenda: String = null,
    allDay: String = null,
    date: String = null,
    day: String = null,
    event: String = null,
    month: String = null,
    next: String = null,
    noEventsInRange: String = null,
    previous: String = null,
    showMore: /* count */ Double => String = null,
    time: String = null,
    today: String = null,
    tomorrow: String = null,
    week: String = null,
    work_week: String = null,
    yesterday: String = null
  ): Messages = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda)
    if (allDay != null) __obj.updateDynamic("allDay")(allDay)
    if (date != null) __obj.updateDynamic("date")(date)
    if (day != null) __obj.updateDynamic("day")(day)
    if (event != null) __obj.updateDynamic("event")(event)
    if (month != null) __obj.updateDynamic("month")(month)
    if (next != null) __obj.updateDynamic("next")(next)
    if (noEventsInRange != null) __obj.updateDynamic("noEventsInRange")(noEventsInRange)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (showMore != null) __obj.updateDynamic("showMore")(js.Any.fromFunction1(showMore))
    if (time != null) __obj.updateDynamic("time")(time)
    if (today != null) __obj.updateDynamic("today")(today)
    if (tomorrow != null) __obj.updateDynamic("tomorrow")(tomorrow)
    if (week != null) __obj.updateDynamic("week")(week)
    if (work_week != null) __obj.updateDynamic("work_week")(work_week)
    if (yesterday != null) __obj.updateDynamic("yesterday")(yesterday)
    __obj.asInstanceOf[Messages]
  }
}

