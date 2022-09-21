package typings.sentryBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryBrowser.anon.PartialLinkedErrorsOption
import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryBrowser.anon.TypeofBreadcrumbs
import typings.sentryBrowser.anon.TypeofCoreIntegrations
import typings.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typings.sentryBrowser.anon.TypeofDedupe
import typings.sentryBrowser.anon.TypeofGlobalHandlers
import typings.sentryBrowser.anon.TypeofHttpContext
import typings.sentryBrowser.anon.TypeofLinkedErrors
import typings.sentryBrowser.anon.TypeofTryCatch
import typings.sentryBrowser.clientMod.BrowserClientOptions
import typings.sentryBrowser.clientMod.BrowserOptions
import typings.sentryBrowser.globalhandlersMod.GlobalHandlersIntegrations
import typings.sentryBrowser.helpersMod.ReportDialogOptions
import typings.sentryBrowser.typesMod.BrowserTransportOptions
import typings.sentryBrowser.utilsMod.FetchImpl
import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryHub.anon.FnCall
import typings.sentryHub.anon.FnCallBreadcrumbHint
import typings.sentryHub.anon.FnCallCallback
import typings.sentryHub.anon.FnCallContextCustomSamplingContext
import typings.sentryHub.anon.FnCallEventHint
import typings.sentryHub.anon.FnCallMessageLevelHint
import typings.sentryHub.anon.FnCallNameContext
import typings.sentryHub.anon.FnCallUser
import typings.sentryHub.hubMod.Carrier
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.extraMod.Extra
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.miscMod.Primitive
import typings.sentryTypes.optionsMod.ClientOptions
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.severityMod.SeverityLevel
import typings.sentryTypes.stacktraceMod.StackLineParser
import typings.sentryTypes.stacktraceMod.StackParser
import typings.sentryTypes.transactionMod.CustomSamplingContext
import typings.sentryTypes.transactionMod.TransactionContext
import typings.sentryTypes.transportMod.BaseTransportOptions
import typings.sentryTypes.transportMod.InternalBaseTransportOptions
import typings.sentryTypes.transportMod.Transport
import typings.sentryTypes.transportMod.TransportRequestExecutor
import typings.sentryTypes.userMod.User
import typings.sentryUtils.promisebufferMod.PromiseBuffer
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/browser", "Breadcrumbs")
  @js.native
  /**
    * @inheritDoc
    */
  open class Breadcrumbs ()
    extends typings.sentryBrowser.exportsMod.Breadcrumbs {
    def this(options: PartialBreadcrumbsOptions) = this()
  }
  /* static members */
  object Breadcrumbs {
    
    @JSImport("@sentry/browser", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "Breadcrumbs.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "BrowserClient")
  @js.native
  open class BrowserClient protected ()
    extends typings.sentryBrowser.exportsMod.BrowserClient {
    /**
      * Creates a new Browser SDK instance.
      *
      * @param options Configuration options for this SDK.
      */
    def this(options: BrowserClientOptions) = this()
  }
  
  @JSImport("@sentry/browser", "Dedupe")
  @js.native
  open class Dedupe ()
    extends typings.sentryBrowser.exportsMod.Dedupe
  /* static members */
  object Dedupe {
    
    @JSImport("@sentry/browser", "Dedupe")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "Dedupe.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "FunctionToString")
  @js.native
  open class FunctionToString ()
    extends typings.sentryBrowser.exportsMod.FunctionToString
  /* static members */
  object FunctionToString {
    
    @JSImport("@sentry/browser", "FunctionToString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "FunctionToString.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "GlobalHandlers")
  @js.native
  /** JSDoc */
  open class GlobalHandlers ()
    extends typings.sentryBrowser.exportsMod.GlobalHandlers {
    def this(options: GlobalHandlersIntegrations) = this()
  }
  /* static members */
  object GlobalHandlers {
    
    @JSImport("@sentry/browser", "GlobalHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "GlobalHandlers.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "HttpContext")
  @js.native
  open class HttpContext ()
    extends typings.sentryBrowser.exportsMod.HttpContext
  /* static members */
  object HttpContext {
    
    @JSImport("@sentry/browser", "HttpContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "HttpContext.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
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
  open class Hub ()
    extends typings.sentryBrowser.exportsMod.Hub {
    def this(client: Client[ClientOptions[BaseTransportOptions]]) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: Unit, _version: Double) = this()
    def this(
      client: Client[ClientOptions[BaseTransportOptions]],
      scope: typings.sentryHub.scopeMod.Scope,
      _version: Double
    ) = this()
  }
  
  @JSImport("@sentry/browser", "InboundFilters")
  @js.native
  open class InboundFilters ()
    extends typings.sentryBrowser.exportsMod.InboundFilters {
    def this(_options: PartialInboundFiltersOpti) = this()
  }
  /* static members */
  object InboundFilters {
    
    @JSImport("@sentry/browser", "InboundFilters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "InboundFilters.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  object Integrations {
    
    @JSImport("@sentry/browser", "Integrations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@sentry/browser", "Integrations.Breadcrumbs")
    @js.native
    def Breadcrumbs: TypeofBreadcrumbs = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.Breadcrumbs")
    @js.native
    /**
      * @inheritDoc
      */
    open class BreadcrumbsCls ()
      extends typings.sentryBrowser.integrationsMod.Breadcrumbs {
      def this(options: PartialBreadcrumbsOptions) = this()
    }
    
    inline def Breadcrumbs_=(x: TypeofBreadcrumbs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Breadcrumbs")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/browser", "Integrations.Dedupe")
    @js.native
    def Dedupe: TypeofDedupe = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.Dedupe")
    @js.native
    open class DedupeCls ()
      extends typings.sentryBrowser.integrationsMod.Dedupe
    
    inline def Dedupe_=(x: TypeofDedupe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dedupe")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/browser", "Integrations.FunctionToString")
    @js.native
    def FunctionToString: TypeofCoreIntegrations = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.FunctionToString")
    @js.native
    open class FunctionToStringCls ()
      extends typings.sentryCore.mod.Integrations.FunctionToString
    
    inline def FunctionToString_=(x: TypeofCoreIntegrations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionToString")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/browser", "Integrations.GlobalHandlers")
    @js.native
    def GlobalHandlers: TypeofGlobalHandlers = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.GlobalHandlers")
    @js.native
    /** JSDoc */
    open class GlobalHandlersCls ()
      extends typings.sentryBrowser.integrationsMod.GlobalHandlers {
      def this(options: GlobalHandlersIntegrations) = this()
    }
    
    inline def GlobalHandlers_=(x: TypeofGlobalHandlers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalHandlers")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/browser", "Integrations.HttpContext")
    @js.native
    def HttpContext: TypeofHttpContext = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.HttpContext")
    @js.native
    open class HttpContextCls ()
      extends typings.sentryBrowser.integrationsMod.HttpContext
    
    inline def HttpContext_=(x: TypeofHttpContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpContext")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/browser", "Integrations.InboundFilters")
    @js.native
    def InboundFilters: TypeofCoreIntegrationsInstantiable = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.InboundFilters")
    @js.native
    open class InboundFiltersCls ()
      extends typings.sentryCore.mod.Integrations.InboundFilters
    
    inline def InboundFilters_=(x: TypeofCoreIntegrationsInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InboundFilters")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/browser", "Integrations.LinkedErrors")
    @js.native
    def LinkedErrors: TypeofLinkedErrors = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.LinkedErrors")
    @js.native
    /**
      * @inheritDoc
      */
    open class LinkedErrorsCls ()
      extends typings.sentryBrowser.integrationsMod.LinkedErrors {
      def this(options: PartialLinkedErrorsOption) = this()
    }
    
    inline def LinkedErrors_=(x: TypeofLinkedErrors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinkedErrors")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/browser", "Integrations.TryCatch")
    @js.native
    def TryCatch: TypeofTryCatch = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@sentry/browser", "Integrations.TryCatch")
    @js.native
    /**
      * @inheritDoc
      */
    open class TryCatchCls ()
      extends typings.sentryBrowser.integrationsMod.TryCatch {
      def this(options: PartialTryCatchOptions) = this()
    }
    
    inline def TryCatch_=(x: TypeofTryCatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TryCatch")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  open class LinkedErrors ()
    extends typings.sentryBrowser.exportsMod.LinkedErrors {
    def this(options: PartialLinkedErrorsOption) = this()
  }
  /* static members */
  object LinkedErrors {
    
    @JSImport("@sentry/browser", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "7.13.0" */ String = js.native
  
  @JSImport("@sentry/browser", "Scope")
  @js.native
  open class Scope ()
    extends typings.sentryBrowser.exportsMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/browser", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typings.sentryHub.scopeMod.Scope): typings.sentryHub.scopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.scopeMod.Scope]
  }
  
  @JSImport("@sentry/browser", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.severityMod.Severity & String] = js.native
    
    /* "debug" */ val Debug: typings.sentryTypes.severityMod.Severity.Debug & String = js.native
    
    /* "error" */ val Error: typings.sentryTypes.severityMod.Severity.Error & String = js.native
    
    /* "fatal" */ val Fatal: typings.sentryTypes.severityMod.Severity.Fatal & String = js.native
    
    /* "info" */ val Info: typings.sentryTypes.severityMod.Severity.Info & String = js.native
    
    /* "log" */ val Log: typings.sentryTypes.severityMod.Severity.Log & String = js.native
    
    /* "warning" */ val Warning: typings.sentryTypes.severityMod.Severity.Warning & String = js.native
  }
  
  @JSImport("@sentry/browser", "TryCatch")
  @js.native
  /**
    * @inheritDoc
    */
  open class TryCatch ()
    extends typings.sentryBrowser.exportsMod.TryCatch {
    def this(options: PartialTryCatchOptions) = this()
  }
  /* static members */
  object TryCatch {
    
    @JSImport("@sentry/browser", "TryCatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser", "TryCatch.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  inline def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCallBreadcrumbHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallBreadcrumbHint]]
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def captureEvent(event: Event): ReturnType[FnCallEventHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallEventHint]]
  inline def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallEventHint]]
  
  inline def captureException(exception: Any): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  inline def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCall] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCall]]
  
  inline def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  
  @JSImport("@sentry/browser", "chromeStackLineParser")
  @js.native
  val chromeStackLineParser: StackLineParser = js.native
  
  inline def close(): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Thenable[Boolean]]
  inline def close(timeout: Double): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Boolean]]
  
  inline def configureScope(callback: js.Function1[/* scope */ typings.sentryHub.scopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  @JSImport("@sentry/browser", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    typings.sentryBrowser.integrationsMod.GlobalHandlers | typings.sentryBrowser.integrationsMod.TryCatch | typings.sentryBrowser.integrationsMod.Breadcrumbs | typings.sentryBrowser.integrationsMod.LinkedErrors | typings.sentryBrowser.integrationsMod.HttpContext | typings.sentryBrowser.integrationsMod.Dedupe | typings.sentryCore.mod.Integrations.InboundFilters | typings.sentryCore.mod.Integrations.FunctionToString
  ] = js.native
  
  @JSImport("@sentry/browser", "defaultStackLineParsers")
  @js.native
  val defaultStackLineParsers: js.Array[StackLineParser] = js.native
  
  @JSImport("@sentry/browser", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  inline def flush(): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[js.Thenable[Boolean]]
  inline def flush(timeout: Double): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Boolean]]
  
  inline def forceLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLoad")().asInstanceOf[Unit]
  
  @JSImport("@sentry/browser", "geckoStackLineParser")
  @js.native
  val geckoStackLineParser: StackLineParser = js.native
  
  inline def getCurrentHub(): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: BrowserOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
  
  inline def makeFetchTransport(options: BrowserTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  inline def makeFetchTransport(options: BrowserTransportOptions, nativeFetch: FetchImpl): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any], nativeFetch.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def makeMain(hub: typings.sentryHub.hubMod.Hub): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def makeXHRTransport(options: BrowserTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeXHRTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  inline def onLoad(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@sentry/browser", "opera10StackLineParser")
  @js.native
  val opera10StackLineParser: StackLineParser = js.native
  
  @JSImport("@sentry/browser", "opera11StackLineParser")
  @js.native
  val opera11StackLineParser: StackLineParser = js.native
  
  inline def setContext(name: String): ReturnType[FnCallNameContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallNameContext]]
  inline def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallNameContext]]
  
  inline def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]]]
  
  inline def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* extras */ Extras, Unit]]]
  
  inline def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]]]
  
  inline def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]]]
  
  inline def setUser(): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[ReturnType[FnCallUser]]
  inline def setUser(user: User): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallUser]]
  
  inline def showReportDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")().asInstanceOf[Unit]
  inline def showReportDialog(options: Unit, hub: typings.sentryCore.mod.Hub): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def showReportDialog(options: ReportDialogOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showReportDialog(options: ReportDialogOptions, hub: typings.sentryCore.mod.Hub): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  inline def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  
  @JSImport("@sentry/browser", "winjsStackLineParser")
  @js.native
  val winjsStackLineParser: StackLineParser = js.native
  
  inline def withScope(callback: js.Function1[/* scope */ typings.sentryHub.scopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def wrap(fn: js.Function1[/* args */ Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
}
