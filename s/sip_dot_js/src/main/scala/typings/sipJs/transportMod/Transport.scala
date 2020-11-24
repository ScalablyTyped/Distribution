package typings.sipJs.transportMod

import typings.sipJs.emitterMod.Emitter
import typings.sipJs.transportStateMod.TransportState
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport
  extends typings.sipJs.coreTransportMod.Transport {
  
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
  def connect(): js.Promise[Unit] = js.native
  
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
  def disconnect(): js.Promise[Unit] = js.native
  
  /**
    * Dispose.
    *
    * @remarks
    * When the `UserAgent` is disposed or stopped, this method is called.
    * The `UserAgent` MUST NOT continue to utilize the instance after calling this method.
    */
  def dispose(): js.Promise[Unit] = js.native
  
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
  def isConnected(): Boolean = js.native
  
  /**
    * Callback on state transition to "Connected".
    *
    * @remarks
    * When the `UserAgent` is constructed, this property is set.
    * ```txt
    * - The `state` MUST be "Connected" when called.
    * ```
    */
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback on state transition from "Connected".
    *
    * @remarks
    * When the `UserAgent` is constructed, this property is set.
    * ```txt
    * - The `state` MUST NOT "Connected" when called.
    * - If prior `state` is "Connecting" or "Connected", `error` MUST be defined.
    * - If prior `state` is "Disconnecting", `error` MUST NOT be undefined.
    * ```
    * If the transition from "Connected" occurs because the transport
    * user requested it by calling `disconnect`, then `error` will be undefined.
    * Otherwise `error` will be defined to provide an indication that the
    * transport initiated the transition from "Connected" - for example,
    * perhaps network connectivity was lost.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], Unit]] = js.native
  
  /**
    * Callback on receipt of a message.
    *
    * @remarks
    * When the `UserAgent` is constructed, this property is set.
    * The `state` MUST be "Connected" when this is called.
    */
  var onMessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  /**
    * Transport state.
    *
    * @remarks
    * The initial Transport state MUST be "disconnected" (after calling constructor).
    */
  val state: TransportState = js.native
  
  /**
    * Transport state change emitter.
    */
  val stateChange: Emitter[TransportState] = js.native
}
object Transport {
  
  @scala.inline
  def apply(
    connect: () => js.Promise[Unit],
    disconnect: () => js.Promise[Unit],
    dispose: () => js.Promise[Unit],
    isConnected: () => Boolean,
    protocol: String,
    send: String => js.Promise[Unit],
    state: TransportState,
    stateChange: Emitter[TransportState]
  ): Transport = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), dispose = js.Any.fromFunction0(dispose), isConnected = js.Any.fromFunction0(isConnected), protocol = protocol.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), state = state.asInstanceOf[js.Any], stateChange = stateChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnect(value: () => js.Promise[Unit]): Self = this.set("connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisconnect(value: () => js.Promise[Unit]): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => js.Promise[Unit]): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = this.set("isConnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: TransportState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChange(value: Emitter[TransportState]): Self = this.set("stateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnConnect(value: () => Unit): Self = this.set("onConnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    
    @scala.inline
    def setOnDisconnect(value: /* error */ js.UndefOr[Error] => Unit): Self = this.set("onDisconnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDisconnect: Self = this.set("onDisconnect", js.undefined)
    
    @scala.inline
    def setOnMessage(value: /* message */ String => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
  }
}
