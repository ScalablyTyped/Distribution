package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.anon.Dictkey
import typings.sentryCore.anon.FnCall
import typings.sentryCore.anon.FnCallBreadcrumbHint
import typings.sentryCore.anon.FnCallCallback
import typings.sentryCore.anon.FnCallContextCustomSamplingContext
import typings.sentryCore.anon.FnCallEventHint
import typings.sentryCore.anon.FnCallMessageLevelHint
import typings.sentryCore.anon.FnCallNameContext
import typings.sentryCore.anon.FnCallUser
import typings.sentryCore.anon.OmitSessionContextstarted
import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryCore.anon.PickOptionsBaseTransportO
import typings.sentryCore.sentryCoreStrings.ok
import typings.sentryCore.typesHubMod.AsyncContextStrategy
import typings.sentryCore.typesHubMod.Carrier
import typings.sentryCore.typesHubMod.RunWithAsyncContextOptions
import typings.sentryCore.typesIntegrationMod.sentryTypesAugmentingMod.Integration
import typings.sentryCore.typesSdkMod.ClientClass
import typings.sentryCore.typesSessionflusherMod.ReleaseHealthAttributes
import typings.sentryCore.typesTracingSpanMod.SpanStatusType
import typings.sentryCore.typesTransportsMultiplexedMod.Matcher
import typings.sentryCore.typesTransportsOfflineMod.OfflineTransportOptions
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesCheckinMod.CheckIn
import typings.sentryTypes.typesCheckinMod.MonitorConfig
import typings.sentryTypes.typesCheckinMod.SerializedCheckIn
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesDsnMod.DsnLike
import typings.sentryTypes.typesEnvelopeMod.CheckInEvelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesExtraMod.Extra
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesOptionsMod.Options
import typings.sentryTypes.typesScopeMod.CaptureContext
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSessionMod.SessionContext
import typings.sentryTypes.typesSessionMod.SessionStatus
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesSpanMod.SpanContext
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TraceparentData
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import typings.sentryTypes.typesTransportMod.TransportMakeRequestResponse
import typings.sentryTypes.typesTransportMod.TransportRequestExecutor
import typings.sentryTypes.typesUserMod.User
import typings.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typings.std.Exclude
import typings.std.PromiseLike
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@sentry/core", "BaseClient")
  @js.native
  open class BaseClient[O /* <: ClientOptions[BaseTransportOptions] */] protected ()
    extends typings.sentryCore.typesBaseclientMod.BaseClient[O] {
    /**
      * Initializes this client instance.
      *
      * @param options Options for the client.
      */
    /* protected */ def this(options: O) = this()
  }
  
  @JSImport("@sentry/core", "DEFAULT_ENVIRONMENT")
  @js.native
  val DEFAULT_ENVIRONMENT: /* "production" */ String = js.native
  
  @JSImport("@sentry/core", "FunctionToString")
  @js.native
  open class FunctionToString ()
    extends typings.sentryCore.typesIntegrationsMod.FunctionToString
  /* static members */
  object FunctionToString {
    
    @JSImport("@sentry/core", "FunctionToString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core", "FunctionToString.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/core", "Hub")
  @js.native
  /**
    * Creates a new instance of the hub, will push one {@link Layer} into the
    * internal stack on creation.
    *
    * @param client bound to the hub.
    * @param scope bound to the hub.
    * @param version number, higher number means higher priority.
    */
  open class Hub ()
    extends typings.sentryCore.typesHubMod.Hub {
    def this(client: Client[ClientOptions[BaseTransportOptions]]) = this()
    def this(client: Unit, scope: typings.sentryCore.typesScopeMod.Scope) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: typings.sentryCore.typesScopeMod.Scope) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: typings.sentryCore.typesScopeMod.Scope, _version: Double) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: Unit, _version: Double) = this()
    def this(
      client: Client[ClientOptions[BaseTransportOptions]],
      scope: typings.sentryCore.typesScopeMod.Scope,
      _version: Double
    ) = this()
  }
  
  @JSImport("@sentry/core", "IdleTransaction")
  @js.native
  open class IdleTransaction protected ()
    extends typings.sentryCore.typesTracingMod.IdleTransaction {
    def this(transactionContext: TransactionContext, _idleHub: typings.sentryCore.typesHubMod.Hub) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: typings.sentryCore.typesHubMod.Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
  }
  
  @JSImport("@sentry/core", "InboundFilters")
  @js.native
  open class InboundFilters ()
    extends typings.sentryCore.typesIntegrationsMod.InboundFilters {
    def this(_options: PartialInboundFiltersOpti) = this()
  }
  /* static members */
  object InboundFilters {
    
    @JSImport("@sentry/core", "InboundFilters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core", "InboundFilters.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  object Integrations {
    
    @JSImport("@sentry/core", "Integrations.FunctionToString")
    @js.native
    open class FunctionToString ()
      extends typings.sentryCore.typesIntegrationsMod.FunctionToString
    /* static members */
    object FunctionToString {
      
      @JSImport("@sentry/core", "Integrations.FunctionToString")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @inheritDoc
        */
      @JSImport("@sentry/core", "Integrations.FunctionToString.id")
      @js.native
      def id: String = js.native
      inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@sentry/core", "Integrations.InboundFilters")
    @js.native
    open class InboundFilters ()
      extends typings.sentryCore.typesIntegrationsMod.InboundFilters {
      def this(_options: PartialInboundFiltersOpti) = this()
    }
    /* static members */
    object InboundFilters {
      
      @JSImport("@sentry/core", "Integrations.InboundFilters")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @inheritDoc
        */
      @JSImport("@sentry/core", "Integrations.InboundFilters.id")
      @js.native
      def id: String = js.native
      inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@sentry/core", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "7.56.0" */ String = js.native
  
  @JSImport("@sentry/core", "Scope")
  @js.native
  open class Scope ()
    extends typings.sentryCore.typesScopeMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/core", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typings.sentryCore.typesScopeMod.Scope): typings.sentryCore.typesScopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesScopeMod.Scope]
  }
  
  @JSImport("@sentry/core", "SessionFlusher")
  @js.native
  open class SessionFlusher protected ()
    extends typings.sentryCore.typesSessionflusherMod.SessionFlusher {
    def this(client: Client[ClientOptions[BaseTransportOptions]], attrs: ReleaseHealthAttributes) = this()
  }
  
  @JSImport("@sentry/core", "Span")
  @js.native
  /**
    * You should never call the constructor manually, always use `Sentry.startTransaction()`
    * or call `startChild()` on an existing span.
    * @internal
    * @hideconstructor
    * @hidden
    */
  open class Span ()
    extends typings.sentryCore.typesTracingMod.Span {
    def this(spanContext: SpanContext) = this()
  }
  
  @JSImport("@sentry/core", "SpanStatus")
  @js.native
  object SpanStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryCore.typesTracingSpanstatusMod.SpanStatus & String] = js.native
    
    /* "aborted" */ val Aborted: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Aborted & String = js.native
    
    /* "already_exists" */ val AlreadyExists: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.AlreadyExists & String = js.native
    
    /* "cancelled" */ val Cancelled: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Cancelled & String = js.native
    
    /* "data_loss" */ val DataLoss: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.DataLoss & String = js.native
    
    /* "deadline_exceeded" */ val DeadlineExceeded: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.DeadlineExceeded & String = js.native
    
    /* "failed_precondition" */ val FailedPrecondition: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.FailedPrecondition & String = js.native
    
    /* "internal_error" */ val InternalError: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.InternalError & String = js.native
    
    /* "invalid_argument" */ val InvalidArgument: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.InvalidArgument & String = js.native
    
    /* "not_found" */ val NotFound: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.NotFound & String = js.native
    
    /* "ok" */ val Ok: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Ok & String = js.native
    
    /* "out_of_range" */ val OutOfRange: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.OutOfRange & String = js.native
    
    /* "permission_denied" */ val PermissionDenied: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.PermissionDenied & String = js.native
    
    /* "resource_exhausted" */ val ResourceExhausted: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.ResourceExhausted & String = js.native
    
    /* "unauthenticated" */ val Unauthenticated: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unauthenticated & String = js.native
    
    /* "unavailable" */ val Unavailable: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unavailable & String = js.native
    
    /* "unimplemented" */ val Unimplemented: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unimplemented & String = js.native
    
    /* "unknown_error" */ val UnknownError: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.UnknownError & String = js.native
  }
  
  object TRACING_DEFAULTS {
    
    @JSImport("@sentry/core", "TRACING_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@sentry/core", "TRACING_DEFAULTS.finalTimeout")
    @js.native
    def finalTimeout: Double = js.native
    inline def finalTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finalTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/core", "TRACING_DEFAULTS.heartbeatInterval")
    @js.native
    def heartbeatInterval: Double = js.native
    inline def heartbeatInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/core", "TRACING_DEFAULTS.idleTimeout")
    @js.native
    def idleTimeout: Double = js.native
    inline def idleTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/core", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.sentryCore.typesTracingMod.Transaction {
    /**
      * This constructor should never be called manually. Those instrumenting tracing should use
      * `Sentry.startTransaction()`, and internal methods should use `hub.startTransaction()`.
      * @internal
      * @hideconstructor
      * @hidden
      */
    def this(transactionContext: TransactionContext) = this()
    def this(transactionContext: TransactionContext, hub: typings.sentryCore.typesHubMod.Hub) = this()
  }
  
  inline def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCallBreadcrumbHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallBreadcrumbHint]]
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addTracingExtensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTracingExtensions")().asInstanceOf[Unit]
  
  inline def captureCheckIn(checkIn: CheckIn): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureCheckIn")(checkIn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def captureCheckIn(checkIn: CheckIn, upsertMonitorConfig: MonitorConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureCheckIn")(checkIn.asInstanceOf[js.Any], upsertMonitorConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def captureEvent(event: Event): ReturnType[FnCallEventHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallEventHint]]
  inline def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallEventHint]]
  
  inline def captureException(exception: Any): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  inline def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCall] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCall]]
  
  inline def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  
  inline def closeSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closeSession_ok(session: Session, status: Exclude[SessionStatus, ok]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def configureScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn): CheckInEvelope = ^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any]).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: Unit, tunnel: String): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: Unit, tunnel: String, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: Unit, tunnel: Unit, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata, tunnel: String): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata, tunnel: String, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata, tunnel: Unit, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit | TransportMakeRequestResponse]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def ensureHubOnCarrier(carrier: Carrier): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureHubOnCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ensureHubOnCarrier(carrier: Carrier, parent: typings.sentryCore.typesHubMod.Hub): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureHubOnCarrier")(carrier.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractTraceparentData(traceparent: String): js.UndefOr[TraceparentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTraceparentData")(traceparent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TraceparentData]]
  
  inline def getActiveTransaction[T /* <: typings.sentryTypes.typesTransactionMod.Transaction */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")().asInstanceOf[js.UndefOr[T]]
  inline def getActiveTransaction[T /* <: typings.sentryTypes.typesTransactionMod.Transaction */](maybeHub: typings.sentryCore.typesHubMod.Hub): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")(maybeHub.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def getCurrentHub(): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents, tunnelOrOptions: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any], tunnelOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents, tunnelOrOptions: ClientOptions[BaseTransportOptions]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any], tunnelOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getHubFromCarrier(carrier: Carrier): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def getIntegrationsToSetup(options: Options[BaseTransportOptions]): js.Array[Integration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationsToSetup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Integration]]
  
  inline def getMainCarrier(): Carrier = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainCarrier")().asInstanceOf[Carrier]
  
  inline def getReportDialogEndpoint(dsnLike: DsnLike, dialogOptions: Dictkey): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getReportDialogEndpoint")(dsnLike.asInstanceOf[js.Any], dialogOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasTracingEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTracingEnabled")().asInstanceOf[Boolean]
  inline def hasTracingEnabled(maybeOptions: PickOptionsBaseTransportO): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTracingEnabled")(maybeOptions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def initAndBind[F /* <: Client[ClientOptions[BaseTransportOptions]] */, O /* <: ClientOptions[BaseTransportOptions] */](clientClass: ClientClass[F, O], options: O): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initAndBind")(clientClass.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def makeMain(hub: typings.sentryCore.typesHubMod.Hub): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def makeMultiplexedTransport[TO /* <: BaseTransportOptions */](createTransport: js.Function1[/* options */ TO, Transport], matcher: Matcher): js.Function1[/* options */ TO, Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMultiplexedTransport")(createTransport.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* options */ TO, Transport]]
  
  inline def makeOfflineTransport[TO](createTransport: js.Function1[/* options */ TO, Transport]): js.Function1[/* options */ TO & OfflineTransportOptions, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOfflineTransport")(createTransport.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ TO & OfflineTransportOptions, Transport]]
  
  inline def makeSession(): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")().asInstanceOf[Session]
  inline def makeSession(context: OmitSessionContextstarted): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")(context.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  inline def prepareEvent(options: ClientOptions[BaseTransportOptions], event: Event, hint: EventHint): PromiseLike[Event | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareEvent")(options.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event | Null]]
  inline def prepareEvent(
    options: ClientOptions[BaseTransportOptions],
    event: Event,
    hint: EventHint,
    scope: typings.sentryCore.typesScopeMod.Scope
  ): PromiseLike[Event | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareEvent")(options.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event | Null]]
  
  inline def runWithAsyncContext[T](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runWithAsyncContext")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def runWithAsyncContext[T](callback: js.Function0[T], options: RunWithAsyncContextOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runWithAsyncContext")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setAsyncContextStrategy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncContextStrategy")().asInstanceOf[Unit]
  inline def setAsyncContextStrategy(strategy: AsyncContextStrategy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncContextStrategy")(strategy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setContext(name: String): ReturnType[FnCallNameContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallNameContext]]
  inline def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallNameContext]]
  
  inline def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]]]
  
  inline def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* extras */ Extras, Unit]]]
  
  inline def setHubOnCarrier(carrier: Carrier, hub: typings.sentryCore.typesHubMod.Hub): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHubOnCarrier")(carrier.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]]]
  
  inline def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]]]
  
  inline def setUser(): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[ReturnType[FnCallUser]]
  inline def setUser(user: User): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallUser]]
  
  inline def spanStatusfromHttpCode(httpStatus: Double): SpanStatusType = ^.asInstanceOf[js.Dynamic].applyDynamic("spanStatusfromHttpCode")(httpStatus.asInstanceOf[js.Any]).asInstanceOf[SpanStatusType]
  
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: typings.sentryCore.typesHubMod.Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  
  inline def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  inline def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  
  inline def trace[T](
    context: TransactionContext,
    callback: js.Function1[/* span */ js.UndefOr[typings.sentryCore.typesTracingSpanMod.Span], T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def trace[T](
    context: TransactionContext,
    callback: js.Function1[/* span */ js.UndefOr[typings.sentryCore.typesTracingSpanMod.Span], T],
    onError: js.Function1[/* error */ Any, Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def updateSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateSession(session: Session, context: SessionContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
}
