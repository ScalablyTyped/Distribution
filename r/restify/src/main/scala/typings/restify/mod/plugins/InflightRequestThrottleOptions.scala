package typings.restify.mod.plugins

import typings.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InflightRequestThrottleOptions extends js.Object {
  var err: js.Any
  var limit: Double
  var server: Server
}

object InflightRequestThrottleOptions {
  @scala.inline
  def apply(err: js.Any, limit: Double, server: Server): InflightRequestThrottleOptions = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflightRequestThrottleOptions]
  }
}

