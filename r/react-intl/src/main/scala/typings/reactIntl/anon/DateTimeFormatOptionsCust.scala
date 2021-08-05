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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/ecma402-abstract.@formatjs/ecma402-abstract.DateTimeFormatOptions & @formatjs/intl.@formatjs/intl.CustomFormatConfig & {  value :string | number | std.Date | undefined} */
trait DateTimeFormatOptionsCust extends StObject {
  
  var calendar: js.UndefOr[
    buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
  ] = js.undefined
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var day: js.UndefOr[String] = js.undefined
  
  var era: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var formatMatcher: js.UndefOr[String] = js.undefined
  
  var fractionalSecondDigits: js.UndefOr[Double] = js.undefined
  
  var hour: js.UndefOr[String] = js.undefined
  
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
  
  var localeMatcher: js.UndefOr[String] = js.undefined
  
  var minute: js.UndefOr[String] = js.undefined
  
  var month: js.UndefOr[String] = js.undefined
  
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  var second: js.UndefOr[String] = js.undefined
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var timeZoneName: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | Double | Date] = js.undefined
  
  var weekday: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[String] = js.undefined
}
object DateTimeFormatOptionsCust {
  
  inline def apply(): DateTimeFormatOptionsCust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatOptionsCust]
  }
  
  extension [Self <: DateTimeFormatOptionsCust](x: Self) {
    
    inline def setCalendar(
      value: buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
    ): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
    
    inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcher(value: String): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFractionalSecondDigits(value: Double): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    inline def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setValue(value: String | Double | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
