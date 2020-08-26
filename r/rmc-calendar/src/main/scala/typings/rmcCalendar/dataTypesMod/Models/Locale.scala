package typings.rmcCalendar.dataTypesMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var am: String = js.native
  var begin: String = js.native
  var begin_over: String = js.native
  var clear: String = js.native
  var confirm: String = js.native
  var dateFormat: String = js.native
  var dateTimeFormat: String = js.native
  var end: String = js.native
  var lastMonth: String = js.native
  var lastWeek: String = js.native
  var loadPrevMonth: String = js.native
  var month: String = js.native
  var monthTitle: String = js.native
  var noChoose: String = js.native
  var over: String = js.native
  var pm: String = js.native
  var selectEndTime: String = js.native
  var selectStartTime: String = js.native
  var selectTime: String = js.native
  var start: String = js.native
  var title: String = js.native
  var today: String = js.native
  var week: js.Array[String] = js.native
  var year: String = js.native
  var yesterday: String = js.native
}

object Locale {
  @scala.inline
  def apply(
    am: String,
    begin: String,
    begin_over: String,
    clear: String,
    confirm: String,
    dateFormat: String,
    dateTimeFormat: String,
    end: String,
    lastMonth: String,
    lastWeek: String,
    loadPrevMonth: String,
    month: String,
    monthTitle: String,
    noChoose: String,
    over: String,
    pm: String,
    selectEndTime: String,
    selectStartTime: String,
    selectTime: String,
    start: String,
    title: String,
    today: String,
    week: js.Array[String],
    year: String,
    yesterday: String
  ): Locale = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], begin_over = begin_over.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lastMonth = lastMonth.asInstanceOf[js.Any], lastWeek = lastWeek.asInstanceOf[js.Any], loadPrevMonth = loadPrevMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthTitle = monthTitle.asInstanceOf[js.Any], noChoose = noChoose.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], selectEndTime = selectEndTime.asInstanceOf[js.Any], selectStartTime = selectStartTime.asInstanceOf[js.Any], selectTime = selectTime.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yesterday = yesterday.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def setAm(value: String): Self = this.set("am", value.asInstanceOf[js.Any])
    @scala.inline
    def setBegin(value: String): Self = this.set("begin", value.asInstanceOf[js.Any])
    @scala.inline
    def setBegin_over(value: String): Self = this.set("begin_over", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirm(value: String): Self = this.set("confirm", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTimeFormat(value: String): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastMonth(value: String): Self = this.set("lastMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastWeek(value: String): Self = this.set("lastWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadPrevMonth(value: String): Self = this.set("loadPrevMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthTitle(value: String): Self = this.set("monthTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoChoose(value: String): Self = this.set("noChoose", value.asInstanceOf[js.Any])
    @scala.inline
    def setOver(value: String): Self = this.set("over", value.asInstanceOf[js.Any])
    @scala.inline
    def setPm(value: String): Self = this.set("pm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectEndTime(value: String): Self = this.set("selectEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectStartTime(value: String): Self = this.set("selectStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectTime(value: String): Self = this.set("selectTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekVarargs(value: String*): Self = this.set("week", js.Array(value :_*))
    @scala.inline
    def setWeek(value: js.Array[String]): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def setYesterday(value: String): Self = this.set("yesterday", value.asInstanceOf[js.Any])
  }
  
}

