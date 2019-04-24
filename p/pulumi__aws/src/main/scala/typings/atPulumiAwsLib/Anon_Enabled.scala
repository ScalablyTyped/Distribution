package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: scala.Boolean
  var healthyThreshold: scala.Double
  var interval: scala.Double
  var matcher: java.lang.String
  var path: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var timeout: scala.Double
  var unhealthyThreshold: scala.Double
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    healthyThreshold: scala.Double,
    interval: scala.Double,
    matcher: java.lang.String,
    path: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    timeout: scala.Double,
    unhealthyThreshold: scala.Double
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled, healthyThreshold = healthyThreshold, interval = interval, matcher = matcher, path = path, port = port, protocol = protocol, timeout = timeout, unhealthyThreshold = unhealthyThreshold)
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

