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
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): Date[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date[TEvent]]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date[?], TEvent /* <: js.Object */] (val x: Self & Date[TEvent]) extends AnyVal {
    
    @scala.inline
    def setDate(value: ComponentType[js.Object]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEvent(value: ComponentType[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setTime(value: ComponentType[js.Object]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
