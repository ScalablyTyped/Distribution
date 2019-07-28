package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: Boolean
  var healthyThreshold: Double
  var interval: Double
  var matcher: String
  var path: String
  var port: String
  var protocol: String
  var timeout: Double
  var unhealthyThreshold: Double
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: Boolean,
    healthyThreshold: Double,
    interval: Double,
    matcher: String,
    path: String,
    port: String,
    protocol: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled, healthyThreshold = healthyThreshold, interval = interval, matcher = matcher, path = path, port = port, protocol = protocol, timeout = timeout, unhealthyThreshold = unhealthyThreshold)
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

