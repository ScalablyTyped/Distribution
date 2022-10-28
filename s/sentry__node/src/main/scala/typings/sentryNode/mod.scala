package typings.sentryNode

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.sentryCore.anon.FnCall
import typings.sentryCore.anon.FnCallCallback
import typings.sentryCore.anon.FnCallContextCustomSamplingContext
import typings.sentryCore.anon.FnCallEventHint
import typings.sentryCore.anon.FnCallExceptionHint
import typings.sentryCore.anon.FnCallMessageLevelHint
import typings.sentryCore.anon.FnCallNameContext
import typings.sentryCore.anon.FnCallUser
import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import typings.sentryCore.typesHubMod.Carrier
import typings.sentryNode.anon.Breadcrumbs
import typings.sentryNode.anon.Include
import typings.sentryNode.anon.Key
import typings.sentryNode.anon.Mode
import typings.sentryNode.anon.OnFatalError
import typings.sentryNode.anon.PartialRequestDataOptions
import typings.sentryNode.anon.ShouldHandleError
import typings.sentryNode.anon.TypeofConsole
import typings.sentryNode.anon.TypeofContext
import typings.sentryNode.anon.TypeofContextLines
import typings.sentryNode.anon.TypeofCoreIntegrations
import typings.sentryNode.anon.TypeofCoreIntegrationsInstantiable
import typings.sentryNode.anon.TypeofHttp_
import typings.sentryNode.anon.TypeofLinkedErrors
import typings.sentryNode.anon.TypeofModules
import typings.sentryNode.anon.TypeofOnUncaughtException
import typings.sentryNode.anon.TypeofOnUnhandledRejectio
import typings.sentryNode.anon.TypeofRequestData
import typings.sentryNode.typesHandlersMod.MiddlewareError
import typings.sentryNode.typesHandlersMod.RequestHandlerOptions
import typings.sentryNode.typesIntegrationsContextMod.ContextOptions
import typings.sentryNode.typesIntegrationsContextlinesMod.ContextLinesOptions
import typings.sentryNode.typesIntegrationsMod.Console
import typings.sentryNode.typesIntegrationsMod.Context
import typings.sentryNode.typesIntegrationsMod.ContextLines
import typings.sentryNode.typesIntegrationsMod.Http
import typings.sentryNode.typesIntegrationsMod.LinkedErrors
import typings.sentryNode.typesIntegrationsMod.Modules
import typings.sentryNode.typesIntegrationsMod.OnUncaughtException
import typings.sentryNode.typesIntegrationsMod.OnUnhandledRejection
import typings.sentryNode.typesRequestDataDeprecatedMod.ExpressRequest
import typings.sentryNode.typesRequestDataDeprecatedMod.ParseRequestOptions
import typings.sentryNode.typesRequestdataMod.AddRequestDataToEventOptions
import typings.sentryNode.typesTransportsHttpMod.NodeTransportOptions
import typings.sentryNode.typesTypesMod.NodeClientOptions
import typings.sentryNode.typesTypesMod.NodeOptions
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesExtraMod.Extra
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import typings.sentryTypes.typesScopeMod.CaptureContext
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesStacktraceMod.StackParser
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import typings.sentryTypes.typesTransportMod.TransportRequestExecutor
import typings.sentryTypes.typesUserMod.User
import typings.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/node", "DEFAULT_USER_INCLUDES")
  @js.native
  val DEFAULT_USER_INCLUDES: js.Array[String] = js.native
  
  object Handlers {
    
    @JSImport("@sentry/node", "Handlers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def errorHandler(): js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")().asInstanceOf[js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ]]
    inline def errorHandler(options: ShouldHandleError): js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ]]
    
    inline def extractRequestData(req: StringDictionary[Any]): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
    inline def extractRequestData(req: StringDictionary[Any], keys: js.Array[String]): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
    
    inline def parseRequest(event: Event, req: ExpressRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
    inline def parseRequest(event: Event, req: ExpressRequest, options: ParseRequestOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
    
    inline def requestHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHandler")().asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ]]
    inline def requestHandler(options: RequestHandlerOptions): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ]]
    
    inline def tracingHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingHandler")().asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ]]
  }
  
  @JSImport("@sentry/node", "Hub")
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
    extends typings.sentryCore.mod.Hub {
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
  
  object Integrations {
    
    @JSImport("@sentry/node", "Integrations")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Console")
    @js.native
    open class Console ()
      extends typings.sentryNode.typesIntegrationsMod.Console
    @JSImport("@sentry/node", "Integrations.Console")
    @js.native
    def Console: TypeofConsole = js.native
    inline def Console_=(x: TypeofConsole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Console")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Context")
    @js.native
    open class Context ()
      extends typings.sentryNode.typesIntegrationsMod.Context {
      def this(_options: ContextOptions) = this()
    }
    @JSImport("@sentry/node", "Integrations.Context")
    @js.native
    def Context: TypeofContext = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.ContextLines")
    @js.native
    open class ContextLines ()
      extends typings.sentryNode.typesIntegrationsMod.ContextLines {
      def this(_options: ContextLinesOptions) = this()
    }
    @JSImport("@sentry/node", "Integrations.ContextLines")
    @js.native
    def ContextLines: TypeofContextLines = js.native
    inline def ContextLines_=(x: TypeofContextLines): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContextLines")(x.asInstanceOf[js.Any])
    
    inline def Context_=(x: TypeofContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.FunctionToString")
    @js.native
    open class FunctionToString ()
      extends typings.sentryCore.mod.Integrations.FunctionToString
    @JSImport("@sentry/node", "Integrations.FunctionToString")
    @js.native
    def FunctionToString: TypeofCoreIntegrations = js.native
    inline def FunctionToString_=(x: TypeofCoreIntegrations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionToString")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Http")
    @js.native
    /**
      * @inheritDoc
      */
    open class Http ()
      extends typings.sentryNode.typesIntegrationsMod.Http {
      def this(options: Breadcrumbs) = this()
    }
    @JSImport("@sentry/node", "Integrations.Http")
    @js.native
    def Http: TypeofHttp_ = js.native
    inline def Http_=(x: TypeofHttp_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Http")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.InboundFilters")
    @js.native
    open class InboundFilters ()
      extends typings.sentryCore.mod.Integrations.InboundFilters
    @JSImport("@sentry/node", "Integrations.InboundFilters")
    @js.native
    def InboundFilters: TypeofCoreIntegrationsInstantiable = js.native
    inline def InboundFilters_=(x: TypeofCoreIntegrationsInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InboundFilters")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.LinkedErrors")
    @js.native
    /**
      * @inheritDoc
      */
    open class LinkedErrors ()
      extends typings.sentryNode.typesIntegrationsMod.LinkedErrors {
      def this(options: Key) = this()
    }
    @JSImport("@sentry/node", "Integrations.LinkedErrors")
    @js.native
    def LinkedErrors: TypeofLinkedErrors = js.native
    inline def LinkedErrors_=(x: TypeofLinkedErrors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinkedErrors")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Modules")
    @js.native
    open class Modules ()
      extends typings.sentryNode.typesIntegrationsMod.Modules
    @JSImport("@sentry/node", "Integrations.Modules")
    @js.native
    def Modules: TypeofModules = js.native
    inline def Modules_=(x: TypeofModules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Modules")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.OnUncaughtException")
    @js.native
    /**
      * @inheritDoc
      */
    open class OnUncaughtException ()
      extends typings.sentryNode.typesIntegrationsMod.OnUncaughtException {
      def this(_options: OnFatalError) = this()
    }
    @JSImport("@sentry/node", "Integrations.OnUncaughtException")
    @js.native
    def OnUncaughtException: TypeofOnUncaughtException = js.native
    inline def OnUncaughtException_=(x: TypeofOnUncaughtException): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnUncaughtException")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.OnUnhandledRejection")
    @js.native
    /**
      * @inheritDoc
      */
    open class OnUnhandledRejection ()
      extends typings.sentryNode.typesIntegrationsMod.OnUnhandledRejection {
      def this(_options: Mode) = this()
    }
    @JSImport("@sentry/node", "Integrations.OnUnhandledRejection")
    @js.native
    def OnUnhandledRejection: TypeofOnUnhandledRejectio = js.native
    inline def OnUnhandledRejection_=(x: TypeofOnUnhandledRejectio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnUnhandledRejection")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.RequestData")
    @js.native
    /**
      * @inheritDoc
      */
    open class RequestData ()
      extends typings.sentryNode.typesIntegrationsMod.RequestData {
      def this(options: PartialRequestDataOptions) = this()
    }
    @JSImport("@sentry/node", "Integrations.RequestData")
    @js.native
    def RequestData: TypeofRequestData = js.native
    inline def RequestData_=(x: TypeofRequestData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RequestData")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node", "NodeClient")
  @js.native
  open class NodeClient protected ()
    extends typings.sentryNode.typesClientMod.NodeClient {
    /**
      * Creates a new Node SDK instance.
      * @param options Configuration options for this SDK.
      */
    def this(options: NodeClientOptions) = this()
  }
  
  @JSImport("@sentry/node", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "7.17.1" */ String = js.native
  
  @JSImport("@sentry/node", "Scope")
  @js.native
  open class Scope ()
    extends typings.sentryCore.mod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/node", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typings.sentryCore.typesScopeMod.Scope): typings.sentryCore.typesScopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesScopeMod.Scope]
  }
  
  @JSImport("@sentry/node", "Severity")
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
  
  inline def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest, options: AddRequestDataToEventOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def captureEvent(event: Event): ReturnType[FnCallEventHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallEventHint]]
  inline def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallEventHint]]
  
  inline def captureException(exception: Any): ReturnType[FnCallExceptionHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallExceptionHint]]
  inline def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCallExceptionHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallExceptionHint]]
  
  inline def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  
  inline def close(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Boolean]]
  inline def close(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def configureScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def deepReadDirSync(targetDir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepReadDirSync")(targetDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("@sentry/node", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    Console | Http | OnUncaughtException | OnUnhandledRejection | ContextLines | LinkedErrors | Modules | Context | InboundFilters | FunctionToString
  ] = js.native
  
  @JSImport("@sentry/node", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  inline def extractRequestData(req: PolymorphicRequest): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: PolymorphicRequest, options: Include): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def flush(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[js.Promise[Boolean]]
  inline def flush(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getCurrentHub(): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def getSentryRelease(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")().asInstanceOf[js.UndefOr[String]]
  inline def getSentryRelease(fallback: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")(fallback.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: NodeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
  
  inline def makeMain(hub: typings.sentryCore.typesHubMod.Hub): typings.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryCore.typesHubMod.Hub]
  
  inline def makeNodeTransport(options: NodeTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNodeTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  inline def setContext(name: String): ReturnType[FnCallNameContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallNameContext]]
  inline def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallNameContext]]
  
  inline def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]]]
  
  inline def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* extras */ Extras, Unit]]]
  
  inline def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]]]
  
  inline def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]]]
  
  inline def setUser(): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[ReturnType[FnCallUser]]
  inline def setUser(user: User): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallUser]]
  
  inline def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  inline def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  
  inline def withScope(callback: js.Function1[/* scope */ typings.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
}
