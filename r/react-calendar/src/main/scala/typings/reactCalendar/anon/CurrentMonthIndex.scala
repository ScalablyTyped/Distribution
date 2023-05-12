package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentMonthIndex extends StObject {
  
  var calendarType: js.UndefOr[typings.reactCalendar.distCjsSharedTypesMod.CalendarType] = js.undefined
  
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  
  var currentMonthIndex: Double
  
  var formatDay: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
  
  var formatLongDate: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
}
object CurrentMonthIndex {
  
  inline def apply(currentMonthIndex: Double): CurrentMonthIndex = {
    val __obj = js.Dynamic.literal(currentMonthIndex = currentMonthIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMonthIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentMonthIndex] (val x: Self) extends AnyVal {
    
    inline def setCalendarType(value: typings.reactCalendar.distCjsSharedTypesMod.CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
    
    inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setCurrentMonthIndex(value: Double): Self = StObject.set(x, "currentMonthIndex", value.asInstanceOf[js.Any])
    
    inline def setFormatDay(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
    
    inline def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
    
    inline def setFormatLongDate(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatLongDate", js.Any.fromFunction2(value))
    
    inline def setFormatLongDateUndefined: Self = StObject.set(x, "formatLongDate", js.undefined)
  }
}
