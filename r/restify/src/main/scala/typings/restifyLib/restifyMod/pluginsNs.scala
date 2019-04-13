package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins")
@js.native
object pluginsNs extends js.Object {
  trait AuditLoggerOptions extends js.Object {
    var body: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The optional context function of signature
      * f(req, res, route, err).  Invoked each time an audit log is generated. This
      * function can return an object that customizes the format of anything off the
      * req, res, route, and err objects. The output of this function will be
      * available on the `context` key in the audit object.
      */
    var context: js.UndefOr[AuditLoggerContext] = js.undefined
    /**
      * The event from the server which initiates the
      * log, one of 'pre', 'routed', or 'after'
      */
    var event: restifyLib.restifyLibStrings.pre | restifyLib.restifyLibStrings.routed | restifyLib.restifyLibStrings.after
    /**
      * Bunyan logger
      */
    var log: bunyanLib.bunyanMod.^
    /**
      * Ringbuffer which is written to if passed in
      */
    var logBuffer: js.UndefOr[js.Any] = js.undefined
    /**
      * When true, prints audit logs. default true.
      */
    var printLog: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
      */
    var server: js.UndefOr[restifyLib.restifyMod.Server] = js.undefined
  }
  
  // ************ This module includes the following data parsing plugins:
  trait BodyParserOptions extends js.Object {
    /**
      * If you want checksums calculated for incoming files, set this to either sha1 or md5.
      */
    var hash: js.UndefOr[java.lang.String] = js.undefined
    /**
      * If you want the uploaded files to include the extensions of the original files (multipart uploads only). Does nothing if multipartFileHandler is defined.
      */
    var keepExtensions: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * If req.params should be filled with the contents of files sent through a multipart request.
      * Formidable is used internally for parsing, and a file is denoted as a multipart part with the filename option set in its Content-Disposition.
      * This will only be performed if mapParams is true.
      */
    var mapFiles: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * If req.params should be filled with parsed parameters from HTTP body.
      */
    var mapParams: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The maximum size in bytes allowed in the HTTP body. Useful for limiting clients from hogging server memory.
      */
    var maxBodySize: js.UndefOr[scala.Double] = js.undefined
    var maxFieldsSize: js.UndefOr[scala.Double] = js.undefined
    var maxFileSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * A callback to handle any multipart file.
      * It will be a file if the part have a Content-Disposition with the filename parameter set.
      * This typically happens when a browser sends a form and there is a parameter similar to <input type="file" />.
      * If this is not provided, the default behaviour is to map the contents into req.params.
      */
    var multipartFileHandler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    /**
      * A callback to handle any multipart part which is not a file.
      * If this is omitted, the default handler is invoked which may or may not map the parts into req.params, depending on the mapParams-option.
      */
    var multipartHandler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    /**
      * If you want to support html5 multiple attribute in upload fields.
      */
    var multiples: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * If an entry in req.params should be overwritten by the value in the body if the names are the same.
      * For instance, if you have the route /:someval, and someone posts an x-www-form-urlencoded Content-Type with the body someval=happy to /sad,
      * the value will be happy if overrideParams is true, sad otherwise.
      */
    var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Set to true if you want to end the request with a UnsupportedMediaTypeError when none of the supported content types was given.
      */
    var rejectUnknown: js.UndefOr[scala.Boolean] = js.undefined
    var reviver: js.UndefOr[js.Any] = js.undefined
    /**
      * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
      */
    var uploadDir: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CpuUsageThrottleOptions extends js.Object {
    var halfLife: js.UndefOr[scala.Double] = js.undefined
    var interval: js.UndefOr[scala.Double] = js.undefined
    var limit: js.UndefOr[scala.Double] = js.undefined
    var max: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait HandlerCandidate extends js.Object {
    var contentType: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
    var handler: restifyLib.restifyMod.RequestHandler | js.Array[restifyLib.restifyMod.RequestHandler]
    var version: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  }
  
  trait InflightRequestThrottleOptions extends js.Object {
    var err: js.Any
    var limit: scala.Double
    var server: restifyLib.restifyMod.Server
  }
  
  trait JsonBodyParserOptions extends js.Object {
    var bodyReader: js.UndefOr[scala.Boolean] = js.undefined
    var mapParams: js.UndefOr[scala.Boolean] = js.undefined
    var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
    var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.undefined
  }
  
  trait MetricsCallbackOptions extends js.Object {
    /**
      * If this value is set, err will be a corresponding `RequestCloseError` or `RequestAbortedError`.
      *
      * If connectionState is either 'close' or 'aborted', then the statusCode is not applicable since the connection was severed before a response was written.
      */
    var connectionState: TMetricsCallback
    /**
      * Number of inflight requests pending in restify
      */
    var inflightRequests: scala.Double
    /**
      * Request latency
      */
    var latency: scala.Double
    /**
      * HTTP request verb
      */
    var method: java.lang.String
    /**
      * req.path() value
      */
    var path: java.lang.String
    /**
      * pre handlers latency
      */
    var preLatency: scala.Double | scala.Null
    /**
      * Status code of the response. Can be undefined in the case of an `uncaughtException`.
      * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
      */
    var statusCode: scala.Double
    /**
      * latency includes both request is flushed and all handlers finished
      */
    var totalLatency: scala.Double
    /**
      * Same as `inflightRequests`
      */
    var unfinishedRequests: scala.Double
    /**
      * use handlers latency
      */
    var useLatency: scala.Double | scala.Null
  }
  
  trait MultipartBodyParser extends js.Object {
    var hash: js.UndefOr[java.lang.String] = js.undefined
    var keepExtensions: js.UndefOr[scala.Boolean] = js.undefined
    var mapFiles: js.UndefOr[scala.Boolean] = js.undefined
    var mapParams: js.UndefOr[scala.Boolean] = js.undefined
    var maxFieldsSize: js.UndefOr[scala.Double] = js.undefined
    var maxFileSize: js.UndefOr[scala.Double] = js.undefined
    var multipartFileHandler: js.UndefOr[js.Any] = js.undefined
    var multipartHandler: js.UndefOr[js.Any] = js.undefined
    var multiples: js.UndefOr[scala.Boolean] = js.undefined
    var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
    var uploadDir: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait QueryParserOptions extends js.Object {
    /**
      *  Default false. Transform `?foo.bar=baz` to a nested object: `{foo: {bar: 'baz'}}`.
      */
    var allowDots: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Default 20. Only transform `?a[$index]=b` to an array if `$index` is less than `arrayLimit`.
      */
    var arrayLimit: js.UndefOr[scala.Double] = js.undefined
    /**
      * Default 5. The depth limit for parsing nested objects, e.g. `?a[b][c][d][e][f][g][h][i]=j`.
      */
    var depth: js.UndefOr[scala.Double] = js.undefined
    /**
      * Default `false`. Copies parsed query parameters into `req.params`.
      */
    var mapParams: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Default `false`. Only applies when if mapParams true. When true, will stomp on req.params field when existing value is found.
      */
    var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Default 1000. Maximum number of query params parsed. Additional params are silently dropped.
      */
    var parameterLimit: js.UndefOr[scala.Double] = js.undefined
    /**
      * Default true. Whether to parse `?a[]=b&a[1]=c` to an array, e.g. `{a: ['b', 'c']}`.
      */
    var parseArrays: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Default false. Whether `req.query` is a "plain" object -- does not inherit from `Object`.
      * This can be used to allow query params whose names collide with Object methods, e.g. `?hasOwnProperty=blah`.
      */
    var plainObjects: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Default false. If true, `?a&b=` results in `{a: null, b: ''}`. Otherwise, `{a: '', b: ''}`.
      */
    var strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait RequestExpiryOptions extends js.Object {
    /**
      * Header name of the absolute time for request expiration
      */
    var absoluteHeader: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Header name for the start time of the request
      */
    var startHeader: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The header name for the time in milliseconds that should ellapse before the request is considered expired.
      */
    var timeoutHeader: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RequestLogger extends js.Object {
    var headers: js.UndefOr[js.Any] = js.undefined
    var log: js.UndefOr[js.Any] = js.undefined
    var properties: js.UndefOr[js.Any] = js.undefined
    var serializers: js.UndefOr[js.Any] = js.undefined
  }
  
  trait ServeStatic extends js.Object {
    var appendRequestPath: js.UndefOr[scala.Boolean] = js.undefined
    var charSet: js.UndefOr[java.lang.String] = js.undefined
    var default: js.UndefOr[js.Any] = js.undefined
    var directory: js.UndefOr[java.lang.String] = js.undefined
    var etag: js.UndefOr[java.lang.String] = js.undefined
    var file: js.UndefOr[java.lang.String] = js.undefined
    var gzip: js.UndefOr[scala.Boolean] = js.undefined
    var `match`: js.UndefOr[js.Any] = js.undefined
    var maxAge: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait ThrottleOptions extends js.Object {
    var burst: js.UndefOr[scala.Double] = js.undefined
    var ip: js.UndefOr[scala.Boolean] = js.undefined
    var maxKeys: js.UndefOr[scala.Double] = js.undefined
    var overrides: js.UndefOr[js.Any] = js.undefined
    var rate: js.UndefOr[scala.Double] = js.undefined
    var setHeaders: js.UndefOr[scala.Boolean] = js.undefined
    var tokensTable: js.UndefOr[js.Any] = js.undefined
    var username: js.UndefOr[scala.Boolean] = js.undefined
    var xff: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait UrlEncodedBodyParserOptions extends js.Object {
    var bodyReader: js.UndefOr[scala.Boolean] = js.undefined
    var mapParams: js.UndefOr[scala.Boolean] = js.undefined
    var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  // *************** This module includes the following header parser plugins:
  /**
    * Check the client's Accept header can be handled by this server.
    */
  def acceptParser(accepts: js.Array[java.lang.String]): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * An audit logger for recording all handled requests
    */
  def auditLogger(options: AuditLoggerOptions): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  /**
    * Authorization header
    */
  def authorizationParser(): restifyLib.restifyMod.RequestHandler = js.native
  def authorizationParser(options: js.Any): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Parses POST bodies to req.body. automatically uses one of the following parsers based on content type.
    */
  def bodyParser(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def bodyParser(options: BodyParserOptions): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  /**
    * Reads the body of the request.
    */
  def bodyReader(): restifyLib.restifyMod.RequestHandler = js.native
  def bodyReader(options: restifyLib.Anon_MaxBodySize): restifyLib.restifyMod.RequestHandler = js.native
  def conditionalHandler(candidates: js.Array[HandlerCandidate]): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Runs first handler that matches to the condition
    */
  def conditionalHandler(candidates: HandlerCandidate): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Conditional headers (If-*)
    */
  def conditionalRequest(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  /**
    * Cpu Throttle middleware
    */
  def cpuUsageThrottle(): restifyLib.restifyMod.RequestHandler = js.native
  def cpuUsageThrottle(opts: CpuUsageThrottleOptions): restifyLib.restifyMod.RequestHandler = js.native
  // ******************** The module includes the following response plugins:
  /**
    * expires requests based on current time + delta
    * @param delta - age in seconds
    */
  def dateParser(): restifyLib.restifyMod.RequestHandler = js.native
  def dateParser(delta: scala.Double): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Handles disappeared CORS headers
    */
  def fullResponse(): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * gzips the response if client send `accept-encoding: gzip`
    * @param options options to pass to gzlib
    */
  def gzipResponse(): restifyLib.restifyMod.RequestHandler = js.native
  def gzipResponse(options: nodeLib.zlibMod.ZlibOptions): restifyLib.restifyMod.RequestHandler = js.native
  def inflightRequestThrottle(opts: InflightRequestThrottleOptions): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Parses JSON POST bodies
    */
  def jsonBodyParser(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def jsonBodyParser(options: JsonBodyParserOptions): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  /**
    * Parses JSONP callback
    */
  def jsonp(): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Listens to the server's after event and emits information about that request (5.x compatible only).
    *
    * ```
    * server.on('after', plugins.metrics({ server }, (err, metrics, req, res, route) =>
    * {
    *    // metrics is an object containing information about the request
    * }));
    * ```
    */
  def metrics(opts: restifyLib.Anon_Server, callback: MetricsCallback): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  /**
    * Parses JSONP callback
    */
  def multipartBodyParser(): restifyLib.restifyMod.RequestHandler = js.native
  def multipartBodyParser(options: MultipartBodyParser): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Parse the client's request for an OAUTH2 access tokensTable
    *
    * Subsequent handlers will see `req.oauth2`, which looks like:
    * ```
    * {
    *    oauth2: {accessToken: 'mF_9.B5f-4.1JqM&p=q'}
    * }
    * ```
    */
  def oauth2TokenParser(): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Parses URL query parameters into `req.query`. Many options correspond directly to option defined for the underlying [qs.parse](https://github.com/ljharb/qs)
    */
  def queryParser(): restifyLib.restifyMod.RequestHandler = js.native
  def queryParser(options: QueryParserOptions): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * A request expiry will use headers to tell if the incoming request has expired or not.
    *
    * There are two options for this plugin:
    *   1. Absolute Time
    *     * Time in Milliseconds since the Epoch when this request should be considered expired
    *   2. Timeout
    *     * The request start time is supplied
    *     * A timeout, in milliseconds, is given
    *     * The timeout is added to the request start time to arrive at the absolute time
    *       in which the request is considered expires
    */
  def requestExpiry(): restifyLib.restifyMod.RequestHandler = js.native
  def requestExpiry(options: RequestExpiryOptions): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Adds timers for each handler in your request chain
    *
    * `options.properties` properties to pass to bunyan's `log.child()` method
    */
  def requestLogger(): restifyLib.restifyMod.RequestHandler = js.native
  def requestLogger(options: RequestLogger): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Used to serve static files
    */
  def serveStatic(): restifyLib.restifyMod.RequestHandler = js.native
  def serveStatic(options: ServeStatic): restifyLib.restifyMod.RequestHandler = js.native
  /**
    *  throttles responses
    */
  def throttle(): restifyLib.restifyMod.RequestHandler = js.native
  def throttle(options: ThrottleOptions): restifyLib.restifyMod.RequestHandler = js.native
  /**
    * Parse the HTTP request body IFF the contentType is application/x-www-form-urlencoded.
    *
    * If req.params already contains a given key, that key is skipped and an
    * error is logged.
    */
  def urlEncodedBodyParser(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def urlEncodedBodyParser(options: UrlEncodedBodyParserOptions): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  @JSName("pre")
  @js.native
  object preNs extends js.Object {
    /**
      * Provide req.set(key, val) and req.get(key) methods for setting and retrieving context to a specific request.
      */
    def context(): restifyLib.restifyMod.RequestHandler = js.native
    def dedupeSlashes(): restifyLib.restifyMod.RequestHandler = js.native
    /**
      * This pre handler fixes issues with node hanging when an asyncHandler is used prior to bodyParser.
      */
    def pause(): restifyLib.restifyMod.RequestHandler = js.native
    /**
      * Automatically reuse incoming request header as the request id.
      */
    def reqIdHeaders(options: restifyLib.Anon_Headers): restifyLib.restifyMod.RequestHandler = js.native
    /**
      * Cleans up duplicate or trailing / on the URL
      */
    def sanitizePath(): restifyLib.restifyMod.RequestHandler = js.native
    /**
      * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
      */
    def strictQueryParams(): restifyLib.restifyMod.RequestHandler = js.native
    def strictQueryParams(options: restifyLib.Anon_Message): restifyLib.restifyMod.RequestHandler = js.native
    /**
      * Regexp to capture curl user-agents
      */
    def userAgentConnection(): restifyLib.restifyMod.RequestHandler = js.native
    def userAgentConnection(options: restifyLib.Anon_UserAgentRegExp): restifyLib.restifyMod.RequestHandler = js.native
  }
  
  type AuditLoggerContext = js.Function4[
    /* req */ restifyLib.restifyMod.Request, 
    /* res */ restifyLib.restifyMod.Response, 
    /* route */ js.Any, 
    /* error */ js.Any, 
    js.Any
  ]
  type MetricsCallback = js.Function5[
    /* err */ stdLib.Error, 
    /* metrics */ MetricsCallbackOptions, 
    /* req */ restifyLib.restifyMod.Request, 
    /* res */ restifyLib.restifyMod.Response, 
    /* route */ restifyLib.restifyMod.Route, 
    scala.Unit
  ]
  type TMetricsCallback = js.UndefOr[restifyLib.restifyLibStrings.close | restifyLib.restifyLibStrings.aborted]
}

