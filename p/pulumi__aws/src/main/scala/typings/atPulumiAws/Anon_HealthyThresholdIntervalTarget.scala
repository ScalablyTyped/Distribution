package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalTarget extends js.Object {
  var healthyThreshold: Input[Double]
  var interval: Input[Double]
  var target: Input[String]
  var timeout: Input[Double]
  var unhealthyThreshold: Input[Double]
}

object Anon_HealthyThresholdIntervalTarget {
  @scala.inline
  def apply(
    healthyThreshold: Input[Double],
    interval: Input[Double],
    target: Input[String],
    timeout: Input[Double],
    unhealthyThreshold: Input[Double]
  ): Anon_HealthyThresholdIntervalTarget = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalTarget]
  }
}

