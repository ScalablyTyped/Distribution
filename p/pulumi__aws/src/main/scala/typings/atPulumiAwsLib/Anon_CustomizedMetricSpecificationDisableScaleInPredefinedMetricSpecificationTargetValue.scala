package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue extends js.Object {
  var customizedMetricSpecification: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_MetricDimensionsMetricName]] = js.undefined
  var disableScaleIn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_PredefinedMetricTypeResourceLabel]] = js.undefined
  var targetValue: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue {
  @scala.inline
  def apply(
    targetValue: atPulumiPulumiLib.outputMod.Input[scala.Double],
    customizedMetricSpecification: atPulumiPulumiLib.outputMod.Input[Anon_MetricDimensionsMetricName] = null,
    disableScaleIn: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    predefinedMetricSpecification: atPulumiPulumiLib.outputMod.Input[Anon_PredefinedMetricTypeResourceLabel] = null
  ): Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (disableScaleIn != null) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue]
  }
}

