package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceEventMap extends StObject {
  
  var error: Event
  
  var message: MessageEvent[js.Any]
  
  var open: Event
}
object EventSourceEventMap {
  
  @scala.inline
  def apply(error: Event, message: MessageEvent[js.Any], open: Event): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceEventMap]
  }
  
  @scala.inline
  implicit class EventSourceEventMapMutableBuilder[Self <: EventSourceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: MessageEvent[js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
