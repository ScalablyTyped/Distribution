package typings.atPulumiAws.typesOutputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStepScalingPolicyConfigurationStepAdjustment extends js.Object {
  var metricIntervalLowerBound: js.UndefOr[String] = js.native
  var metricIntervalUpperBound: js.UndefOr[String] = js.native
  var scalingAdjustment: Double = js.native
}

object PolicyStepScalingPolicyConfigurationStepAdjustment {
  @scala.inline
  def apply(
    scalingAdjustment: Double,
    metricIntervalLowerBound: String = null,
    metricIntervalUpperBound: String = null
  ): PolicyStepScalingPolicyConfigurationStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound.asInstanceOf[js.Any])
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepScalingPolicyConfigurationStepAdjustment]
  }
}

