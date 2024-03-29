package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.anon.PartialUserAgentOptions
import typings.sipJs.anon.RequiredUserAgentOptions
import typings.sipJs.libApiEmitterMod.Emitter
import typings.sipJs.libApiInviterMod.Inviter
import typings.sipJs.libApiInviterOptionsMod.InviterOptions
import typings.sipJs.libApiPublisherMod.Publisher
import typings.sipJs.libApiRegistererMod.Registerer
import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libApiSubscriptionMod.Subscription
import typings.sipJs.libApiTransportMod.Transport
import typings.sipJs.libApiUserAgentDelegateMod.UserAgentDelegate
import typings.sipJs.libApiUserAgentStateMod.UserAgentState
import typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreConfigurationMod.Contact
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libGrammarUriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiUserAgentMod {
  
  @JSImport("sip.js/lib/api/user-agent", "UserAgent")
  @js.native
  /**
    * Constructs a new instance of the `UserAgent` class.
    * @param options - Options bucket. See {@link UserAgentOptions} for details.
    */
  open class UserAgent () extends StObject {
    def this(options: PartialUserAgentOptions) = this()
    
    /* private */ var _contact: Any = js.native
    
    /* private */ var _instanceId: Any = js.native
    
    /**
      * Used to avoid circular references.
      * @internal
      */
    def _makeInviter(targetURI: URI): Inviter = js.native
    def _makeInviter(targetURI: URI, options: InviterOptions): Inviter = js.native
    
    /** @internal */
    var _publishers: StringDictionary[Publisher] = js.native
    
    /** @internal */
    var _registerers: StringDictionary[Registerer] = js.native
    
    /** @internal */
    var _sessions: StringDictionary[Session] = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _stateEventEmitter: Any = js.native
    
    /** @internal */
    var _subscriptions: StringDictionary[Subscription] = js.native
    
    /* private */ var _transport: Any = js.native
    
    /* private */ var _userAgentCore: Any = js.native
    
    /**
      * Attempt reconnection up to `maxReconnectionAttempts` times.
      * @param reconnectionAttempt - Current attempt number.
      */
    /* private */ var attemptReconnection: Any = js.native
    
    /**
      * User agent configuration.
      */
    def configuration: RequiredUserAgentOptions = js.native
    
    /**
      * User agent contact.
      */
    def contact: Contact = js.native
    
    /**
      * Property reserved for use by instance owner.
      * @defaultValue `undefined`
      */
    var data: Any = js.native
    
    /**
      * Delegate.
      */
    var delegate: js.UndefOr[UserAgentDelegate] = js.native
    
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
      * Initialize contact.
      */
    /* private */ var initContact: Any = js.native
    
    /**
      * Initialize user agent core.
      */
    /* private */ var initCore: Any = js.native
    
    /* private */ var initTransportCallbacks: Any = js.native
    
    /**
      * User agent instance id.
      */
    def instanceId: String = js.native
    
    /**
      * True if transport is connected.
      */
    def isConnected(): Boolean = js.native
    
    /** Logger. */
    /* private */ var logger: Any = js.native
    
    /** LoggerFactory. */
    /* private */ var loggerFactory: Any = js.native
    
    /* private */ var onTransportConnect: Any = js.native
    
    /* private */ var onTransportDisconnect: Any = js.native
    
    /* private */ var onTransportMessage: Any = js.native
    
    /** Options. */
    /* private */ var options: Any = js.native
    
    /**
      * Reconnect the transport.
      */
    def reconnect(): js.Promise[Unit] = js.native
    
    /**
      * Start the user agent.
      *
      * @remarks
      * Resolves if transport connects, otherwise rejects.
      * Calling `start()` after calling `stop()` will fail if `stop()` has yet to resolve.
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
      * User agent state.
      */
    def state: UserAgentState = js.native
    
    /**
      * User agent state change emitter.
      */
    def stateChange: Emitter[UserAgentState] = js.native
    
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
      * The user agent state transistions to stopped once these steps have been completed.
      * Calling `start()` after calling `stop()` will fail if `stop()` has yet to resolve.
      *
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
    
    /**
      * Transition state.
      */
    /* private */ var transitionState: Any = js.native
    
    /**
      * User agent transport.
      */
    def transport: Transport = js.native
    
    /**
      * User agent core.
      */
    def userAgentCore: UserAgentCore = js.native
  }
  /* static members */
  object UserAgent {
    
    @JSImport("sip.js/lib/api/user-agent", "UserAgent")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default user agent options. */
    @JSImport("sip.js/lib/api/user-agent", "UserAgent.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Create a URI instance from a string.
      * @param uri - The string to parse.
      *
      * @remarks
      * Returns undefined if the syntax of the URI is invalid.
      * The syntax must conform to a SIP URI as defined in the RFC.
      * 25 Augmented BNF for the SIP Protocol
      * https://tools.ietf.org/html/rfc3261#section-25
      *
      * @example
      * ```ts
      * const uri = UserAgent.makeURI("sip:edgar@example.com");
      * ```
      */
    inline def makeURI(uri: String): js.UndefOr[URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[URI]]
    
    @JSImport("sip.js/lib/api/user-agent", "UserAgent.newUUID")
    @js.native
    def newUUID: Any = js.native
    inline def newUUID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newUUID")(x.asInstanceOf[js.Any])
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api/user-agent", "UserAgent.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: Any = js.native
    inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
}
