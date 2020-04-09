package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and
  * Down directions (scaleUp and scaleDown fields respectively).
  */
trait HorizontalPodAutoscalerBehavior extends js.Object {
  /**
    * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to
    * scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest
    * recommendation for the last 300sec is used).
    */
  var scaleDown: js.UndefOr[Input[HPAScalingRules]] = js.undefined
  /**
    * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
    *   * increase no more than 4 pods per 60 seconds
    *   * double the number of pods per 60 seconds
    * No stabilization is used.
    */
  var scaleUp: js.UndefOr[Input[HPAScalingRules]] = js.undefined
}

object HorizontalPodAutoscalerBehavior {
  @scala.inline
  def apply(scaleDown: Input[HPAScalingRules] = null, scaleUp: Input[HPAScalingRules] = null): HorizontalPodAutoscalerBehavior = {
    val __obj = js.Dynamic.literal()
    if (scaleDown != null) __obj.updateDynamic("scaleDown")(scaleDown.asInstanceOf[js.Any])
    if (scaleUp != null) __obj.updateDynamic("scaleUp")(scaleUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerBehavior]
  }
}

