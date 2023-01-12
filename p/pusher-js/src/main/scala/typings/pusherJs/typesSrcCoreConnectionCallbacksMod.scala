package typings.pusherJs

import typings.pusherJs.typesSrcCoreConnectionHandshakeHandshakePayloadMod.HandshakePayload
import typings.pusherJs.typesSrcCoreConnectionProtocolActionMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionCallbacksMod {
  
  trait ConnectionCallbacks extends StObject {
    
    def activity(): Unit
    
    def closed(): Unit
    
    def error(error: Any): Unit
    
    def message(message: Any): Unit
    
    def ping(): Unit
  }
  object ConnectionCallbacks {
    
    inline def apply(
      activity: () => Unit,
      closed: () => Unit,
      error: Any => Unit,
      message: Any => Unit,
      ping: () => Unit
    ): ConnectionCallbacks = {
      val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), ping = js.Any.fromFunction0(ping))
      __obj.asInstanceOf[ConnectionCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionCallbacks] (val x: Self) extends AnyVal {
      
      inline def setActivity(value: () => Unit): Self = StObject.set(x, "activity", js.Any.fromFunction0(value))
      
      inline def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
      
      inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setMessage(value: Any => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setPing(value: () => Unit): Self = StObject.set(x, "ping", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ErrorCallbacks extends StObject {
    
    def backoff(result: HandshakePayload): Unit = js.native
    def backoff(result: Action): Unit = js.native
    
    def refused(result: HandshakePayload): Unit = js.native
    def refused(result: Action): Unit = js.native
    
    def retry(result: HandshakePayload): Unit = js.native
    def retry(result: Action): Unit = js.native
    
    def tls_only(result: HandshakePayload): Unit = js.native
    def tls_only(result: Action): Unit = js.native
  }
  
  trait HandshakeCallbacks extends StObject {
    
    def connected(handshake: HandshakePayload): Unit
  }
  object HandshakeCallbacks {
    
    inline def apply(connected: HandshakePayload => Unit): HandshakeCallbacks = {
      val __obj = js.Dynamic.literal(connected = js.Any.fromFunction1(connected))
      __obj.asInstanceOf[HandshakeCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandshakeCallbacks] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: HandshakePayload => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
    }
  }
}
