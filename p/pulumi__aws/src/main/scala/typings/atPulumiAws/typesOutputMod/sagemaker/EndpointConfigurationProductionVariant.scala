package typings.atPulumiAws.typesOutputMod.sagemaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConfigurationProductionVariant extends js.Object {
  var acceleratorType: js.UndefOr[String] = js.undefined
  var initialInstanceCount: Double
  var initialVariantWeight: js.UndefOr[Double] = js.undefined
  var instanceType: String
  var modelName: String
  var variantName: String
}

object EndpointConfigurationProductionVariant {
  @scala.inline
  def apply(
    initialInstanceCount: Double,
    instanceType: String,
    modelName: String,
    variantName: String,
    acceleratorType: String = null,
    initialVariantWeight: Int | Double = null
  ): EndpointConfigurationProductionVariant = {
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount, instanceType = instanceType, modelName = modelName, variantName = variantName)
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType)
    if (initialVariantWeight != null) __obj.updateDynamic("initialVariantWeight")(initialVariantWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationProductionVariant]
  }
}

