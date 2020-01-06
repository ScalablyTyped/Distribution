package typings.atPulumiAws.typesOutputMod.sagemaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigurationProductionVariant extends js.Object {
  var acceleratorType: js.UndefOr[String] = js.native
  var initialInstanceCount: Double = js.native
  var initialVariantWeight: js.UndefOr[Double] = js.native
  var instanceType: String = js.native
  var modelName: String = js.native
  var variantName: String = js.native
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
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], variantName = variantName.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (initialVariantWeight != null) __obj.updateDynamic("initialVariantWeight")(initialVariantWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationProductionVariant]
  }
}

