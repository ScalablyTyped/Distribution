package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecificationDisableScaleIn extends js.Object {
  var customizedMetricSpecification: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_DimensionsMetricName]] = js.undefined
  var disableScaleIn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_PredefinedMetricTypeResourceLabel]] = js.undefined
  var scaleInCooldown: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var scaleOutCooldown: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var targetValue: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_CustomizedMetricSpecificationDisableScaleIn {
  @scala.inline
  def apply(
    targetValue: atPulumiPulumiLib.outputMod.Input[scala.Double],
    customizedMetricSpecification: atPulumiPulumiLib.outputMod.Input[Anon_DimensionsMetricName] = null,
    disableScaleIn: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    predefinedMetricSpecification: atPulumiPulumiLib.outputMod.Input[Anon_PredefinedMetricTypeResourceLabel] = null,
    scaleInCooldown: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    scaleOutCooldown: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_CustomizedMetricSpecificationDisableScaleIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targetValue")(targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (disableScaleIn != null) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    if (scaleInCooldown != null) __obj.updateDynamic("scaleInCooldown")(scaleInCooldown.asInstanceOf[js.Any])
    if (scaleOutCooldown != null) __obj.updateDynamic("scaleOutCooldown")(scaleOutCooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomizedMetricSpecificationDisableScaleIn]
  }
}

