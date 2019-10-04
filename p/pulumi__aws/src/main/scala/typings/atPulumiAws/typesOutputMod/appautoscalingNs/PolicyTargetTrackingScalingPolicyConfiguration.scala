package typings.atPulumiAws.typesOutputMod.appautoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingScalingPolicyConfiguration extends js.Object {
  var customizedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] = js.undefined
  var disableScaleIn: js.UndefOr[Boolean] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] = js.undefined
  var scaleInCooldown: js.UndefOr[Double] = js.undefined
  var scaleOutCooldown: js.UndefOr[Double] = js.undefined
  var targetValue: Double
}

object PolicyTargetTrackingScalingPolicyConfiguration {
  @scala.inline
  def apply(
    targetValue: Double,
    customizedMetricSpecification: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = null,
    disableScaleIn: js.UndefOr[Boolean] = js.undefined,
    predefinedMetricSpecification: PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification = null,
    scaleInCooldown: Int | Double = null,
    scaleOutCooldown: Int | Double = null
  ): PolicyTargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue)
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification)
    if (!js.isUndefined(disableScaleIn)) __obj.updateDynamic("disableScaleIn")(disableScaleIn)
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification)
    if (scaleInCooldown != null) __obj.updateDynamic("scaleInCooldown")(scaleInCooldown.asInstanceOf[js.Any])
    if (scaleOutCooldown != null) __obj.updateDynamic("scaleOutCooldown")(scaleOutCooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfiguration]
  }
}

