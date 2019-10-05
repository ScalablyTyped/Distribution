package typings.restifyDashPlugins.restifyDashPluginsMod

import typings.restify.restifyMod.RequestHandler
import typings.restifyDashPlugins.Anon_Headers
import typings.restifyDashPlugins.Anon_Message
import typings.restifyDashPlugins.Anon_UserAgentRegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", "pre")
@js.native
object pre extends js.Object {
  /**
    * Provide req.set(key, val) and req.get(key) methods for setting and retrieving context to a specific request.
    */
  def context(): RequestHandler = js.native
  def dedupeSlashes(): RequestHandler = js.native
  /**
    * This pre handler fixes issues with node hanging when an asyncHandler is used prior to bodyParser.
    */
  def pause(): RequestHandler = js.native
  /**
    * Automatically reuse incoming request header as the request id.
    */
  def reqIdHeaders(options: Anon_Headers): RequestHandler = js.native
  /**
    * Cleans up duplicate or trailing / on the URL
    */
  def sanitizePath(): RequestHandler = js.native
  /**
    * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
    */
  def strictQueryParams(): RequestHandler = js.native
  def strictQueryParams(options: Anon_Message): RequestHandler = js.native
  /**
    * Regexp to capture curl user-agents
    */
  def userAgentConnection(): RequestHandler = js.native
  def userAgentConnection(options: Anon_UserAgentRegExp): RequestHandler = js.native
}

