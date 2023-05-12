package typings.reactCalendar.anon

import typings.propTypes.mod.Requireable
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarType extends StObject {
  
  var calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]
  
  var formatShortWeekday: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatWeekday: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var locale: Requireable[String]
  
  var onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object CalendarType {
  
  inline def apply(
    calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US],
    formatShortWeekday: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatWeekday: Requireable[js.Function1[/* repeated */ Any, Any]],
    locale: Requireable[String],
    onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]]
  ): CalendarType = {
    val __obj = js.Dynamic.literal(calendarType = calendarType.asInstanceOf[js.Any], formatShortWeekday = formatShortWeekday.asInstanceOf[js.Any], formatWeekday = formatWeekday.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarType] (val x: Self) extends AnyVal {
    
    inline def setCalendarType(value: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setFormatShortWeekday(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatShortWeekday", value.asInstanceOf[js.Any])
    
    inline def setFormatWeekday(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatWeekday", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Requireable[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeave(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
  }
}
