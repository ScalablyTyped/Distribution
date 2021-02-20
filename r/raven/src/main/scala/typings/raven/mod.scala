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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raven", "Client")
  @js.native
  class Client () extends EventEmitter {
    def this(dsn: String) = this()
    def this(dsn: `false`) = this()
    def this(options: ConstructorOptions) = this()
    def this(dsn: js.UndefOr[scala.Nothing], options: ConstructorOptions) = this()
    def this(dsn: String, options: ConstructorOptions) = this()
    def this(dsn: `false`, options: ConstructorOptions) = this()
    
    def captureBreadcrumb(breadcrumb: js.Any): Unit = js.native
    
    def captureException(error: Error): String = js.native
    def captureException(error: Error, cb: CaptureCallback): String = js.native
    def captureException(error: Error, options: js.UndefOr[scala.Nothing], cb: CaptureCallback): String = js.native
    def captureException(error: Error, options: CaptureOptions): String = js.native
    def captureException(error: Error, options: CaptureOptions, cb: CaptureCallback): String = js.native
    
    def captureMessage(message: String): String = js.native
    def captureMessage(message: String, cb: CaptureCallback): String = js.native
    def captureMessage(message: String, options: js.UndefOr[scala.Nothing], cb: CaptureCallback): String = js.native
    def captureMessage(message: String, options: CaptureOptions): String = js.native
    def captureMessage(message: String, options: CaptureOptions, cb: CaptureCallback): String = js.native
    
    def config(): this.type = js.native
    def config(dsn: js.UndefOr[scala.Nothing], options: ConstructorOptions): this.type = js.native
    def config(dsn: String): this.type = js.native
    def config(dsn: String, options: ConstructorOptions): this.type = js.native
    def config(options: ConstructorOptions): this.type = js.native
    @JSName("config")
    def config_false(dsn: `false`): this.type = js.native
    @JSName("config")
    def config_false(dsn: `false`, options: ConstructorOptions): this.type = js.native
    
    def context[T](ctx: js.Any, func: js.Function0[T]): T = js.native
    def context[T](func: js.Function0[T]): T = js.native
    
    def errorHandler(): js.Function4[
        /* e */ Error, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def getContext(): js.Any = js.native
    
    def install(): this.type = js.native
    def install(cb: FatalErrorCallback): this.type = js.native
    
    def mergeContext(ctx: js.Any): this.type = js.native
    
    // todo: part of public API?
    def process(eventId: String, kwargs: js.Any): Unit = js.native
    def process(eventId: String, kwargs: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def process(kwargs: js.Any): Unit = js.native
    def process(kwargs: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def requestHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def setContext(ctx: js.Any): this.type = js.native
    
    def setDataCallback(fn: DataCallback): this.type = js.native
    
    def setShouldSendCallback(fn: ShouldSendCallback): this.type = js.native
    
    def uninstall(): this.type = js.native
    
    def wrap[T](func: js.Function0[T]): js.Function0[T] = js.native
    def wrap[T](options: js.Any, func: js.Function0[T]): js.Function0[T] = js.native
  }
  
  @JSImport("raven", "captureBreadcrumb")
  @js.native
  def captureBreadcrumb(breadcrumb: js.Any): Unit = js.native
  
  @JSImport("raven", "captureException")
  @js.native
  def captureException(e: Error): String = js.native
  @JSImport("raven", "captureException")
  @js.native
  def captureException(e: Error, cb: CaptureCallback): String = js.native
  @JSImport("raven", "captureException")
  @js.native
  def captureException(e: Error, options: js.UndefOr[scala.Nothing], cb: CaptureCallback): String = js.native
  @JSImport("raven", "captureException")
  @js.native
  def captureException(e: Error, options: CaptureOptions): String = js.native
  @JSImport("raven", "captureException")
  @js.native
  def captureException(e: Error, options: CaptureOptions, cb: CaptureCallback): String = js.native
  
  @JSImport("raven", "captureMessage")
  @js.native
  def captureMessage(message: String): String = js.native
  @JSImport("raven", "captureMessage")
  @js.native
  def captureMessage(message: String, cb: CaptureCallback): String = js.native
  @JSImport("raven", "captureMessage")
  @js.native
  def captureMessage(message: String, options: js.UndefOr[scala.Nothing], cb: CaptureCallback): String = js.native
  @JSImport("raven", "captureMessage")
  @js.native
  def captureMessage(message: String, options: CaptureOptions): String = js.native
  @JSImport("raven", "captureMessage")
  @js.native
  def captureMessage(message: String, options: CaptureOptions, cb: CaptureCallback): String = js.native
  
  @JSImport("raven", "config")
  @js.native
  def config(): Client = js.native
  @JSImport("raven", "config")
  @js.native
  def config(dsn: js.UndefOr[scala.Nothing], options: ConstructorOptions): Client = js.native
  @JSImport("raven", "config")
  @js.native
  def config(dsn: String): Client = js.native
  @JSImport("raven", "config")
  @js.native
  def config(dsn: String, options: ConstructorOptions): Client = js.native
  @JSImport("raven", "config")
  @js.native
  def config(options: ConstructorOptions): Client = js.native
  @JSImport("raven", "config")
  @js.native
  def config_false(dsn: `false`): Client = js.native
  @JSImport("raven", "config")
  @js.native
  def config_false(dsn: `false`, options: ConstructorOptions): Client = js.native
  
  @JSImport("raven", "context")
  @js.native
  def context[T](ctx: js.Any, func: js.Function0[T]): T = js.native
  @JSImport("raven", "context")
  @js.native
  def context[T](func: js.Function0[T]): T = js.native
  
  @JSImport("raven", "disableConsoleAlerts")
  @js.native
  def disableConsoleAlerts(): Unit = js.native
  
  @JSImport("raven", "errorHandler")
  @js.native
  def errorHandler(): js.Function4[
    /* e */ Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  @JSImport("raven", "getContext")
  @js.native
  def getContext(): js.Any = js.native
  
  @JSImport("raven", "install")
  @js.native
  def install(): Client = js.native
  @JSImport("raven", "install")
  @js.native
  def install(cb: FatalErrorCallback): Client = js.native
  
  @JSImport("raven", "interceptErr")
  @js.native
  def interceptErr(ctx: js.Any): Client = js.native
  
  @JSImport("raven", "mergeContext")
  @js.native
  def mergeContext(ctx: js.Any): Client = js.native
  
  @JSImport("raven", "requestHandler")
  @js.native
  def requestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  @JSImport("raven", "setContext")
  @js.native
  def setContext(ctx: js.Any): Client = js.native
  
  @JSImport("raven", "setDataCallback")
  @js.native
  def setDataCallback(fn: DataCallback): Client = js.native
  
  @JSImport("raven", "setShouldSendCallback")
  @js.native
  def setShouldSendCallback(fn: ShouldSendCallback): Client = js.native
  
  object transports {
    
    @JSImport("raven", "transports.HTTPSTransport")
    @js.native
    class HTTPSTransport () extends HTTPTransport {
      def this(options: HTTPTransportOptions) = this()
    }
    
    @JSImport("raven", "transports.HTTPTransport")
    @js.native
    class HTTPTransport () extends Transport {
      def this(options: HTTPTransportOptions) = this()
      
      var agent: Agent = js.native
      
      var defaultPort: String = js.native
      
      var options: HTTPTransportOptions = js.native
    }
    
    @JSImport("raven", "transports.Transport")
    @js.native
    abstract class Transport () extends EventEmitter {
      def this(options: EventEmitterOptions) = this()
      
      def send(
        client: Client,
        message: js.Any,
        headers: OutgoingHttpHeaders,
        eventId: String,
        cb: CaptureCallback
      ): Unit = js.native
    }
    
    @JSImport("raven", "transports.http")
    @js.native
    val http: HTTPTransport = js.native
    
    @JSImport("raven", "transports.https")
    @js.native
    val https: HTTPSTransport = js.native
    
    @js.native
    trait HTTPTransportOptions extends StObject {
      
      var agent: js.UndefOr[Agent] = js.native
      
      var ca: js.UndefOr[String] = js.native
      
      var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
      
      var hostname: js.UndefOr[String] = js.native
      
      var method: js.UndefOr[POST | GET] = js.native
      
      var path: js.UndefOr[String] = js.native
      
      var port: js.UndefOr[Double] = js.native
      
      var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    }
    object HTTPTransportOptions {
      
      @scala.inline
      def apply(): HTTPTransportOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTTPTransportOptions]
      }
      
      @scala.inline
      implicit class HTTPTransportOptionsMutableBuilder[Self <: HTTPTransportOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
        
        @scala.inline
        def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
        
        @scala.inline
        def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
        
        @scala.inline
        def setMethod(value: POST | GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      }
    }
  }
  
  @JSImport("raven", "uninstall")
  @js.native
  def uninstall(): Client = js.native
  
  object utils {
    
    @JSImport("raven", "utils.consoleAlert")
    @js.native
    def consoleAlert(msg: String): Unit = js.native
    
    @JSImport("raven", "utils.parseDSN")
    @js.native
    def parseDSN(dsn: String): parsedDSN | `false` = js.native
    @JSImport("raven", "utils.parseDSN")
    @js.native
    def parseDSN_false(dsn: `false`): parsedDSN | `false` = js.native
  }
  
  @JSImport("raven", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("raven", "wrap")
  @js.native
  def wrap[T](func: js.Function0[T]): js.Function0[T] = js.native
  @JSImport("raven", "wrap")
  @js.native
  def wrap[T](options: js.Any, func: js.Function0[T]): js.Function0[T] = js.native
  
  type CaptureCallback = js.Function2[/* sendErr */ js.UndefOr[Error | Null], /* eventId */ js.Any, Unit]
  
  @js.native
  trait CaptureOptions extends StObject {
    
    var extra: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var fingerprint: js.UndefOr[js.Array[String]] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var req: js.UndefOr[IncomingMessage] = js.native
    
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    var user: js.UndefOr[js.Any] = js.native
  }
  object CaptureOptions {
    
    @scala.inline
    def apply(): CaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureOptions]
    }
    
    @scala.inline
    implicit class CaptureOptionsMutableBuilder[Self <: CaptureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: StringDictionary[js.Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait ConstructorOptions extends StObject {
    
    var autoBreadcrumbs: js.UndefOr[Boolean | StringDictionary[Boolean]] = js.native
    
    var captureUnhandledRejections: js.UndefOr[Boolean] = js.native
    
    var dataCallback: js.UndefOr[DataCallback] = js.native
    
    var environment: js.UndefOr[String] = js.native
    
    var extra: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var logger: js.UndefOr[String] = js.native
    
    var maxBreadcrumbs: js.UndefOr[Double] = js.native
    
    var maxReqQueueCount: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var parseUser: js.UndefOr[Boolean | js.Array[String] | parseUserCallback] = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var sampleRate: js.UndefOr[Double] = js.native
    
    var sendTimeout: js.UndefOr[Double] = js.native
    
    var shouldSendCallback: js.UndefOr[ShouldSendCallback] = js.native
    
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    var transport: js.UndefOr[Transport] = js.native
  }
  object ConstructorOptions {
    
    @scala.inline
    def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit class ConstructorOptionsMutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoBreadcrumbs(value: Boolean | StringDictionary[Boolean]): Self = StObject.set(x, "autoBreadcrumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoBreadcrumbsUndefined: Self = StObject.set(x, "autoBreadcrumbs", js.undefined)
      
      @scala.inline
      def setCaptureUnhandledRejections(value: Boolean): Self = StObject.set(x, "captureUnhandledRejections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUnhandledRejectionsUndefined: Self = StObject.set(x, "captureUnhandledRejections", js.undefined)
      
      @scala.inline
      def setDataCallback(value: /* data */ StringDictionary[js.Any] => js.Any): Self = StObject.set(x, "dataCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataCallbackUndefined: Self = StObject.set(x, "dataCallback", js.undefined)
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setExtra(value: StringDictionary[js.Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMaxBreadcrumbs(value: Double): Self = StObject.set(x, "maxBreadcrumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBreadcrumbsUndefined: Self = StObject.set(x, "maxBreadcrumbs", js.undefined)
      
      @scala.inline
      def setMaxReqQueueCount(value: Double): Self = StObject.set(x, "maxReqQueueCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReqQueueCountUndefined: Self = StObject.set(x, "maxReqQueueCount", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParseUser(value: Boolean | js.Array[String] | parseUserCallback): Self = StObject.set(x, "parseUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUserFunction1(value: /* req */ js.Any => js.Any): Self = StObject.set(x, "parseUser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseUserUndefined: Self = StObject.set(x, "parseUser", js.undefined)
      
      @scala.inline
      def setParseUserVarargs(value: String*): Self = StObject.set(x, "parseUser", js.Array(value :_*))
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      @scala.inline
      def setSendTimeout(value: Double): Self = StObject.set(x, "sendTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendTimeoutUndefined: Self = StObject.set(x, "sendTimeout", js.undefined)
      
      @scala.inline
      def setShouldSendCallback(value: /* data */ StringDictionary[js.Any] => Boolean): Self = StObject.set(x, "shouldSendCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldSendCallbackUndefined: Self = StObject.set(x, "shouldSendCallback", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  type DataCallback = js.Function1[/* data */ StringDictionary[js.Any], js.Any]
  
  type FatalErrorCallback = js.Function3[/* err */ Error, /* sendErr */ js.UndefOr[Error | Null], /* eventId */ String, Unit]
  
  type ShouldSendCallback = js.Function1[/* data */ StringDictionary[js.Any], Boolean]
  
  type parseUserCallback = js.Function1[/* req */ js.Any, js.Any]
  
  @js.native
  trait parsedDSN extends StObject {
    
    var host: String = js.native
    
    var path: String = js.native
    
    var port: Double = js.native
    
    var private_key: String = js.native
    
    var project_id: String = js.native
    
    var protocol: String = js.native
    
    var public_key: String = js.native
  }
  object parsedDSN {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class parsedDSNMutableBuilder[Self <: parsedDSN] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject_id(value: String): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    }
  }
}
