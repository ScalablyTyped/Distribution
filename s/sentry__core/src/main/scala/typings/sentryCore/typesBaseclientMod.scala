package typings.sentryCore

import typings.sentryCore.sentryCoreStrings.afterSendEvent
import typings.sentryCore.sentryCoreStrings.beforeAddBreadcrumb
import typings.sentryCore.sentryCoreStrings.beforeEnvelope
import typings.sentryCore.sentryCoreStrings.createDsc
import typings.sentryCore.sentryCoreStrings.finishTransaction
import typings.sentryCore.sentryCoreStrings.startTransaction
import typings.sentryCore.typesIntegrationMod.IntegrationIndex
import typings.sentryCore.typesScopeMod.Scope
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesBreadcrumbMod.BreadcrumbHint
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesClientreportMod.Outcome
import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesEnvelopeMod.DynamicSamplingContext
import typings.sentryTypes.typesEnvelopeMod.Envelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import typings.sentryTypes.typesTransportMod.TransportMakeRequestResponse
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseclientMod {
  
  /* note: abstract class */ @JSImport("@sentry/core/types/baseclient", "BaseClient")
  @js.native
  open class BaseClient[O /* <: ClientOptions[BaseTransportOptions] */] protected ()
    extends StObject
       with Client[O] {
    /**
      * Initializes this client instance.
      *
      * @param options Options for the client.
      */
    /* protected */ def this(options: O) = this()
    
    /**
      * Processes the event and logs an error in case of rejection
      * @param event
      * @param hint
      * @param scope
      */
    /* protected */ def _captureEvent(event: Event): PromiseLike[js.UndefOr[String]] = js.native
    /* protected */ def _captureEvent(event: Event, hint: Unit, scope: Scope): PromiseLike[js.UndefOr[String]] = js.native
    /* protected */ def _captureEvent(event: Event, hint: EventHint): PromiseLike[js.UndefOr[String]] = js.native
    /* protected */ def _captureEvent(event: Event, hint: EventHint, scope: Scope): PromiseLike[js.UndefOr[String]] = js.native
    
    /**
      * Clears outcomes on this client and returns them.
      */
    /* protected */ def _clearOutcomes(): js.Array[Outcome] = js.native
    
    /** The client Dsn, if specified in options. Without this Dsn, the SDK will be disabled. */
    /* protected */ val _dsn: js.UndefOr[DsnComponents] = js.native
    
    /* private */ var _hooks: Any = js.native
    
    /** Array of set up integrations. */
    /* protected */ var _integrations: IntegrationIndex = js.native
    
    /** Indicates whether this client's integrations have been set up. */
    /* protected */ var _integrationsInitialized: Boolean = js.native
    
    /**
      * Determine if the client is finished processing. Returns a promise because it will wait `timeout` ms before saying
      * "no" (resolving to `false`) in order to give the client a chance to potentially finish first.
      *
      * @param timeout The time, in ms, after which to resolve to `false` if the client is still busy. Passing `0` (or not
      * passing anything) will make the promise wait as long as it takes for processing to finish before resolving to
      * `true`.
      * @returns A promise which will resolve to `true` if processing is already done or finishes before the timeout, and
      * `false` otherwise
      */
    /* protected */ def _isClientDoneProcessing(): PromiseLike[Boolean] = js.native
    /* protected */ def _isClientDoneProcessing(timeout: Double): PromiseLike[Boolean] = js.native
    
    /** Determines whether this SDK is enabled and a valid Dsn is present. */
    /* protected */ def _isEnabled(): Boolean = js.native
    
    /** Number of calls being processed */
    /* protected */ var _numProcessing: Double = js.native
    
    /** Options passed to the SDK. */
    /* protected */ val _options: O = js.native
    
    /** Holds flushable  */
    /* private */ var _outcomes: Any = js.native
    
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
    /* protected */ def _prepareEvent(event: Event, hint: EventHint): PromiseLike[Event | Null] = js.native
    /* protected */ def _prepareEvent(event: Event, hint: EventHint, scope: Scope): PromiseLike[Event | Null] = js.native
    
    /**
      * Occupies the client with processing and event
      */
    /* protected */ def _process[T](promise: PromiseLike[T]): Unit = js.native
    
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
    /* protected */ def _processEvent(event: Event, hint: EventHint): PromiseLike[Event] = js.native
    /* protected */ def _processEvent(event: Event, hint: EventHint, scope: Scope): PromiseLike[Event] = js.native
    
    /**
      * @inheritdoc
      */
    /* protected */ def _sendEnvelope(envelope: Envelope): (PromiseLike[Unit | TransportMakeRequestResponse]) | Unit = js.native
    
    /* protected */ val _transport: js.UndefOr[Transport] = js.native
    
    /** Updates existing session based on the provided event */
    /* protected */ def _updateSessionFromEvent(session: Session, event: Event): Unit = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("addIntegration")
    def addIntegration_MBaseClient(integration: Integration): Unit = js.native
    
    def captureEvent(event: Event, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureEvent(event: Event, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    def captureException(exception: Any, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureException(exception: Any, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    def captureMessage(message: String, level: Unit, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Unit, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: SeverityLevel, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: SeverityLevel, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("captureSession")
    def captureSession_MBaseClient(session: Session): Unit = js.native
    
    /** @inheritdoc */
    @JSName("emit")
    def emit_MBaseClient(hook: startTransaction | finishTransaction, transaction: Transaction): Unit = js.native
    @JSName("emit")
    def emit_afterSendEvent(hook: afterSendEvent, event: Event, sendResponse: Unit): Unit = js.native
    /** @inheritdoc */
    @JSName("emit")
    def emit_afterSendEvent(hook: afterSendEvent, event: Event, sendResponse: TransportMakeRequestResponse): Unit = js.native
    /** @inheritdoc */
    @JSName("emit")
    def emit_beforeAddBreadcrumb(hook: beforeAddBreadcrumb, breadcrumb: Breadcrumb): Unit = js.native
    @JSName("emit")
    def emit_beforeAddBreadcrumb(hook: beforeAddBreadcrumb, breadcrumb: Breadcrumb, hint: BreadcrumbHint): Unit = js.native
    /** @inheritdoc */
    @JSName("emit")
    def emit_beforeEnvelope(hook: beforeEnvelope, envelope: Envelope): Unit = js.native
    /** @inheritdoc */
    @JSName("emit")
    def emit_createDsc(hook: createDsc, dsc: DynamicSamplingContext): Unit = js.native
    
    /**
      * Gets an installed integration by its `id`.
      *
      * @returns The installed integration or `undefined` if no integration with that `id` was installed.
      */
    def getIntegrationById(integrationId: String): js.UndefOr[Integration] = js.native
    
    /**
      * @see SdkMetadata in @sentry/types
      *
      * @return The metadata of the SDK
      */
    @JSName("getSdkMetadata")
    def getSdkMetadata_MBaseClient(): js.UndefOr[SdkMetadata] = js.native
    
    /** @inheritdoc */
    @JSName("on")
    def on_MBaseClient(
      hook: startTransaction | finishTransaction,
      callback: js.Function1[/* transaction */ Transaction, Unit]
    ): Unit = js.native
    /** @inheritdoc */
    @JSName("on")
    def on_afterSendEvent(
      hook: afterSendEvent,
      callback: js.Function2[/* event */ Event, /* sendResponse */ TransportMakeRequestResponse | Unit, Unit]
    ): Unit = js.native
    /** @inheritdoc */
    @JSName("on")
    def on_beforeAddBreadcrumb(
      hook: beforeAddBreadcrumb,
      callback: js.Function2[/* breadcrumb */ Breadcrumb, /* hint */ js.UndefOr[BreadcrumbHint], Unit]
    ): Unit = js.native
    /** @inheritdoc */
    @JSName("on")
    def on_beforeEnvelope(hook: beforeEnvelope, callback: js.Function1[/* envelope */ Envelope, Unit]): Unit = js.native
    /** @inheritdoc */
    @JSName("on")
    def on_createDsc(hook: createDsc, callback: js.Function1[/* dsc */ DynamicSamplingContext, Unit]): Unit = js.native
  }
}
