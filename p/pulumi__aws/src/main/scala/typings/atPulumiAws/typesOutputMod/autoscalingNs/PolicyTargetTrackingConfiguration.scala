package typings.atPulumiAws.typesOutputMod.autoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. Conflicts with `predefinedMetricSpecification`.
    */
  var customizedMetricSpecification: js.UndefOr[PolicyTargetTrackingConfigurationCustomizedMetricSpecification] = js.undefined
  /**
    * Indicates whether scale in by the target tracking policy is disabled.
    */
  var disableScaleIn: js.UndefOr[Boolean] = js.undefined
  /**
    * A predefined metric. Conflicts with `customizedMetricSpecification`.
    */
  var predefinedMetricSpecification: js.UndefOr[PolicyTargetTrackingConfigurationPredefinedMetricSpecification] = js.undefined
  /**
    * The target value for the metric.
    */
  var targetValue: Double
}

object PolicyTargetTrackingConfiguration {
  @scala.inline
  def apply(
    targetValue: Double,
    customizedMetricSpecification: PolicyTargetTrackingConfigurationCustomizedMetricSpecification = null,
    disableScaleIn: js.UndefOr[Boolean] = js.undefined,
    predefinedMetricSpecification: PolicyTargetTrackingConfigurationPredefinedMetricSpecification = null
  ): PolicyTargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue)
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification)
    if (!js.isUndefined(disableScaleIn)) __obj.updateDynamic("disableScaleIn")(disableScaleIn)
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification)
    __obj.asInstanceOf[PolicyTargetTrackingConfiguration]
  }
}

