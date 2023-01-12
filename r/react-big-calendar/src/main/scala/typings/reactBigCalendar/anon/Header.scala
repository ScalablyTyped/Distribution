package typings.reactBigCalendar.anon

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.EventProps
import typings.reactBigCalendar.mod.HeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header[TEvent /* <: js.Object */] extends StObject {
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.undefined
  
  var header: js.UndefOr[ComponentType[HeaderProps]] = js.undefined
}
object Header {
  
  inline def apply[TEvent /* <: js.Object */](): Header[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Header[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Header[?], TEvent /* <: js.Object */] (val x: Self & Header[TEvent]) extends AnyVal {
    
    inline def setEvent(value: ComponentType[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHeader(value: ComponentType[HeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
