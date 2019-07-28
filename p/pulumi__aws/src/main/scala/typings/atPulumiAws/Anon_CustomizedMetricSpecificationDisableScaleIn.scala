package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecificationDisableScaleIn extends js.Object {
  var customizedMetricSpecification: js.UndefOr[Input[Anon_DimensionsMetricName]] = js.undefined
  var disableScaleIn: js.UndefOr[Input[Boolean]] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[Input[Anon_PredefinedMetricTypeResourceLabel]] = js.undefined
  var scaleInCooldown: js.UndefOr[Input[Double]] = js.undefined
  var scaleOutCooldown: js.UndefOr[Input[Double]] = js.undefined
  var targetValue: Input[Double]
}

object Anon_CustomizedMetricSpecificationDisableScaleIn {
  @scala.inline
  def apply(
    targetValue: Input[Double],
    customizedMetricSpecification: Input[Anon_DimensionsMetricName] = null,
    disableScaleIn: Input[Boolean] = null,
    predefinedMetricSpecification: Input[Anon_PredefinedMetricTypeResourceLabel] = null,
    scaleInCooldown: Input[Double] = null,
    scaleOutCooldown: Input[Double] = null
  ): Anon_CustomizedMetricSpecificationDisableScaleIn = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (disableScaleIn != null) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    if (scaleInCooldown != null) __obj.updateDynamic("scaleInCooldown")(scaleInCooldown.asInstanceOf[js.Any])
    if (scaleOutCooldown != null) __obj.updateDynamic("scaleOutCooldown")(scaleOutCooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomizedMetricSpecificationDisableScaleIn]
  }
}

