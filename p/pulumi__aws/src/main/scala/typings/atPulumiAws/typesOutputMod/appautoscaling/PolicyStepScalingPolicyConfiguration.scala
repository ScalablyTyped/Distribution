package typings.atPulumiAws.typesOutputMod.appautoscaling

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
    cooldown: Int | Double = null,
    metricAggregationType: String = null,
    minAdjustmentMagnitude: Int | Double = null,
    stepAdjustments: js.Array[PolicyStepScalingPolicyConfigurationStepAdjustment] = null
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

