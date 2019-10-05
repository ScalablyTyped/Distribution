package typings.atPulumiAws.typesOutputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerHealthCheck extends js.Object {
  var healthyThreshold: Double
  var interval: Double
  var target: String
  var timeout: Double
  var unhealthyThreshold: Double
}

object GetLoadBalancerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Double,
    interval: Double,
    target: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): GetLoadBalancerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold, interval = interval, target = target, timeout = timeout, unhealthyThreshold = unhealthyThreshold)
  
    __obj.asInstanceOf[GetLoadBalancerHealthCheck]
  }
}

