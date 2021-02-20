package typings.restify.mod

import typings.restify.anon.Headers
import typings.restify.anon.Message
import typings.restify.anon.UserAgentRegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pre {
  
  /**
    * Provide req.set(key, val) and req.get(key) methods for setting and retrieving context to a specific request.
    */
  @JSImport("restify", "pre.context")
  @js.native
  def context(): RequestHandler = js.native
  
  @JSImport("restify", "pre.dedupeSlashes")
  @js.native
  def dedupeSlashes(): RequestHandler = js.native
  
  /**
    * This pre handler fixes issues with node hanging when an asyncHandler is used prior to bodyParser.
    */
  @JSImport("restify", "pre.pause")
  @js.native
  def pause(): RequestHandler = js.native
  
  /**
    * Automatically reuse incoming request header as the request id.
    */
  @JSImport("restify", "pre.reqIdHeaders")
  @js.native
  def reqIdHeaders(options: Headers): RequestHandler = js.native
  
  /**
    * Cleans up duplicate or trailing / on the URL
    */
  @JSImport("restify", "pre.sanitizePath")
  @js.native
  def sanitizePath(): RequestHandler = js.native
  
  /**
    * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
    */
  @JSImport("restify", "pre.strictQueryParams")
  @js.native
  def strictQueryParams(): RequestHandler = js.native
  @JSImport("restify", "pre.strictQueryParams")
  @js.native
  def strictQueryParams(options: Message): RequestHandler = js.native
  
  /**
    * Regexp to capture curl user-agents
    */
  @JSImport("restify", "pre.userAgentConnection")
  @js.native
  def userAgentConnection(): RequestHandler = js.native
  @JSImport("restify", "pre.userAgentConnection")
  @js.native
  def userAgentConnection(options: UserAgentRegExp): RequestHandler = js.native
}
