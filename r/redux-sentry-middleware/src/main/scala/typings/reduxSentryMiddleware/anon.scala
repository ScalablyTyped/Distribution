package typings.reduxSentryMiddleware

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.TypeofBreadcrumbs
import typings.sentryBrowser.anon.TypeofCoreIntegrations
import typings.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typings.sentryBrowser.anon.TypeofGlobalHandlers
import typings.sentryBrowser.anon.TypeofLinkedErrors
import typings.sentryBrowser.anon.TypeofTryCatch
import typings.sentryBrowser.anon.TypeofUserAgent
import typings.sentryBrowser.backendMod.BrowserOptions
import typings.sentryBrowser.helpersMod.ReportDialogOptions
import typings.sentryBrowser.integrationsMod.Breadcrumbs
import typings.sentryBrowser.integrationsMod.GlobalHandlers
import typings.sentryBrowser.integrationsMod.LinkedErrors
import typings.sentryBrowser.integrationsMod.TryCatch
import typings.sentryBrowser.integrationsMod.UserAgent
import typings.sentryBrowser.mod.Scope
import typings.sentryBrowser.mod.Transports.BaseTransport
import typings.sentryBrowser.mod.Transports.FetchTransport
import typings.sentryBrowser.mod.Transports.XHRTransport
import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import typings.sentryHub.hubMod.Hub
import typings.sentryHub.interfacesMod.Carrier
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.extraMod.Extra
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.statusMod.Status
import typings.sentryTypes.transactionMod.CustomSamplingContext
import typings.sentryTypes.transactionMod.Transaction
import typings.sentryTypes.transactionMod.TransactionContext
import typings.sentryTypes.transportMod.TransportOptions
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeof extends StObject {
    
    var Breadcrumbs: TypeofBreadcrumbs
    
    var FunctionToString: TypeofCoreIntegrations
    
    var GlobalHandlers: TypeofGlobalHandlers
    
    var InboundFilters: TypeofCoreIntegrationsInstantiable
    
    var LinkedErrors: TypeofLinkedErrors
    
    var TryCatch: TypeofTryCatch
    
    var UserAgent: TypeofUserAgent
  }
  object Typeof {
    
    @scala.inline
    def apply(
      Breadcrumbs: TypeofBreadcrumbs,
      FunctionToString: TypeofCoreIntegrations,
      GlobalHandlers: TypeofGlobalHandlers,
      InboundFilters: TypeofCoreIntegrationsInstantiable,
      LinkedErrors: TypeofLinkedErrors,
      TryCatch: TypeofTryCatch,
      UserAgent: TypeofUserAgent
    ): Typeof = {
      val __obj = js.Dynamic.literal(Breadcrumbs = Breadcrumbs.asInstanceOf[js.Any], FunctionToString = FunctionToString.asInstanceOf[js.Any], GlobalHandlers = GlobalHandlers.asInstanceOf[js.Any], InboundFilters = InboundFilters.asInstanceOf[js.Any], LinkedErrors = LinkedErrors.asInstanceOf[js.Any], TryCatch = TryCatch.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeof]
    }
    
    @scala.inline
    implicit class TypeofMutableBuilder[Self <: Typeof] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbs(value: TypeofBreadcrumbs): Self = StObject.set(x, "Breadcrumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionToString(value: TypeofCoreIntegrations): Self = StObject.set(x, "FunctionToString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalHandlers(value: TypeofGlobalHandlers): Self = StObject.set(x, "GlobalHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundFilters(value: TypeofCoreIntegrationsInstantiable): Self = StObject.set(x, "InboundFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedErrors(value: TypeofLinkedErrors): Self = StObject.set(x, "LinkedErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryCatch(value: TypeofTryCatch): Self = StObject.set(x, "TryCatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: TypeofUserAgent): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofIntegrations
    extends StObject
       with Typeof
  
  @js.native
  trait TypeofScope
    extends StObject
       with Instantiable0[Scope] {
    
    def clone(scope: typings.sentryHub.scopeMod.Scope): typings.sentryHub.scopeMod.Scope = js.native
  }
  
  @js.native
  trait TypeofSentry extends StObject {
    
    var BrowserClient: Instantiable0[typings.sentryBrowser.mod.BrowserClient] = js.native
    
    var Hub: Instantiable0[typings.sentryBrowser.mod.Hub] = js.native
    
    val Integrations: TypeofIntegrations = js.native
    
    val SDK_NAME: /* "sentry.javascript.browser" */ String = js.native
    
    val SDK_VERSION: /* "5.27.4" */ String = js.native
    
    var Scope: TypeofScope = js.native
    
    val Severity: TypeofSeverity = js.native
    
    val Status: TypeofStatus = js.native
    
    val Transports: TypeofTransports = js.native
    
    def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
    
    def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
    
    def captureEvent(event: Event): String = js.native
    
    def captureException(exception: js.Any): String = js.native
    def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
    
    def captureMessage(message: String): String = js.native
    def captureMessage(message: String, captureContext: CaptureContext): String = js.native
    def captureMessage(message: String, captureContext: typings.sentryTypes.severityMod.Severity): String = js.native
    
    def close(): js.Thenable[Boolean] = js.native
    def close(timeout: Double): js.Thenable[Boolean] = js.native
    
    def configureScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = js.native
    
    val defaultIntegrations: js.Array[
        FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
      ] = js.native
    
    def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = js.native
    def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = js.native
    
    def eventFromMessage(options: Options, message: String): js.Thenable[Event] = js.native
    def eventFromMessage(options: Options, message: String, level: Unit, hint: EventHint): js.Thenable[Event] = js.native
    def eventFromMessage(options: Options, message: String, level: typings.sentryTypes.severityMod.Severity): js.Thenable[Event] = js.native
    def eventFromMessage(
      options: Options,
      message: String,
      level: typings.sentryTypes.severityMod.Severity,
      hint: EventHint
    ): js.Thenable[Event] = js.native
    
    def flush(): js.Thenable[Boolean] = js.native
    def flush(timeout: Double): js.Thenable[Boolean] = js.native
    
    def forceLoad(): Unit = js.native
    
    def getCurrentHub(): Hub = js.native
    
    def getHubFromCarrier(carrier: Carrier): Hub = js.native
    
    def init(): Unit = js.native
    def init(options: BrowserOptions): Unit = js.native
    
    def injectReportDialog(): Unit = js.native
    def injectReportDialog(options: ReportDialogOptions): Unit = js.native
    
    def lastEventId(): js.UndefOr[String] = js.native
    
    def makeMain(hub: Hub): Hub = js.native
    
    def onLoad(callback: js.Function0[Unit]): Unit = js.native
    
    def setContext(name: String): Unit = js.native
    def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
    
    def setExtra(key: String, extra: Extra): Unit = js.native
    
    def setExtras(extras: Extras): Unit = js.native
    
    def setTag(key: String, value: String): Unit = js.native
    
    def setTags(tags: StringDictionary[String]): Unit = js.native
    
    def setUser(): Unit = js.native
    def setUser(user: User): Unit = js.native
    
    def showReportDialog(): Unit = js.native
    def showReportDialog(options: ReportDialogOptions): Unit = js.native
    
    def startTransaction(context: TransactionContext): Transaction = js.native
    def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
    
    def withScope(callback: js.Function1[/* scope */ typings.sentryHub.mod.Scope, Unit]): Unit = js.native
    
    def wrap(fn: js.Function1[/* args */ js.Any, js.Any]): js.Any = js.native
  }
  
  trait TypeofSeverity extends StObject {
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): Severity
  }
  object TypeofSeverity {
    
    @scala.inline
    def apply(fromString: String => Severity): TypeofSeverity = {
      val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
      __obj.asInstanceOf[TypeofSeverity]
    }
    
    @scala.inline
    implicit class TypeofSeverityMutableBuilder[Self <: TypeofSeverity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromString(value: String => Severity): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofStatus extends StObject {
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): Status
  }
  object TypeofStatus {
    
    @scala.inline
    def apply(fromHttpCode: Double => Status): TypeofStatus = {
      val __obj = js.Dynamic.literal(fromHttpCode = js.Any.fromFunction1(fromHttpCode))
      __obj.asInstanceOf[TypeofStatus]
    }
    
    @scala.inline
    implicit class TypeofStatusMutableBuilder[Self <: TypeofStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromHttpCode(value: Double => Status): Self = StObject.set(x, "fromHttpCode", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofTransports extends StObject {
    
    var BaseTransport: Instantiable1[/* options */ TransportOptions, typings.sentryBrowser.mod.Transports.BaseTransport]
    
    var FetchTransport: Instantiable1[
        /* options */ TransportOptions, 
        typings.sentryBrowser.mod.Transports.FetchTransport
      ]
    
    var XHRTransport: Instantiable1[/* options */ TransportOptions, typings.sentryBrowser.mod.Transports.XHRTransport]
  }
  object TypeofTransports {
    
    @scala.inline
    def apply(
      BaseTransport: Instantiable1[/* options */ TransportOptions, BaseTransport],
      FetchTransport: Instantiable1[/* options */ TransportOptions, FetchTransport],
      XHRTransport: Instantiable1[/* options */ TransportOptions, XHRTransport]
    ): TypeofTransports = {
      val __obj = js.Dynamic.literal(BaseTransport = BaseTransport.asInstanceOf[js.Any], FetchTransport = FetchTransport.asInstanceOf[js.Any], XHRTransport = XHRTransport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofTransports]
    }
    
    @scala.inline
    implicit class TypeofTransportsMutableBuilder[Self <: TypeofTransports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseTransport(value: Instantiable1[/* options */ TransportOptions, BaseTransport]): Self = StObject.set(x, "BaseTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchTransport(value: Instantiable1[/* options */ TransportOptions, FetchTransport]): Self = StObject.set(x, "FetchTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHRTransport(value: Instantiable1[/* options */ TransportOptions, XHRTransport]): Self = StObject.set(x, "XHRTransport", value.asInstanceOf[js.Any])
    }
  }
}
