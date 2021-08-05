package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDay[TEvent /* <: js.Object */] extends StObject {
  
  var allDay: Boolean
  
  var end: stringOrDate
  
  var event: TEvent
  
  var start: stringOrDate
}
object AllDay {
  
  inline def apply[TEvent /* <: js.Object */](allDay: Boolean, end: stringOrDate, event: TEvent, start: stringOrDate): AllDay[TEvent] = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDay[TEvent]]
  }
  
  extension [Self <: AllDay[?], TEvent /* <: js.Object */](x: Self & AllDay[TEvent]) {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
