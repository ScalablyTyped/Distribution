package typings.restifyPlugins

import typings.bunyan.mod.^
import typings.restify.mod.Request
import typings.restify.mod.RequestHandler
import typings.restify.mod.Response
import typings.restify.mod.Route
import typings.restifyPlugins.anon.Headers
import typings.restifyPlugins.anon.MapParams
import typings.restifyPlugins.anon.MaxBodySize
import typings.restifyPlugins.anon.Message
import typings.restifyPlugins.anon.Server
import typings.restifyPlugins.anon.UserAgentRegExp
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restify-plugins", "acceptParser")
  @js.native
  def acceptParser(accepts: js.Array[String]): RequestHandler = js.native
  
  @JSImport("restify-plugins", "auditLogger")
  @js.native
  def auditLogger(options: AuditLoggerOptions): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("restify-plugins", "authorizationParser")
  @js.native
  def authorizationParser(): RequestHandler = js.native
  @JSImport("restify-plugins", "authorizationParser")
  @js.native
  def authorizationParser(options: js.Any): RequestHandler = js.native
  
  @JSImport("restify-plugins", "bodyParser")
  @js.native
  def bodyParser(): js.Array[RequestHandler] = js.native
  @JSImport("restify-plugins", "bodyParser")
  @js.native
  def bodyParser(options: BodyParserOptions): js.Array[RequestHandler] = js.native
  
  @JSImport("restify-plugins", "bodyReader")
  @js.native
  def bodyReader(): RequestHandler = js.native
  @JSImport("restify-plugins", "bodyReader")
  @js.native
  def bodyReader(options: MaxBodySize): RequestHandler = js.native
  
  @JSImport("restify-plugins", "conditionalRequest")
  @js.native
  def conditionalRequest(): js.Array[RequestHandler] = js.native
  
  @JSImport("restify-plugins", "dateParser")
  @js.native
  def dateParser(): RequestHandler = js.native
  @JSImport("restify-plugins", "dateParser")
  @js.native
  def dateParser(delta: Double): RequestHandler = js.native
  
  @JSImport("restify-plugins", "fullResponse")
  @js.native
  def fullResponse(): RequestHandler = js.native
  
  @JSImport("restify-plugins", "gzipResponse")
  @js.native
  def gzipResponse(): RequestHandler = js.native
  @JSImport("restify-plugins", "gzipResponse")
  @js.native
  def gzipResponse(options: js.Any): RequestHandler = js.native
  
  @JSImport("restify-plugins", "jsonBodyParser")
  @js.native
  def jsonBodyParser(): js.Array[RequestHandler] = js.native
  @JSImport("restify-plugins", "jsonBodyParser")
  @js.native
  def jsonBodyParser(options: MapParams): js.Array[RequestHandler] = js.native
  
  @JSImport("restify-plugins", "jsonp")
  @js.native
  def jsonp(): RequestHandler = js.native
  
  @JSImport("restify-plugins", "metrics")
  @js.native
  def metrics(opts: Server, callback: js.Function1[/* options */ MetricsCallback, _]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("restify-plugins", "multipartBodyParser")
  @js.native
  def multipartBodyParser(): RequestHandler = js.native
  @JSImport("restify-plugins", "multipartBodyParser")
  @js.native
  def multipartBodyParser(options: MultipartBodyParser_): RequestHandler = js.native
  
  @JSImport("restify-plugins", "oauth2TokenParser")
  @js.native
  def oauth2TokenParser(): RequestHandler = js.native
  
  object pre {
    
    /**
      * Provide req.set(key, val) and req.get(key) methods for setting and retrieving context to a specific request.
      */
    @JSImport("restify-plugins", "pre.context")
    @js.native
    def context(): RequestHandler = js.native
    
    @JSImport("restify-plugins", "pre.dedupeSlashes")
    @js.native
    def dedupeSlashes(): RequestHandler = js.native
    
    /**
      * This pre handler fixes issues with node hanging when an asyncHandler is used prior to bodyParser.
      */
    @JSImport("restify-plugins", "pre.pause")
    @js.native
    def pause(): RequestHandler = js.native
    
    /**
      * Automatically reuse incoming request header as the request id.
      */
    @JSImport("restify-plugins", "pre.reqIdHeaders")
    @js.native
    def reqIdHeaders(options: Headers): RequestHandler = js.native
    
    /**
      * Cleans up duplicate or trailing / on the URL
      */
    @JSImport("restify-plugins", "pre.sanitizePath")
    @js.native
    def sanitizePath(): RequestHandler = js.native
    
    /**
      * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
      */
    @JSImport("restify-plugins", "pre.strictQueryParams")
    @js.native
    def strictQueryParams(): RequestHandler = js.native
    @JSImport("restify-plugins", "pre.strictQueryParams")
    @js.native
    def strictQueryParams(options: Message): RequestHandler = js.native
    
    /**
      * Regexp to capture curl user-agents
      */
    @JSImport("restify-plugins", "pre.userAgentConnection")
    @js.native
    def userAgentConnection(): RequestHandler = js.native
    @JSImport("restify-plugins", "pre.userAgentConnection")
    @js.native
    def userAgentConnection(options: UserAgentRegExp): RequestHandler = js.native
  }
  
  @JSImport("restify-plugins", "queryParser")
  @js.native
  def queryParser(): RequestHandler = js.native
  @JSImport("restify-plugins", "queryParser")
  @js.native
  def queryParser(options: QueryParserOptions): RequestHandler = js.native
  
  @JSImport("restify-plugins", "requestExpiry")
  @js.native
  def requestExpiry(): RequestHandler = js.native
  @JSImport("restify-plugins", "requestExpiry")
  @js.native
  def requestExpiry(options: RequestExpiryOptions): RequestHandler = js.native
  
  @JSImport("restify-plugins", "requestLogger")
  @js.native
  def requestLogger(): RequestHandler = js.native
  @JSImport("restify-plugins", "requestLogger")
  @js.native
  def requestLogger(options: RequestLogger_): RequestHandler = js.native
  
  @JSImport("restify-plugins", "serveStatic")
  @js.native
  def serveStatic(): RequestHandler = js.native
  @JSImport("restify-plugins", "serveStatic")
  @js.native
  def serveStatic(options: ServeStatic_): RequestHandler = js.native
  
  @JSImport("restify-plugins", "throttle")
  @js.native
  def throttle(): RequestHandler = js.native
  @JSImport("restify-plugins", "throttle")
  @js.native
  def throttle(options: ThrottleOptions): RequestHandler = js.native
  
  @JSImport("restify-plugins", "urlEncodedBodyParser")
  @js.native
  def urlEncodedBodyParser(): js.Array[RequestHandler] = js.native
  @JSImport("restify-plugins", "urlEncodedBodyParser")
  @js.native
  def urlEncodedBodyParser(options: UrlEncodedBodyParser_): js.Array[RequestHandler] = js.native
  
  @js.native
  trait AuditLoggerOptions extends StObject {
    
    var body: js.UndefOr[Boolean] = js.native
    
    /**
      * Bunyan logger
      */
    var log: ^ = js.native
    
    /**
      * Ringbuffer which is written to if passed in
      */
    var logBuffer: js.UndefOr[js.Any] = js.native
    
    /**
      * When true, prints audit logs. default true.
      */
    var printLog: js.UndefOr[Boolean] = js.native
    
    /**
      * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
      */
    var server: js.UndefOr[typings.restify.mod.Server] = js.native
  }
  object AuditLoggerOptions {
    
    @scala.inline
    def apply(log: ^): AuditLoggerOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuditLoggerOptions]
    }
    
    @scala.inline
    implicit class AuditLoggerOptionsMutableBuilder[Self <: AuditLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setLog(value: ^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogBuffer(value: js.Any): Self = StObject.set(x, "logBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogBufferUndefined: Self = StObject.set(x, "logBuffer", js.undefined)
      
      @scala.inline
      def setPrintLog(value: Boolean): Self = StObject.set(x, "printLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintLogUndefined: Self = StObject.set(x, "printLog", js.undefined)
      
      @scala.inline
      def setServer(value: typings.restify.mod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  @js.native
  trait BodyParserOptions extends StObject {
    
    /**
      * If you want checksums calculated for incoming files, set this to either sha1 or md5.
      */
    var hash: js.UndefOr[String] = js.native
    
    /**
      * If you want the uploaded files to include the extensions of the original files (multipart uploads only). Does nothing if multipartFileHandler is defined.
      */
    var keepExtensions: js.UndefOr[Boolean] = js.native
    
    /**
      * If req.params should be filled with the contents of files sent through a multipart request.
      * Formidable is used internally for parsing, and a file is denoted as a multipart part with the filename option set in its Content-Disposition.
      * This will only be performed if mapParams is true.
      */
    var mapFiles: js.UndefOr[Boolean] = js.native
    
    /**
      * If req.params should be filled with parsed parameters from HTTP body.
      */
    var mapParams: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum size in bytes allowed in the HTTP body. Useful for limiting clients from hogging server memory.
      */
    var maxBodySize: js.UndefOr[Double] = js.native
    
    var maxFieldsSize: js.UndefOr[Double] = js.native
    
    /**
      * A callback to handle any multipart file.
      * It will be a file if the part have a Content-Disposition with the filename parameter set.
      * This typically happens when a browser sends a form and there is a parameter similar to <input type="file" />.
      * If this is not provided, the default behaviour is to map the contents into req.params.
      */
    var multipartFileHandler: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A callback to handle any multipart part which is not a file.
      * If this is omitted, the default handler is invoked which may or may not map the parts into req.params, depending on the mapParams-option.
      */
    var multipartHandler: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * If you want to support html5 multiple attribute in upload fields.
      */
    var multiples: js.UndefOr[Boolean] = js.native
    
    /**
      * If an entry in req.params should be overwritten by the value in the body if the names are the same.
      * For instance, if you have the route /:someval, and someone posts an x-www-form-urlencoded Content-Type with the body someval=happy to /sad,
      * the value will be happy if overrideParams is true, sad otherwise.
      */
    var overrideParams: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true if you want to end the request with a UnsupportedMediaTypeError when none of the supported content types was given.
      */
    var rejectUnknown: js.UndefOr[Boolean] = js.native
    
    var reviver: js.UndefOr[js.Any] = js.native
    
    /**
      * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
      */
    var uploadDir: js.UndefOr[String] = js.native
  }
  object BodyParserOptions {
    
    @scala.inline
    def apply(): BodyParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BodyParserOptions]
    }
    
    @scala.inline
    implicit class BodyParserOptionsMutableBuilder[Self <: BodyParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
      
      @scala.inline
      def setMapFiles(value: Boolean): Self = StObject.set(x, "mapFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapFilesUndefined: Self = StObject.set(x, "mapFiles", js.undefined)
      
      @scala.inline
      def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      @scala.inline
      def setMaxBodySize(value: Double): Self = StObject.set(x, "maxBodySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBodySizeUndefined: Self = StObject.set(x, "maxBodySize", js.undefined)
      
      @scala.inline
      def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      @scala.inline
      def setMultipartFileHandler(value: () => Unit): Self = StObject.set(x, "multipartFileHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMultipartFileHandlerUndefined: Self = StObject.set(x, "multipartFileHandler", js.undefined)
      
      @scala.inline
      def setMultipartHandler(value: () => Unit): Self = StObject.set(x, "multipartHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMultipartHandlerUndefined: Self = StObject.set(x, "multipartHandler", js.undefined)
      
      @scala.inline
      def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
      
      @scala.inline
      def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      @scala.inline
      def setRejectUnknown(value: Boolean): Self = StObject.set(x, "rejectUnknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnknownUndefined: Self = StObject.set(x, "rejectUnknown", js.undefined)
      
      @scala.inline
      def setReviver(value: js.Any): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
      
      @scala.inline
      def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
    }
  }
  
  @js.native
  trait MetricsCallback extends StObject {
    
    /**
      *  An error if the request had an error
      */
    var err: Error = js.native
    
    var metrics: MetricsCallbackOptions = js.native
    
    var req: Request = js.native
    
    var res: Response = js.native
    
    /**
      * The route obj that serviced the request
      */
    var route: Route = js.native
  }
  object MetricsCallback {
    
    @scala.inline
    def apply(err: Error, metrics: MetricsCallbackOptions, req: Request, res: Response, route: Route): MetricsCallback = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsCallback]
    }
    
    @scala.inline
    implicit class MetricsCallbackMutableBuilder[Self <: MetricsCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetrics(value: MetricsCallbackOptions): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetricsCallbackOptions extends StObject {
    
    /**
      * If this value is set, err will be a corresponding `RequestCloseError` or `RequestAbortedError`.
      *
      * If connectionState is either 'close' or 'aborted', then the statusCode is not applicable since the connection was severed before a response was written.
      */
    var connectionState: TMetricsCallback = js.native
    
    /**
      * Request latency
      */
    var latency: Double = js.native
    
    /**
      * HTTP request verb
      */
    var method: String = js.native
    
    /**
      * req.path() value
      */
    var path: String = js.native
    
    /**
      * Status code of the response. Can be undefined in the case of an `uncaughtException`.
      * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
      */
    var statusCode: Double = js.native
  }
  object MetricsCallbackOptions {
    
    @scala.inline
    def apply(latency: Double, method: String, path: String, statusCode: Double): MetricsCallbackOptions = {
      val __obj = js.Dynamic.literal(latency = latency.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsCallbackOptions]
    }
    
    @scala.inline
    implicit class MetricsCallbackOptionsMutableBuilder[Self <: MetricsCallbackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionState(value: TMetricsCallback): Self = StObject.set(x, "connectionState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionStateUndefined: Self = StObject.set(x, "connectionState", js.undefined)
      
      @scala.inline
      def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultipartBodyParser_ extends StObject {
    
    var hash: js.UndefOr[String] = js.native
    
    var keepExtensions: js.UndefOr[Boolean] = js.native
    
    var mapFiles: js.UndefOr[Boolean] = js.native
    
    var mapParams: js.UndefOr[Boolean] = js.native
    
    var maxFieldsSize: js.UndefOr[Double] = js.native
    
    var multipartFileHandler: js.UndefOr[js.Any] = js.native
    
    var multipartHandler: js.UndefOr[js.Any] = js.native
    
    var multiples: js.UndefOr[Boolean] = js.native
    
    var overrideParams: js.UndefOr[Boolean] = js.native
    
    var uploadDir: js.UndefOr[String] = js.native
  }
  object MultipartBodyParser_ {
    
    @scala.inline
    def apply(): MultipartBodyParser_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipartBodyParser_]
    }
    
    @scala.inline
    implicit class MultipartBodyParser_MutableBuilder[Self <: MultipartBodyParser_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
      
      @scala.inline
      def setMapFiles(value: Boolean): Self = StObject.set(x, "mapFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapFilesUndefined: Self = StObject.set(x, "mapFiles", js.undefined)
      
      @scala.inline
      def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      @scala.inline
      def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      @scala.inline
      def setMultipartFileHandler(value: js.Any): Self = StObject.set(x, "multipartFileHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipartFileHandlerUndefined: Self = StObject.set(x, "multipartFileHandler", js.undefined)
      
      @scala.inline
      def setMultipartHandler(value: js.Any): Self = StObject.set(x, "multipartHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipartHandlerUndefined: Self = StObject.set(x, "multipartHandler", js.undefined)
      
      @scala.inline
      def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
      
      @scala.inline
      def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      @scala.inline
      def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
    }
  }
  
  @js.native
  trait QueryParserOptions extends StObject {
    
    /**
      *  Default false. Transform `?foo.bar=baz` to a nested object: `{foo: {bar: 'baz'}}`.
      */
    var allowDots: js.UndefOr[Boolean] = js.native
    
    /**
      * Default 20. Only transform `?a[$index]=b` to an array if `$index` is less than `arrayLimit`.
      */
    var arrayLimit: js.UndefOr[Double] = js.native
    
    /**
      * Default 5. The depth limit for parsing nested objects, e.g. `?a[b][c][d][e][f][g][h][i]=j`.
      */
    var depth: js.UndefOr[Double] = js.native
    
    /**
      * Default `false`. Copies parsed query parameters into `req.params`.
      */
    var mapParams: js.UndefOr[Boolean] = js.native
    
    /**
      * Default `false`. Only applies when if mapParams true. When true, will stomp on req.params field when existing value is found.
      */
    var overrideParams: js.UndefOr[Boolean] = js.native
    
    /**
      * Default 1000. Maximum number of query params parsed. Additional params are silently dropped.
      */
    var parameterLimit: js.UndefOr[Double] = js.native
    
    /**
      * Default true. Whether to parse `?a[]=b&a[1]=c` to an array, e.g. `{a: ['b', 'c']}`.
      */
    var parseArrays: js.UndefOr[Boolean] = js.native
    
    /**
      * Default false. Whether `req.query` is a "plain" object -- does not inherit from `Object`.
      * This can be used to allow query params whose names collide with Object methods, e.g. `?hasOwnProperty=blah`.
      */
    var plainObjects: js.UndefOr[Boolean] = js.native
    
    /**
      * Default false. If true, `?a&b=` results in `{a: null, b: ''}`. Otherwise, `{a: '', b: ''}`.
      */
    var strictNullHandling: js.UndefOr[Boolean] = js.native
  }
  object QueryParserOptions {
    
    @scala.inline
    def apply(): QueryParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParserOptions]
    }
    
    @scala.inline
    implicit class QueryParserOptionsMutableBuilder[Self <: QueryParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
      
      @scala.inline
      def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayLimitUndefined: Self = StObject.set(x, "arrayLimit", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      @scala.inline
      def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      @scala.inline
      def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterLimitUndefined: Self = StObject.set(x, "parameterLimit", js.undefined)
      
      @scala.inline
      def setParseArrays(value: Boolean): Self = StObject.set(x, "parseArrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseArraysUndefined: Self = StObject.set(x, "parseArrays", js.undefined)
      
      @scala.inline
      def setPlainObjects(value: Boolean): Self = StObject.set(x, "plainObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainObjectsUndefined: Self = StObject.set(x, "plainObjects", js.undefined)
      
      @scala.inline
      def setStrictNullHandling(value: Boolean): Self = StObject.set(x, "strictNullHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictNullHandlingUndefined: Self = StObject.set(x, "strictNullHandling", js.undefined)
    }
  }
  
  @js.native
  trait RequestExpiryOptions extends StObject {
    
    /**
      * Header name of the absolute time for request expiration
      */
    var absoluteHeader: js.UndefOr[String] = js.native
    
    /**
      * Header name for the start time of the request
      */
    var startHeader: js.UndefOr[String] = js.native
    
    /**
      * The header name for the time in milliseconds that should ellapse before the request is considered expired.
      */
    var timeoutHeader: js.UndefOr[String] = js.native
  }
  object RequestExpiryOptions {
    
    @scala.inline
    def apply(): RequestExpiryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestExpiryOptions]
    }
    
    @scala.inline
    implicit class RequestExpiryOptionsMutableBuilder[Self <: RequestExpiryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteHeader(value: String): Self = StObject.set(x, "absoluteHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteHeaderUndefined: Self = StObject.set(x, "absoluteHeader", js.undefined)
      
      @scala.inline
      def setStartHeader(value: String): Self = StObject.set(x, "startHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartHeaderUndefined: Self = StObject.set(x, "startHeader", js.undefined)
      
      @scala.inline
      def setTimeoutHeader(value: String): Self = StObject.set(x, "timeoutHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutHeaderUndefined: Self = StObject.set(x, "timeoutHeader", js.undefined)
    }
  }
  
  @js.native
  trait RequestLogger_ extends StObject {
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var log: js.UndefOr[js.Any] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var serializers: js.UndefOr[js.Any] = js.native
  }
  object RequestLogger_ {
    
    @scala.inline
    def apply(): RequestLogger_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestLogger_]
    }
    
    @scala.inline
    implicit class RequestLogger_MutableBuilder[Self <: RequestLogger_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setSerializers(value: js.Any): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    }
  }
  
  @js.native
  trait ServeStatic_ extends StObject {
    
    var default: js.UndefOr[js.Any] = js.native
    
    var appendRequestPath: js.UndefOr[Boolean] = js.native
    
    var charSet: js.UndefOr[String] = js.native
    
    var directory: js.UndefOr[String] = js.native
    
    var etag: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var `match`: js.UndefOr[js.Any] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
  }
  object ServeStatic_ {
    
    @scala.inline
    def apply(): ServeStatic_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServeStatic_]
    }
    
    @scala.inline
    implicit class ServeStatic_MutableBuilder[Self <: ServeStatic_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendRequestPath(value: Boolean): Self = StObject.set(x, "appendRequestPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendRequestPathUndefined: Self = StObject.set(x, "appendRequestPath", js.undefined)
      
      @scala.inline
      def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.restifyPlugins.restifyPluginsStrings.close
    - typings.restifyPlugins.restifyPluginsStrings.aborted
    - js.UndefOr[scala.Nothing]
  */
  type TMetricsCallback = js.UndefOr[_TMetricsCallback]
  
  @js.native
  trait ThrottleOptions extends StObject {
    
    var burst: js.UndefOr[Double] = js.native
    
    var ip: js.UndefOr[Boolean] = js.native
    
    var maxKeys: js.UndefOr[Double] = js.native
    
    var overrides: js.UndefOr[js.Any] = js.native
    
    var rate: js.UndefOr[Double] = js.native
    
    var tokensTable: js.UndefOr[js.Any] = js.native
    
    var username: js.UndefOr[Boolean] = js.native
    
    var xff: js.UndefOr[Boolean] = js.native
  }
  object ThrottleOptions {
    
    @scala.inline
    def apply(): ThrottleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleOptions]
    }
    
    @scala.inline
    implicit class ThrottleOptionsMutableBuilder[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
      
      @scala.inline
      def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
      
      @scala.inline
      def setOverrides(value: js.Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setTokensTable(value: js.Any): Self = StObject.set(x, "tokensTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensTableUndefined: Self = StObject.set(x, "tokensTable", js.undefined)
      
      @scala.inline
      def setUsername(value: Boolean): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setXff(value: Boolean): Self = StObject.set(x, "xff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXffUndefined: Self = StObject.set(x, "xff", js.undefined)
    }
  }
  
  @js.native
  trait UrlEncodedBodyParser_ extends StObject {
    
    var mapParams: js.UndefOr[Boolean] = js.native
    
    var overrideParams: js.UndefOr[Boolean] = js.native
  }
  object UrlEncodedBodyParser_ {
    
    @scala.inline
    def apply(): UrlEncodedBodyParser_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlEncodedBodyParser_]
    }
    
    @scala.inline
    implicit class UrlEncodedBodyParser_MutableBuilder[Self <: UrlEncodedBodyParser_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      @scala.inline
      def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
    }
  }
  
  trait _TMetricsCallback extends StObject
}
