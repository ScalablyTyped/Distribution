package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventProps[TEvent /* <: js.Object */] extends StObject {
  
  var continuesAfter: Boolean
  
  var continuesPrior: Boolean
  
  var event: TEvent
  
  var isAllDay: Boolean
  
  var localizer: DateLocalizer
  
  var slotEnd: js.Date
  
  var slotStart: js.Date
  
  var title: String
}
object EventProps {
  
  inline def apply[TEvent /* <: js.Object */](
    continuesAfter: Boolean,
    continuesPrior: Boolean,
    event: TEvent,
    isAllDay: Boolean,
    localizer: DateLocalizer,
    slotEnd: js.Date,
    slotStart: js.Date,
    title: String
  ): EventProps[TEvent] = {
    val __obj = js.Dynamic.literal(continuesAfter = continuesAfter.asInstanceOf[js.Any], continuesPrior = continuesPrior.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isAllDay = isAllDay.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any], slotEnd = slotEnd.asInstanceOf[js.Any], slotStart = slotStart.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventProps[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventProps[?], TEvent /* <: js.Object */] (val x: Self & EventProps[TEvent]) extends AnyVal {
    
    inline def setContinuesAfter(value: Boolean): Self = StObject.set(x, "continuesAfter", value.asInstanceOf[js.Any])
    
    inline def setContinuesPrior(value: Boolean): Self = StObject.set(x, "continuesPrior", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    inline def setLocalizer(value: DateLocalizer): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
    
    inline def setSlotEnd(value: js.Date): Self = StObject.set(x, "slotEnd", value.asInstanceOf[js.Any])
    
    inline def setSlotStart(value: js.Date): Self = StObject.set(x, "slotStart", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
