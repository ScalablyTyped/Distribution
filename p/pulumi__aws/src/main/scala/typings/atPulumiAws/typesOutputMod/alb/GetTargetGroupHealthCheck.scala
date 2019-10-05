package typings.atPulumiAws.typesOutputMod.alb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTargetGroupHealthCheck extends js.Object {
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

object GetTargetGroupHealthCheck {
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
  ): GetTargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal(enabled = enabled, healthyThreshold = healthyThreshold, interval = interval, matcher = matcher, path = path, port = port, protocol = protocol, timeout = timeout, unhealthyThreshold = unhealthyThreshold)
  
    __obj.asInstanceOf[GetTargetGroupHealthCheck]
  }
}

