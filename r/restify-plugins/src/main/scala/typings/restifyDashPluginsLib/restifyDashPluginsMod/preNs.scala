package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", "pre")
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
  def reqIdHeaders(options: restifyDashPluginsLib.Anon_Headers): restifyLib.restifyMod.RequestHandler = js.native
  /**
     * Cleans up duplicate or trailing / on the URL
     */
  def sanitizePath(): restifyLib.restifyMod.RequestHandler = js.native
  /**
     * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
     */
  def strictQueryParams(): restifyLib.restifyMod.RequestHandler = js.native
  /**
     * Checks req.urls query params with strict key/val format and rejects non-strict requests with status code 400.
     */
  def strictQueryParams(options: restifyDashPluginsLib.Anon_Message): restifyLib.restifyMod.RequestHandler = js.native
  /**
     * Regexp to capture curl user-agents
     */
  def userAgentConnection(): restifyLib.restifyMod.RequestHandler = js.native
  /**
     * Regexp to capture curl user-agents
     */
  def userAgentConnection(options: restifyDashPluginsLib.Anon_UserAgentRegExp): restifyLib.restifyMod.RequestHandler = js.native
}

