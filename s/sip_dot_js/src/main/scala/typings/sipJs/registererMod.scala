package typings.sipJs

import typings.sipJs.emitterMod.Emitter
import typings.sipJs.registerMod.OutgoingRegisterRequest
import typings.sipJs.registererOptionsMod.RegistererOptions
import typings.sipJs.registererRegisterOptionsMod.RegistererRegisterOptions
import typings.sipJs.registererStateMod.RegistererState
import typings.sipJs.registererUnregisterOptionsMod.RegistererUnregisterOptions
import typings.sipJs.userAgentMod.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/registerer", JSImport.Namespace)
@js.native
object registererMod extends js.Object {
  
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
    
    /** The number of seconds to wait before retrying to register. */
    var _retryAfter: js.Any = js.native
    
    /** The registration state. */
    var _state: js.Any = js.native
    
    /** Emits when the registration state changes. */
    var _stateEventEmitter: js.Any = js.native
    
    /** True is waiting for final response to outstanding REGISTER request. */
    var _waiting: js.Any = js.native
    
    /** Emits when waiting changes. */
    var _waitingEventEmitter: js.Any = js.native
    
    /**
      * Clear registration timers.
      */
    var clearTimers: js.Any = js.native
    
    /** The registered contacts. */
    def contacts: js.Array[String] = js.native
    
    /** Destructor. */
    def dispose(): js.Promise[Unit] = js.native
    
    var disposed: js.Any = js.native
    
    var expires: js.Any = js.native
    
    /**
      * Generate Contact Header
      */
    var generateContactHeader: js.Any = js.native
    
    var id: js.Any = js.native
    
    var logger: js.Any = js.native
    
    var options: js.Any = js.native
    
    /**
      * Sends the REGISTER request.
      * @remarks
      * If successful, sends re-REGISTER requests prior to registration expiration until `unsubscribe()` is called.
      * Rejects with `RequestPendingError` if a REGISTER request is already in progress.
      */
    def register(): js.Promise[OutgoingRegisterRequest] = js.native
    def register(options: RegistererRegisterOptions): js.Promise[OutgoingRegisterRequest] = js.native
    
    /**
      * Helper function, called when registered.
      */
    var registered: js.Any = js.native
    
    var registrationExpiredTimer: js.Any = js.native
    
    var registrationTimer: js.Any = js.native
    
    var request: js.Any = js.native
    
    /**
      * The number of seconds to wait before retrying to register.
      * @defaultValue `undefined`
      * @remarks
      * When the server rejects a registration request, if it provides a suggested
      * duration to wait before retrying, that value is available here when and if
      * the state transitions to `Unsubscribed`. It is also available during the
      * callback to `onReject` after a call to `register`. (Note that if the state
      * if already `Unsubscribed`, a rejected request created by `register` will
      * not cause the state to transition to `Unsubscribed`. One way to avoid this
      * case is to dispose of `Registerer` when unregistered and create a new
      * `Registerer` for any attempts to retry registering.)
      * @example
      * ```ts
      * // Checking for retry after on state change
      * registerer.stateChange.addListener((newState) => {
      *   switch (newState) {
      *     case RegistererState.Unregistered:
      *       const retryAfter = registerer.retryAfter;
      *       break;
      *   }
      * });
      *
      * // Checking for retry after on request rejection
      * registerer.register({
      *   requestDelegate: {
      *     onReject: () => {
      *       const retryAfter = registerer.retryAfter;
      *     }
      *   }
      * });
      * ```
      */
    def retryAfter: js.UndefOr[Double] = js.native
    
    /** The registration state. */
    def state: RegistererState = js.native
    
    /** Emits when the registerer state changes. */
    def stateChange: Emitter[RegistererState] = js.native
    
    /** Hopefully helpful as the standard behavior has been found to be unexpected. */
    var stateError: js.Any = js.native
    
    /**
      * Transition registration state.
      */
    var stateTransition: js.Any = js.native
    
    /**
      * Helper function, called when terminated.
      */
    var terminated: js.Any = js.native
    
    /**
      * Sends the REGISTER request with expires equal to zero.
      * @remarks
      * Rejects with `RequestPendingError` if a REGISTER request is already in progress.
      */
    def unregister(): js.Promise[OutgoingRegisterRequest] = js.native
    def unregister(options: RegistererUnregisterOptions): js.Promise[OutgoingRegisterRequest] = js.native
    
    /**
      * Helper function, called when unregistered.
      */
    var unregistered: js.Any = js.native
    
    var userAgent: js.Any = js.native
    
    /** True if the registerer is currently waiting for final response to a REGISTER request. */
    /* private */ def waiting: js.Any = js.native
    
    /** Emits when the registerer waiting state changes. */
    /* private */ def waitingChange: js.Any = js.native
    
    /**
      * Toggle waiting.
      */
    var waitingToggle: js.Any = js.native
    
    /** Hopefully helpful as the standard behavior has been found to be unexpected. */
    var waitingWarning: js.Any = js.native
  }
  /* static members */
  @js.native
  object Registerer extends js.Object {
    
    val defaultExpires: js.Any = js.native
    
    /** Default registerer options. */
    var defaultOptions: js.Any = js.native
    
    var newUUID: js.Any = js.native
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    var stripUndefinedProperties: js.Any = js.native
  }
}
