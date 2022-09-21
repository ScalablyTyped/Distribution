package typings.raven

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import typings.raven.mod.transports.Transport
import typings.raven.ravenBooleans.`false`
import typings.raven.ravenStrings.GET
import typings.raven.ravenStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raven", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raven", "Client")
  @js.native
  open class Client () extends EventEmitter {
    def this(dsn: String) = this()
    def this(dsn: `false`) = this()
    def this(options: ConstructorOptions) = this()
    def this(dsn: String, options: ConstructorOptions) = this()
    def this(dsn: Unit, options: ConstructorOptions) = this()
    def this(dsn: `false`, options: ConstructorOptions) = this()
    
    def captureBreadcrumb(breadcrumb: Any): Unit = js.native
    
    def captureException(error: js.Error): String = js.native
    def captureException(error: js.Error, cb: CaptureCallback): String = js.native
    def captureException(error: js.Error, options: Unit, cb: CaptureCallback): String = js.native
    def captureException(error: js.Error, options: CaptureOptions): String = js.native
    def captureException(error: js.Error, options: CaptureOptions, cb: CaptureCallback): String = js.native
    
    def captureMessage(message: String): String = js.native
    def captureMessage(message: String, cb: CaptureCallback): String = js.native
    def captureMessage(message: String, options: Unit, cb: CaptureCallback): String = js.native
    def captureMessage(message: String, options: CaptureOptions): String = js.native
    def captureMessage(message: String, options: CaptureOptions, cb: CaptureCallback): String = js.native
    
    def config(): this.type = js.native
    def config(dsn: String): this.type = js.native
    def config(dsn: String, options: ConstructorOptions): this.type = js.native
    def config(dsn: Unit, options: ConstructorOptions): this.type = js.native
    def config(options: ConstructorOptions): this.type = js.native
    @JSName("config")
    def config_false(dsn: `false`): this.type = js.native
    @JSName("config")
    def config_false(dsn: `false`, options: ConstructorOptions): this.type = js.native
    
    def context[T](ctx: Any, func: js.Function0[T]): T = js.native
    def context[T](func: js.Function0[T]): T = js.native
    
    def errorHandler(): js.Function4[
        /* e */ js.Error, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def getContext(): Any = js.native
    
    def install(): this.type = js.native
    def install(cb: FatalErrorCallback): this.type = js.native
    
    def mergeContext(ctx: Any): this.type = js.native
    
    // todo: part of public API?
    def process(eventId: String, kwargs: Any): Unit = js.native
    def process(eventId: String, kwargs: Any, cb: js.Function0[Unit]): Unit = js.native
    def process(kwargs: Any): Unit = js.native
    def process(kwargs: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def requestHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def setContext(ctx: Any): this.type = js.native
    
    def setDataCallback(fn: DataCallback): this.type = js.native
    
    def setShouldSendCallback(fn: ShouldSendCallback): this.type = js.native
    
    def uninstall(): this.type = js.native
    
    def wrap[T](func: js.Function0[T]): js.Function0[T] = js.native
    def wrap[T](options: Any, func: js.Function0[T]): js.Function0[T] = js.native
  }
  
  inline def captureBreadcrumb(breadcrumb: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def captureException(e: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def captureException(e: js.Error, cb: CaptureCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(e.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def captureException(e: js.Error, options: Unit, cb: CaptureCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def captureException(e: js.Error, options: CaptureOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def captureException(e: js.Error, options: CaptureOptions, cb: CaptureCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def captureMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def captureMessage(message: String, cb: CaptureCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def captureMessage(message: String, options: Unit, cb: CaptureCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def captureMessage(message: String, options: CaptureOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def captureMessage(message: String, options: CaptureOptions, cb: CaptureCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def config(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[Client]
  inline def config(dsn: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(dsn.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def config(dsn: String, options: ConstructorOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(dsn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def config(dsn: Unit, options: ConstructorOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(dsn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def config(options: ConstructorOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def config_false(dsn: `false`): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(dsn.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def config_false(dsn: `false`, options: ConstructorOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(dsn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  inline def context[T](ctx: Any, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("context")(ctx.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def context[T](func: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("context")(func.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def disableConsoleAlerts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableConsoleAlerts")().asInstanceOf[Unit]
  
  inline def errorHandler(): js.Function4[
    /* e */ js.Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")().asInstanceOf[js.Function4[
    /* e */ js.Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def getContext(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[Any]
  
  inline def install(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Client]
  inline def install(cb: FatalErrorCallback): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(cb.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def interceptErr(ctx: Any): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptErr")(ctx.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def mergeContext(ctx: Any): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeContext")(ctx.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def requestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHandler")().asInstanceOf[js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def setContext(ctx: Any): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(ctx.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def setDataCallback(fn: DataCallback): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("setDataCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def setShouldSendCallback(fn: ShouldSendCallback): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("setShouldSendCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  object transports {
    
    @JSImport("raven", "transports.HTTPSTransport")
    @js.native
    open class HTTPSTransport () extends HTTPTransport {
      def this(options: HTTPTransportOptions) = this()
    }
    
    @JSImport("raven", "transports.HTTPTransport")
    @js.native
    open class HTTPTransport () extends Transport {
      def this(options: HTTPTransportOptions) = this()
      
      var agent: Agent = js.native
      
      var defaultPort: String = js.native
      
      var options: HTTPTransportOptions = js.native
    }
    
    @JSImport("raven", "transports.Transport")
    @js.native
    abstract class Transport () extends EventEmitter {
      def this(options: EventEmitterOptions) = this()
      
      def send(client: Client, message: Any, headers: OutgoingHttpHeaders, eventId: String, cb: CaptureCallback): Unit = js.native
    }
    
    @JSImport("raven", "transports.http")
    @js.native
    val http: HTTPTransport = js.native
    
    @JSImport("raven", "transports.https")
    @js.native
    val https: HTTPSTransport = js.native
    
    trait HTTPTransportOptions extends StObject {
      
      var agent: js.UndefOr[Agent] = js.undefined
      
      var ca: js.UndefOr[String] = js.undefined
      
      var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
      
      var hostname: js.UndefOr[String] = js.undefined
      
      var method: js.UndefOr[POST | GET] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var port: js.UndefOr[Double] = js.undefined
      
      var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    }
    object HTTPTransportOptions {
      
      inline def apply(): HTTPTransportOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTTPTransportOptions]
      }
      
      extension [Self <: HTTPTransportOptions](x: Self) {
        
        inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
        
        inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
        
        inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
        
        inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
        
        inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
        
        inline def setMethod(value: POST | GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
        
        inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      }
    }
  }
  
  inline def uninstall(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")().asInstanceOf[Client]
  
  object utils {
    
    @JSImport("raven", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def consoleAlert(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("consoleAlert")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def parseDSN(dsn: String): parsedDSN | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDSN")(dsn.asInstanceOf[js.Any]).asInstanceOf[parsedDSN | `false`]
    
    inline def parseDSN_false(dsn: `false`): parsedDSN | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDSN")(dsn.asInstanceOf[js.Any]).asInstanceOf[parsedDSN | `false`]
  }
  
  @JSImport("raven", "version")
  @js.native
  val version: String = js.native
  
  inline def wrap[T](func: js.Function0[T]): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
  inline def wrap[T](options: Any, func: js.Function0[T]): js.Function0[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(options.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function0[T]]
  
  type CaptureCallback = js.Function2[/* sendErr */ js.UndefOr[js.Error | Null], /* eventId */ Any, Unit]
  
  trait CaptureOptions extends StObject {
    
    var extra: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var fingerprint: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var req: js.UndefOr[IncomingMessage] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var user: js.UndefOr[Any] = js.undefined
  }
  object CaptureOptions {
    
    inline def apply(): CaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureOptions]
    }
    
    extension [Self <: CaptureOptions](x: Self) {
      
      inline def setExtra(value: StringDictionary[Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value*))
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait ConstructorOptions extends StObject {
    
    var autoBreadcrumbs: js.UndefOr[Boolean | StringDictionary[Boolean]] = js.undefined
    
    var captureUnhandledRejections: js.UndefOr[Boolean] = js.undefined
    
    var dataCallback: js.UndefOr[DataCallback] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var logger: js.UndefOr[String] = js.undefined
    
    var maxBreadcrumbs: js.UndefOr[Double] = js.undefined
    
    var maxReqQueueCount: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parseUser: js.UndefOr[Boolean | js.Array[String] | parseUserCallback] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    var sendTimeout: js.UndefOr[Double] = js.undefined
    
    var shouldSendCallback: js.UndefOr[ShouldSendCallback] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var transport: js.UndefOr[Transport] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setAutoBreadcrumbs(value: Boolean | StringDictionary[Boolean]): Self = StObject.set(x, "autoBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setAutoBreadcrumbsUndefined: Self = StObject.set(x, "autoBreadcrumbs", js.undefined)
      
      inline def setCaptureUnhandledRejections(value: Boolean): Self = StObject.set(x, "captureUnhandledRejections", value.asInstanceOf[js.Any])
      
      inline def setCaptureUnhandledRejectionsUndefined: Self = StObject.set(x, "captureUnhandledRejections", js.undefined)
      
      inline def setDataCallback(value: /* data */ StringDictionary[Any] => Any): Self = StObject.set(x, "dataCallback", js.Any.fromFunction1(value))
      
      inline def setDataCallbackUndefined: Self = StObject.set(x, "dataCallback", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setExtra(value: StringDictionary[Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxBreadcrumbs(value: Double): Self = StObject.set(x, "maxBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setMaxBreadcrumbsUndefined: Self = StObject.set(x, "maxBreadcrumbs", js.undefined)
      
      inline def setMaxReqQueueCount(value: Double): Self = StObject.set(x, "maxReqQueueCount", value.asInstanceOf[js.Any])
      
      inline def setMaxReqQueueCountUndefined: Self = StObject.set(x, "maxReqQueueCount", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParseUser(value: Boolean | js.Array[String] | parseUserCallback): Self = StObject.set(x, "parseUser", value.asInstanceOf[js.Any])
      
      inline def setParseUserFunction1(value: /* req */ Any => Any): Self = StObject.set(x, "parseUser", js.Any.fromFunction1(value))
      
      inline def setParseUserUndefined: Self = StObject.set(x, "parseUser", js.undefined)
      
      inline def setParseUserVarargs(value: String*): Self = StObject.set(x, "parseUser", js.Array(value*))
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setSendTimeout(value: Double): Self = StObject.set(x, "sendTimeout", value.asInstanceOf[js.Any])
      
      inline def setSendTimeoutUndefined: Self = StObject.set(x, "sendTimeout", js.undefined)
      
      inline def setShouldSendCallback(value: /* data */ StringDictionary[Any] => Boolean): Self = StObject.set(x, "shouldSendCallback", js.Any.fromFunction1(value))
      
      inline def setShouldSendCallbackUndefined: Self = StObject.set(x, "shouldSendCallback", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  type DataCallback = js.Function1[/* data */ StringDictionary[Any], Any]
  
  type FatalErrorCallback = js.Function3[
    /* err */ js.Error, 
    /* sendErr */ js.UndefOr[js.Error | Null], 
    /* eventId */ String, 
    Unit
  ]
  
  type ShouldSendCallback = js.Function1[/* data */ StringDictionary[Any], Boolean]
  
  type parseUserCallback = js.Function1[/* req */ Any, Any]
  
  trait parsedDSN extends StObject {
    
    var host: String
    
    var path: String
    
    var port: Double
    
    var private_key: String
    
    var project_id: String
    
    var protocol: String
    
    var public_key: String
  }
  object parsedDSN {
    
    inline def apply(
      host: String,
      path: String,
      port: Double,
      private_key: String,
      project_id: String,
      protocol: String,
      public_key: String
    ): parsedDSN = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[parsedDSN]
    }
    
    extension [Self <: parsedDSN](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setProject_id(value: String): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    }
  }
}
