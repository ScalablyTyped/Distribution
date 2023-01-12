package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var MozWebSocket: Any
  
  var SockJS: Any
  
  var WebSocket: Any
  
  var XMLHttpRequest: Any
  
  var attachEvent: Any
  
  var detachEvent: Any
}
object Window {
  
  inline def apply(
    MozWebSocket: Any,
    SockJS: Any,
    WebSocket: Any,
    XMLHttpRequest: Any,
    attachEvent: Any,
    detachEvent: Any
  ): Window = {
    val __obj = js.Dynamic.literal(MozWebSocket = MozWebSocket.asInstanceOf[js.Any], SockJS = SockJS.asInstanceOf[js.Any], WebSocket = WebSocket.asInstanceOf[js.Any], XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any], attachEvent = attachEvent.asInstanceOf[js.Any], detachEvent = detachEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setAttachEvent(value: Any): Self = StObject.set(x, "attachEvent", value.asInstanceOf[js.Any])
    
    inline def setDetachEvent(value: Any): Self = StObject.set(x, "detachEvent", value.asInstanceOf[js.Any])
    
    inline def setMozWebSocket(value: Any): Self = StObject.set(x, "MozWebSocket", value.asInstanceOf[js.Any])
    
    inline def setSockJS(value: Any): Self = StObject.set(x, "SockJS", value.asInstanceOf[js.Any])
    
    inline def setWebSocket(value: Any): Self = StObject.set(x, "WebSocket", value.asInstanceOf[js.Any])
    
    inline def setXMLHttpRequest(value: Any): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
  }
}
