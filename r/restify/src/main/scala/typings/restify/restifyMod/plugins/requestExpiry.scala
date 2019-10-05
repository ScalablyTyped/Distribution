package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.requestExpiry")
@js.native
object requestExpiry extends js.Object {
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
  def apply(): RequestHandler = js.native
  def apply(options: RequestExpiryOptions): RequestHandler = js.native
}

