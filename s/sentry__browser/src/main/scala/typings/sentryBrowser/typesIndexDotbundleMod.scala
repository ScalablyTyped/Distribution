package typings.sentryBrowser

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.Dsn
import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryBrowser.anon.PartialLinkedErrorsOption
import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryBrowser.typesClientMod.BrowserClientOptions
import typings.sentryBrowser.typesClientMod.BrowserOptions
import typings.sentryBrowser.typesHelpersMod.ReportDialogOptions
import typings.sentryBrowser.typesIntegrationsGlobalhandlersMod.GlobalHandlersIntegrations
import typings.sentryBrowser.typesProfilingJsSelfProfilingMod.global.Window
import typings.sentryBrowser.typesTransportsTypesMod.BrowserTransportOptions
import typings.sentryBrowser.typesTransportsUtilsMod.FetchImpl
import typings.sentryCore.anon.FnCall
import typings.sentryCore.anon.FnCallBreadcrumbHint
import typings.sentryCore.anon.FnCallCallback
import typings.sentryCore.anon.FnCallContextCustomSamplingContext
import typings.sentryCore.anon.FnCallEventHint
import typings.sentryCore.anon.FnCallMessageLevelHint
import typings.sentryCore.anon.FnCallNameContext
import typings.sentryCore.anon.FnCallUser
import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryCore.typesHubMod.Carrier
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesEnvelopeMod.EventEnvelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesExtraMod.Extra
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesIntegrationMod.Integration
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
import typings.sentryTypes.typesTransportMod.TransportMakeRequestResponse
import typings.sentryTypes.typesTransportMod.TransportRequestExecutor
import typings.sentryTypes.typesUserMod.User
import typings.sentryTypes.typesUserMod.UserFeedback
import typings.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typings.sentryUtils.typesWorldwideMod.InternalGlobal
import typings.std.PromiseLike
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIndexDotbundleMod {
  
  @JSImport("@sentry/browser/types/index.bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/browser/types/index.bundle", "Breadcrumbs")
  @js.native
  /**
    * @inheritDoc
    */
  open class Breadcrumbs ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.Breadcrumbs {
    def this(options: PartialBreadcrumbsOptions) = this()
  }
  /* static members */
  object Breadcrumbs {
    
    @JSImport("@sentry/browser/types/index.bundle", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "Breadcrumbs.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "BrowserClient")
  @js.native
  open class BrowserClient protected ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.BrowserClient {
    /**
      * Creates a new Browser SDK instance.
      *
      * @param options Configuration options for this SDK.
      */
    def this(options: BrowserClientOptions) = this()
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "Dedupe")
  @js.native
  open class Dedupe ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.Dedupe
  /* static members */
  object Dedupe {
    
    @JSImport("@sentry/browser/types/index.bundle", "Dedupe")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "Dedupe.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "FunctionToString")
  @js.native
  open class FunctionToString ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.FunctionToString
  /* static members */
  object FunctionToString {
    
    @JSImport("@sentry/browser/types/index.bundle", "FunctionToString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "FunctionToString.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "GlobalHandlers")
  @js.native
  /** JSDoc */
  open class GlobalHandlers ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.GlobalHandlers {
    def this(options: GlobalHandlersIntegrations) = this()
  }
  /* static members */
  object GlobalHandlers {
    
    @JSImport("@sentry/browser/types/index.bundle", "GlobalHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "GlobalHandlers.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "HttpContext")
  @js.native
  open class HttpContext ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.HttpContext
  /* static members */
  object HttpContext {
    
    @JSImport("@sentry/browser/types/index.bundle", "HttpContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "HttpContext.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "Hub")
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
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.Hub {
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
  
  @JSImport("@sentry/browser/types/index.bundle", "InboundFilters")
  @js.native
  open class InboundFilters ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.InboundFilters {
    def this(_options: PartialInboundFiltersOpti) = this()
  }
  /* static members */
  object InboundFilters {
    
    @JSImport("@sentry/browser/types/index.bundle", "InboundFilters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "InboundFilters.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "Integrations")
  @js.native
  val Integrations: Record[String, Instantiable1[/* args (repeated) */ Any, Integration]] = js.native
  
  @JSImport("@sentry/browser/types/index.bundle", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  open class LinkedErrors ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.LinkedErrors {
    def this(options: PartialLinkedErrorsOption) = this()
  }
  /* static members */
  object LinkedErrors {
    
    @JSImport("@sentry/browser/types/index.bundle", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "7.56.0" */ String = js.native
  
  @JSImport("@sentry/browser/types/index.bundle", "Scope")
  @js.native
  open class Scope ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/browser/types/index.bundle", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typings.sentryCore.typesScopeMod.Scope): typings.sentryCore.typesScopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesScopeMod.Scope]
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "Severity")
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
  
  @JSImport("@sentry/browser/types/index.bundle", "TryCatch")
  @js.native
  /**
    * @inheritDoc
    */
  open class TryCatch ()
    extends typings.sentryBrowser.typesIndexDotbundleDotbaseMod.TryCatch {
    def this(options: PartialTryCatchOptions) = this()
  }
  /* static members */
  object TryCatch {
    
    @JSImport("@sentry/browser/types/index.bundle", "TryCatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/index.bundle", "TryCatch.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/index.bundle", "WINDOW")
  @js.native
  val WINDOW: InternalGlobal & Window = js.native
  
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
  
  inline def captureUserFeedback(feedback: UserFeedback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureUserFeedback")(feedback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@sentry/browser/types/index.bundle", "chromeStackLineParser")
  @js.native
  val chromeStackLineParser: StackLineParser = js.native
  
  inline def close(): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[PromiseLike[Boolean]]
  inline def close(timeout: Double): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[Boolean]]
  
  inline def configureScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit | TransportMakeRequestResponse]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def createUserFeedbackEnvelope(feedback: UserFeedback, param1: Dsn): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserFeedbackEnvelope")(feedback.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  
  @JSImport("@sentry/browser/types/index.bundle", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    typings.sentryBrowser.typesIntegrationsMod.GlobalHandlers | typings.sentryBrowser.typesIntegrationsMod.TryCatch | typings.sentryBrowser.typesIntegrationsMod.Breadcrumbs | typings.sentryBrowser.typesIntegrationsMod.LinkedErrors | typings.sentryBrowser.typesIntegrationsMod.HttpContext | typings.sentryBrowser.typesIntegrationsMod.Dedupe | typings.sentryCore.mod.Integrations.InboundFilters | typings.sentryCore.mod.Integrations.FunctionToString
  ] = js.native
  
  @JSImport("@sentry/browser/types/index.bundle", "defaultStackLineParsers")
  @js.native
  val defaultStackLineParsers: js.Array[StackLineParser] = js.native
  
  @JSImport("@sentry/browser/types/index.bundle", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  inline def eventFromException(stackParser: StackParser, exception: Any): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromException(stackParser: StackParser, exception: Any, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromException(stackParser: StackParser, exception: Any, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromException(stackParser: StackParser, exception: Any, hint: EventHint, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  
  inline def eventFromMessage(stackParser: StackParser, message: String): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: SeverityLevel,
    hint: Unit,
    attachStacktrace: Boolean
  ): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: SeverityLevel,
    hint: EventHint,
    attachStacktrace: Boolean
  ): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: Severity,
    hint: EventHint,
    attachStacktrace: Boolean
  ): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  
  inline def flush(): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[PromiseLike[Boolean]]
  inline def flush(timeout: Double): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[Boolean]]
  
  inline def forceLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLoad")().asInstanceOf[Unit]
  
  @JSImport("@sentry/browser/types/index.bundle", "geckoStackLineParser")
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
  
  @JSImport("@sentry/browser/types/index.bundle", "opera10StackLineParser")
  @js.native
  val opera10StackLineParser: StackLineParser = js.native
  
  @JSImport("@sentry/browser/types/index.bundle", "opera11StackLineParser")
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
  
  @JSImport("@sentry/browser/types/index.bundle", "winjsStackLineParser")
  @js.native
  val winjsStackLineParser: StackLineParser = js.native
  
  inline def withScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def wrap(fn: js.Function1[/* args */ Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
}
