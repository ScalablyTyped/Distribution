package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketEventMap extends StObject {
  
  /* standard dom */
  var close: CloseEvent
  
  /* standard dom */
  var error: Event
  
  /* standard dom */
  var message: MessageEvent[Any]
  
  /* standard dom */
  var open: Event
}
object WebSocketEventMap {
  
  inline def apply(close: CloseEvent, error: Event, message: MessageEvent[Any], open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
    
    inline def setClose(value: CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
