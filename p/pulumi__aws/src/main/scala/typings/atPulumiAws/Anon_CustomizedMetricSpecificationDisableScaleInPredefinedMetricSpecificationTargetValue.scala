package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue extends js.Object {
  var customizedMetricSpecification: js.UndefOr[Input[Anon_MetricDimensionsMetricName]] = js.undefined
  var disableScaleIn: js.UndefOr[Input[Boolean]] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[Input[Anon_PredefinedMetricTypeResourceLabel]] = js.undefined
  var targetValue: Input[Double]
}

object Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue {
  @scala.inline
  def apply(
    targetValue: Input[Double],
    customizedMetricSpecification: Input[Anon_MetricDimensionsMetricName] = null,
    disableScaleIn: Input[Boolean] = null,
    predefinedMetricSpecification: Input[Anon_PredefinedMetricTypeResourceLabel] = null
  ): Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (disableScaleIn != null) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue]
  }
}

