package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.Server
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
    val __obj = js.Dynamic.literal(err = err, limit = limit, server = server)
  
    __obj.asInstanceOf[InflightRequestThrottleOptions]
  }
}

