package typings.atPulumiAws.typesInputMod.appautoscaling

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStepScalingPolicyConfigurationStepAdjustment extends js.Object {
  var metricIntervalLowerBound: js.UndefOr[Input[String]] = js.undefined
  var metricIntervalUpperBound: js.UndefOr[Input[String]] = js.undefined
  var scalingAdjustment: Input[Double]
}

object PolicyStepScalingPolicyConfigurationStepAdjustment {
  @scala.inline
  def apply(
    scalingAdjustment: Input[Double],
    metricIntervalLowerBound: Input[String] = null,
    metricIntervalUpperBound: Input[String] = null
  ): PolicyStepScalingPolicyConfigurationStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound.asInstanceOf[js.Any])
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepScalingPolicyConfigurationStepAdjustment]
  }
}

