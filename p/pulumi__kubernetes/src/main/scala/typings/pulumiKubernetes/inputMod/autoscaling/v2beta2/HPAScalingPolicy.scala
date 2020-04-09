package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
  */
trait HPAScalingPolicy extends js.Object {
  /**
    * PeriodSeconds specifies the window of time for which the policy should hold true.
    * PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
    */
  var periodSeconds: Input[Double]
  /**
    * Type is used to specify the scaling policy.
    */
  var `type`: Input[String]
  /**
    * Value contains the amount of change which is permitted by the policy. It must be greater
    * than zero
    */
  var value: Input[Double]
}

object HPAScalingPolicy {
  @scala.inline
  def apply(periodSeconds: Input[Double], `type`: Input[String], value: Input[Double]): HPAScalingPolicy = {
    val __obj = js.Dynamic.literal(periodSeconds = periodSeconds.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPAScalingPolicy]
  }
}

