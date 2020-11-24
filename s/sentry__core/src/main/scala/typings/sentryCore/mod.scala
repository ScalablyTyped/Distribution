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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
  
  def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
  
  def captureEvent(event: Event): String = js.native
  
  def captureException(exception: js.Any): String = js.native
  def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
  
  def captureMessage(message: String): String = js.native
  def captureMessage(message: String, captureContext: CaptureContext): String = js.native
  def captureMessage(message: String, captureContext: Severity): String = js.native
  
  def configureScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = js.native
  
  def eventToSentryRequest(event: Event, api: typings.sentryCore.apiMod.API): SentryRequest = js.native
  
  def getCurrentHub(): typings.sentryHub.hubMod.Hub = js.native
  
  def getHubFromCarrier(carrier: Carrier): typings.sentryHub.hubMod.Hub = js.native
  
  def initAndBind[F /* <: Client[Options] */, O /* <: Options */](clientClass: ClientClass[F, O], options: O): Unit = js.native
  
  def makeMain(hub: typings.sentryHub.hubMod.Hub): typings.sentryHub.hubMod.Hub = js.native
  
  def sessionToSentryRequest(session: Session, api: typings.sentryCore.apiMod.API): SentryRequest = js.native
  
  def setContext(name: String): Unit = js.native
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
  
  def setExtra(key: String, extra: Extra): Unit = js.native
  
  def setExtras(extras: Extras): Unit = js.native
  
  def setTag(key: String, value: String): Unit = js.native
  
  def setTags(tags: StringDictionary[String]): Unit = js.native
  
  def setUser(): Unit = js.native
  def setUser(user: User): Unit = js.native
  
  def startTransaction(context: TransactionContext): Transaction = js.native
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
  
  def withScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = js.native
  
  @js.native
  class API protected ()
    extends typings.sentryCore.apiMod.API {
    /** Create a new instance of API */
    def this(dsn: DsnLike) = this()
  }
  
  @js.native
  abstract class BaseBackend[O /* <: Options */] protected ()
    extends typings.sentryCore.basebackendMod.BaseBackend[O] {
    /** Creates a new backend instance. */
    def this(options: O) = this()
  }
  
  @js.native
  abstract class BaseClient[B /* <: Backend */, O /* <: Options */] protected ()
    extends typings.sentryCore.baseclientMod.BaseClient[B, O] {
    /**
      * Initializes this client instance.
      *
      * @param backendClass A constructor function to create the backend.
      * @param options Options for the client.
      */
    protected def this(backendClass: BackendClass[B, O], options: O) = this()
  }
  
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
    def this(client: js.UndefOr[scala.Nothing], scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  @js.native
  object Integrations extends js.Object {
    
    @js.native
    class FunctionToString ()
      extends typings.sentryCore.integrationsMod.FunctionToString
    /* static members */
    @js.native
    object FunctionToString extends js.Object {
      
      /**
        * @inheritDoc
        */
      var id: String = js.native
    }
    
    @js.native
    class InboundFilters ()
      extends typings.sentryCore.integrationsMod.InboundFilters {
      def this(_options: PartialInboundFiltersOpti) = this()
    }
    /* static members */
    @js.native
    object InboundFilters extends js.Object {
      
      /**
        * @inheritDoc
        */
      var id: String = js.native
    }
  }
  
  @js.native
  class NoopTransport ()
    extends typings.sentryCore.noopMod.NoopTransport
  
  @js.native
  class Scope ()
    extends typings.sentryHub.mod.Scope
  /* static members */
  @js.native
  object Scope extends js.Object {
    
    def clone(scope: typings.sentryHub.scopeMod.Scope): typings.sentryHub.scopeMod.Scope = js.native
  }
}
