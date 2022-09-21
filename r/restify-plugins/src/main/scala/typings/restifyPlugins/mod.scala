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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restify-plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def acceptParser(accepts: js.Array[String]): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptParser")(accepts.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def auditLogger(options: AuditLoggerOptions): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditLogger")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def authorizationParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")().asInstanceOf[RequestHandler]
  inline def authorizationParser(options: Any): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def bodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")().asInstanceOf[js.Array[RequestHandler]]
  inline def bodyParser(options: BodyParserOptions): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]
  
  inline def bodyReader(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")().asInstanceOf[RequestHandler]
  inline def bodyReader(options: MaxBodySize): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def conditionalRequest(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionalRequest")().asInstanceOf[js.Array[RequestHandler]]
  
  inline def dateParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")().asInstanceOf[RequestHandler]
  inline def dateParser(delta: Double): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")(delta.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def fullResponse(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fullResponse")().asInstanceOf[RequestHandler]
  
  inline def gzipResponse(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")().asInstanceOf[RequestHandler]
  inline def gzipResponse(options: Any): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def jsonBodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")().asInstanceOf[js.Array[RequestHandler]]
  inline def jsonBodyParser(options: MapParams): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]
  
  inline def jsonp(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")().asInstanceOf[RequestHandler]
  
  inline def metrics(opts: Server, callback: js.Function1[/* options */ MetricsCallback, Any]): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("metrics")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def multipartBodyParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")().asInstanceOf[RequestHandler]
  inline def multipartBodyParser(options: MultipartBodyParser_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def oauth2TokenParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("oauth2TokenParser")().asInstanceOf[RequestHandler]
  
  object pre {
    
    @JSImport("restify-plugins", "pre")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Provide req.set(key, val) and req.get(key) methods for setting and retrieving context to a specific request.
      */
    inline def context(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("context")().asInstanceOf[RequestHandler]
    
    inline def dedupeSlashes(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dedupeSlashes")().asInstanceOf[RequestHandler]
    
    /**
      * This pre handler fixes issues with node hanging when an asyncHandler is used prior to bodyParser.
      */
    inline def pause(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[RequestHandler]
    
    /**
      * Automatically reuse incoming request header as the request id.
      */
    inline def reqIdHeaders(options: Headers): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("reqIdHeaders")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
    
    /**
      * Cleans up duplicate or trailing / on the URL
      */
    inline def sanitizePath(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizePath")().asInstanceOf[RequestHandler]
    
    /**
      * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
      */
    inline def strictQueryParams(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("strictQueryParams")().asInstanceOf[RequestHandler]
    inline def strictQueryParams(options: Message): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("strictQueryParams")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
    
    /**
      * Regexp to capture curl user-agents
      */
    inline def userAgentConnection(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentConnection")().asInstanceOf[RequestHandler]
    inline def userAgentConnection(options: UserAgentRegExp): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentConnection")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  }
  
  inline def queryParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")().asInstanceOf[RequestHandler]
  inline def queryParser(options: QueryParserOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def requestExpiry(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")().asInstanceOf[RequestHandler]
  inline def requestExpiry(options: RequestExpiryOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def requestLogger(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")().asInstanceOf[RequestHandler]
  inline def requestLogger(options: RequestLogger_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def serveStatic(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")().asInstanceOf[RequestHandler]
  inline def serveStatic(options: ServeStatic_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def throttle(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")().asInstanceOf[RequestHandler]
  inline def throttle(options: ThrottleOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def urlEncodedBodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")().asInstanceOf[js.Array[RequestHandler]]
  inline def urlEncodedBodyParser(options: UrlEncodedBodyParser_): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]
  
  trait AuditLoggerOptions extends StObject {
    
    var body: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Bunyan logger
      */
    var log: typings.bunyan.mod.^
    
    /**
      * Ringbuffer which is written to if passed in
      */
    var logBuffer: js.UndefOr[Any] = js.undefined
    
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
    
    inline def apply(log: typings.bunyan.mod.^): AuditLoggerOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuditLoggerOptions]
    }
    
    extension [Self <: AuditLoggerOptions](x: Self) {
      
      inline def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogBuffer(value: Any): Self = StObject.set(x, "logBuffer", value.asInstanceOf[js.Any])
      
      inline def setLogBufferUndefined: Self = StObject.set(x, "logBuffer", js.undefined)
      
      inline def setPrintLog(value: Boolean): Self = StObject.set(x, "printLog", value.asInstanceOf[js.Any])
      
      inline def setPrintLogUndefined: Self = StObject.set(x, "printLog", js.undefined)
      
      inline def setServer(value: typings.restify.mod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
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
    
    var reviver: js.UndefOr[Any] = js.undefined
    
    /**
      * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
      */
    var uploadDir: js.UndefOr[String] = js.undefined
  }
  object BodyParserOptions {
    
    inline def apply(): BodyParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BodyParserOptions]
    }
    
    extension [Self <: BodyParserOptions](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      inline def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
      
      inline def setMapFiles(value: Boolean): Self = StObject.set(x, "mapFiles", value.asInstanceOf[js.Any])
      
      inline def setMapFilesUndefined: Self = StObject.set(x, "mapFiles", js.undefined)
      
      inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      inline def setMaxBodySize(value: Double): Self = StObject.set(x, "maxBodySize", value.asInstanceOf[js.Any])
      
      inline def setMaxBodySizeUndefined: Self = StObject.set(x, "maxBodySize", js.undefined)
      
      inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      inline def setMultipartFileHandler(value: () => Unit): Self = StObject.set(x, "multipartFileHandler", js.Any.fromFunction0(value))
      
      inline def setMultipartFileHandlerUndefined: Self = StObject.set(x, "multipartFileHandler", js.undefined)
      
      inline def setMultipartHandler(value: () => Unit): Self = StObject.set(x, "multipartHandler", js.Any.fromFunction0(value))
      
      inline def setMultipartHandlerUndefined: Self = StObject.set(x, "multipartHandler", js.undefined)
      
      inline def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      inline def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
      
      inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      inline def setRejectUnknown(value: Boolean): Self = StObject.set(x, "rejectUnknown", value.asInstanceOf[js.Any])
      
      inline def setRejectUnknownUndefined: Self = StObject.set(x, "rejectUnknown", js.undefined)
      
      inline def setReviver(value: Any): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
      
      inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      inline def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
    }
  }
  
  trait MetricsCallback extends StObject {
    
    /**
      *  An error if the request had an error
      */
    var err: js.Error
    
    var metrics: MetricsCallbackOptions
    
    var req: Request
    
    var res: Response
    
    /**
      * The route obj that serviced the request
      */
    var route: Route
  }
  object MetricsCallback {
    
    inline def apply(err: js.Error, metrics: MetricsCallbackOptions, req: Request, res: Response, route: Route): MetricsCallback = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsCallback]
    }
    
    extension [Self <: MetricsCallback](x: Self) {
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: MetricsCallbackOptions): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
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
    
    inline def apply(latency: Double, method: String, path: String, statusCode: Double): MetricsCallbackOptions = {
      val __obj = js.Dynamic.literal(latency = latency.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsCallbackOptions]
    }
    
    extension [Self <: MetricsCallbackOptions](x: Self) {
      
      inline def setConnectionState(value: TMetricsCallback): Self = StObject.set(x, "connectionState", value.asInstanceOf[js.Any])
      
      inline def setConnectionStateUndefined: Self = StObject.set(x, "connectionState", js.undefined)
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipartBodyParser_ extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var keepExtensions: js.UndefOr[Boolean] = js.undefined
    
    var mapFiles: js.UndefOr[Boolean] = js.undefined
    
    var mapParams: js.UndefOr[Boolean] = js.undefined
    
    var maxFieldsSize: js.UndefOr[Double] = js.undefined
    
    var multipartFileHandler: js.UndefOr[Any] = js.undefined
    
    var multipartHandler: js.UndefOr[Any] = js.undefined
    
    var multiples: js.UndefOr[Boolean] = js.undefined
    
    var overrideParams: js.UndefOr[Boolean] = js.undefined
    
    var uploadDir: js.UndefOr[String] = js.undefined
  }
  object MultipartBodyParser_ {
    
    inline def apply(): MultipartBodyParser_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipartBodyParser_]
    }
    
    extension [Self <: MultipartBodyParser_](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      inline def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
      
      inline def setMapFiles(value: Boolean): Self = StObject.set(x, "mapFiles", value.asInstanceOf[js.Any])
      
      inline def setMapFilesUndefined: Self = StObject.set(x, "mapFiles", js.undefined)
      
      inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      inline def setMultipartFileHandler(value: Any): Self = StObject.set(x, "multipartFileHandler", value.asInstanceOf[js.Any])
      
      inline def setMultipartFileHandlerUndefined: Self = StObject.set(x, "multipartFileHandler", js.undefined)
      
      inline def setMultipartHandler(value: Any): Self = StObject.set(x, "multipartHandler", value.asInstanceOf[js.Any])
      
      inline def setMultipartHandlerUndefined: Self = StObject.set(x, "multipartHandler", js.undefined)
      
      inline def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      inline def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
      
      inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      inline def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
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
    
    inline def apply(): QueryParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParserOptions]
    }
    
    extension [Self <: QueryParserOptions](x: Self) {
      
      inline def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
      
      inline def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
      
      inline def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
      
      inline def setArrayLimitUndefined: Self = StObject.set(x, "arrayLimit", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      inline def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
      
      inline def setParameterLimitUndefined: Self = StObject.set(x, "parameterLimit", js.undefined)
      
      inline def setParseArrays(value: Boolean): Self = StObject.set(x, "parseArrays", value.asInstanceOf[js.Any])
      
      inline def setParseArraysUndefined: Self = StObject.set(x, "parseArrays", js.undefined)
      
      inline def setPlainObjects(value: Boolean): Self = StObject.set(x, "plainObjects", value.asInstanceOf[js.Any])
      
      inline def setPlainObjectsUndefined: Self = StObject.set(x, "plainObjects", js.undefined)
      
      inline def setStrictNullHandling(value: Boolean): Self = StObject.set(x, "strictNullHandling", value.asInstanceOf[js.Any])
      
      inline def setStrictNullHandlingUndefined: Self = StObject.set(x, "strictNullHandling", js.undefined)
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
    
    inline def apply(): RequestExpiryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestExpiryOptions]
    }
    
    extension [Self <: RequestExpiryOptions](x: Self) {
      
      inline def setAbsoluteHeader(value: String): Self = StObject.set(x, "absoluteHeader", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteHeaderUndefined: Self = StObject.set(x, "absoluteHeader", js.undefined)
      
      inline def setStartHeader(value: String): Self = StObject.set(x, "startHeader", value.asInstanceOf[js.Any])
      
      inline def setStartHeaderUndefined: Self = StObject.set(x, "startHeader", js.undefined)
      
      inline def setTimeoutHeader(value: String): Self = StObject.set(x, "timeoutHeader", value.asInstanceOf[js.Any])
      
      inline def setTimeoutHeaderUndefined: Self = StObject.set(x, "timeoutHeader", js.undefined)
    }
  }
  
  trait RequestLogger_ extends StObject {
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var log: js.UndefOr[Any] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var serializers: js.UndefOr[Any] = js.undefined
  }
  object RequestLogger_ {
    
    inline def apply(): RequestLogger_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestLogger_]
    }
    
    extension [Self <: RequestLogger_](x: Self) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLog(value: Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSerializers(value: Any): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    }
  }
  
  trait ServeStatic_ extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var appendRequestPath: js.UndefOr[Boolean] = js.undefined
    
    var charSet: js.UndefOr[String] = js.undefined
    
    var directory: js.UndefOr[String] = js.undefined
    
    var etag: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var `match`: js.UndefOr[Any] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object ServeStatic_ {
    
    inline def apply(): ServeStatic_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServeStatic_]
    }
    
    extension [Self <: ServeStatic_](x: Self) {
      
      inline def setAppendRequestPath(value: Boolean): Self = StObject.set(x, "appendRequestPath", value.asInstanceOf[js.Any])
      
      inline def setAppendRequestPathUndefined: Self = StObject.set(x, "appendRequestPath", js.undefined)
      
      inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setMatch(value: Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
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
    
    var overrides: js.UndefOr[Any] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var tokensTable: js.UndefOr[Any] = js.undefined
    
    var username: js.UndefOr[Boolean] = js.undefined
    
    var xff: js.UndefOr[Boolean] = js.undefined
  }
  object ThrottleOptions {
    
    inline def apply(): ThrottleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleOptions]
    }
    
    extension [Self <: ThrottleOptions](x: Self) {
      
      inline def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
      
      inline def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
      
      inline def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
      
      inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setTokensTable(value: Any): Self = StObject.set(x, "tokensTable", value.asInstanceOf[js.Any])
      
      inline def setTokensTableUndefined: Self = StObject.set(x, "tokensTable", js.undefined)
      
      inline def setUsername(value: Boolean): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setXff(value: Boolean): Self = StObject.set(x, "xff", value.asInstanceOf[js.Any])
      
      inline def setXffUndefined: Self = StObject.set(x, "xff", js.undefined)
    }
  }
  
  trait UrlEncodedBodyParser_ extends StObject {
    
    var mapParams: js.UndefOr[Boolean] = js.undefined
    
    var overrideParams: js.UndefOr[Boolean] = js.undefined
  }
  object UrlEncodedBodyParser_ {
    
    inline def apply(): UrlEncodedBodyParser_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlEncodedBodyParser_]
    }
    
    extension [Self <: UrlEncodedBodyParser_](x: Self) {
      
      inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
    }
  }
  
  trait _TMetricsCallback extends StObject
}
