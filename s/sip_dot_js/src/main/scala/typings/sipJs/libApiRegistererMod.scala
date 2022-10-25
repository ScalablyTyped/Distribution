package typings.sipJs

import typings.sipJs.libApiEmitterMod.Emitter
import typings.sipJs.libApiRegistererOptionsMod.RegistererOptions
import typings.sipJs.libApiRegistererRegisterOptionsMod.RegistererRegisterOptions
import typings.sipJs.libApiRegistererStateMod.RegistererState
import typings.sipJs.libApiRegistererUnregisterOptionsMod.RegistererUnregisterOptions
import typings.sipJs.libApiUserAgentMod.UserAgent
import typings.sipJs.libCoreMessagesMethodsRegisterMod.OutgoingRegisterRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiRegistererMod {
  
  @JSImport("sip.js/lib/api/registerer", "Registerer")
  @js.native
  open class Registerer protected () extends StObject {
    /**
      * Constructs a new instance of the `Registerer` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param options - Options bucket. See {@link RegistererOptions} for details.
      */
    def this(userAgent: UserAgent) = this()
    def this(userAgent: UserAgent, options: RegistererOptions) = this()
    
    /** The contacts returned from the most recent accepted REGISTER request. */
    /* private */ var _contacts: Any = js.native
    
    /** The number of seconds to wait before retrying to register. */
    /* private */ var _retryAfter: Any = js.native
    
    /** The registration state. */
    /* private */ var _state: Any = js.native
    
    /** Emits when the registration state changes. */
    /* private */ var _stateEventEmitter: Any = js.native
    
    /** True is waiting for final response to outstanding REGISTER request. */
    /* private */ var _waiting: Any = js.native
    
    /** Emits when waiting changes. */
    /* private */ var _waitingEventEmitter: Any = js.native
    
    /**
      * Clear registration timers.
      */
    /* private */ var clearTimers: Any = js.native
    
    /** The registered contacts. */
    def contacts: js.Array[String] = js.native
    
    /** Destructor. */
    def dispose(): js.Promise[Unit] = js.native
    
    /* private */ var disposed: Any = js.native
    
    /* private */ var expires: Any = js.native
    
    /**
      * Generate Contact Header
      */
    /* private */ var generateContactHeader: Any = js.native
    
    /* private */ var id: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var refreshFrequency: Any = js.native
    
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
    /* private */ var registered: Any = js.native
    
    /* private */ var registrationExpiredTimer: Any = js.native
    
    /* private */ var registrationTimer: Any = js.native
    
    /* private */ var request: Any = js.native
    
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
    /* private */ var stateError: Any = js.native
    
    /**
      * Transition registration state.
      */
    /* private */ var stateTransition: Any = js.native
    
    /**
      * Helper function, called when terminated.
      */
    /* private */ var terminated: Any = js.native
    
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
    /* private */ var unregistered: Any = js.native
    
    /* private */ var userAgent: Any = js.native
    
    /** True if the registerer is currently waiting for final response to a REGISTER request. */
    /* private */ def waiting: Any = js.native
    
    /** Emits when the registerer waiting state changes. */
    /* private */ def waitingChange: Any = js.native
    
    /**
      * Toggle waiting.
      */
    /* private */ var waitingToggle: Any = js.native
    
    /** Hopefully helpful as the standard behavior has been found to be unexpected. */
    /* private */ var waitingWarning: Any = js.native
  }
  /* static members */
  object Registerer {
    
    @JSImport("sip.js/lib/api/registerer", "Registerer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/api/registerer", "Registerer.defaultExpires")
    @js.native
    val defaultExpires: Any = js.native
    
    /** Default registerer options. */
    @JSImport("sip.js/lib/api/registerer", "Registerer.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/api/registerer", "Registerer.defaultRefreshFrequency")
    @js.native
    val defaultRefreshFrequency: Any = js.native
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api/registerer", "Registerer.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: Any = js.native
    inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
}
