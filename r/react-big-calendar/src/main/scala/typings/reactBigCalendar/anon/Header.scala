package typings.reactBigCalendar.anon

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.EventProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header[TEvent /* <: js.Object */] extends StObject {
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.native
  
  var header: js.UndefOr[ComponentType[js.Object]] = js.native
}
object Header {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): Header[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Header[TEvent]]
  }
  
  @scala.inline
  implicit class HeaderMutableBuilder[Self <: Header[_], TEvent /* <: js.Object */] (val x: Self with Header[TEvent]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: ComponentType[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setHeader(value: ComponentType[js.Object]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
