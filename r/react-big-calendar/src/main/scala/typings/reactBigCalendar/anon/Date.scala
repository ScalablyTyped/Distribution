package typings.reactBigCalendar.anon

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.EventProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date[TEvent /* <: js.Object */] extends StObject {
  
  var date: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.undefined
  
  var time: js.UndefOr[ComponentType[js.Object]] = js.undefined
}
object Date {
  
  inline def apply[TEvent /* <: js.Object */](): Date[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Date[?], TEvent /* <: js.Object */] (val x: Self & Date[TEvent]) extends AnyVal {
    
    inline def setDate(value: ComponentType[js.Object]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEvent(value: ComponentType[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setTime(value: ComponentType[js.Object]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
