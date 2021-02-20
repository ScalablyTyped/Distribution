package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportOptionsMod {
  
  @js.native
  trait TransportOptions extends StObject {
    
    /**
      * Seconds to wait for WebSocket to connect before giving up.
      * @defaultValue `5`
      */
    var connectionTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Keep alive - needs review.
      * @internal
      */
    var keepAliveDebounce: js.UndefOr[Double] = js.native
    
    /**
      * Keep alive - needs review.
      * @internal
      */
    var keepAliveInterval: js.UndefOr[Double] = js.native
    
    /**
      * URL of WebSocket server to connect with. For example, "wss://localhost:8080".
      */
    var server: String = js.native
    
    /**
      * If true, messages sent and received by the transport are logged.
      * @defaultValue `true`
      */
    var traceSip: js.UndefOr[Boolean] = js.native
  }
  object TransportOptions {
    
    @scala.inline
    def apply(server: String): TransportOptions = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportOptions]
    }
    
    @scala.inline
    implicit class TransportOptionsMutableBuilder[Self <: TransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setKeepAliveDebounce(value: Double): Self = StObject.set(x, "keepAliveDebounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveDebounceUndefined: Self = StObject.set(x, "keepAliveDebounce", js.undefined)
      
      @scala.inline
      def setKeepAliveInterval(value: Double): Self = StObject.set(x, "keepAliveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveIntervalUndefined: Self = StObject.set(x, "keepAliveInterval", js.undefined)
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceSip(value: Boolean): Self = StObject.set(x, "traceSip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceSipUndefined: Self = StObject.set(x, "traceSip", js.undefined)
    }
  }
}
