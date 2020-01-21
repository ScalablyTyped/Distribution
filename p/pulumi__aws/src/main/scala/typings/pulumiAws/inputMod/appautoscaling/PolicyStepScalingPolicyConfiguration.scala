package typings.pulumiAws.inputMod.appautoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStepScalingPolicyConfiguration extends js.Object {
  var adjustmentType: js.UndefOr[Input[String]] = js.native
  var cooldown: js.UndefOr[Input[Double]] = js.native
  var metricAggregationType: js.UndefOr[Input[String]] = js.native
  var minAdjustmentMagnitude: js.UndefOr[Input[Double]] = js.native
  var stepAdjustments: js.UndefOr[Input[js.Array[Input[PolicyStepScalingPolicyConfigurationStepAdjustment]]]] = js.native
}

object PolicyStepScalingPolicyConfiguration {
  @scala.inline
  def apply(
    adjustmentType: Input[String] = null,
    cooldown: Input[Double] = null,
    metricAggregationType: Input[String] = null,
    minAdjustmentMagnitude: Input[Double] = null,
    stepAdjustments: Input[js.Array[Input[PolicyStepScalingPolicyConfigurationStepAdjustment]]] = null
  ): PolicyStepScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adjustmentType != null) __obj.updateDynamic("adjustmentType")(adjustmentType.asInstanceOf[js.Any])
    if (cooldown != null) __obj.updateDynamic("cooldown")(cooldown.asInstanceOf[js.Any])
    if (metricAggregationType != null) __obj.updateDynamic("metricAggregationType")(metricAggregationType.asInstanceOf[js.Any])
    if (minAdjustmentMagnitude != null) __obj.updateDynamic("minAdjustmentMagnitude")(minAdjustmentMagnitude.asInstanceOf[js.Any])
    if (stepAdjustments != null) __obj.updateDynamic("stepAdjustments")(stepAdjustments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepScalingPolicyConfiguration]
  }
}

