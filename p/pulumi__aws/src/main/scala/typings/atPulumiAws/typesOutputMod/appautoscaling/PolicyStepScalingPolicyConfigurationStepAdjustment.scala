package typings.atPulumiAws.typesOutputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStepScalingPolicyConfigurationStepAdjustment extends js.Object {
  var metricIntervalLowerBound: js.UndefOr[String] = js.undefined
  var metricIntervalUpperBound: js.UndefOr[String] = js.undefined
  var scalingAdjustment: Double
}

object PolicyStepScalingPolicyConfigurationStepAdjustment {
  @scala.inline
  def apply(
    scalingAdjustment: Double,
    metricIntervalLowerBound: String = null,
    metricIntervalUpperBound: String = null
  ): PolicyStepScalingPolicyConfigurationStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment)
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound)
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound)
    __obj.asInstanceOf[PolicyStepScalingPolicyConfigurationStepAdjustment]
  }
}

