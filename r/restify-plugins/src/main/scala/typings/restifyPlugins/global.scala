package typings.restifyPlugins

import typings.restify.mod.RequestHandler
import typings.restifyPlugins.anon.Headers
import typings.restifyPlugins.anon.MapParams
import typings.restifyPlugins.anon.MaxBodySize
import typings.restifyPlugins.anon.Message
import typings.restifyPlugins.anon.Server
import typings.restifyPlugins.anon.UserAgentRegExp
import typings.restifyPlugins.mod.AuditLoggerOptions
import typings.restifyPlugins.mod.BodyParserOptions
import typings.restifyPlugins.mod.MetricsCallback
import typings.restifyPlugins.mod.MultipartBodyParser_
import typings.restifyPlugins.mod.QueryParserOptions
import typings.restifyPlugins.mod.RequestExpiryOptions
import typings.restifyPlugins.mod.RequestLogger_
import typings.restifyPlugins.mod.ServeStatic_
import typings.restifyPlugins.mod.ThrottleOptions
import typings.restifyPlugins.mod.UrlEncodedBodyParser_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object RestifyPlugins {
    
    @JSGlobal("RestifyPlugins")
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
      
      @JSGlobal("RestifyPlugins.pre")
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
  }
}
