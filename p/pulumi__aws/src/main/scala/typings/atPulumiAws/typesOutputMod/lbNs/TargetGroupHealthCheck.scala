package typings.atPulumiAws.typesOutputMod.lbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupHealthCheck extends js.Object {
  /**
    * Indicates whether  health checks are enabled. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy. Defaults to 3.
    */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. Minimum value 5 seconds, Maximum value 300 seconds. For `lambda` target groups, it needs to be greater as the `timeout` of the underlying `lambda`. Default 30 seconds.
    */
  var interval: js.UndefOr[Double] = js.undefined
  var matcher: String
  /**
    * The destination for the health check request. Applies to Application Load Balancers only (HTTP/HTTPS), not Network Load Balancers (TCP).
    */
  var path: String
  /**
    * The port to use to connect with the target. Valid values are either ports 1-65536, or `traffic-port`. Defaults to `traffic-port`.
    */
  var port: js.UndefOr[String] = js.undefined
  /**
    * The protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `targetType` is `lambda`.
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * The amount of time, in seconds, during which no response means a failed health check. For Application Load Balancers, the range is 2 to 120 seconds, and the default is 5 seconds for the `instance` target type and 30 seconds for the `lambda` target type. For Network Load Balancers, you cannot set a custom value, and the default is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
    */
  var timeout: Double
  /**
    * The number of consecutive health check failures required before considering the target unhealthy . For Network Load Balancers, this value must be the same as the `healthyThreshold`. Defaults to 3.
    * * `matcher` (Required for HTTP/HTTPS ALB) The HTTP codes to use when checking for a successful response from a target. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). Applies to Application Load Balancers only (HTTP/HTTPS), not Network Load Balancers (TCP).
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}

object TargetGroupHealthCheck {
  @scala.inline
  def apply(
    matcher: String,
    path: String,
    timeout: Double,
    enabled: js.UndefOr[Boolean] = js.undefined,
    healthyThreshold: Int | Double = null,
    interval: Int | Double = null,
    port: String = null,
    protocol: String = null,
    unhealthyThreshold: Int | Double = null
  ): TargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal(matcher = matcher, path = path, timeout = timeout)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupHealthCheck]
  }
}

