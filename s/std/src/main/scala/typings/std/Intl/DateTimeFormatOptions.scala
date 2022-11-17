package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeFormatOptions extends StObject {
  
  /* standard es2020.intl */
  var calendar: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  /* standard es2021.intl */
  var dateStyle: js.UndefOr["full" | "long" | "medium" | "short"] = js.undefined
  
  /* standard es5 */
  var day: js.UndefOr["numeric" | "2-digit"] = js.undefined
  
  /* standard es2020.intl */
  /* standard es2021.intl */
  var dayPeriod: js.UndefOr["narrow" | "short" | "long"] = js.undefined
  
  /* standard es5 */
  var era: js.UndefOr["long" | "short" | "narrow"] = js.undefined
  
  /* standard es5 */
  /* standard es2021.intl */
  var formatMatcher: (js.UndefOr[("best fit") | "basic"]) & (js.UndefOr["basic" | ("best fit")])
  
  /* standard es2021.intl */
  var fractionalSecondDigits: js.UndefOr[1 | 2 | 3] = js.undefined
  
  /* standard es5 */
  var hour: js.UndefOr["numeric" | "2-digit"] = js.undefined
  
  /* standard es5 */
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  /* standard es2020.intl */
  var hourCycle: js.UndefOr["h11" | "h12" | "h23" | "h24"] = js.undefined
  
  /* standard es5 */
  var localeMatcher: js.UndefOr[("best fit") | "lookup"] = js.undefined
  
  /* standard es5 */
  var minute: js.UndefOr["numeric" | "2-digit"] = js.undefined
  
  /* standard es5 */
  var month: js.UndefOr["numeric" | "2-digit" | "long" | "short" | "narrow"] = js.undefined
  
  /* standard es2020.intl */
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var second: js.UndefOr["numeric" | "2-digit"] = js.undefined
  
  /* standard es2020.intl */
  /* standard es2021.intl */
  var timeStyle: js.UndefOr["full" | "long" | "medium" | "short"] = js.undefined
  
  /* standard es5 */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var timeZoneName: js.UndefOr["short" | "long" | "shortOffset" | "longOffset" | "shortGeneric" | "longGeneric"] = js.undefined
  
  /* standard es5 */
  var weekday: js.UndefOr["long" | "short" | "narrow"] = js.undefined
  
  /* standard es5 */
  var year: js.UndefOr["numeric" | "2-digit"] = js.undefined
}
object DateTimeFormatOptions {
  
  inline def apply(formatMatcher: (js.UndefOr[("best fit") | "basic"]) & (js.UndefOr["basic" | ("best fit")])): DateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(formatMatcher = formatMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatOptions]
  }
  
  extension [Self <: DateTimeFormatOptions](x: Self) {
    
    inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setDateStyle(value: "full" | "long" | "medium" | "short"): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
    
    inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
    
    inline def setDay(value: "numeric" | "2-digit"): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayPeriod(value: "narrow" | "short" | "long"): Self = StObject.set(x, "dayPeriod", value.asInstanceOf[js.Any])
    
    inline def setDayPeriodUndefined: Self = StObject.set(x, "dayPeriod", js.undefined)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: "long" | "short" | "narrow"): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setFormatMatcher(value: (js.UndefOr[("best fit") | "basic"]) & (js.UndefOr["basic" | ("best fit")])): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFractionalSecondDigits(value: 1 | 2 | 3): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
    
    inline def setHour(value: "numeric" | "2-digit"): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    inline def setHourCycle(value: "h11" | "h12" | "h23" | "h24"): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setLocaleMatcher(value: ("best fit") | "lookup"): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setMinute(value: "numeric" | "2-digit"): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: "numeric" | "2-digit" | "long" | "short" | "narrow"): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setSecond(value: "numeric" | "2-digit"): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeStyle(value: "full" | "long" | "medium" | "short"): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneName(value: "short" | "long" | "shortOffset" | "longOffset" | "shortGeneric" | "longGeneric"): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setWeekday(value: "long" | "short" | "narrow"): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: "numeric" | "2-digit"): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
