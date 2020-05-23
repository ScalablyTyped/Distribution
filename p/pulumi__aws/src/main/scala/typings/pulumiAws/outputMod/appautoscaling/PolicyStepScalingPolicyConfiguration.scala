package typings.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStepScalingPolicyConfiguration extends js.Object {
  var adjustmentType: js.UndefOr[String] = js.native
  var cooldown: js.UndefOr[Double] = js.native
  var metricAggregationType: js.UndefOr[String] = js.native
  var minAdjustmentMagnitude: js.UndefOr[Double] = js.native
  var stepAdjustments: js.UndefOr[js.Array[PolicyStepScalingPolicyConfigurationStepAdjustment]] = js.native
}

object PolicyStepScalingPolicyConfiguration {
  @scala.inline
  def apply(
    adjustmentType: String = null,
    cooldown: js.UndefOr[Double] = js.undefined,
    metricAggregationType: String = null,
    minAdjustmentMagnitude: js.UndefOr[Double] = js.undefined,
    stepAdjustments: js.Array[PolicyStepScalingPolicyConfigurationStepAdjustment] = null
  ): PolicyStepScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adjustmentType != null) __obj.updateDynamic("adjustmentType")(adjustmentType.asInstanceOf[js.Any])
    if (!js.isUndefined(cooldown)) __obj.updateDynamic("cooldown")(cooldown.get.asInstanceOf[js.Any])
    if (metricAggregationType != null) __obj.updateDynamic("metricAggregationType")(metricAggregationType.asInstanceOf[js.Any])
    if (!js.isUndefined(minAdjustmentMagnitude)) __obj.updateDynamic("minAdjustmentMagnitude")(minAdjustmentMagnitude.get.asInstanceOf[js.Any])
    if (stepAdjustments != null) __obj.updateDynamic("stepAdjustments")(stepAdjustments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepScalingPolicyConfiguration]
  }
}

