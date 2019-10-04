package typings.sipDotJs.libApiRegistererMod

import typings.sipDotJs.libApiEmitterMod.Emitter
import typings.sipDotJs.libApiRegistererDashOptionsMod.RegistererOptions
import typings.sipDotJs.libApiRegistererDashRegisterDashOptionsMod.RegistererRegisterOptions
import typings.sipDotJs.libApiRegistererDashStateMod.RegistererState
import typings.sipDotJs.libApiRegistererDashUnregisterDashOptionsMod.RegistererUnregisterOptions
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import typings.sipDotJs.libCoreMessagesMethodsRegisterMod.OutgoingRegisterRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/registerer", "Registerer")
@js.native
class Registerer protected () extends js.Object {
  /**
    * Constructs a new instance of the `Registerer` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param options - Options bucket. See {@link RegistererOptions} for details.
    */
  def this(userAgent: UserAgent) = this()
  def this(userAgent: UserAgent, options: RegistererOptions) = this()
  /** The contacts returned from the most recent accepted REGISTER request. */
  var _contacts: js.Any = js.native
  /** The registration state. */
  var _state: js.Any = js.native
  /** Emits when the registration state changes. */
  var _stateEventEmitter: js.Any = js.native
  /** True is waiting for final response to outstanding REGISTER request. */
  var _waiting: js.Any = js.native
  /** Emits when waiting changes. */
  var _waitingEventEmitter: js.Any = js.native
  /** @internal */
  var clearTimers: js.Any = js.native
  var contact: js.Any = js.native
  /** The registered contacts. */
  val contacts: js.Array[String] = js.native
  var expires: js.Any = js.native
  /**
    * Helper Function to generate Contact Header
    * @internal
    */
  var generateContactHeader: js.Any = js.native
  var id: js.Any = js.native
  var logger: js.Any = js.native
  /** @internal */
  var onTransportDisconnected: js.Any = js.native
  var options: js.Any = js.native
  /** @internal */
  var registered: js.Any = js.native
  var registrationExpiredTimer: js.Any = js.native
  var registrationTimer: js.Any = js.native
  var request: js.Any = js.native
  /** The registration state. */
  val state: RegistererState = js.native
  /** Emits when the registerer state changes. */
  val stateChange: Emitter[RegistererState] = js.native
  /**
    * Transition registration state.
    * @internal
    */
  var stateTransition: js.Any = js.native
  /** @internal */
  var unregistered: js.Any = js.native
  var userAgent: js.Any = js.native
  /** True if waiting for final response to a REGISTER request. */
  val waiting: js.Any = js.native
  /** Emits when the registerer toggles waiting. */
  val waitingChange: js.Any = js.native
  /**
    * Toggle waiting.
    * @internal
    */
  var waitingToggle: js.Any = js.native
  /** Destructor. */
  def dispose(): js.Promise[Unit] = js.native
  /**
    * Sends the REGISTER request.
    * @remarks
    * If successfull, sends re-REGISTER requests prior to registration expiration until `unsubscribe()` is called.
    */
  def register(): js.Promise[OutgoingRegisterRequest] = js.native
  def register(options: RegistererRegisterOptions): js.Promise[OutgoingRegisterRequest] = js.native
  /**
    * Sends the REGISTER request with expires equal to zero.
    */
  def unregister(): js.Promise[OutgoingRegisterRequest] = js.native
  def unregister(options: RegistererUnregisterOptions): js.Promise[OutgoingRegisterRequest] = js.native
}

