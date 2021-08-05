package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelEventMap extends StObject {
  
  var bufferedamountlow: Event
  
  var close: Event
  
  var error: RTCErrorEvent
  
  var message: MessageEvent[js.Any]
  
  var open: Event
}
object RTCDataChannelEventMap {
  
  inline def apply(
    bufferedamountlow: Event,
    close: Event,
    error: RTCErrorEvent,
    message: MessageEvent[js.Any],
    open: Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
  
  extension [Self <: RTCDataChannelEventMap](x: Self) {
    
    inline def setBufferedamountlow(value: Event): Self = StObject.set(x, "bufferedamountlow", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: RTCErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
