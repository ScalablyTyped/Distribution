package typings.reactBigCalendar.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style[TEvent /* <: js.Object */] extends StObject {
  
  var event: TEvent
  
  var style: CSSProperties
}
object Style {
  
  inline def apply[TEvent /* <: js.Object */](event: TEvent, style: CSSProperties): Style[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style[TEvent]]
  }
  
  extension [Self <: Style[?], TEvent /* <: js.Object */](x: Self & Style[TEvent]) {
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
