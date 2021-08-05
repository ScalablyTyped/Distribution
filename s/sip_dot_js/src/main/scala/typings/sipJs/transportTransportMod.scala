package typings.sipJs

import typings.sipJs.coreMod.Logger
import typings.sipJs.emitterMod.Emitter
import typings.sipJs.transportOptionsMod.TransportOptions
import typings.sipJs.transportStateMod.TransportState
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportTransportMod {
  
  @JSImport("sip.js/lib/platform/web/transport/transport", "Transport")
  @js.native
  class Transport protected ()
    extends StObject
       with typings.sipJs.transportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
    
    /* private */ var _connect: js.Any = js.native
    
    /* private */ var _disconnect: js.Any = js.native
    
    /* private */ var _protocol: js.Any = js.native
    
    /* private */ var _send: js.Any = js.native
    
    /* private */ var _state: js.Any = js.native
    
    /* private */ var _stateEventEmitter: js.Any = js.native
    
    /* private */ var _ws: js.Any = js.native
    
    /* private */ var clearKeepAliveTimeout: js.Any = js.native
    
    /* private */ var configuration: js.Any = js.native
    
    /**
      * Connect to network.
      *
      * @remarks
      * ```txt
      * - If `state` is "Connecting", `state` MUST NOT transition before returning.
      * - If `state` is "Connected", `state` MUST NOT transition before returning.
      * - If `state` is "Disconnecting", `state` MUST transition to "Connecting" before returning.
      * - If `state` is "Disconnected" `state` MUST transition to "Connecting" before returning.
      * - The `state` MUST transition to "Connected" before resolving (assuming `state` is not already "Connected").
      * - The `state` MUST transition to "Disconnecting" or "Disconnected" before rejecting and MUST reject with an Error.
      * ```
      * Resolves when the transport connects. Rejects if transport fails to connect.
      * Rejects with {@link StateTransitionError} if a loop is detected.
      * In particular, callbacks and emitters MUST NOT call this method synchronously.
      */
    /* CompleteClass */
    override def connect(): js.Promise[Unit] = js.native
    
    /* private */ var connectPromise: js.Any = js.native
    
    /* private */ var connectReject: js.Any = js.native
    
    /* private */ var connectResolve: js.Any = js.native
    
    /* private */ var connectTimeout: js.Any = js.native
    
    /**
      * Disconnect from network.
      *
      * @remarks
      * ```txt
      * - If `state` is "Connecting", `state` MUST transition to "Disconnecting" before returning.
      * - If `state` is "Connected", `state` MUST transition to "Disconnecting" before returning.
      * - If `state` is "Disconnecting", `state` MUST NOT transition before returning.
      * - If `state` is "Disconnected", `state` MUST NOT transition before returning.
      * - The `state` MUST transition to "Disconnected" before resolving (assuming `state` is not already "Disconnected").
      * - The `state` MUST transition to "Connecting" or "Connected" before rejecting and MUST reject with an Error.
      * ```
      * Resolves when the transport disconnects. Rejects if transport fails to disconnect.
      * Rejects with {@link StateTransitionError} if a loop is detected.
      * In particular, callbacks and emitters MUST NOT call this method synchronously.
      */
    /* CompleteClass */
    override def disconnect(): js.Promise[Unit] = js.native
    
    /* private */ var disconnectPromise: js.Any = js.native
    
    /* private */ var disconnectReject: js.Any = js.native
    
    /* private */ var disconnectResolve: js.Any = js.native
    
    /**
      * Dispose.
      *
      * @remarks
      * When the `UserAgent` is disposed or stopped, this method is called.
      * The `UserAgent` MUST NOT continue to utilize the instance after calling this method.
      */
    /* CompleteClass */
    override def dispose(): js.Promise[Unit] = js.native
    
    /**
      * Returns true if the `state` equals "Connected".
      *
      * @remarks
      * This is equivalent to `state === TransportState.Connected`.
      * It is convenient. A common paradigm is, for example...
      *
      * @example
      * ```ts
      * // Monitor transport connectivity
      * userAgent.transport.stateChange.addListener(() => {
      *   if (userAgent.transport.isConnected()) {
      *     // handle transport connect
      *   } else {
      *     // handle transport disconnect
      *   }
      * });
      * ```
      */
    /* CompleteClass */
    override def isConnected(): Boolean = js.native
    
    /* private */ var keepAliveDebounceTimeout: js.Any = js.native
    
    /* private */ var keepAliveInterval: js.Any = js.native
    
    /* private */ var logger: js.Any = js.native
    
    /**
      * WebSocket "onclose" event handler.
      * @param ev - Event.
      */
    /* private */ var onWebSocketClose: js.Any = js.native
    
    /**
      * WebSocket "onerror" event handler.
      * @param ev - Event.
      */
    /* private */ var onWebSocketError: js.Any = js.native
    
    /**
      * WebSocket "onmessage" event handler.
      * @param ev - Event.
      */
    /* private */ var onWebSocketMessage: js.Any = js.native
    
    /**
      * WebSocket "onopen" event handler.
      * @param ev - Event.
      */
    /* private */ var onWebSocketOpen: js.Any = js.native
    
    /**
      * The transport protocol.
      *
      * @remarks
      * Formatted as defined for the Via header sent-protocol transport.
      * https://tools.ietf.org/html/rfc3261#section-20.42
      */
    /* CompleteClass */
    override val protocol: String = js.native
    
    /**
      * Send a message.
      *
      * @remarks
      * Resolves once message is sent. Otherwise rejects with an Error.
      *
      * @param message - Message to send.
      */
    /* CompleteClass */
    override def send(message: String): js.Promise[Unit] = js.native
    
    /**
      * Send a keep-alive (a double-CRLF sequence).
      */
    /* private */ var sendKeepAlive: js.Any = js.native
    
    /**
      * The URL of the WebSocket Server.
      */
    def server: String = js.native
    
    /**
      * Start sending keep-alives.
      */
    /* private */ var startSendingKeepAlives: js.Any = js.native
    
    /**
      * Transport state.
      *
      * @remarks
      * The initial Transport state MUST be "disconnected" (after calling constructor).
      */
    /* CompleteClass */
    override val state: TransportState = js.native
    
    /**
      * Transport state change emitter.
      */
    /* CompleteClass */
    override val stateChange: Emitter[TransportState] = js.native
    
    /**
      * Stop sending keep-alives.
      */
    /* private */ var stopSendingKeepAlives: js.Any = js.native
    
    /**
      * Helper function to generate an Error.
      * @param state - State transitioning to.
      */
    /* private */ var transitionLoopDetectedError: js.Any = js.native
    
    /**
      * Transition transport state.
      * @internal
      */
    /* private */ var transitionState: js.Any = js.native
    
    /* private */ var transitioningState: js.Any = js.native
    
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
    inline def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
}
