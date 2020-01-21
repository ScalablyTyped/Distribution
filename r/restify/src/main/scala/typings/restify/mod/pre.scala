package typings.restify.mod

import typings.restify.AnonHeaders
import typings.restify.AnonMessage
import typings.restify.AnonUserAgentRegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "pre")
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
  def reqIdHeaders(options: AnonHeaders): RequestHandler = js.native
  /**
    * Cleans up duplicate or trailing / on the URL
    */
  def sanitizePath(): RequestHandler = js.native
  /**
    * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
    */
  def strictQueryParams(): RequestHandler = js.native
  def strictQueryParams(options: AnonMessage): RequestHandler = js.native
  /**
    * Regexp to capture curl user-agents
    */
  def userAgentConnection(): RequestHandler = js.native
  def userAgentConnection(options: AnonUserAgentRegExp): RequestHandler = js.native
}

