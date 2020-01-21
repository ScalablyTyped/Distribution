package typings.restifyPlugins.mod

import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", "throttle")
@js.native
object throttle extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: ThrottleOptions): RequestHandler = js.native
}

