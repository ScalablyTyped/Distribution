package typings.restify.mod.plugins

import typings.node.zlibMod.ZlibOptions
import typings.restify.anon.MaxBodySize
import typings.restify.anon.Server
import typings.restify.mod.Request
import typings.restify.mod.RequestHandler
import typings.restify.mod.Response
import typings.restify.mod.Route
import typings.restify.mod.plugins.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// *************** This module includes the following header parser plugins:
/**
  * Check the client's Accept header can be handled by this server.
  */
inline def acceptParser(accepts: js.Array[String]): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptParser")(accepts.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * An audit logger for recording all handled requests
  */
inline def auditLogger(options: AuditLoggerOptions): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditLogger")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]

/**
  * Authorization header
  */
inline def authorizationParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")().asInstanceOf[RequestHandler]
inline def authorizationParser(options: Any): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Parses POST bodies to req.body. automatically uses one of the following parsers based on content type.
  */
inline def bodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")().asInstanceOf[js.Array[RequestHandler]]
inline def bodyParser(options: BodyParserOptions): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]

/**
  * Reads the body of the request.
  */
inline def bodyReader(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")().asInstanceOf[RequestHandler]
inline def bodyReader(options: MaxBodySize): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

inline def conditionalHandler(candidates: js.Array[HandlerCandidate]): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionalHandler")(candidates.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
/**
  * Runs first handler that matches to the condition
  */
inline def conditionalHandler(candidates: HandlerCandidate): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionalHandler")(candidates.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Conditional headers (If-*)
  */
inline def conditionalRequest(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionalRequest")().asInstanceOf[js.Array[RequestHandler]]

/**
  * Cpu Throttle middleware
  */
inline def cpuUsageThrottle(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsageThrottle")().asInstanceOf[RequestHandler]
inline def cpuUsageThrottle(opts: CpuUsageThrottleOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsageThrottle")(opts.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

// ******************** The module includes the following response plugins:
/**
  * expires requests based on current time + delta
  * @param delta - age in seconds
  */
inline def dateParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")().asInstanceOf[RequestHandler]
inline def dateParser(delta: Double): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")(delta.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Handles disappeared CORS headers
  */
inline def fullResponse(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fullResponse")().asInstanceOf[RequestHandler]

/**
  * gzips the response if client send `accept-encoding: gzip`
  * @param options options to pass to gzlib
  */
inline def gzipResponse(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")().asInstanceOf[RequestHandler]
inline def gzipResponse(options: ZlibOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

inline def inflightRequestThrottle(opts: InflightRequestThrottleOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("inflightRequestThrottle")(opts.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Parses JSON POST bodies
  */
inline def jsonBodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")().asInstanceOf[js.Array[RequestHandler]]
inline def jsonBodyParser(options: JsonBodyParserOptions): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]

/**
  * Parses JSONP callback
  */
inline def jsonp(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")().asInstanceOf[RequestHandler]

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
inline def metrics(opts: Server, callback: MetricsCallback): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("metrics")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]

/**
  * Parses JSONP callback
  */
inline def multipartBodyParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")().asInstanceOf[RequestHandler]
inline def multipartBodyParser(options: MultipartBodyParser_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

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
inline def oauth2TokenParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("oauth2TokenParser")().asInstanceOf[RequestHandler]

/**
  * Parses URL query parameters into `req.query`. Many options correspond directly to option defined for the underlying [qs.parse](https://github.com/ljharb/qs)
  */
inline def queryParser(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")().asInstanceOf[RequestHandler]
inline def queryParser(options: QueryParserOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

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
inline def requestExpiry(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")().asInstanceOf[RequestHandler]
inline def requestExpiry(options: RequestExpiryOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Adds timers for each handler in your request chain
  *
  * `options.properties` properties to pass to bunyan's `log.child()` method
  */
inline def requestLogger(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")().asInstanceOf[RequestHandler]
inline def requestLogger(options: RequestLogger_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Used to serve static files
  */
inline def serveStatic(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")().asInstanceOf[RequestHandler]
inline def serveStatic(options: ServeStatic_): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Used to serve static files from a given directory
  */
inline def serveStaticFiles(dir: String): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("serveStaticFiles")(dir.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
inline def serveStaticFiles(dir: String, options: ServeStaticFiles_): RequestHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("serveStaticFiles")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler]

/**
  *  throttles responses
  */
inline def throttle(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")().asInstanceOf[RequestHandler]
inline def throttle(options: ThrottleOptions): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]

/**
  * Parse the HTTP request body IFF the contentType is application/x-www-form-urlencoded.
  *
  * If req.params already contains a given key, that key is skipped and an
  * error is logged.
  */
inline def urlEncodedBodyParser(): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")().asInstanceOf[js.Array[RequestHandler]]
inline def urlEncodedBodyParser(options: UrlEncodedBodyParserOptions): js.Array[RequestHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler]]

type AuditLoggerContext = js.Function4[/* req */ Request, /* res */ Response, /* route */ Any, /* error */ Any, Any]

type MetricsCallback = js.Function5[
/* err */ js.Error, 
/* metrics */ MetricsCallbackOptions, 
/* req */ Request, 
/* res */ Response, 
/* route */ Route, 
Unit]

/* Rewritten from type alias, can be one of: 
  - typings.restify.restifyStrings.close
  - typings.restify.restifyStrings.aborted
  - scala.Unit
*/
type TMetricsCallback = js.UndefOr[_TMetricsCallback]
