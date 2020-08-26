package typings.pulumiAws.endpointConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigurationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Fields are documented below.
    */
  val productionVariants: Input[js.Array[Input[EndpointConfigurationProductionVariant]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object EndpointConfigurationArgs {
  @scala.inline
  def apply(productionVariants: Input[js.Array[Input[EndpointConfigurationProductionVariant]]]): EndpointConfigurationArgs = {
    val __obj = js.Dynamic.literal(productionVariants = productionVariants.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationArgs]
  }
  @scala.inline
  implicit class EndpointConfigurationArgsOps[Self <: EndpointConfigurationArgs] (val x: Self) extends AnyVal {
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
    def setProductionVariantsVarargs(value: Input[EndpointConfigurationProductionVariant]*): Self = this.set("productionVariants", js.Array(value :_*))
    @scala.inline
    def setProductionVariants(value: Input[js.Array[Input[EndpointConfigurationProductionVariant]]]): Self = this.set("productionVariants", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

