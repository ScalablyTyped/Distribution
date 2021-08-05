package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messages extends StObject {
  
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
  
  inline def apply(): Messages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Messages]
  }
  
  extension [Self <: Messages](x: Self) {
    
    inline def setAgenda(value: String): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
    
    inline def setAgendaUndefined: Self = StObject.set(x, "agenda", js.undefined)
    
    inline def setAllDay(value: String): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNoEventsInRange(value: String): Self = StObject.set(x, "noEventsInRange", value.asInstanceOf[js.Any])
    
    inline def setNoEventsInRangeUndefined: Self = StObject.set(x, "noEventsInRange", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setShowMore(value: /* count */ Double => String): Self = StObject.set(x, "showMore", js.Any.fromFunction1(value))
    
    inline def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    
    inline def setTomorrow(value: String): Self = StObject.set(x, "tomorrow", value.asInstanceOf[js.Any])
    
    inline def setTomorrowUndefined: Self = StObject.set(x, "tomorrow", js.undefined)
    
    inline def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    inline def setWork_week(value: String): Self = StObject.set(x, "work_week", value.asInstanceOf[js.Any])
    
    inline def setWork_weekUndefined: Self = StObject.set(x, "work_week", js.undefined)
    
    inline def setYesterday(value: String): Self = StObject.set(x, "yesterday", value.asInstanceOf[js.Any])
    
    inline def setYesterdayUndefined: Self = StObject.set(x, "yesterday", js.undefined)
  }
}
