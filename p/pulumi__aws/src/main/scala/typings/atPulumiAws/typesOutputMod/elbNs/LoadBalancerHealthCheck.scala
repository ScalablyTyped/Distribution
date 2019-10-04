package typings.atPulumiAws.typesOutputMod.elbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerHealthCheck extends js.Object {
  /**
    * The number of checks before the instance is declared healthy.
    */
  var healthyThreshold: Double
  /**
    * The interval between checks.
    */
  var interval: Double
  /**
    * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
    * values are:
    * * `HTTP`, `HTTPS` - PORT and PATH are required
    * * `TCP`, `SSL` - PORT is required, PATH is not supported
    */
  var target: String
  /**
    * The length of time before the check times out.
    */
  var timeout: Double
  /**
    * The number of checks before the instance is declared unhealthy.
    */
  var unhealthyThreshold: Double
}

object LoadBalancerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Double,
    interval: Double,
    target: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): LoadBalancerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold, interval = interval, target = target, timeout = timeout, unhealthyThreshold = unhealthyThreshold)
  
    __obj.asInstanceOf[LoadBalancerHealthCheck]
  }
}

