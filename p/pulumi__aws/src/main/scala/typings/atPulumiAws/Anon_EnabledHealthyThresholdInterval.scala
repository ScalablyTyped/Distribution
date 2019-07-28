package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledHealthyThresholdInterval extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var healthyThreshold: js.UndefOr[Input[Double]] = js.undefined
  var interval: js.UndefOr[Input[Double]] = js.undefined
  var matcher: js.UndefOr[Input[String]] = js.undefined
  var path: js.UndefOr[Input[String]] = js.undefined
  var port: js.UndefOr[Input[String]] = js.undefined
  var protocol: js.UndefOr[Input[String]] = js.undefined
  var timeout: js.UndefOr[Input[Double]] = js.undefined
  var unhealthyThreshold: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_EnabledHealthyThresholdInterval {
  @scala.inline
  def apply(
    enabled: Input[Boolean] = null,
    healthyThreshold: Input[Double] = null,
    interval: Input[Double] = null,
    matcher: Input[String] = null,
    path: Input[String] = null,
    port: Input[String] = null,
    protocol: Input[String] = null,
    timeout: Input[Double] = null,
    unhealthyThreshold: Input[Double] = null
  ): Anon_EnabledHealthyThresholdInterval = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledHealthyThresholdInterval]
  }
}

