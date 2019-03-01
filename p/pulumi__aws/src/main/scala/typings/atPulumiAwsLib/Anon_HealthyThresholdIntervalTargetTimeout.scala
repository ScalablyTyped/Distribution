package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalTargetTimeout extends js.Object {
  var healthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var interval: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var target: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var timeout: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var unhealthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_HealthyThresholdIntervalTargetTimeout {
  @scala.inline
  def apply(
    healthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double],
    interval: atPulumiPulumiLib.outputMod.Input[scala.Double],
    target: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    timeout: atPulumiPulumiLib.outputMod.Input[scala.Double],
    unhealthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_HealthyThresholdIntervalTargetTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalTargetTimeout]
  }
}

