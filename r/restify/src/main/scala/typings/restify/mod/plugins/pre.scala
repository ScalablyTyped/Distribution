package typings.restify.mod.plugins

import typings.restify.anon.Headers
import typings.restify.anon.Message
import typings.restify.anon.UserAgentRegExp
import typings.restify.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pre {
  
  @JSImport("restify", "plugins.pre")
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
