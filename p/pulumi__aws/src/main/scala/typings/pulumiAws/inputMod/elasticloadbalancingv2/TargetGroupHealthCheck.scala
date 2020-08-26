package typings.pulumiAws.inputMod.elasticloadbalancingv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupHealthCheck extends js.Object {
  /**
    * Boolean to enable / disable `stickiness`. Default is `true`
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy. Defaults to 3.
    */
  var healthyThreshold: js.UndefOr[Input[Double]] = js.native
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. Minimum value 5 seconds, Maximum value 300 seconds. For `lambda` target groups, it needs to be greater as the `timeout` of the underlying `lambda`. Default 30 seconds.
    */
  var interval: js.UndefOr[Input[Double]] = js.native
  /**
    * The HTTP codes to use when checking for a successful response from a target. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). Applies to Application Load Balancers only (HTTP/HTTPS), not Network Load Balancers (TCP).
    */
  var matcher: js.UndefOr[Input[String]] = js.native
  /**
    * The destination for the health check request. Applies to Application Load Balancers only (HTTP/HTTPS), not Network Load Balancers (TCP).
    */
  var path: js.UndefOr[Input[String]] = js.native
  /**
    * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  var port: js.UndefOr[Input[String]] = js.native
  /**
    * The protocol to use for routing traffic to the targets. Should be one of "TCP", "TLS", "UDP", "TCP_UDP", "HTTP" or "HTTPS". Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  var protocol: js.UndefOr[Input[String]] = js.native
  /**
    * The amount of time, in seconds, during which no response means a failed health check. For Application Load Balancers, the range is 2 to 120 seconds, and the default is 5 seconds for the `instance` target type and 30 seconds for the `lambda` target type. For Network Load Balancers, you cannot set a custom value, and the default is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
    */
  var timeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of consecutive health check failures required before considering the target unhealthy . For Network Load Balancers, this value must be the same as the `healthyThreshold`. Defaults to 3.
    */
  var unhealthyThreshold: js.UndefOr[Input[Double]] = js.native
}

object TargetGroupHealthCheck {
  @scala.inline
  def apply(): TargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupHealthCheck]
  }
  @scala.inline
  implicit class TargetGroupHealthCheckOps[Self <: TargetGroupHealthCheck] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHealthyThreshold(value: Input[Double]): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthyThreshold: Self = this.set("healthyThreshold", js.undefined)
    @scala.inline
    def setInterval(value: Input[Double]): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setMatcher(value: Input[String]): Self = this.set("matcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Input[String]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setTimeout(value: Input[Double]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUnhealthyThreshold(value: Input[Double]): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhealthyThreshold: Self = this.set("unhealthyThreshold", js.undefined)
  }
  
}

