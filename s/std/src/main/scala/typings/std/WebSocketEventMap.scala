package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketEventMap extends StObject {
  
  var close: CloseEvent = js.native
  
  var error: Event = js.native
  
  var message: MessageEvent[_] = js.native
  
  var open: Event = js.native
}
object WebSocketEventMap {
  
  @scala.inline
  def apply(close: CloseEvent, error: Event, message: MessageEvent[_], open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
  
  @scala.inline
  implicit class WebSocketEventMapMutableBuilder[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: MessageEvent[_]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
