package typings.redisDashRateDashLimiter.redisDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var current: Double
  var key: String
  var limit: Double
  var over: Boolean
  var window: Double
}

object Response {
  @scala.inline
  def apply(current: Double, key: String, limit: Double, over: Boolean, window: Double): Response = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response]
  }
}

