package typings.atPulumiAws.typesInputMod.sagemakerNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConfigurationProductionVariant extends js.Object {
  var acceleratorType: js.UndefOr[Input[String]] = js.undefined
  var initialInstanceCount: Input[Double]
  var initialVariantWeight: js.UndefOr[Input[Double]] = js.undefined
  var instanceType: Input[String]
  var modelName: Input[String]
  var variantName: js.UndefOr[Input[String]] = js.undefined
}

object EndpointConfigurationProductionVariant {
  @scala.inline
  def apply(
    initialInstanceCount: Input[Double],
    instanceType: Input[String],
    modelName: Input[String],
    acceleratorType: Input[String] = null,
    initialVariantWeight: Input[Double] = null,
    variantName: Input[String] = null
  ): EndpointConfigurationProductionVariant = {
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (initialVariantWeight != null) __obj.updateDynamic("initialVariantWeight")(initialVariantWeight.asInstanceOf[js.Any])
    if (variantName != null) __obj.updateDynamic("variantName")(variantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationProductionVariant]
  }
}

