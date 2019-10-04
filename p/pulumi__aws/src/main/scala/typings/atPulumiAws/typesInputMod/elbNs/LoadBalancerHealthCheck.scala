package typings.atPulumiAws.typesInputMod.elbNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerHealthCheck extends js.Object {
  /**
    * The number of checks before the instance is declared healthy.
    */
  var healthyThreshold: Input[Double]
  /**
    * The interval between checks.
    */
  var interval: Input[Double]
  /**
    * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
    * values are:
    * * `HTTP`, `HTTPS` - PORT and PATH are required
    * * `TCP`, `SSL` - PORT is required, PATH is not supported
    */
  var target: Input[String]
  /**
    * The length of time before the check times out.
    */
  var timeout: Input[Double]
  /**
    * The number of checks before the instance is declared unhealthy.
    */
  var unhealthyThreshold: Input[Double]
}

object LoadBalancerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Input[Double],
    interval: Input[Double],
    target: Input[String],
    timeout: Input[Double],
    unhealthyThreshold: Input[Double]
  ): LoadBalancerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoadBalancerHealthCheck]
  }
}

