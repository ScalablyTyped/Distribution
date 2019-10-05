package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1

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
  val openAPIV3Schema: JSONSchemaProps
}

object CustomResourceValidation {
  @scala.inline
  def apply(openAPIV3Schema: JSONSchemaProps): CustomResourceValidation = {
    val __obj = js.Dynamic.literal(openAPIV3Schema = openAPIV3Schema)
  
    __obj.asInstanceOf[CustomResourceValidation]
  }
}

