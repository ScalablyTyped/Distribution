package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAllDay[TEvent /* <: js.Object */] extends StObject {
  
  var end: stringOrDate
  
  var event: TEvent
  
  var isAllDay: Boolean
  
  var start: stringOrDate
}
object IsAllDay {
  
  inline def apply[TEvent /* <: js.Object */](end: stringOrDate, event: TEvent, isAllDay: Boolean, start: stringOrDate): IsAllDay[TEvent] = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isAllDay = isAllDay.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAllDay[TEvent]]
  }
  
  extension [Self <: IsAllDay[?], TEvent /* <: js.Object */](x: Self & IsAllDay[TEvent]) {
    
    inline def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    inline def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
