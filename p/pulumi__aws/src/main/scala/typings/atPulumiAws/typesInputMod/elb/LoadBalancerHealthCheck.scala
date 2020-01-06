package typings.atPulumiAws.typesInputMod.elb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerHealthCheck extends js.Object {
  /**
    * The number of checks before the instance is declared healthy.
    */
  var healthyThreshold: Input[Double] = js.native
  /**
    * The interval between checks.
    */
  var interval: Input[Double] = js.native
  /**
    * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
    * values are:
    * * `HTTP`, `HTTPS` - PORT and PATH are required
    * * `TCP`, `SSL` - PORT is required, PATH is not supported
    */
  var target: Input[String] = js.native
  /**
    * The length of time before the check times out.
    */
  var timeout: Input[Double] = js.native
  /**
    * The number of checks before the instance is declared unhealthy.
    */
  var unhealthyThreshold: Input[Double] = js.native
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

