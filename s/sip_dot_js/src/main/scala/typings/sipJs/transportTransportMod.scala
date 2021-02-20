package typings.sipJs

import typings.sipJs.coreMod.Logger
import typings.sipJs.transportOptionsMod.TransportOptions
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportTransportMod {
  
  @JSImport("sip.js/lib/platform/web/transport/transport", "Transport")
  @js.native
  class Transport protected ()
    extends typings.sipJs.transportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
    
    var _connect: js.Any = js.native
    
    var _disconnect: js.Any = js.native
    
    var _protocol: js.Any = js.native
    
    var _send: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _stateEventEmitter: js.Any = js.native
    
    var _ws: js.Any = js.native
    
    var clearKeepAliveTimeout: js.Any = js.native
    
    var configuration: js.Any = js.native
    
    var connectPromise: js.Any = js.native
    
    var connectReject: js.Any = js.native
    
    var connectResolve: js.Any = js.native
    
    var connectTimeout: js.Any = js.native
    
    var disconnectPromise: js.Any = js.native
    
    var disconnectReject: js.Any = js.native
    
    var disconnectResolve: js.Any = js.native
    
    var keepAliveDebounceTimeout: js.Any = js.native
    
    var keepAliveInterval: js.Any = js.native
    
    var logger: js.Any = js.native
    
    /**
      * WebSocket "onclose" event handler.
      * @param ev - Event.
      */
    var onWebSocketClose: js.Any = js.native
    
    /**
      * WebSocket "onerror" event handler.
      * @param ev - Event.
      */
    var onWebSocketError: js.Any = js.native
    
    /**
      * WebSocket "onmessage" event handler.
      * @param ev - Event.
      */
    var onWebSocketMessage: js.Any = js.native
    
    /**
      * WebSocket "onopen" event handler.
      * @param ev - Event.
      */
    var onWebSocketOpen: js.Any = js.native
    
    /**
      * Send a keep-alive (a double-CRLF sequence).
      */
    var sendKeepAlive: js.Any = js.native
    
    /**
      * The URL of the WebSocket Server.
      */
    def server: String = js.native
    
    /**
      * Start sending keep-alives.
      */
    var startSendingKeepAlives: js.Any = js.native
    
    /**
      * Stop sending keep-alives.
      */
    var stopSendingKeepAlives: js.Any = js.native
    
    /**
      * Helper function to generate an Error.
      * @param state - State transitioning to.
      */
    var transitionLoopDetectedError: js.Any = js.native
    
    /**
      * Transition transport state.
      * @internal
      */
    var transitionState: js.Any = js.native
    
    var transitioningState: js.Any = js.native
    
    /**
      * The WebSocket.
      */
    def ws: js.UndefOr[WebSocket] = js.native
  }
  /* static members */
  object Transport {
    
    @JSImport("sip.js/lib/platform/web/transport/transport", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web/transport/transport", "Transport.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
}
