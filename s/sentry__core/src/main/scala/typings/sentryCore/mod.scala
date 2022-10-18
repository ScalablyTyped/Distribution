package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.anon.Dictkey
import typings.sentryCore.anon.FnCall
import typings.sentryCore.anon.FnCallCallback
import typings.sentryCore.anon.FnCallContextCustomSamplingContext
import typings.sentryCore.anon.FnCallEventHint
import typings.sentryCore.anon.FnCallExceptionHint
import typings.sentryCore.anon.FnCallMessageLevelHint
import typings.sentryCore.anon.FnCallNameContext
import typings.sentryCore.anon.FnCallUser
import typings.sentryCore.anon.OmitSessionContextstarted
import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryCore.sentryCoreStrings.ok
import typings.sentryCore.typesHubMod.Carrier
import typings.sentryCore.typesIntegrationMod.sentryTypesAugmentingMod.Integration
import typings.sentryCore.typesSdkMod.ClientClass
import typings.sentryCore.typesSessionflusherMod.ReleaseHealthAttributes
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesDsnMod.DsnLike
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesExtraMod.Extra
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesOptionsMod.Options
import typings.sentryTypes.typesScopeMod.CaptureContext
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSessionMod.SessionContext
import typings.sentryTypes.typesSessionMod.SessionStatus
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import typings.sentryTypes.typesTransportMod.TransportRequestExecutor
import typings.sentryTypes.typesUserMod.User
import typings.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typings.std.Exclude
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
  val SDK_VERSION: /* "7.15.0" */ String = js.native
  
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
  
  inline def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def captureEvent(event: Event): ReturnType[FnCallEventHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallEventHint]]
  inline def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallEventHint]]
  
  inline def captureException(exception: Any): ReturnType[FnCallExceptionHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallExceptionHint]]
  inline def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCallExceptionHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallExceptionHint]]
  
  inline def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  
  inline def closeSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closeSession_ok(session: Session, status: Exclude[SessionStatus, ok]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def configureScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def getCurrentHub(): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents, tunnelOrOptions: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any], tunnelOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents, tunnelOrOptions: ClientOptions[BaseTransportOptions]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any], tunnelOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getHubFromCarrier(carrier: Carrier): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def getIntegrationsToSetup(options: Options[BaseTransportOptions]): js.Array[Integration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationsToSetup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Integration]]
  
  inline def getMainCarrier(): Carrier = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainCarrier")().asInstanceOf[Carrier]
  
  inline def getReportDialogEndpoint(dsnLike: DsnLike, dialogOptions: Dictkey): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getReportDialogEndpoint")(dsnLike.asInstanceOf[js.Any], dialogOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def initAndBind[F /* <: Client[ClientOptions[BaseTransportOptions]] */, O /* <: ClientOptions[BaseTransportOptions] */](clientClass: ClientClass[F, O], options: O): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initAndBind")(clientClass.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def makeMain(hub: typings.sentryCore.typesHubMod.Hub): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def makeSession(): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")().asInstanceOf[Session]
  inline def makeSession(context: OmitSessionContextstarted): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")(context.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  inline def setContext(name: String): ReturnType[FnCallNameContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallNameContext]]
  inline def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallNameContext]]
  
  inline def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]]]
  
  inline def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* extras */ Extras, Unit]]]
  
  inline def setHubOnCarrier(carrier: Carrier, hub: typings.sentryCore.typesHubMod.Hub): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHubOnCarrier")(carrier.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]]]
  
  inline def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]]]
  
  inline def setUser(): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[ReturnType[FnCallUser]]
  inline def setUser(user: User): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallUser]]
  
  inline def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  inline def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  
  inline def updateSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateSession(session: Session, context: SessionContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
}
