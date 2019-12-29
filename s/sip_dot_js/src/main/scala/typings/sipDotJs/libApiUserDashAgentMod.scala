package typings.sipDotJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipDotJs.libApiEmitterMod.Emitter
import typings.sipDotJs.libApiInviterDashOptionsMod.InviterOptions
import typings.sipDotJs.libApiInviterMod.Inviter
import typings.sipDotJs.libApiPublisherMod.Publisher
import typings.sipDotJs.libApiRegistererMod.Registerer
import typings.sipDotJs.libApiSessionMod.Session
import typings.sipDotJs.libApiSubscriptionMod.Subscription
import typings.sipDotJs.libApiTransportMod.Transport
import typings.sipDotJs.libApiUserDashAgentDashDelegateMod.UserAgentDelegate
import typings.sipDotJs.libApiUserDashAgentDashOptionsMod.UserAgentOptions
import typings.sipDotJs.libApiUserDashAgentDashStateMod.UserAgentState
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libCoreMod.LoggerFactory
import typings.sipDotJs.libCoreMod.URI
import typings.sipDotJs.libCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod.Contact
import typings.std.Partial
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/user-agent", JSImport.Namespace)
@js.native
object libApiUserDashAgentMod extends js.Object {
  @js.native
  /**
    * Constructs a new instance of the `UserAgent` class.
    * @param options - Options bucket. See {@link UserAgentOptions} for details.
    */
  class UserAgent () extends js.Object {
    def this(options: Partial[UserAgentOptions]) = this()
    var _contact: js.Any = js.native
    /** @internal */
    var _publishers: StringDictionary[Publisher] = js.native
    /** @internal */
    var _registerers: StringDictionary[Registerer] = js.native
    /** @internal */
    var _sessions: StringDictionary[Session] = js.native
    var _state: js.Any = js.native
    var _stateEventEmitter: js.Any = js.native
    var _stateInitial: js.Any = js.native
    /** @internal */
    var _subscriptions: StringDictionary[Subscription] = js.native
    var _transport: js.Any = js.native
    var _userAgentCore: js.Any = js.native
    /**
      * Attempt reconnection up to `maxReconnectionAttempts` times.
      * @param reconnectionAttempt - Current attempt number.
      */
    var attemptReconnection: js.Any = js.native
    /**
      * User agent configuration.
      */
    val configuration: Required[UserAgentOptions] = js.native
    /**
      * User agent contact.
      */
    val contact: Contact = js.native
    /**
      * Property reserved for use by instance owner.
      * @defaultValue `undefined`
      */
    var data: js.Any = js.native
    /**
      * Delegate.
      */
    var delegate: js.UndefOr[UserAgentDelegate] = js.native
    /**
      * Initialize contact.
      */
    var initContact: js.Any = js.native
    /**
      * Initialize user agent core.
      */
    var initCore: js.Any = js.native
    var initTransportCallbacks: js.Any = js.native
    /** Logger. */
    var logger: js.Any = js.native
    /** LoggerFactory. */
    var loggerFactory: js.Any = js.native
    var onTransportConnect: js.Any = js.native
    var onTransportDisconnect: js.Any = js.native
    var onTransportMessage: js.Any = js.native
    /** Options. */
    var options: js.Any = js.native
    /**
      * User agent state.
      */
    val state: UserAgentState = js.native
    /**
      * User agent state change emitter.
      */
    val stateChange: Emitter[UserAgentState] = js.native
    /**
      * Transition state.
      */
    var transitionState: js.Any = js.native
    /**
      * User agent transport.
      */
    val transport: Transport = js.native
    /** Unload listener. */
    var unloadListener: js.Any = js.native
    /**
      * User agent core.
      */
    val userAgentCore: UserAgentCore = js.native
    /**
      * Used to avoid circular references.
      * @internal
      */
    def _makeInviter(targetURI: URI): Inviter = js.native
    def _makeInviter(targetURI: URI, options: InviterOptions): Inviter = js.native
    /**
      * The logger.
      */
    def getLogger(category: String): Logger = js.native
    def getLogger(category: String, label: String): Logger = js.native
    /**
      * The logger factory.
      */
    def getLoggerFactory(): LoggerFactory = js.native
    /**
      * True if transport is connected.
      */
    def isConnected(): Boolean = js.native
    /**
      * Reconnect the transport.
      */
    def reconnect(): js.Promise[Unit] = js.native
    /**
      * Start the user agent.
      *
      * @remarks
      * Resolves if transport connects, otherwise rejects.
      *
      * @example
      * ```ts
      * userAgent.start()
      *   .then(() => {
      *     // userAgent.isConnected() === true
      *   })
      *   .catch((error: Error) => {
      *     // userAgent.isConnected() === false
      *   });
      * ```
      */
    def start(): js.Promise[Unit] = js.native
    /**
      * Stop the user agent.
      *
      * @remarks
      * Resolves when the user agent has completed a graceful shutdown.
      * ```txt
      * 1) Sessions terminate.
      * 2) Registerers unregister.
      * 3) Subscribers unsubscribe.
      * 4) Publishers unpublish.
      * 5) Transport disconnects.
      * 6) User Agent Core resets.
      * ```
      * NOTE: While this is a "graceful shutdown", it can also be very slow one if you
      * are waiting for the returned Promise to resolve. The disposal of the clients and
      * dialogs is done serially - waiting on one to finish before moving on to the next.
      * This can be slow if there are lot of subscriptions to unsubscribe for example.
      *
      * THE SLOW PACE IS INTENTIONAL!
      * While one could spin them all down in parallel, this could slam the remote server.
      * It is bad practice to denial of service attack (DoS attack) servers!!!
      * Moreover, production servers will automatically blacklist clients which send too
      * many requests in too short a period of time - dropping any additional requests.
      *
      * If a different approach to disposing is needed, one can implement whatever is
      * needed and execute that prior to calling `stop()`. Alternatively one may simply
      * not wait for the Promise returned by `stop()` to complete.
      */
    def stop(): js.Promise[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object UserAgent extends js.Object {
    /** Default user agent options. */
    val defaultOptions: js.Any = js.native
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    var stripUndefinedProperties: js.Any = js.native
    /**
      * Create a URI instance from a string.
      * @param uri - The string to parse.
      *
      * @example
      * ```ts
      * const uri = UserAgent.makeURI("sip:edgar@example.com");
      * ```
      */
    def makeURI(uri: String): js.UndefOr[URI] = js.native
  }
  
}

