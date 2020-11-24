package typings.pulumiAws.inputMod.elb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class LoadBalancerHealthCheckOps[Self <: LoadBalancerHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHealthyThreshold(value: Input[Double]): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Input[Double]): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Input[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Input[Double]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThreshold(value: Input[Double]): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
