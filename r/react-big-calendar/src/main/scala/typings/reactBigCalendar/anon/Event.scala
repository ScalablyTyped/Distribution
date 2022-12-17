package typings.reactBigCalendar.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[TEvent /* <: js.Object */] extends StObject {
  
  var event: TEvent
  
  var style: CSSProperties
}
object Event {
  
  inline def apply[TEvent /* <: js.Object */](event: TEvent, style: CSSProperties): Event[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TEvent]]
  }
  
  extension [Self <: Event[?], TEvent /* <: js.Object */](x: Self & Event[TEvent]) {
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
