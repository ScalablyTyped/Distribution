package typings.std.Intl

import typings.std.stdNumbers.`1`
import typings.std.stdNumbers.`2`
import typings.std.stdNumbers.`3`
import typings.std.stdStrings.`best fit`
import typings.std.stdStrings.basic
import typings.std.stdStrings.full
import typings.std.stdStrings.h11
import typings.std.stdStrings.h12
import typings.std.stdStrings.h23
import typings.std.stdStrings.h24
import typings.std.stdStrings.long
import typings.std.stdStrings.medium
import typings.std.stdStrings.narrow
import typings.std.stdStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedDateTimeFormatOptions extends StObject {
  
  /* standard es5 */
  var calendar: String
  
  /* standard es2021.intl */
  var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  /* standard es5 */
  var day: js.UndefOr[String] = js.undefined
  
  /* standard es2021.intl */
  var dayPeriod: js.UndefOr[narrow | short | long] = js.undefined
  
  /* standard es5 */
  var era: js.UndefOr[String] = js.undefined
  
  /* standard es2021.intl */
  var formatMatcher: js.UndefOr[basic | (`best fit`)] = js.undefined
  
  /* standard es2021.intl */
  var fractionalSecondDigits: js.UndefOr[`1` | `2` | `3`] = js.undefined
  
  /* standard es5 */
  var hour: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  /* standard es2021.intl */
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
  
  /* standard es5 */
  var locale: String
  
  /* standard es5 */
  var minute: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var month: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var numberingSystem: String
  
  /* standard es5 */
  var second: js.UndefOr[String] = js.undefined
  
  /* standard es2021.intl */
  var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  /* standard es5 */
  var timeZone: String
  
  /* standard es5 */
  var timeZoneName: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var weekday: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var year: js.UndefOr[String] = js.undefined
}
object ResolvedDateTimeFormatOptions {
  
  inline def apply(calendar: String, locale: String, numberingSystem: String, timeZone: String): ResolvedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
  }
  
  extension [Self <: ResolvedDateTimeFormatOptions](x: Self) {
    
    inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
    
    inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayPeriod(value: narrow | short | long): Self = StObject.set(x, "dayPeriod", value.asInstanceOf[js.Any])
    
    inline def setDayPeriodUndefined: Self = StObject.set(x, "dayPeriod", js.undefined)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setFormatMatcher(value: basic | (`best fit`)): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    inline def setFractionalSecondDigits(value: `1` | `2` | `3`): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    inline def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
