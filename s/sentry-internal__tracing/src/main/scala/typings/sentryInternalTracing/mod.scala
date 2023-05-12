package typings.sentryInternalTracing

import typings.sentryCore.anon.PickOptionsBaseTransportO
import typings.sentryCore.typesHubMod.Hub
import typings.sentryCore.typesTracingSpanMod.SpanStatusType
import typings.sentryInternalTracing.anon.App
import typings.sentryInternalTracing.anon.Client
import typings.sentryInternalTracing.anon.Headers
import typings.sentryInternalTracing.anon.PartialBrowserTracingOpti
import typings.sentryInternalTracing.anon.PartialDynamicSamplingCon
import typings.sentryInternalTracing.anon.PartialRequestInstrumenta
import typings.sentryInternalTracing.typesBrowserRequestMod.PolymorphicRequestHeaders
import typings.sentryInternalTracing.typesBrowserRequestMod.RequestInstrumentationOptions
import typings.sentryInternalTracing.typesNodeIntegrationsApolloMod.ApolloOptions
import typings.sentryInternalTracing.typesNodeIntegrationsLazyMod.LazyLoadedIntegration
import typings.sentryInternalTracing.typesNodeIntegrationsMongoMod.MongoOptions
import typings.sentryInternalTracing.typesNodeIntegrationsPostgresMod.PgOptions
import typings.sentryTypes.typesSpanMod.SpanContext
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TraceparentData
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry-internal/tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry-internal/tracing", "Apollo")
  @js.native
  /**
    * @inheritDoc
    */
  open class Apollo ()
    extends typings.sentryInternalTracing.typesNodeMod.Apollo {
    def this(options: ApolloOptions) = this()
  }
  /* static members */
  object Apollo {
    
    @JSImport("@sentry-internal/tracing", "Apollo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing", "Apollo.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing", "BROWSER_TRACING_INTEGRATION_ID")
  @js.native
  val BROWSER_TRACING_INTEGRATION_ID: /* "BrowserTracing" */ String = js.native
  
  @JSImport("@sentry-internal/tracing", "BrowserTracing")
  @js.native
  open class BrowserTracing ()
    extends typings.sentryInternalTracing.typesBrowserMod.BrowserTracing {
    def this(_options: PartialBrowserTracingOpti) = this()
  }
  
  @JSImport("@sentry-internal/tracing", "Express")
  @js.native
  /**
    * @inheritDoc
    */
  open class Express ()
    extends typings.sentryInternalTracing.typesNodeMod.Express {
    def this(options: App) = this()
  }
  /* static members */
  object Express {
    
    @JSImport("@sentry-internal/tracing", "Express")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing", "Express.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing", "GraphQL")
  @js.native
  open class GraphQL ()
    extends typings.sentryInternalTracing.typesNodeMod.GraphQL
  /* static members */
  object GraphQL {
    
    @JSImport("@sentry-internal/tracing", "GraphQL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing", "GraphQL.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing", "IdleTransaction")
  @js.native
  open class IdleTransaction protected ()
    extends typings.sentryInternalTracing.typesExportsMod.IdleTransaction {
    def this(transactionContext: TransactionContext, _idleHub: Hub) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
      _idleHub: Hub,
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
  
  @JSImport("@sentry-internal/tracing", "Mongo")
  @js.native
  /**
    * @inheritDoc
    */
  open class Mongo ()
    extends typings.sentryInternalTracing.typesNodeMod.Mongo {
    def this(options: MongoOptions) = this()
  }
  /* static members */
  object Mongo {
    
    @JSImport("@sentry-internal/tracing", "Mongo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing", "Mongo.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing", "Mysql")
  @js.native
  open class Mysql ()
    extends typings.sentryInternalTracing.typesNodeMod.Mysql
  /* static members */
  object Mysql {
    
    @JSImport("@sentry-internal/tracing", "Mysql")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing", "Mysql.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing", "Postgres")
  @js.native
  open class Postgres ()
    extends typings.sentryInternalTracing.typesNodeMod.Postgres {
    def this(options: PgOptions) = this()
  }
  /* static members */
  object Postgres {
    
    @JSImport("@sentry-internal/tracing", "Postgres")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing", "Postgres.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing", "Prisma")
  @js.native
  /**
    * @inheritDoc
    */
  open class Prisma ()
    extends typings.sentryInternalTracing.typesNodeMod.Prisma {
    def this(options: Client) = this()
  }
  /* static members */
  object Prisma {
    
    @JSImport("@sentry-internal/tracing", "Prisma")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing", "Prisma.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing", "Span")
  @js.native
  /**
    * You should never call the constructor manually, always use `Sentry.startTransaction()`
    * or call `startChild()` on an existing span.
    * @internal
    * @hideconstructor
    * @hidden
    */
  open class Span ()
    extends typings.sentryInternalTracing.typesExportsMod.Span {
    def this(spanContext: SpanContext) = this()
  }
  
  @JSImport("@sentry-internal/tracing", "SpanStatus")
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
  
  @JSImport("@sentry-internal/tracing", "TRACEPARENT_REGEXP")
  @js.native
  val TRACEPARENT_REGEXP: js.RegExp = js.native
  
  @JSImport("@sentry-internal/tracing", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.sentryInternalTracing.typesExportsMod.Transaction {
    /**
      * This constructor should never be called manually. Those instrumenting tracing should use
      * `Sentry.startTransaction()`, and internal methods should use `hub.startTransaction()`.
      * @internal
      * @hideconstructor
      * @hidden
      */
    def this(transactionContext: TransactionContext) = this()
    def this(transactionContext: TransactionContext, hub: Hub) = this()
  }
  
  inline def addExtensionMethods(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtensionMethods")().asInstanceOf[Unit]
  
  inline def addTracingHeadersToFetchRequest(
    request: String,
    // unknown is actually type Request but we can't export DOM types from this package,
  dynamicSamplingContext: PartialDynamicSamplingCon,
    span: typings.sentryTypes.typesSpanMod.Span,
    options: Headers
  ): PolymorphicRequestHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("addTracingHeadersToFetchRequest")(request.asInstanceOf[js.Any], dynamicSamplingContext.asInstanceOf[js.Any], span.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PolymorphicRequestHeaders]
  inline def addTracingHeadersToFetchRequest(
    request: Any,
    // unknown is actually type Request but we can't export DOM types from this package,
  dynamicSamplingContext: PartialDynamicSamplingCon,
    span: typings.sentryTypes.typesSpanMod.Span,
    options: Headers
  ): PolymorphicRequestHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("addTracingHeadersToFetchRequest")(request.asInstanceOf[js.Any], dynamicSamplingContext.asInstanceOf[js.Any], span.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PolymorphicRequestHeaders]
  
  @JSImport("@sentry-internal/tracing", "defaultRequestInstrumentationOptions")
  @js.native
  val defaultRequestInstrumentationOptions: RequestInstrumentationOptions = js.native
  
  inline def extractTraceparentData(traceparent: String): js.UndefOr[TraceparentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTraceparentData")(traceparent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TraceparentData]]
  
  inline def getActiveTransaction[T /* <: typings.sentryTypes.typesTransactionMod.Transaction */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")().asInstanceOf[js.UndefOr[T]]
  inline def getActiveTransaction[T /* <: typings.sentryTypes.typesTransactionMod.Transaction */](maybeHub: Hub): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")(maybeHub.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def hasTracingEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTracingEnabled")().asInstanceOf[Boolean]
  inline def hasTracingEnabled(maybeOptions: PickOptionsBaseTransportO): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTracingEnabled")(maybeOptions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def instrumentOutgoingRequests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instrumentOutgoingRequests")().asInstanceOf[Unit]
  inline def instrumentOutgoingRequests(_options: PartialRequestInstrumenta): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instrumentOutgoingRequests")(_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@sentry-internal/tracing", "lazyLoadedNodePerformanceMonitoringIntegrations")
  @js.native
  val lazyLoadedNodePerformanceMonitoringIntegrations: js.Array[js.Function0[LazyLoadedIntegration[js.Object]]] = js.native
  
  inline def spanStatusfromHttpCode(httpStatus: Double): SpanStatusType = ^.asInstanceOf[js.Dynamic].applyDynamic("spanStatusfromHttpCode")(httpStatus.asInstanceOf[js.Any]).asInstanceOf[SpanStatusType]
  
  inline def startIdleTransaction(hub: Hub, transactionContext: TransactionContext, idleTimeout: Double, finalTimeout: Double): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  
  inline def stripUrlQueryAndFragment(urlPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrlQueryAndFragment")(urlPath.asInstanceOf[js.Any]).asInstanceOf[String]
}
