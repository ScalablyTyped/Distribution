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
import typings.sentryBrowser.typesClientMod.BrowserClientOptions
import typings.sentryBrowser.typesClientMod.BrowserOptions
import typings.sentryBrowser.typesHelpersMod.ReportDialogOptions
import typings.sentryBrowser.typesIntegrationsGlobalhandlersMod.GlobalHandlersIntegrations
import typings.sentryBrowser.typesTransportsTypesMod.BrowserTransportOptions
import typings.sentryBrowser.typesTransportsUtilsMod.FetchImpl
import typings.sentryCore.anon.FnCall
import typings.sentryCore.anon.FnCallCallback
import typings.sentryCore.anon.FnCallContextCustomSamplingContext
import typings.sentryCore.anon.FnCallEventHint
import typings.sentryCore.anon.FnCallExceptionHint
import typings.sentryCore.anon.FnCallMessageLevelHint
import typings.sentryCore.anon.FnCallNameContext
import typings.sentryCore.anon.FnCallUser
import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryCore.typesHubMod.Carrier
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesExtraMod.Extra
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesScopeMod.CaptureContext
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesStacktraceMod.StackLineParser
import typings.sentryTypes.typesStacktraceMod.StackParser
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import typings.sentryTypes.typesTransportMod.TransportRequestExecutor
import typings.sentryTypes.typesUserMod.User
import typings.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typings.sentryUtils.typesWorldwideMod.InternalGlobal
import typings.std.PromiseLike
import typings.std.ReturnType
import typings.std.Window
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
    extends typings.sentryBrowser.typesExportsMod.Breadcrumbs {
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
    extends typings.sentryBrowser.typesExportsMod.BrowserClient {
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
    extends typings.sentryBrowser.typesExportsMod.Dedupe
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
    extends typings.sentryBrowser.typesExportsMod.FunctionToString
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
    extends typings.sentryBrowser.typesExportsMod.GlobalHandlers {
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
    extends typings.sentryBrowser.typesExportsMod.HttpContext
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
    extends typings.sentryBrowser.typesExportsMod.Hub {
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
  
  @JSImport("@sentry/browser", "InboundFilters")
  @js.native
  open class InboundFilters ()
    extends typings.sentryBrowser.typesExportsMod.InboundFilters {
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
      extends typings.sentryBrowser.typesIntegrationsMod.Breadcrumbs {
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
      extends typings.sentryBrowser.typesIntegrationsMod.Dedupe
    
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
      extends typings.sentryBrowser.typesIntegrationsMod.GlobalHandlers {
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
      extends typings.sentryBrowser.typesIntegrationsMod.HttpContext
    
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
      extends typings.sentryBrowser.typesIntegrationsMod.LinkedErrors {
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
      extends typings.sentryBrowser.typesIntegrationsMod.TryCatch {
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
    extends typings.sentryBrowser.typesExportsMod.LinkedErrors {
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
  val SDK_VERSION: /* "7.17.3" */ String = js.native
  
  @JSImport("@sentry/browser", "Scope")
  @js.native
  open class Scope ()
    extends typings.sentryBrowser.typesExportsMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/browser", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typings.sentryCore.typesScopeMod.Scope): typings.sentryCore.typesScopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesScopeMod.Scope]
  }
  
  @JSImport("@sentry/browser", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.typesSeverityMod.Severity & String] = js.native
    
    /* "debug" */ val Debug: typings.sentryTypes.typesSeverityMod.Severity.Debug & String = js.native
    
    /* "error" */ val Error: typings.sentryTypes.typesSeverityMod.Severity.Error & String = js.native
    
    /* "fatal" */ val Fatal: typings.sentryTypes.typesSeverityMod.Severity.Fatal & String = js.native
    
    /* "info" */ val Info: typings.sentryTypes.typesSeverityMod.Severity.Info & String = js.native
    
    /* "log" */ val Log: typings.sentryTypes.typesSeverityMod.Severity.Log & String = js.native
    
    /* "warning" */ val Warning: typings.sentryTypes.typesSeverityMod.Severity.Warning & String = js.native
  }
  
  @JSImport("@sentry/browser", "TryCatch")
  @js.native
  /**
    * @inheritDoc
    */
  open class TryCatch ()
    extends typings.sentryBrowser.typesExportsMod.TryCatch {
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
  
  @JSImport("@sentry/browser", "WINDOW")
  @js.native
  val WINDOW: InternalGlobal & Window = js.native
  
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
  
  @JSImport("@sentry/browser", "chromeStackLineParser")
  @js.native
  val chromeStackLineParser: StackLineParser = js.native
  
  inline def close(): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[PromiseLike[Boolean]]
  inline def close(timeout: Double): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[Boolean]]
  
  inline def configureScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  @JSImport("@sentry/browser", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    typings.sentryBrowser.typesIntegrationsMod.GlobalHandlers | typings.sentryBrowser.typesIntegrationsMod.TryCatch | typings.sentryBrowser.typesIntegrationsMod.Breadcrumbs | typings.sentryBrowser.typesIntegrationsMod.LinkedErrors | typings.sentryBrowser.typesIntegrationsMod.HttpContext | typings.sentryBrowser.typesIntegrationsMod.Dedupe | typings.sentryCore.mod.Integrations.InboundFilters | typings.sentryCore.mod.Integrations.FunctionToString
  ] = js.native
  
  @JSImport("@sentry/browser", "defaultStackLineParsers")
  @js.native
  val defaultStackLineParsers: js.Array[StackLineParser] = js.native
  
  @JSImport("@sentry/browser", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  inline def flush(): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[PromiseLike[Boolean]]
  inline def flush(timeout: Double): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[Boolean]]
  
  inline def forceLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLoad")().asInstanceOf[Unit]
  
  @JSImport("@sentry/browser", "geckoStackLineParser")
  @js.native
  val geckoStackLineParser: StackLineParser = js.native
  
  inline def getCurrentHub(): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: BrowserOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
  
  inline def makeFetchTransport(options: BrowserTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  inline def makeFetchTransport(options: BrowserTransportOptions, nativeFetch: FetchImpl): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any], nativeFetch.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def makeMain(hub: typings.sentryCore.typesHubMod.Hub): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
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
  
  inline def withScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def wrap(fn: js.Function1[/* args */ Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
}
