package typings.sentryBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.Key
import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryBrowser.anon.TypeofBreadcrumbs
import typings.sentryBrowser.anon.TypeofCoreIntegrations
import typings.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typings.sentryBrowser.anon.TypeofGlobalHandlers
import typings.sentryBrowser.anon.TypeofLinkedErrors
import typings.sentryBrowser.anon.TypeofTryCatch
import typings.sentryBrowser.anon.TypeofUserAgent
import typings.sentryBrowser.backendMod.BrowserOptions
import typings.sentryBrowser.globalhandlersMod.GlobalHandlersIntegrations
import typings.sentryBrowser.helpersMod.ReportDialogOptions
import typings.sentryBrowser.integrationsMod.Breadcrumbs
import typings.sentryBrowser.integrationsMod.GlobalHandlers
import typings.sentryBrowser.integrationsMod.LinkedErrors
import typings.sentryBrowser.integrationsMod.TryCatch
import typings.sentryBrowser.integrationsMod.UserAgent
import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import typings.sentryHub.interfacesMod.Carrier
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.extraMod.Extra
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.transactionMod.CustomSamplingContext
import typings.sentryTypes.transactionMod.Transaction
import typings.sentryTypes.transactionMod.TransactionContext
import typings.sentryTypes.transportMod.TransportOptions
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/browser", "BrowserClient")
  @js.native
  /**
    * Creates a new Browser SDK instance.
    *
    * @param options Configuration options for this SDK.
    */
  class BrowserClient ()
    extends typings.sentryBrowser.exportsMod.BrowserClient {
    def this(options: BrowserOptions) = this()
  }
  
  @JSImport("@sentry/browser", "Hub")
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
    extends typings.sentryBrowser.exportsMod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: Unit, _version: Double) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  object Integrations {
    
    @JSImport("@sentry/browser", "Integrations")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.Breadcrumbs")
    @js.native
    /**
      * @inheritDoc
      */
    class Breadcrumbs ()
      extends typings.sentryBrowser.integrationsMod.Breadcrumbs {
      def this(options: PartialBreadcrumbsOptions) = this()
    }
    @JSImport("@sentry/browser", "Integrations.Breadcrumbs")
    @js.native
    def Breadcrumbs: TypeofBreadcrumbs = js.native
    @scala.inline
    def Breadcrumbs_=(x: TypeofBreadcrumbs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Breadcrumbs")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.FunctionToString")
    @js.native
    class FunctionToString ()
      extends typings.sentryCore.mod.Integrations.FunctionToString
    @JSImport("@sentry/browser", "Integrations.FunctionToString")
    @js.native
    def FunctionToString: TypeofCoreIntegrations = js.native
    @scala.inline
    def FunctionToString_=(x: TypeofCoreIntegrations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionToString")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.GlobalHandlers")
    @js.native
    /** JSDoc */
    class GlobalHandlers ()
      extends typings.sentryBrowser.integrationsMod.GlobalHandlers {
      def this(options: GlobalHandlersIntegrations) = this()
    }
    @JSImport("@sentry/browser", "Integrations.GlobalHandlers")
    @js.native
    def GlobalHandlers: TypeofGlobalHandlers = js.native
    @scala.inline
    def GlobalHandlers_=(x: TypeofGlobalHandlers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalHandlers")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.InboundFilters")
    @js.native
    class InboundFilters ()
      extends typings.sentryCore.mod.Integrations.InboundFilters
    @JSImport("@sentry/browser", "Integrations.InboundFilters")
    @js.native
    def InboundFilters: TypeofCoreIntegrationsInstantiable = js.native
    @scala.inline
    def InboundFilters_=(x: TypeofCoreIntegrationsInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InboundFilters")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.LinkedErrors")
    @js.native
    /**
      * @inheritDoc
      */
    class LinkedErrors ()
      extends typings.sentryBrowser.integrationsMod.LinkedErrors {
      def this(options: Key) = this()
    }
    @JSImport("@sentry/browser", "Integrations.LinkedErrors")
    @js.native
    def LinkedErrors: TypeofLinkedErrors = js.native
    @scala.inline
    def LinkedErrors_=(x: TypeofLinkedErrors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinkedErrors")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.TryCatch")
    @js.native
    /**
      * @inheritDoc
      */
    class TryCatch ()
      extends typings.sentryBrowser.integrationsMod.TryCatch {
      def this(options: PartialTryCatchOptions) = this()
    }
    @JSImport("@sentry/browser", "Integrations.TryCatch")
    @js.native
    def TryCatch: TypeofTryCatch = js.native
    @scala.inline
    def TryCatch_=(x: TypeofTryCatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TryCatch")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.UserAgent")
    @js.native
    class UserAgent ()
      extends typings.sentryBrowser.integrationsMod.UserAgent
    @JSImport("@sentry/browser", "Integrations.UserAgent")
    @js.native
    def UserAgent: TypeofUserAgent = js.native
    @scala.inline
    def UserAgent_=(x: TypeofUserAgent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserAgent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "SDK_NAME")
  @js.native
  val SDK_NAME: /* "sentry.javascript.browser" */ String = js.native
  
  @JSImport("@sentry/browser", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "5.27.4" */ String = js.native
  
  @JSImport("@sentry/browser", "Scope")
  @js.native
  class Scope ()
    extends typings.sentryBrowser.exportsMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/browser", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def clone(scope: typings.sentryHub.scopeMod.Scope): typings.sentryHub.scopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.scopeMod.Scope]
  }
  
  @JSImport("@sentry/browser", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.severityMod.Severity & String] = js.native
    
    /* "critical" */ val Critical: typings.sentryTypes.severityMod.Severity.Critical & String = js.native
    
    /* "debug" */ val Debug: typings.sentryTypes.severityMod.Severity.Debug & String = js.native
    
    /* "error" */ val Error: typings.sentryTypes.severityMod.Severity.Error & String = js.native
    
    /* "fatal" */ val Fatal: typings.sentryTypes.severityMod.Severity.Fatal & String = js.native
    
    /* "info" */ val Info: typings.sentryTypes.severityMod.Severity.Info & String = js.native
    
    /* "log" */ val Log: typings.sentryTypes.severityMod.Severity.Log & String = js.native
    
    /* "warning" */ val Warning: typings.sentryTypes.severityMod.Severity.Warning & String = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): typings.sentryTypes.severityMod.Severity = js.native
  }
  
  @JSImport("@sentry/browser", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.statusMod.Status & String] = js.native
    
    /* "failed" */ val Failed: typings.sentryTypes.statusMod.Status.Failed & String = js.native
    
    /* "invalid" */ val Invalid: typings.sentryTypes.statusMod.Status.Invalid & String = js.native
    
    /* "rate_limit" */ val RateLimit: typings.sentryTypes.statusMod.Status.RateLimit & String = js.native
    
    /* "skipped" */ val Skipped: typings.sentryTypes.statusMod.Status.Skipped & String = js.native
    
    /* "success" */ val Success: typings.sentryTypes.statusMod.Status.Success & String = js.native
    
    /* "unknown" */ val Unknown: typings.sentryTypes.statusMod.Status.Unknown & String = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): typings.sentryTypes.statusMod.Status = js.native
  }
  
  object Transports {
    
    @JSImport("@sentry/browser", "Transports.BaseTransport")
    @js.native
    abstract class BaseTransport protected ()
      extends typings.sentryBrowser.transportsMod.BaseTransport {
      def this(options: TransportOptions) = this()
    }
    
    @JSImport("@sentry/browser", "Transports.FetchTransport")
    @js.native
    class FetchTransport protected ()
      extends typings.sentryBrowser.transportsMod.FetchTransport {
      def this(options: TransportOptions) = this()
    }
    
    @JSImport("@sentry/browser", "Transports.XHRTransport")
    @js.native
    class XHRTransport protected ()
      extends typings.sentryBrowser.transportsMod.XHRTransport {
      def this(options: TransportOptions) = this()
    }
  }
  
  @scala.inline
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def captureEvent(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def captureException(exception: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def captureException(exception: js.Any, captureContext: CaptureContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def captureMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def captureMessage(message: String, captureContext: CaptureContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def captureMessage(message: String, captureContext: Severity): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def close(): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Thenable[Boolean]]
  @scala.inline
  def close(timeout: Double): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Boolean]]
  
  @scala.inline
  def configureScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@sentry/browser", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
  ] = js.native
  
  @scala.inline
  def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(options.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(options.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  
  @scala.inline
  def eventFromMessage(options: Options, message: String): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromMessage(options: Options, message: String, level: Unit, hint: EventHint): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromMessage(options: Options, message: String, level: Severity): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromMessage(options: Options, message: String, level: Severity, hint: EventHint): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  
  @scala.inline
  def flush(): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[js.Thenable[Boolean]]
  @scala.inline
  def flush(timeout: Double): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Boolean]]
  
  @scala.inline
  def forceLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLoad")().asInstanceOf[Unit]
  
  @scala.inline
  def getCurrentHub(): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  @scala.inline
  def getHubFromCarrier(carrier: Carrier): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  @scala.inline
  def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  @scala.inline
  def init(options: BrowserOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def injectReportDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectReportDialog")().asInstanceOf[Unit]
  @scala.inline
  def injectReportDialog(options: ReportDialogOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectReportDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def makeMain(hub: typings.sentryHub.hubMod.Hub): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  @scala.inline
  def onLoad(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setContext(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setExtra(key: String, extra: Extra): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setExtras(extras: Extras): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTag(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setTags(tags: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[Unit]
  @scala.inline
  def setUser(user: User): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def showReportDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")().asInstanceOf[Unit]
  @scala.inline
  def showReportDialog(options: ReportDialogOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def startTransaction(context: TransactionContext): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  @scala.inline
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  @scala.inline
  def withScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def wrap(fn: js.Function1[/* args */ js.Any, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
