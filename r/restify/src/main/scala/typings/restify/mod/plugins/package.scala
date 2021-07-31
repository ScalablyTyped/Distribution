package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// *************** This module includes the following header parser plugins:
/**
  * Check the client's Accept header can be handled by this server.
  */
@scala.inline
def acceptParser(accepts: js.Array[java.lang.String]): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("acceptParser")(accepts.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * An audit logger for recording all handled requests
  */
@scala.inline
def auditLogger(options: typings.restify.mod.plugins.AuditLoggerOptions): js.Function1[/* repeated */ js.Any, scala.Unit] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("auditLogger")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]

/**
  * Authorization header
  */
@scala.inline
def authorizationParser(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def authorizationParser(options: js.Any): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Parses POST bodies to req.body. automatically uses one of the following parsers based on content type.
  */
@scala.inline
def bodyParser(): js.Array[typings.restify.mod.RequestHandler] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")().asInstanceOf[js.Array[typings.restify.mod.RequestHandler]]
@scala.inline
def bodyParser(options: typings.restify.mod.plugins.BodyParserOptions): js.Array[typings.restify.mod.RequestHandler] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.restify.mod.RequestHandler]]

/**
  * Reads the body of the request.
  */
@scala.inline
def bodyReader(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def bodyReader(options: typings.restify.anon.MaxBodySize): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

@scala.inline
def conditionalHandler(candidates: js.Array[typings.restify.mod.plugins.HandlerCandidate]): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("conditionalHandler")(candidates.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]
/**
  * Runs first handler that matches to the condition
  */
@scala.inline
def conditionalHandler(candidates: typings.restify.mod.plugins.HandlerCandidate): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("conditionalHandler")(candidates.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Conditional headers (If-*)
  */
@scala.inline
def conditionalRequest(): js.Array[typings.restify.mod.RequestHandler] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("conditionalRequest")().asInstanceOf[js.Array[typings.restify.mod.RequestHandler]]

/**
  * Cpu Throttle middleware
  */
@scala.inline
def cpuUsageThrottle(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsageThrottle")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def cpuUsageThrottle(opts: typings.restify.mod.plugins.CpuUsageThrottleOptions): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsageThrottle")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

// ******************** The module includes the following response plugins:
/**
  * expires requests based on current time + delta
  * @param delta - age in seconds
  */
@scala.inline
def dateParser(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def dateParser(delta: scala.Double): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")(delta.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Handles disappeared CORS headers
  */
@scala.inline
def fullResponse(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("fullResponse")().asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * gzips the response if client send `accept-encoding: gzip`
  * @param options options to pass to gzlib
  */
@scala.inline
def gzipResponse(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def gzipResponse(options: typings.node.zlibMod.ZlibOptions): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

@scala.inline
def inflightRequestThrottle(opts: typings.restify.mod.plugins.InflightRequestThrottleOptions): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("inflightRequestThrottle")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Parses JSON POST bodies
  */
@scala.inline
def jsonBodyParser(): js.Array[typings.restify.mod.RequestHandler] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")().asInstanceOf[js.Array[typings.restify.mod.RequestHandler]]
@scala.inline
def jsonBodyParser(options: typings.restify.mod.plugins.JsonBodyParserOptions): js.Array[typings.restify.mod.RequestHandler] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.restify.mod.RequestHandler]]

/**
  * Parses JSONP callback
  */
@scala.inline
def jsonp(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")().asInstanceOf[typings.restify.mod.RequestHandler]

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
@scala.inline
def metrics(opts: typings.restify.anon.Server, callback: typings.restify.mod.plugins.MetricsCallback): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("metrics")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]

/**
  * Parses JSONP callback
  */
@scala.inline
def multipartBodyParser(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def multipartBodyParser(options: typings.restify.mod.plugins.MultipartBodyParser_): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

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
@scala.inline
def oauth2TokenParser(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("oauth2TokenParser")().asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Parses URL query parameters into `req.query`. Many options correspond directly to option defined for the underlying [qs.parse](https://github.com/ljharb/qs)
  */
@scala.inline
def queryParser(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def queryParser(options: typings.restify.mod.plugins.QueryParserOptions): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

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
@scala.inline
def requestExpiry(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def requestExpiry(options: typings.restify.mod.plugins.RequestExpiryOptions): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Adds timers for each handler in your request chain
  *
  * `options.properties` properties to pass to bunyan's `log.child()` method
  */
@scala.inline
def requestLogger(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def requestLogger(options: typings.restify.mod.plugins.RequestLogger_): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Used to serve static files
  */
@scala.inline
def serveStatic(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def serveStatic(options: typings.restify.mod.plugins.ServeStatic_): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Used to serve static files from a given directory
  */
@scala.inline
def serveStaticFiles(dir: java.lang.String): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStaticFiles")(dir.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def serveStaticFiles(dir: java.lang.String, options: typings.restify.mod.plugins.ServeStaticFiles_): typings.restify.mod.RequestHandler = (typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStaticFiles")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  *  throttles responses
  */
@scala.inline
def throttle(): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("throttle")().asInstanceOf[typings.restify.mod.RequestHandler]
@scala.inline
def throttle(options: typings.restify.mod.plugins.ThrottleOptions): typings.restify.mod.RequestHandler = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(options.asInstanceOf[js.Any]).asInstanceOf[typings.restify.mod.RequestHandler]

/**
  * Parse the HTTP request body IFF the contentType is application/x-www-form-urlencoded.
  *
  * If req.params already contains a given key, that key is skipped and an
  * error is logged.
  */
@scala.inline
def urlEncodedBodyParser(): js.Array[typings.restify.mod.RequestHandler] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")().asInstanceOf[js.Array[typings.restify.mod.RequestHandler]]
@scala.inline
def urlEncodedBodyParser(options: typings.restify.mod.plugins.UrlEncodedBodyParserOptions): js.Array[typings.restify.mod.RequestHandler] = typings.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.restify.mod.RequestHandler]]

type AuditLoggerContext = js.Function4[
/* req */ typings.restify.mod.Request, 
/* res */ typings.restify.mod.Response, 
/* route */ js.Any, 
/* error */ js.Any, 
js.Any]

type MetricsCallback = js.Function5[
/* err */ typings.std.Error, 
/* metrics */ typings.restify.mod.plugins.MetricsCallbackOptions, 
/* req */ typings.restify.mod.Request, 
/* res */ typings.restify.mod.Response, 
/* route */ typings.restify.mod.Route, 
scala.Unit]

/* Rewritten from type alias, can be one of: 
  - typings.restify.restifyStrings.close
  - typings.restify.restifyStrings.aborted
  - scala.Unit
*/
type TMetricsCallback = js.UndefOr[typings.restify.mod.plugins._TMetricsCallback]
