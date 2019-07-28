package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledHealthyThreshold extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var matcher: String
  var path: String
  var port: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var timeout: Double
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}

object Anon_EnabledHealthyThreshold {
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

