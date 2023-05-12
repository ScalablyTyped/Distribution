package typings.reduxSentryMiddleware

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.Dsn
import typings.sentryBrowser.anon.TypeofCoreIntegrations
import typings.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typings.sentryBrowser.mod.Breadcrumbs
import typings.sentryBrowser.mod.Dedupe
import typings.sentryBrowser.mod.FunctionToString
import typings.sentryBrowser.mod.GlobalHandlers
import typings.sentryBrowser.mod.HttpContext
import typings.sentryBrowser.mod.InboundFilters
import typings.sentryBrowser.mod.LinkedErrors
import typings.sentryBrowser.mod.Replay
import typings.sentryBrowser.mod.Scope
import typings.sentryBrowser.typesClientMod.BrowserClientOptions
import typings.sentryBrowser.typesClientMod.BrowserOptions
import typings.sentryBrowser.typesHelpersMod.ReportDialogOptions
import typings.sentryBrowser.typesIntegrationsMod.TryCatch
import typings.sentryBrowser.typesProfilingJsSelfProfilingMod.global.Window
import typings.sentryBrowser.typesTransportsOfflineMod.BrowserOfflineTransportOptions
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
import typings.sentryCore.typesHubMod.Carrier
import typings.sentryCore.typesHubMod.Hub
import typings.sentryCore.typesTracingSpanMod.Span
import typings.sentryCore.typesTracingSpanMod.SpanStatusType
import typings.sentryCore.typesTransportsMultiplexedMod.Matcher
import typings.sentryInternalTracing.anon.PartialRequestInstrumenta
import typings.sentryInternalTracing.typesBrowserRequestMod.RequestInstrumentationOptions
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesEnvelopeMod.EventEnvelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesExtraMod.Extra
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesScopeMod.CaptureContext
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesStackframeMod.StackFrame
import typings.sentryTypes.typesStacktraceMod.StackLineParser
import typings.sentryTypes.typesStacktraceMod.StackParser
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TraceparentData
import typings.sentryTypes.typesTransactionMod.Transaction
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
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeof extends StObject {
    
    var Breadcrumbs: typings.sentryBrowser.anon.TypeofBreadcrumbs
    
    var Dedupe: typings.sentryBrowser.anon.TypeofDedupe
    
    var FunctionToString: TypeofCoreIntegrations
    
    var GlobalHandlers: typings.sentryBrowser.anon.TypeofGlobalHandlers
    
    var HttpContext: typings.sentryBrowser.anon.TypeofHttpContext
    
    var InboundFilters: TypeofCoreIntegrationsInstantiable
    
    var LinkedErrors: typings.sentryBrowser.anon.TypeofLinkedErrors
    
    var TryCatch: typings.sentryBrowser.anon.TypeofTryCatch
  }
  object Typeof {
    
    inline def apply(
      Breadcrumbs: typings.sentryBrowser.anon.TypeofBreadcrumbs,
      Dedupe: typings.sentryBrowser.anon.TypeofDedupe,
      FunctionToString: TypeofCoreIntegrations,
      GlobalHandlers: typings.sentryBrowser.anon.TypeofGlobalHandlers,
      HttpContext: typings.sentryBrowser.anon.TypeofHttpContext,
      InboundFilters: TypeofCoreIntegrationsInstantiable,
      LinkedErrors: typings.sentryBrowser.anon.TypeofLinkedErrors,
      TryCatch: typings.sentryBrowser.anon.TypeofTryCatch
    ): Typeof = {
      val __obj = js.Dynamic.literal(Breadcrumbs = Breadcrumbs.asInstanceOf[js.Any], Dedupe = Dedupe.asInstanceOf[js.Any], FunctionToString = FunctionToString.asInstanceOf[js.Any], GlobalHandlers = GlobalHandlers.asInstanceOf[js.Any], HttpContext = HttpContext.asInstanceOf[js.Any], InboundFilters = InboundFilters.asInstanceOf[js.Any], LinkedErrors = LinkedErrors.asInstanceOf[js.Any], TryCatch = TryCatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeof]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeof] (val x: Self) extends AnyVal {
      
      inline def setBreadcrumbs(value: typings.sentryBrowser.anon.TypeofBreadcrumbs): Self = StObject.set(x, "Breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setDedupe(value: typings.sentryBrowser.anon.TypeofDedupe): Self = StObject.set(x, "Dedupe", value.asInstanceOf[js.Any])
      
      inline def setFunctionToString(value: TypeofCoreIntegrations): Self = StObject.set(x, "FunctionToString", value.asInstanceOf[js.Any])
      
      inline def setGlobalHandlers(value: typings.sentryBrowser.anon.TypeofGlobalHandlers): Self = StObject.set(x, "GlobalHandlers", value.asInstanceOf[js.Any])
      
      inline def setHttpContext(value: typings.sentryBrowser.anon.TypeofHttpContext): Self = StObject.set(x, "HttpContext", value.asInstanceOf[js.Any])
      
      inline def setInboundFilters(value: TypeofCoreIntegrationsInstantiable): Self = StObject.set(x, "InboundFilters", value.asInstanceOf[js.Any])
      
      inline def setLinkedErrors(value: typings.sentryBrowser.anon.TypeofLinkedErrors): Self = StObject.set(x, "LinkedErrors", value.asInstanceOf[js.Any])
      
      inline def setTryCatch(value: typings.sentryBrowser.anon.TypeofTryCatch): Self = StObject.set(x, "TryCatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBreadcrumbs
    extends StObject
       with Instantiable0[Breadcrumbs] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofDedupe
    extends StObject
       with Instantiable0[Dedupe] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofFunctionToString
    extends StObject
       with Instantiable0[FunctionToString] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofGlobalHandlers
    extends StObject
       with Instantiable0[GlobalHandlers] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofHttpContext
    extends StObject
       with Instantiable0[HttpContext] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofInboundFilters
    extends StObject
       with Instantiable0[InboundFilters] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofIntegrations
    extends StObject
       with Typeof
  
  @js.native
  trait TypeofLinkedErrors
    extends StObject
       with Instantiable0[LinkedErrors] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofReplay
    extends StObject
       with Instantiable0[Replay] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofScope
    extends StObject
       with Instantiable0[Scope] {
    
    def clone(scope: typings.sentryCore.typesScopeMod.Scope): typings.sentryCore.typesScopeMod.Scope = js.native
  }
  
  @js.native
  trait TypeofSentry extends StObject {
    
    var Breadcrumbs: TypeofBreadcrumbs = js.native
    
    var BrowserClient: Instantiable1[/* options */ BrowserClientOptions, typings.sentryBrowser.mod.BrowserClient] = js.native
    
    var BrowserProfilingIntegration: Instantiable0[typings.sentryBrowser.mod.BrowserProfilingIntegration] = js.native
    
    var BrowserTracing: Instantiable0[typings.sentryBrowser.mod.BrowserTracing] = js.native
    
    var Dedupe: TypeofDedupe = js.native
    
    var FunctionToString: TypeofFunctionToString = js.native
    
    var GlobalHandlers: TypeofGlobalHandlers = js.native
    
    var HttpContext: TypeofHttpContext = js.native
    
    var Hub: Instantiable0[typings.sentryBrowser.mod.Hub] = js.native
    
    var InboundFilters: TypeofInboundFilters = js.native
    
    val Integrations: TypeofIntegrations = js.native
    
    var LinkedErrors: TypeofLinkedErrors = js.native
    
    var Replay: TypeofReplay = js.native
    
    val SDK_VERSION: /* "7.51.2" */ String = js.native
    
    var Scope: TypeofScope = js.native
    
    var TryCatch: TypeofTryCatch = js.native
    
    val WINDOW: InternalGlobal & Window = js.native
    
    def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCallBreadcrumbHint] = js.native
    
    def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
    
    def addTracingExtensions(): Unit = js.native
    
    def captureEvent(event: Event): ReturnType[FnCallEventHint] = js.native
    def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = js.native
    
    def captureException(exception: Any): ReturnType[FnCall] = js.native
    def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCall] = js.native
    
    def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = js.native
    
    def captureUserFeedback(feedback: UserFeedback): Unit = js.native
    
    val chromeStackLineParser: StackLineParser = js.native
    
    def close(): PromiseLike[Boolean] = js.native
    def close(timeout: Double): PromiseLike[Boolean] = js.native
    
    def configureScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = js.native
    
    def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = js.native
    def createTransport(
      options: InternalBaseTransportOptions,
      makeRequest: TransportRequestExecutor,
      buffer: PromiseBuffer[Unit | TransportMakeRequestResponse]
    ): Transport = js.native
    
    def createUserFeedbackEnvelope(feedback: UserFeedback, param1: Dsn): EventEnvelope = js.native
    
    val defaultIntegrations: js.Array[
        typings.sentryBrowser.typesIntegrationsMod.GlobalHandlers | TryCatch | typings.sentryBrowser.typesIntegrationsMod.Breadcrumbs | typings.sentryBrowser.typesIntegrationsMod.LinkedErrors | typings.sentryBrowser.typesIntegrationsMod.HttpContext | typings.sentryBrowser.typesIntegrationsMod.Dedupe | typings.sentryCore.mod.Integrations.InboundFilters | typings.sentryCore.mod.Integrations.FunctionToString
      ] = js.native
    
    val defaultRequestInstrumentationOptions: RequestInstrumentationOptions = js.native
    
    val defaultStackLineParsers: js.Array[StackLineParser] = js.native
    
    def defaultStackParser(stack: String): js.Array[StackFrame] = js.native
    def defaultStackParser(stack: String, skipFirst: Double): js.Array[StackFrame] = js.native
    
    def eventFromException(stackParser: StackParser, exception: Any): PromiseLike[Event] = js.native
    def eventFromException(stackParser: StackParser, exception: Any, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = js.native
    def eventFromException(stackParser: StackParser, exception: Any, hint: EventHint): PromiseLike[Event] = js.native
    def eventFromException(stackParser: StackParser, exception: Any, hint: EventHint, attachStacktrace: Boolean): PromiseLike[Event] = js.native
    
    def eventFromMessage(stackParser: StackParser, message: String): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint, attachStacktrace: Boolean): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: Severity): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel): PromiseLike[Event] = js.native
    def eventFromMessage(
      stackParser: StackParser,
      message: String,
      level: SeverityLevel,
      hint: Unit,
      attachStacktrace: Boolean
    ): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel, hint: EventHint): PromiseLike[Event] = js.native
    def eventFromMessage(
      stackParser: StackParser,
      message: String,
      level: SeverityLevel,
      hint: EventHint,
      attachStacktrace: Boolean
    ): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = js.native
    def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: EventHint): PromiseLike[Event] = js.native
    def eventFromMessage(
      stackParser: StackParser,
      message: String,
      level: Severity,
      hint: EventHint,
      attachStacktrace: Boolean
    ): PromiseLike[Event] = js.native
    
    def extractTraceparentData(traceparent: String): js.UndefOr[TraceparentData] = js.native
    
    def flush(): PromiseLike[Boolean] = js.native
    def flush(timeout: Double): PromiseLike[Boolean] = js.native
    
    def forceLoad(): Unit = js.native
    
    val geckoStackLineParser: StackLineParser = js.native
    
    def getActiveTransaction[T /* <: Transaction */](): js.UndefOr[T] = js.native
    def getActiveTransaction[T /* <: Transaction */](maybeHub: Hub): js.UndefOr[T] = js.native
    
    def getCurrentHub(): Hub = js.native
    
    def getHubFromCarrier(carrier: Carrier): Hub = js.native
    
    def init(): Unit = js.native
    def init(options: BrowserOptions): Unit = js.native
    
    def instrumentOutgoingRequests(): Unit = js.native
    def instrumentOutgoingRequests(_options: PartialRequestInstrumenta): Unit = js.native
    
    def lastEventId(): js.UndefOr[String] = js.native
    
    def makeBrowserOfflineTransport[T /* <: InternalBaseTransportOptions */](createTransport: js.Function1[/* options */ T, Transport]): js.Function1[/* options */ T & BrowserOfflineTransportOptions, Transport] = js.native
    
    def makeFetchTransport(options: BrowserTransportOptions): Transport = js.native
    def makeFetchTransport(options: BrowserTransportOptions, nativeFetch: FetchImpl): Transport = js.native
    
    def makeMain(hub: Hub): Hub = js.native
    
    def makeMultiplexedTransport[TO /* <: BaseTransportOptions */](createTransport: js.Function1[/* options */ TO, Transport], matcher: Matcher): js.Function1[/* options */ TO, Transport] = js.native
    
    def makeXHRTransport(options: BrowserTransportOptions): Transport = js.native
    
    def onLoad(callback: js.Function0[Unit]): Unit = js.native
    
    def onProfilingStartRouteTransaction(): js.UndefOr[Transaction] = js.native
    def onProfilingStartRouteTransaction(transaction: Transaction): js.UndefOr[Transaction] = js.native
    
    val opera10StackLineParser: StackLineParser = js.native
    
    val opera11StackLineParser: StackLineParser = js.native
    
    def setContext(name: String): ReturnType[FnCallNameContext] = js.native
    def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = js.native
    
    def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = js.native
    
    def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = js.native
    
    def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = js.native
    
    def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = js.native
    
    def setUser(): ReturnType[FnCallUser] = js.native
    def setUser(user: User): ReturnType[FnCallUser] = js.native
    
    def showReportDialog(): Unit = js.native
    def showReportDialog(options: Unit, hub: typings.sentryCore.mod.Hub): Unit = js.native
    def showReportDialog(options: ReportDialogOptions): Unit = js.native
    def showReportDialog(options: ReportDialogOptions, hub: typings.sentryCore.mod.Hub): Unit = js.native
    
    def spanStatusfromHttpCode(httpStatus: Double): SpanStatusType = js.native
    
    def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = js.native
    def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = js.native
    
    def trace[T](context: TransactionContext, callback: js.Function1[/* span */ js.UndefOr[Span], T]): T = js.native
    def trace[T](
      context: TransactionContext,
      callback: js.Function1[/* span */ js.UndefOr[Span], T],
      onError: js.Function1[/* error */ Any, Unit]
    ): T = js.native
    
    val winjsStackLineParser: StackLineParser = js.native
    
    def withScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = js.native
    
    def wrap(fn: js.Function1[/* args */ Any, Any]): Any = js.native
  }
  
  @js.native
  trait TypeofTryCatch
    extends StObject
       with Instantiable0[typings.sentryBrowser.mod.TryCatch] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
