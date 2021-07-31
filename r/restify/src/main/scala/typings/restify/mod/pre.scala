package typings.restify.mod

import typings.restify.anon.Headers
import typings.restify.anon.Message
import typings.restify.anon.UserAgentRegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pre {
  
  @JSImport("restify", "pre")
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
