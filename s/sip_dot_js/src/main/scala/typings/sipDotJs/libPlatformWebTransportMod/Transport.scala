package typings.sipDotJs.libPlatformWebTransportMod

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libApiEmitterMod.Emitter
import typings.sipDotJs.libApiTransportDashStateMod.TransportState
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.sipDotJsStrings.connected
import typings.sipDotJs.sipDotJsStrings.connecting
import typings.sipDotJs.sipDotJsStrings.disconnected
import typings.sipDotJs.sipDotJsStrings.disconnecting
import typings.sipDotJs.sipDotJsStrings.message_
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web/transport", "Transport")
@js.native
class Transport protected ()
  extends EventEmitter
     with typings.sipDotJs.libApiTransportMod.Transport {
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
    * The transport protocol.
    *
    * @remarks
    * Formatted as defined for the Via header sent-protocol transport.
    * https://tools.ietf.org/html/rfc3261#section-20.42
    */
  /* CompleteClass */
  override val protocol: String = js.native
  /**
    * Send a keep-alive (a double-CRLF sequence).
    */
  var sendKeepAlive: js.Any = js.native
  /**
    * The URL of the WebSocket Server.
    */
  val server: String = js.native
  /**
    * Start sending keep-alives.
    */
  var startSendingKeepAlives: js.Any = js.native
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
  var stopSendingKeepAlives: js.Any = js.native
  /**
    * Helper function to generate an Error.
    * @param state State transitioning to.
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
  val ws: js.UndefOr[WebSocket] = js.native
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
    * userAgent.transport.stateChange.on(() => {
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
  /**
    * Add listener for connection events.
    * @deprecated Use `onConnected`, `onDisconnected` and/or `stateChange`.
    */
  @JSName("on")
  def on_connected(event: connected, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_disconnected(event: disconnected, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_disconnecting(event: disconnecting, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Add listener for message event.
    * @deprecated Use `onMessage`.
    */
  @JSName("on")
  def on_message(event: message_, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
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
}

/* static members */
@JSImport("sip.js/lib/platform/web/transport", "Transport")
@js.native
object Transport extends js.Object {
  var defaultOptions: js.Any = js.native
}

