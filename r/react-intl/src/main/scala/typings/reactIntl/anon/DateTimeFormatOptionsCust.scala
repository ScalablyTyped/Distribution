package typings.reactIntl.anon

import typings.reactIntl.reactIntlStrings.buddhist
import typings.reactIntl.reactIntlStrings.chinese
import typings.reactIntl.reactIntlStrings.coptic
import typings.reactIntl.reactIntlStrings.ethiopia
import typings.reactIntl.reactIntlStrings.ethiopic
import typings.reactIntl.reactIntlStrings.full
import typings.reactIntl.reactIntlStrings.gregory
import typings.reactIntl.reactIntlStrings.h11
import typings.reactIntl.reactIntlStrings.h12
import typings.reactIntl.reactIntlStrings.h23
import typings.reactIntl.reactIntlStrings.h24
import typings.reactIntl.reactIntlStrings.hebrew
import typings.reactIntl.reactIntlStrings.indian
import typings.reactIntl.reactIntlStrings.islamic
import typings.reactIntl.reactIntlStrings.iso8601
import typings.reactIntl.reactIntlStrings.japanese
import typings.reactIntl.reactIntlStrings.long
import typings.reactIntl.reactIntlStrings.medium
import typings.reactIntl.reactIntlStrings.persian
import typings.reactIntl.reactIntlStrings.roc
import typings.reactIntl.reactIntlStrings.short
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/ecma402-abstract.@formatjs/ecma402-abstract.DateTimeFormatOptions & @formatjs/intl.@formatjs/intl.CustomFormatConfig & {  value :string | number | std.Date | undefined} */
@js.native
trait DateTimeFormatOptionsCust extends js.Object {
  
  var calendar: js.UndefOr[
    buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
  ] = js.native
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var day: js.UndefOr[String] = js.native
  
  var era: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var formatMatcher: js.UndefOr[String] = js.native
  
  var fractionalSecondDigits: js.UndefOr[Double] = js.native
  
  var hour: js.UndefOr[String] = js.native
  
  var hour12: js.UndefOr[Boolean] = js.native
  
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.native
  
  var localeMatcher: js.UndefOr[String] = js.native
  
  var minute: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var numberingSystem: js.UndefOr[String] = js.native
  
  var second: js.UndefOr[String] = js.native
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var timeZoneName: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double | Date] = js.native
  
  var weekday: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object DateTimeFormatOptionsCust {
  
  @scala.inline
  def apply(): DateTimeFormatOptionsCust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatOptionsCust]
  }
  
  @scala.inline
  implicit class DateTimeFormatOptionsCustOps[Self <: DateTimeFormatOptionsCust] (val x: Self) extends AnyVal {
    
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
    def setCalendar(
      value: buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
    ): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setDateStyle(value: full | long | medium | short): Self = this.set("dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStyle: Self = this.set("dateStyle", js.undefined)
    
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setEra(value: String): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEra: Self = this.set("era", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatMatcher(value: String): Self = this.set("formatMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatMatcher: Self = this.set("formatMatcher", js.undefined)
    
    @scala.inline
    def setFractionalSecondDigits(value: Double): Self = this.set("fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFractionalSecondDigits: Self = this.set("fractionalSecondDigits", js.undefined)
    
    @scala.inline
    def setHour(value: String): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setHour12(value: Boolean): Self = this.set("hour12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour12: Self = this.set("hour12", js.undefined)
    
    @scala.inline
    def setHourCycle(value: h11 | h12 | h23 | h24): Self = this.set("hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourCycle: Self = this.set("hourCycle", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: String): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    
    @scala.inline
    def setMinute(value: String): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    
    @scala.inline
    def setSecond(value: String): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setTimeStyle(value: full | long | medium | short): Self = this.set("timeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStyle: Self = this.set("timeStyle", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneName(value: String): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneName: Self = this.set("timeZoneName", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWeekday(value: String): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
