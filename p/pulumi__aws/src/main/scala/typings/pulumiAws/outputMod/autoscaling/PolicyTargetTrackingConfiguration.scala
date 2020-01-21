package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. Conflicts with `predefinedMetricSpecification`.
    */
  var customizedMetricSpecification: js.UndefOr[PolicyTargetTrackingConfigurationCustomizedMetricSpecification] = js.native
  /**
    * Indicates whether scale in by the target tracking policy is disabled.
    */
  var disableScaleIn: js.UndefOr[Boolean] = js.native
  /**
    * A predefined metric. Conflicts with `customizedMetricSpecification`.
    */
  var predefinedMetricSpecification: js.UndefOr[PolicyTargetTrackingConfigurationPredefinedMetricSpecification] = js.native
  /**
    * The target value for the metric.
    */
  var targetValue: Double = js.native
}

object PolicyTargetTrackingConfiguration {
  @scala.inline
  def apply(
    targetValue: Double,
    customizedMetricSpecification: PolicyTargetTrackingConfigurationCustomizedMetricSpecification = null,
    disableScaleIn: js.UndefOr[Boolean] = js.undefined,
    predefinedMetricSpecification: PolicyTargetTrackingConfigurationPredefinedMetricSpecification = null
  ): PolicyTargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScaleIn)) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfiguration]
  }
}

