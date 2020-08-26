package typings.pulumiAws.outputMod.elb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerHealthCheck extends js.Object {
  var healthyThreshold: Double = js.native
  var interval: Double = js.native
  var target: String = js.native
  var timeout: Double = js.native
  var unhealthyThreshold: Double = js.native
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
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerHealthCheck]
  }
  @scala.inline
  implicit class GetLoadBalancerHealthCheckOps[Self <: GetLoadBalancerHealthCheck] (val x: Self) extends AnyVal {
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
    def setHealthyThreshold(value: Double): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
  }
  
}

