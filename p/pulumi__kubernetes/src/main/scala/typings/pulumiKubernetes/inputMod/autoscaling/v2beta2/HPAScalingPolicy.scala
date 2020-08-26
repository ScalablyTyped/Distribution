package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
  */
@js.native
trait HPAScalingPolicy extends js.Object {
  /**
    * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
    */
  var periodSeconds: Input[Double] = js.native
  /**
    * Type is used to specify the scaling policy.
    */
  var `type`: Input[String] = js.native
  /**
    * Value contains the amount of change which is permitted by the policy. It must be greater than zero
    */
  var value: Input[Double] = js.native
}

object HPAScalingPolicy {
  @scala.inline
  def apply(periodSeconds: Input[Double], `type`: Input[String], value: Input[Double]): HPAScalingPolicy = {
    val __obj = js.Dynamic.literal(periodSeconds = periodSeconds.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPAScalingPolicy]
  }
  @scala.inline
  implicit class HPAScalingPolicyOps[Self <: HPAScalingPolicy] (val x: Self) extends AnyVal {
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
    def setPeriodSeconds(value: Input[Double]): Self = this.set("periodSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

