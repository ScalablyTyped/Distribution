package typings.reactBigCalendar.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[TEvent /* <: js.Object */] extends StObject {
  
  var event: TEvent = js.native
  
  var style: CSSProperties = js.native
}
object Event {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](event: TEvent, style: CSSProperties): Event[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TEvent]]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event[_], TEvent /* <: js.Object */] (val x: Self with Event[TEvent]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
