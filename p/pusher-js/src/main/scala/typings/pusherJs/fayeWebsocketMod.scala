package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fayeWebsocketMod {
  
  @JSImport("faye-websocket", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(url: String) = this()
    
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, reason: String): Unit = js.native
    def close(code: Unit, reason: String): Unit = js.native
    
    def onclose(event: CloseEvent): Unit = js.native
    
    def onmessage(event: MessageEvent): Unit = js.native
    
    def onopen(): Unit = js.native
    
    def send(data: String): Unit = js.native
  }
  
  trait CloseEvent extends StObject {
    
    var code: Double
    
    var reason: String
    
    var wasClean: Boolean
  }
  object CloseEvent {
    
    inline def apply(code: Double, reason: String, wasClean: Boolean): CloseEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEvent] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageEvent extends StObject {
    
    var data: Any
  }
  object MessageEvent {
    
    inline def apply(data: Any): MessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
