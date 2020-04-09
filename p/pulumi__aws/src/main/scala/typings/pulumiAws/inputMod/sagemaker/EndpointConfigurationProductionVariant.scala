package typings.pulumiAws.inputMod.sagemaker

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigurationProductionVariant extends js.Object {
  /**
    * The size of the Elastic Inference (EI) instance to use for the production variant.
    */
  var acceleratorType: js.UndefOr[Input[String]] = js.native
  /**
    * Initial number of instances used for auto-scaling.
    */
  var initialInstanceCount: Input[Double] = js.native
  /**
    * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to 1.0.
    */
  var initialVariantWeight: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of instance to start.
    */
  var instanceType: Input[String] = js.native
  /**
    * The name of the model to use.
    */
  var modelName: Input[String] = js.native
  /**
    * The name of the variant. If omitted, this provider will assign a random, unique name.
    */
  var variantName: js.UndefOr[Input[String]] = js.native
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

