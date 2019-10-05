package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.throttle")
@js.native
object throttle extends js.Object {
  /**
    *  throttles responses
    */
  def apply(): RequestHandler = js.native
  def apply(options: ThrottleOptions): RequestHandler = js.native
}

