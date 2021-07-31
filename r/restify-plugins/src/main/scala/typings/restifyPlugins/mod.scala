package typings.restifyPlugins

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restify-plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def acceptParser(accepts: js.Array[String]): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptParser")(accepts.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def auditLogger(options: AuditLoggerOptions): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditLogger")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  @scala.inline
  def authorizationParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")().asInstanceOf[RequestHandler]
  @scala.inline
  def authorizationParser(options: js.Any): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def bodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")().asInstanceOf[js.Array[RequestHandler]]
  @scala.inline
  def bodyParser(options: BodyParserOptions): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]
  
  @scala.inline
  def bodyReader(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")().asInstanceOf[RequestHandler]
  @scala.inline
  def bodyReader(options: MaxBodySize): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def conditionalRequest(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionalRequest")().asInstanceOf[js.Array[RequestHandler]]
  
  @scala.inline
  def dateParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")().asInstanceOf[RequestHandler]
  @scala.inline
  def dateParser(delta: Double): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")(delta.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def fullResponse(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fullResponse")().asInstanceOf[RequestHandler]
  
  @scala.inline
  def gzipResponse(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")().asInstanceOf[RequestHandler]
  @scala.inline
  def gzipResponse(options: js.Any): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def jsonBodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")().asInstanceOf[js.Array[RequestHandler]]
  @scala.inline
  def jsonBodyParser(options: MapParams): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]
  
  @scala.inline
  def jsonp(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")().asInstanceOf[RequestHandler]
  
  @scala.inline
  def metrics(opts: Server, callback: js.Function1[/* options */ MetricsCallback, js.Any]): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("metrics")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  @scala.inline
  def multipartBodyParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")().asInstanceOf[RequestHandler]
  @scala.inline
  def multipartBodyParser(options: MultipartBodyParser_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def oauth2TokenParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("oauth2TokenParser")().asInstanceOf[RequestHandler]
  
  object pre {
    
    @JSImport("restify-plugins", "pre")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Provide req.set(key, val) and req.get(key) methods for setting and retrieving context to a specific request.
      */
    @scala.inline
    def context(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("context")().asInstanceOf[RequestHandler]
    
    @scala.inline
    def dedupeSlashes(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dedupeSlashes")().asInstanceOf[RequestHandler]
    
    /**
      * This pre handler fixes issues with node hanging when an asyncHandler is used prior to bodyParser.
      */
    @scala.inline
    def pause(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[RequestHandler]
    
    /**
      * Automatically reuse incoming request header as the request id.
      */
    @scala.inline
    def reqIdHeaders(options: Headers): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("reqIdHeaders")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
    
    /**
      * Cleans up duplicate or trailing / on the URL
      */
    @scala.inline
    def sanitizePath(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizePath")().asInstanceOf[RequestHandler]
    
    /**
      * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
      */
    @scala.inline
    def strictQueryParams(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("strictQueryParams")().asInstanceOf[RequestHandler]
    @scala.inline
    def strictQueryParams(options: Message): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("strictQueryParams")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
    
    /**
      * Regexp to capture curl user-agents
      */
    @scala.inline
    def userAgentConnection(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentConnection")().asInstanceOf[RequestHandler]
    @scala.inline
    def userAgentConnection(options: UserAgentRegExp): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentConnection")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  }
  
  @scala.inline
  def queryParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")().asInstanceOf[RequestHandler]
  @scala.inline
  def queryParser(options: QueryParserOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def requestExpiry(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")().asInstanceOf[RequestHandler]
  @scala.inline
  def requestExpiry(options: RequestExpiryOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def requestLogger(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")().asInstanceOf[RequestHandler]
  @scala.inline
  def requestLogger(options: RequestLogger_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def serveStatic(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")().asInstanceOf[RequestHandler]
  @scala.inline
  def serveStatic(options: ServeStatic_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def throttle(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")().asInstanceOf[RequestHandler]
  @scala.inline
  def throttle(options: ThrottleOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @scala.inline
  def urlEncodedBodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")().asInstanceOf[js.Array[RequestHandler]]
  @scala.inline
  def urlEncodedBodyParser(options: UrlEncodedBodyParser_): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]
  
  trait AuditLoggerOptions extends StObject {
    
    var body: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Bunyan logger
      */
    var log: typings.bunyan.mod.^
    
    /**
      * Ringbuffer which is written to if passed in
      */
    var logBuffer: js.UndefOr[js.Any] = js.undefined
    
    /**
      * When true, prints audit logs. default true.
      */
    var printLog: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
      */
    var server: js.UndefOr[typings.restify.mod.Server] = js.undefined
  }
  object AuditLoggerOptions {
    
    @scala.inline
    def apply(log: typings.bunyan.mod.^): AuditLoggerOptions = {
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
      def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
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
  
  trait BodyParserOptions extends StObject {
    
    /**
      * If you want checksums calculated for incoming files, set this to either sha1 or md5.
      */
    var hash: js.UndefOr[String] = js.undefined
    
    /**
      * If you want the uploaded files to include the extensions of the original files (multipart uploads only). Does nothing if multipartFileHandler is defined.
      */
    var keepExtensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If req.params should be filled with the contents of files sent through a multipart request.
      * Formidable is used internally for parsing, and a file is denoted as a multipart part with the filename option set in its Content-Disposition.
      * This will only be performed if mapParams is true.
      */
    var mapFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If req.params should be filled with parsed parameters from HTTP body.
      */
    var mapParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum size in bytes allowed in the HTTP body. Useful for limiting clients from hogging server memory.
      */
    var maxBodySize: js.UndefOr[Double] = js.undefined
    
    var maxFieldsSize: js.UndefOr[Double] = js.undefined
    
    /**
      * A callback to handle any multipart file.
      * It will be a file if the part have a Content-Disposition with the filename parameter set.
      * This typically happens when a browser sends a form and there is a parameter similar to <input type="file" />.
      * If this is not provided, the default behaviour is to map the contents into req.params.
      */
    var multipartFileHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A callback to handle any multipart part which is not a file.
      * If this is omitted, the default handler is invoked which may or may not map the parts into req.params, depending on the mapParams-option.
      */
    var multipartHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If you want to support html5 multiple attribute in upload fields.
      */
    var multiples: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If an entry in req.params should be overwritten by the value in the body if the names are the same.
      * For instance, if you have the route /:someval, and someone posts an x-www-form-urlencoded Content-Type with the body someval=happy to /sad,
      * the value will be happy if overrideParams is true, sad otherwise.
      */
    var overrideParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true if you want to end the request with a UnsupportedMediaTypeError when none of the supported content types was given.
      */
    var rejectUnknown: js.UndefOr[Boolean] = js.undefined
    
    var reviver: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
      */
    var uploadDir: js.UndefOr[String] = js.undefined
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
  
  trait MetricsCallback extends StObject {
    
    /**
      *  An error if the request had an error
      */
    var err: Error
    
    var metrics: MetricsCallbackOptions
    
    var req: Request
    
    var res: Response
    
    /**
      * The route obj that serviced the request
      */
    var route: Route
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
  
  trait MetricsCallbackOptions extends StObject {
    
    /**
      * If this value is set, err will be a corresponding `RequestCloseError` or `RequestAbortedError`.
      *
      * If connectionState is either 'close' or 'aborted', then the statusCode is not applicable since the connection was severed before a response was written.
      */
    var connectionState: TMetricsCallback
    
    /**
      * Request latency
      */
    var latency: Double
    
    /**
      * HTTP request verb
      */
    var method: String
    
    /**
      * req.path() value
      */
    var path: String
    
    /**
      * Status code of the response. Can be undefined in the case of an `uncaughtException`.
      * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
      */
    var statusCode: Double
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
  
  trait MultipartBodyParser_ extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var keepExtensions: js.UndefOr[Boolean] = js.undefined
    
    var mapFiles: js.UndefOr[Boolean] = js.undefined
    
    var mapParams: js.UndefOr[Boolean] = js.undefined
    
    var maxFieldsSize: js.UndefOr[Double] = js.undefined
    
    var multipartFileHandler: js.UndefOr[js.Any] = js.undefined
    
    var multipartHandler: js.UndefOr[js.Any] = js.undefined
    
    var multiples: js.UndefOr[Boolean] = js.undefined
    
    var overrideParams: js.UndefOr[Boolean] = js.undefined
    
    var uploadDir: js.UndefOr[String] = js.undefined
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
  
  trait QueryParserOptions extends StObject {
    
    /**
      *  Default false. Transform `?foo.bar=baz` to a nested object: `{foo: {bar: 'baz'}}`.
      */
    var allowDots: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default 20. Only transform `?a[$index]=b` to an array if `$index` is less than `arrayLimit`.
      */
    var arrayLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Default 5. The depth limit for parsing nested objects, e.g. `?a[b][c][d][e][f][g][h][i]=j`.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Default `false`. Copies parsed query parameters into `req.params`.
      */
    var mapParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default `false`. Only applies when if mapParams true. When true, will stomp on req.params field when existing value is found.
      */
    var overrideParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default 1000. Maximum number of query params parsed. Additional params are silently dropped.
      */
    var parameterLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Default true. Whether to parse `?a[]=b&a[1]=c` to an array, e.g. `{a: ['b', 'c']}`.
      */
    var parseArrays: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default false. Whether `req.query` is a "plain" object -- does not inherit from `Object`.
      * This can be used to allow query params whose names collide with Object methods, e.g. `?hasOwnProperty=blah`.
      */
    var plainObjects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default false. If true, `?a&b=` results in `{a: null, b: ''}`. Otherwise, `{a: '', b: ''}`.
      */
    var strictNullHandling: js.UndefOr[Boolean] = js.undefined
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
  
  trait RequestExpiryOptions extends StObject {
    
    /**
      * Header name of the absolute time for request expiration
      */
    var absoluteHeader: js.UndefOr[String] = js.undefined
    
    /**
      * Header name for the start time of the request
      */
    var startHeader: js.UndefOr[String] = js.undefined
    
    /**
      * The header name for the time in milliseconds that should ellapse before the request is considered expired.
      */
    var timeoutHeader: js.UndefOr[String] = js.undefined
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
  
  trait RequestLogger_ extends StObject {
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var log: js.UndefOr[js.Any] = js.undefined
    
    var properties: js.UndefOr[js.Any] = js.undefined
    
    var serializers: js.UndefOr[js.Any] = js.undefined
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
  
  trait ServeStatic_ extends StObject {
    
    var default: js.UndefOr[js.Any] = js.undefined
    
    var appendRequestPath: js.UndefOr[Boolean] = js.undefined
    
    var charSet: js.UndefOr[String] = js.undefined
    
    var directory: js.UndefOr[String] = js.undefined
    
    var etag: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var `match`: js.UndefOr[js.Any] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
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
    - scala.Unit
  */
  type TMetricsCallback = js.UndefOr[_TMetricsCallback]
  
  trait ThrottleOptions extends StObject {
    
    var burst: js.UndefOr[Double] = js.undefined
    
    var ip: js.UndefOr[Boolean] = js.undefined
    
    var maxKeys: js.UndefOr[Double] = js.undefined
    
    var overrides: js.UndefOr[js.Any] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var tokensTable: js.UndefOr[js.Any] = js.undefined
    
    var username: js.UndefOr[Boolean] = js.undefined
    
    var xff: js.UndefOr[Boolean] = js.undefined
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
  
  trait UrlEncodedBodyParser_ extends StObject {
    
    var mapParams: js.UndefOr[Boolean] = js.undefined
    
    var overrideParams: js.UndefOr[Boolean] = js.undefined
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
