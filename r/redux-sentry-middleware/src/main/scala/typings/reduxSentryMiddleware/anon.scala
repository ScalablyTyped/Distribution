package typings.reduxSentryMiddleware

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.TypeofCoreIntegrations
import typings.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typings.sentryBrowser.clientMod.BrowserClientOptions
import typings.sentryBrowser.clientMod.BrowserOptions
import typings.sentryBrowser.helpersMod.ReportDialogOptions
import typings.sentryBrowser.integrationsMod.TryCatch
import typings.sentryBrowser.mod.Breadcrumbs
import typings.sentryBrowser.mod.Dedupe
import typings.sentryBrowser.mod.FunctionToString
import typings.sentryBrowser.mod.GlobalHandlers
import typings.sentryBrowser.mod.HttpContext
import typings.sentryBrowser.mod.InboundFilters
import typings.sentryBrowser.mod.LinkedErrors
import typings.sentryBrowser.mod.Scope
import typings.sentryBrowser.typesMod.BrowserTransportOptions
import typings.sentryBrowser.utilsMod.FetchImpl
import typings.sentryHub.anon.FnCall
import typings.sentryHub.anon.FnCallBreadcrumbHint
import typings.sentryHub.anon.FnCallCallback
import typings.sentryHub.anon.FnCallContextCustomSamplingContext
import typings.sentryHub.anon.FnCallEventHint
import typings.sentryHub.anon.FnCallMessageLevelHint
import typings.sentryHub.anon.FnCallNameContext
import typings.sentryHub.anon.FnCallUser
import typings.sentryHub.hubMod.Carrier
import typings.sentryHub.hubMod.Hub
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.extraMod.Extra
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.miscMod.Primitive
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.severityMod.SeverityLevel
import typings.sentryTypes.stackframeMod.StackFrame
import typings.sentryTypes.stacktraceMod.StackLineParser
import typings.sentryTypes.transactionMod.CustomSamplingContext
import typings.sentryTypes.transactionMod.TransactionContext
import typings.sentryTypes.transportMod.InternalBaseTransportOptions
import typings.sentryTypes.transportMod.Transport
import typings.sentryTypes.transportMod.TransportRequestExecutor
import typings.sentryTypes.userMod.User
import typings.sentryUtils.promisebufferMod.PromiseBuffer
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
    
    extension [Self <: Typeof](x: Self) {
      
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
  trait TypeofScope
    extends StObject
       with Instantiable0[Scope] {
    
    def clone(scope: typings.sentryHub.scopeMod.Scope): typings.sentryHub.scopeMod.Scope = js.native
  }
  
  @js.native
  trait TypeofSentry extends StObject {
    
    var Breadcrumbs: TypeofBreadcrumbs = js.native
    
    var BrowserClient: Instantiable1[/* options */ BrowserClientOptions, typings.sentryBrowser.mod.BrowserClient] = js.native
    
    var Dedupe: TypeofDedupe = js.native
    
    var FunctionToString: TypeofFunctionToString = js.native
    
    var GlobalHandlers: TypeofGlobalHandlers = js.native
    
    var HttpContext: TypeofHttpContext = js.native
    
    var Hub: Instantiable0[typings.sentryBrowser.mod.Hub] = js.native
    
    var InboundFilters: TypeofInboundFilters = js.native
    
    val Integrations: TypeofIntegrations = js.native
    
    var LinkedErrors: TypeofLinkedErrors = js.native
    
    val SDK_VERSION: /* "7.14.0" */ String = js.native
    
    var Scope: TypeofScope = js.native
    
    var TryCatch: TypeofTryCatch = js.native
    
    def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCallBreadcrumbHint] = js.native
    
    def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
    
    def captureEvent(event: Event): ReturnType[FnCallEventHint] = js.native
    def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = js.native
    
    def captureException(exception: Any): ReturnType[FnCall] = js.native
    def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCall] = js.native
    
    def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = js.native
    
    val chromeStackLineParser: StackLineParser = js.native
    
    def close(): PromiseLike[Boolean] = js.native
    def close(timeout: Double): PromiseLike[Boolean] = js.native
    
    def configureScope(callback: js.Function1[/* scope */ typings.sentryHub.scopeMod.Scope, Unit]): ReturnType[FnCallCallback] = js.native
    
    def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = js.native
    def createTransport(
      options: InternalBaseTransportOptions,
      makeRequest: TransportRequestExecutor,
      buffer: PromiseBuffer[Unit]
    ): Transport = js.native
    
    val defaultIntegrations: js.Array[
        typings.sentryBrowser.integrationsMod.GlobalHandlers | TryCatch | typings.sentryBrowser.integrationsMod.Breadcrumbs | typings.sentryBrowser.integrationsMod.LinkedErrors | typings.sentryBrowser.integrationsMod.HttpContext | typings.sentryBrowser.integrationsMod.Dedupe | typings.sentryCore.mod.Integrations.InboundFilters | typings.sentryCore.mod.Integrations.FunctionToString
      ] = js.native
    
    val defaultStackLineParsers: js.Array[StackLineParser] = js.native
    
    def defaultStackParser(stack: String): js.Array[StackFrame] = js.native
    def defaultStackParser(stack: String, skipFirst: Double): js.Array[StackFrame] = js.native
    
    def flush(): PromiseLike[Boolean] = js.native
    def flush(timeout: Double): PromiseLike[Boolean] = js.native
    
    def forceLoad(): Unit = js.native
    
    val geckoStackLineParser: StackLineParser = js.native
    
    def getCurrentHub(): Hub = js.native
    
    def getHubFromCarrier(carrier: Carrier): Hub = js.native
    
    def init(): Unit = js.native
    def init(options: BrowserOptions): Unit = js.native
    
    def lastEventId(): js.UndefOr[String] = js.native
    
    def makeFetchTransport(options: BrowserTransportOptions): Transport = js.native
    def makeFetchTransport(options: BrowserTransportOptions, nativeFetch: FetchImpl): Transport = js.native
    
    def makeMain(hub: Hub): Hub = js.native
    
    def makeXHRTransport(options: BrowserTransportOptions): Transport = js.native
    
    def onLoad(callback: js.Function0[Unit]): Unit = js.native
    
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
    
    def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = js.native
    def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = js.native
    
    val winjsStackLineParser: StackLineParser = js.native
    
    def withScope(callback: js.Function1[/* scope */ typings.sentryHub.scopeMod.Scope, Unit]): ReturnType[FnCallCallback] = js.native
    
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
