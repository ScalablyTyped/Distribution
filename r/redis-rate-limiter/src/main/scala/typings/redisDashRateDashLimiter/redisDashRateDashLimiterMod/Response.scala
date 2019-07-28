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
    val __obj = js.Dynamic.literal(current = current, key = key, limit = limit, over = over, window = window)
  
    __obj.asInstanceOf[Response]
  }
}

