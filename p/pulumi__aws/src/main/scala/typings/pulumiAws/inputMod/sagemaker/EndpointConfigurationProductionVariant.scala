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
  def apply(initialInstanceCount: Input[Double], instanceType: Input[String], modelName: Input[String]): EndpointConfigurationProductionVariant = {
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationProductionVariant]
  }
  @scala.inline
  implicit class EndpointConfigurationProductionVariantOps[Self <: EndpointConfigurationProductionVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInitialInstanceCount(value: Input[Double]): Self = this.set("initialInstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelName(value: Input[String]): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceleratorType(value: Input[String]): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
    @scala.inline
    def setInitialVariantWeight(value: Input[Double]): Self = this.set("initialVariantWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialVariantWeight: Self = this.set("initialVariantWeight", js.undefined)
    @scala.inline
    def setVariantName(value: Input[String]): Self = this.set("variantName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantName: Self = this.set("variantName", js.undefined)
  }
  
}

