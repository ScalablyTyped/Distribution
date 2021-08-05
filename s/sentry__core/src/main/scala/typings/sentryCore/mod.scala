package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryCore.basebackendMod.Backend
import typings.sentryCore.basebackendMod.BackendClass
import typings.sentryCore.sdkMod.ClientClass
import typings.sentryHub.interfacesMod.Carrier
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.dsnMod.DsnLike
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.extraMod.Extra
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.requestMod.SentryRequest
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.transactionMod.CustomSamplingContext
import typings.sentryTypes.transactionMod.Transaction
import typings.sentryTypes.transactionMod.TransactionContext
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core", "API")
  @js.native
  class API protected ()
    extends typings.sentryCore.apiMod.API {
    /** Create a new instance of API */
    def this(dsn: DsnLike) = this()
  }
  
  @JSImport("@sentry/core", "BaseBackend")
  @js.native
  abstract class BaseBackend[O /* <: Options */] protected ()
    extends typings.sentryCore.basebackendMod.BaseBackend[O] {
    /** Creates a new backend instance. */
    def this(options: O) = this()
  }
  
  @JSImport("@sentry/core", "BaseClient")
  @js.native
  abstract class BaseClient[B /* <: Backend */, O /* <: Options */] protected ()
    extends typings.sentryCore.baseclientMod.BaseClient[B, O] {
    /**
      * Initializes this client instance.
      *
      * @param backendClass A constructor function to create the backend.
      * @param options Options for the client.
      */
    /* protected */ def this(backendClass: BackendClass[B, O], options: O) = this()
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
  class Hub ()
    extends typings.sentryHub.mod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: Unit, _version: Double) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  object Integrations {
    
    @JSImport("@sentry/core", "Integrations.FunctionToString")
    @js.native
    class FunctionToString ()
      extends typings.sentryCore.integrationsMod.FunctionToString
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
    class InboundFilters ()
      extends typings.sentryCore.integrationsMod.InboundFilters {
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
  
  @JSImport("@sentry/core", "NoopTransport")
  @js.native
  class NoopTransport ()
    extends typings.sentryCore.noopMod.NoopTransport
  
  @JSImport("@sentry/core", "Scope")
  @js.native
  class Scope ()
    extends typings.sentryHub.mod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/core", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typings.sentryHub.scopeMod.Scope): typings.sentryHub.scopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.scopeMod.Scope]
  }
  
  inline def addBreadcrumb(breadcrumb: Breadcrumb): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def captureEvent(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def captureException(exception: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def captureException(exception: js.Any, captureContext: CaptureContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def captureMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def captureMessage(message: String, captureContext: CaptureContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def captureMessage(message: String, captureContext: Severity): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def configureScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def eventToSentryRequest(event: Event, api: typings.sentryCore.apiMod.API): SentryRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("eventToSentryRequest")(event.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[SentryRequest]
  
  inline def getCurrentHub(): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def initAndBind[F /* <: Client[Options] */, O /* <: Options */](clientClass: ClientClass[F, O], options: O): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initAndBind")(clientClass.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def makeMain(hub: typings.sentryHub.hubMod.Hub): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def sessionToSentryRequest(session: Session, api: typings.sentryCore.apiMod.API): SentryRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("sessionToSentryRequest")(session.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[SentryRequest]
  
  inline def setContext(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setContext(name: String, context: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setExtra(key: String, extra: Extra): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setExtras(extras: Extras): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTag(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTags(tags: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[Unit]
  inline def setUser(user: User): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startTransaction(context: TransactionContext): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  inline def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  inline def withScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
