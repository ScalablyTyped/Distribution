package typings
package redisDashRateDashLimiterLib.redisDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var current: scala.Double
  var key: java.lang.String
  var limit: scala.Double
  var over: scala.Boolean
  var window: scala.Double
}

object Response {
  @scala.inline
  def apply(
    current: scala.Double,
    key: java.lang.String,
    limit: scala.Double,
    over: scala.Boolean,
    window: scala.Double
  ): Response = {
    val __obj = js.Dynamic.literal(current = current, key = key, limit = limit, over = over, window = window)
  
    __obj.asInstanceOf[Response]
  }
}

