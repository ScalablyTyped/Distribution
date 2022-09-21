package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeMod {
  
  @JSImport("pusher-js/types/src/core/connection/handshake", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Handshake {
    def this(
      transport: typings.pusherJs.transportConnectionMod.default,
      callback: js.Function1[/* HandshakePayload */ Any, Unit]
    ) = this()
    
    /* private */ /* CompleteClass */
    var bindListeners: Any = js.native
    
    /* CompleteClass */
    override def callback(HandshakePayload: Any): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var finish: Any = js.native
    
    /* CompleteClass */
    var onClosed: js.Function = js.native
    
    /* CompleteClass */
    var onMessage: js.Function = js.native
    
    /* CompleteClass */
    var transport: typings.pusherJs.transportConnectionMod.default = js.native
    
    /* private */ /* CompleteClass */
    var unbindListeners: Any = js.native
  }
  
  trait Handshake extends StObject {
    
    /* private */ var bindListeners: Any
    
    def callback(HandshakePayload: Any): Unit
    
    def close(): Unit
    
    /* private */ var finish: Any
    
    var onClosed: js.Function
    
    var onMessage: js.Function
    
    var transport: typings.pusherJs.transportConnectionMod.default
    
    /* private */ var unbindListeners: Any
  }
  object Handshake {
    
    inline def apply(
      bindListeners: Any,
      callback: Any => Unit,
      close: () => Unit,
      finish: Any,
      onClosed: js.Function,
      onMessage: js.Function,
      transport: typings.pusherJs.transportConnectionMod.default,
      unbindListeners: Any
    ): Handshake = {
      val __obj = js.Dynamic.literal(bindListeners = bindListeners.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), close = js.Any.fromFunction0(close), finish = finish.asInstanceOf[js.Any], onClosed = onClosed.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], unbindListeners = unbindListeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handshake]
    }
    
    extension [Self <: Handshake](x: Self) {
      
      inline def setBindListeners(value: Any): Self = StObject.set(x, "bindListeners", value.asInstanceOf[js.Any])
      
      inline def setCallback(value: Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setFinish(value: Any): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setOnClosed(value: js.Function): Self = StObject.set(x, "onClosed", value.asInstanceOf[js.Any])
      
      inline def setOnMessage(value: js.Function): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: typings.pusherJs.transportConnectionMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setUnbindListeners(value: Any): Self = StObject.set(x, "unbindListeners", value.asInstanceOf[js.Any])
    }
  }
}
