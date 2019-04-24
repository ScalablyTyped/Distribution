package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledHealthyThreshold extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var healthyThreshold: js.UndefOr[scala.Double] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var matcher: java.lang.String
  var path: java.lang.String
  var port: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var timeout: scala.Double
  var unhealthyThreshold: js.UndefOr[scala.Double] = js.undefined
}

object Anon_EnabledHealthyThreshold {
  @scala.inline
  def apply(
    matcher: java.lang.String,
    path: java.lang.String,
    timeout: scala.Double,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    healthyThreshold: scala.Int | scala.Double = null,
    interval: scala.Int | scala.Double = null,
    port: java.lang.String = null,
    protocol: java.lang.String = null,
    unhealthyThreshold: scala.Int | scala.Double = null
  ): Anon_EnabledHealthyThreshold = {
    val __obj = js.Dynamic.literal(matcher = matcher, path = path, timeout = timeout)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledHealthyThreshold]
  }
}

