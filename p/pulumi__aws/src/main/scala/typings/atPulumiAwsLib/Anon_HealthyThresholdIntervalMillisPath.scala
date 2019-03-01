package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalMillisPath extends js.Object {
  var healthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var intervalMillis: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var path: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var timeoutMillis: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var unhealthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_HealthyThresholdIntervalMillisPath {
  @scala.inline
  def apply(
    healthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double],
    intervalMillis: atPulumiPulumiLib.outputMod.Input[scala.Double],
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    timeoutMillis: atPulumiPulumiLib.outputMod.Input[scala.Double],
    unhealthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double],
    path: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_HealthyThresholdIntervalMillisPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    __obj.updateDynamic("intervalMillis")(intervalMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("timeoutMillis")(timeoutMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalMillisPath]
  }
}

