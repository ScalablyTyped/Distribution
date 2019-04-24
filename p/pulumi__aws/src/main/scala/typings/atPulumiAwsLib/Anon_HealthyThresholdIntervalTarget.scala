package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalTarget extends js.Object {
  var healthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var interval: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var target: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var timeout: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var unhealthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_HealthyThresholdIntervalTarget {
  @scala.inline
  def apply(
    healthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double],
    interval: atPulumiPulumiLib.outputMod.Input[scala.Double],
    target: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    timeout: atPulumiPulumiLib.outputMod.Input[scala.Double],
    unhealthyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_HealthyThresholdIntervalTarget = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalTarget]
  }
}

