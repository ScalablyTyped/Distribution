package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventProps[TEvent /* <: js.Object */] extends StObject {
  
  var event: TEvent
  
  var title: String
}
object EventProps {
  
  inline def apply[TEvent /* <: js.Object */](event: TEvent, title: String): EventProps[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventProps[TEvent]]
  }
  
  extension [Self <: EventProps[?], TEvent /* <: js.Object */](x: Self & EventProps[TEvent]) {
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
