package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceValidation is a list of validation methods for CustomResources.
  */
trait CustomResourceValidation extends js.Object {
  /**
    * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
    */
  var openAPIV3Schema: js.UndefOr[Input[JSONSchemaProps]] = js.undefined
}

object CustomResourceValidation {
  @scala.inline
  def apply(openAPIV3Schema: Input[JSONSchemaProps] = null): CustomResourceValidation = {
    val __obj = js.Dynamic.literal()
    if (openAPIV3Schema != null) __obj.updateDynamic("openAPIV3Schema")(openAPIV3Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceValidation]
  }
}

