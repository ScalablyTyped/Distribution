package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowFixedNumberOfWeeks extends StObject {
  
  var activeStartDate: js.Date
  
  var calendarType: typings.reactCalendar.distCjsSharedTypesMod.CalendarType
  
  var showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.undefined
  
  var showNeighboringMonth: js.UndefOr[Boolean] = js.undefined
}
object ShowFixedNumberOfWeeks {
  
  inline def apply(activeStartDate: js.Date, calendarType: typings.reactCalendar.distCjsSharedTypesMod.CalendarType): ShowFixedNumberOfWeeks = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowFixedNumberOfWeeks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowFixedNumberOfWeeks] (val x: Self) extends AnyVal {
    
    inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setCalendarType(value: typings.reactCalendar.distCjsSharedTypesMod.CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setShowFixedNumberOfWeeks(value: Boolean): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
    
    inline def setShowFixedNumberOfWeeksUndefined: Self = StObject.set(x, "showFixedNumberOfWeeks", js.undefined)
    
    inline def setShowNeighboringMonth(value: Boolean): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
    
    inline def setShowNeighboringMonthUndefined: Self = StObject.set(x, "showNeighboringMonth", js.undefined)
  }
}
