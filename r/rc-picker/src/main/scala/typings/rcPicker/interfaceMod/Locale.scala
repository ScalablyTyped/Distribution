package typings.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  var backToToday: String = js.native
  
  var clear: String = js.native
  
  var dateFormat: String = js.native
  
  var dateSelect: String = js.native
  
  var dateTimeFormat: String = js.native
  
  var dayFormat: String = js.native
  
  var decadeSelect: String = js.native
  
  var locale: String = js.native
  
  var month: String = js.native
  
  /** Display month before year in date panel header */
  var monthBeforeYear: js.UndefOr[Boolean] = js.native
  
  var monthFormat: js.UndefOr[String] = js.native
  
  var monthSelect: String = js.native
  
  var nextCentury: String = js.native
  
  var nextDecade: String = js.native
  
  var nextMonth: String = js.native
  
  var nextYear: String = js.native
  
  var now: String = js.native
  
  var ok: String = js.native
  
  var previousCentury: String = js.native
  
  var previousDecade: String = js.native
  
  var previousMonth: String = js.native
  
  var previousYear: String = js.native
  
  var quarterFormat: js.UndefOr[String] = js.native
  
  var shortMonths: js.UndefOr[js.Array[String]] = js.native
  
  var shortWeekDays: js.UndefOr[js.Array[String]] = js.native
  
  var timeSelect: String = js.native
  
  var today: String = js.native
  
  var weekSelect: js.UndefOr[String] = js.native
  
  var year: String = js.native
  
  var yearFormat: String = js.native
  
  var yearSelect: String = js.native
}
object Locale {
  
  @scala.inline
  def apply(
    backToToday: String,
    clear: String,
    dateFormat: String,
    dateSelect: String,
    dateTimeFormat: String,
    dayFormat: String,
    decadeSelect: String,
    locale: String,
    month: String,
    monthSelect: String,
    nextCentury: String,
    nextDecade: String,
    nextMonth: String,
    nextYear: String,
    now: String,
    ok: String,
    previousCentury: String,
    previousDecade: String,
    previousMonth: String,
    previousYear: String,
    timeSelect: String,
    today: String,
    year: String,
    yearFormat: String,
    yearSelect: String
  ): Locale = {
    val __obj = js.Dynamic.literal(backToToday = backToToday.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateSelect = dateSelect.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], dayFormat = dayFormat.asInstanceOf[js.Any], decadeSelect = decadeSelect.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthSelect = monthSelect.asInstanceOf[js.Any], nextCentury = nextCentury.asInstanceOf[js.Any], nextDecade = nextDecade.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], previousCentury = previousCentury.asInstanceOf[js.Any], previousDecade = previousDecade.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], previousYear = previousYear.asInstanceOf[js.Any], timeSelect = timeSelect.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any], yearSelect = yearSelect.asInstanceOf[js.Any])
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
    def setBackToToday(value: String): Self = this.set("backToToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateSelect(value: String): Self = this.set("dateSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeFormat(value: String): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayFormat(value: String): Self = this.set("dayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecadeSelect(value: String): Self = this.set("decadeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthSelect(value: String): Self = this.set("monthSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextCentury(value: String): Self = this.set("nextCentury", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextDecade(value: String): Self = this.set("nextDecade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMonth(value: String): Self = this.set("nextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextYear(value: String): Self = this.set("nextYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: String): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: String): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousCentury(value: String): Self = this.set("previousCentury", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousDecade(value: String): Self = this.set("previousDecade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousMonth(value: String): Self = this.set("previousMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousYear(value: String): Self = this.set("previousYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSelect(value: String): Self = this.set("timeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearFormat(value: String): Self = this.set("yearFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearSelect(value: String): Self = this.set("yearSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthBeforeYear(value: Boolean): Self = this.set("monthBeforeYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthBeforeYear: Self = this.set("monthBeforeYear", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    
    @scala.inline
    def setQuarterFormat(value: String): Self = this.set("quarterFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarterFormat: Self = this.set("quarterFormat", js.undefined)
    
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortMonths: Self = this.set("shortMonths", js.undefined)
    
    @scala.inline
    def setShortWeekDaysVarargs(value: String*): Self = this.set("shortWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setShortWeekDays(value: js.Array[String]): Self = this.set("shortWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortWeekDays: Self = this.set("shortWeekDays", js.undefined)
    
    @scala.inline
    def setWeekSelect(value: String): Self = this.set("weekSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekSelect: Self = this.set("weekSelect", js.undefined)
  }
}
