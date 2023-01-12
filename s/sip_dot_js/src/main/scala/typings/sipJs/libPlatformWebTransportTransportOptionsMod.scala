package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebTransportTransportOptionsMod {
  
  trait TransportOptions extends StObject {
    
    /**
      * Seconds to wait for WebSocket to connect before giving up.
      * @defaultValue `5`
      */
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Keep alive - needs review.
      * @internal
      */
    var keepAliveDebounce: js.UndefOr[Double] = js.undefined
    
    /**
      * Keep alive - needs review.
      * @internal
      */
    var keepAliveInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * URL of WebSocket server to connect with. For example, "wss://localhost:8080".
      */
    var server: String
    
    /**
      * If true, messages sent and received by the transport are logged.
      * @defaultValue `true`
      */
    var traceSip: js.UndefOr[Boolean] = js.undefined
  }
  object TransportOptions {
    
    inline def apply(server: String): TransportOptions = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportOptions] (val x: Self) extends AnyVal {
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setKeepAliveDebounce(value: Double): Self = StObject.set(x, "keepAliveDebounce", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveDebounceUndefined: Self = StObject.set(x, "keepAliveDebounce", js.undefined)
      
      inline def setKeepAliveInterval(value: Double): Self = StObject.set(x, "keepAliveInterval", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveIntervalUndefined: Self = StObject.set(x, "keepAliveInterval", js.undefined)
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setTraceSip(value: Boolean): Self = StObject.set(x, "traceSip", value.asInstanceOf[js.Any])
      
      inline def setTraceSipUndefined: Self = StObject.set(x, "traceSip", js.undefined)
    }
  }
}
