package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceValidation is a list of validation methods for CustomResources.
  */
@js.native
trait CustomResourceValidation extends js.Object {
  /**
    * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
    */
  var openAPIV3Schema: js.UndefOr[Input[JSONSchemaProps]] = js.native
}

object CustomResourceValidation {
  @scala.inline
  def apply(): CustomResourceValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceValidation]
  }
  @scala.inline
  implicit class CustomResourceValidationOps[Self <: CustomResourceValidation] (val x: Self) extends AnyVal {
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
    def setOpenAPIV3Schema(value: Input[JSONSchemaProps]): Self = this.set("openAPIV3Schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenAPIV3Schema: Self = this.set("openAPIV3Schema", js.undefined)
  }
  
}

