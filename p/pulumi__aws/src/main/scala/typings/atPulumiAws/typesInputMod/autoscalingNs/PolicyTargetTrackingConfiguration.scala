package typings.atPulumiAws.typesInputMod.autoscalingNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. Conflicts with `predefinedMetricSpecification`.
    */
  var customizedMetricSpecification: js.UndefOr[Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]] = js.undefined
  /**
    * Indicates whether scale in by the target tracking policy is disabled.
    */
  var disableScaleIn: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A predefined metric. Conflicts with `customizedMetricSpecification`.
    */
  var predefinedMetricSpecification: js.UndefOr[Input[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]] = js.undefined
  /**
    * The target value for the metric.
    */
  var targetValue: Input[Double]
}

object PolicyTargetTrackingConfiguration {
  @scala.inline
  def apply(
    targetValue: Input[Double],
    customizedMetricSpecification: Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecification] = null,
    disableScaleIn: Input[Boolean] = null,
    predefinedMetricSpecification: Input[PolicyTargetTrackingConfigurationPredefinedMetricSpecification] = null
  ): PolicyTargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (disableScaleIn != null) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfiguration]
  }
}

