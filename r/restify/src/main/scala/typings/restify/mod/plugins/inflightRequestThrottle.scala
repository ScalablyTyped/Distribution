package typings.restify.mod.plugins

import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.inflightRequestThrottle")
@js.native
object inflightRequestThrottle extends js.Object {
  def apply(opts: InflightRequestThrottleOptions): RequestHandler = js.native
}

