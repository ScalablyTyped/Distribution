package typings.sentryCore

import typings.sentryCore.basebackendMod.Backend
import typings.sentryCore.basebackendMod.BackendClass
import typings.sentryCore.integrationMod.IntegrationIndex
import typings.sentryHub.mod.Scope
import typings.sentryHub.mod.Session
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.severityMod.Severity
import typings.sentryUtils.mod.Dsn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseclientMod {
  
  @JSImport("@sentry/core/dist/baseclient", "BaseClient")
  @js.native
  abstract class BaseClient[B /* <: Backend */, O /* <: Options */] protected () extends Client[O] {
    /**
      * Initializes this client instance.
      *
      * @param backendClass A constructor function to create the backend.
      * @param options Options for the client.
      */
    protected def this(backendClass: BackendClass[B, O], options: O) = this()
    
    /**
      *  Enhances event using the client configuration.
      *  It takes care of all "static" values like environment, release and `dist`,
      *  as well as truncating overly long values.
      * @param event event instance to be enhanced
      */
    /* protected */ def _applyClientOptions(event: Event): Unit = js.native
    
    /**
      * This function adds all used integrations to the SDK info in the event.
      * @param sdkInfo The sdkInfo of the event that will be filled with all integrations.
      */
    /* protected */ def _applyIntegrationsMetadata(event: Event): Unit = js.native
    
    /**
      * The backend used to physically interact in the environment. Usually, this
      * will correspond to the client. When composing SDKs, however, the Backend
      * from the root SDK will be used.
      */
    val _backend: B = js.native
    
    /**
      * Processes the event and logs an error in case of rejection
      * @param event
      * @param hint
      * @param scope
      */
    /* protected */ def _captureEvent(event: Event): js.Thenable[js.UndefOr[String]] = js.native
    /* protected */ def _captureEvent(event: Event, hint: js.UndefOr[scala.Nothing], scope: Scope): js.Thenable[js.UndefOr[String]] = js.native
    /* protected */ def _captureEvent(event: Event, hint: EventHint): js.Thenable[js.UndefOr[String]] = js.native
    /* protected */ def _captureEvent(event: Event, hint: EventHint, scope: Scope): js.Thenable[js.UndefOr[String]] = js.native
    
    /** The client Dsn, if specified in options. Without this Dsn, the SDK will be disabled. */
    val _dsn: js.UndefOr[Dsn] = js.native
    
    /** Returns the current backend. */
    /* protected */ def _getBackend(): B = js.native
    
    /** Array of used integrations. */
    var _integrations: IntegrationIndex = js.native
    
    /** Waits for the client to be done with processing. */
    /* protected */ def _isClientProcessing(): js.Thenable[Boolean] = js.native
    /* protected */ def _isClientProcessing(timeout: Double): js.Thenable[Boolean] = js.native
    
    /** Determines whether this SDK is enabled and a valid Dsn is present. */
    /* protected */ def _isEnabled(): Boolean = js.native
    
    /* protected */ def _normalizeEvent(event: Null, depth: Double): Event | Null = js.native
    /**
      * Applies `normalize` function on necessary `Event` attributes to make them safe for serialization.
      * Normalized keys:
      * - `breadcrumbs.data`
      * - `user`
      * - `contexts`
      * - `extra`
      * @param event Event
      * @returns Normalized event
      */
    /* protected */ def _normalizeEvent(event: Event, depth: Double): Event | Null = js.native
    
    /** Options passed to the SDK. */
    val _options: O = js.native
    
    /**
      * Adds common information to events.
      *
      * The information includes release and environment from `options`,
      * breadcrumbs and context (extra, tags and user) from the scope.
      *
      * Information that is already present in the event is never overwritten. For
      * nested objects, such as the context, keys are merged.
      *
      * @param event The original event.
      * @param hint May contain additional information about the original exception.
      * @param scope A scope containing event metadata.
      * @returns A new event with more information.
      */
    /* protected */ def _prepareEvent(event: Event): js.Thenable[Event | Null] = js.native
    /* protected */ def _prepareEvent(event: Event, scope: js.UndefOr[scala.Nothing], hint: EventHint): js.Thenable[Event | Null] = js.native
    /* protected */ def _prepareEvent(event: Event, scope: Scope): js.Thenable[Event | Null] = js.native
    /* protected */ def _prepareEvent(event: Event, scope: Scope, hint: EventHint): js.Thenable[Event | Null] = js.native
    
    /**
      * Occupies the client with processing and event
      */
    /* protected */ def _process[T](promise: js.Thenable[T]): Unit = js.native
    
    /**
      * Processes an event (either error or message) and sends it to Sentry.
      *
      * This also adds breadcrumbs and context information to the event. However,
      * platform specific meta data (such as the User's IP address) must be added
      * by the SDK implementor.
      *
      *
      * @param event The event to send to Sentry.
      * @param hint May contain additional information about the original exception.
      * @param scope A scope containing event metadata.
      * @returns A SyncPromise that resolves with the event or rejects in case event was/will not be send.
      */
    /* protected */ def _processEvent(event: Event): js.Thenable[Event] = js.native
    /* protected */ def _processEvent(event: Event, hint: js.UndefOr[scala.Nothing], scope: Scope): js.Thenable[Event] = js.native
    /* protected */ def _processEvent(event: Event, hint: EventHint): js.Thenable[Event] = js.native
    /* protected */ def _processEvent(event: Event, hint: EventHint, scope: Scope): js.Thenable[Event] = js.native
    
    /** Number of call being processed */
    var _processing: Double = js.native
    
    /**
      * Tells the backend to send this event
      * @param event The Sentry event to send
      */
    /* protected */ def _sendEvent(event: Event): Unit = js.native
    
    /** Deliver captured session to Sentry */
    /* protected */ def _sendSession(session: Session): Unit = js.native
    
    /** Updates existing session based on the provided event */
    /* protected */ def _updateSessionFromEvent(session: Session, event: Event): Unit = js.native
    
    def captureEvent(event: Event, hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureEvent(event: Event, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    def captureException(exception: js.Any, hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureException(exception: js.Any, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    def captureMessage(message: String, level: js.UndefOr[scala.Nothing], hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: js.UndefOr[scala.Nothing], hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("captureSession")
    def captureSession_MBaseClient(session: Session): Unit = js.native
  }
}
