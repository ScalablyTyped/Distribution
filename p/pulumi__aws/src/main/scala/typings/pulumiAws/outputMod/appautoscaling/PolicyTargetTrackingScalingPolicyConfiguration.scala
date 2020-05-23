package typings.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfiguration extends js.Object {
  var customizedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] = js.native
  var disableScaleIn: js.UndefOr[Boolean] = js.native
  var predefinedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] = js.native
  var scaleInCooldown: js.UndefOr[Double] = js.native
  var scaleOutCooldown: js.UndefOr[Double] = js.native
  var targetValue: Double = js.native
}

object PolicyTargetTrackingScalingPolicyConfiguration {
  @scala.inline
  def apply(
    targetValue: Double,
    customizedMetricSpecification: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = null,
    disableScaleIn: js.UndefOr[Boolean] = js.undefined,
    predefinedMetricSpecification: PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification = null,
    scaleInCooldown: js.UndefOr[Double] = js.undefined,
    scaleOutCooldown: js.UndefOr[Double] = js.undefined
  ): PolicyTargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScaleIn)) __obj.updateDynamic("disableScaleIn")(disableScaleIn.get.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleInCooldown)) __obj.updateDynamic("scaleInCooldown")(scaleInCooldown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleOutCooldown)) __obj.updateDynamic("scaleOutCooldown")(scaleOutCooldown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfiguration]
  }
}

