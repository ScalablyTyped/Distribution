package typings.atPulumiKubernetes.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceValidation is a list of validation methods for CustomResources.
  */
trait CustomResourceValidation extends js.Object {
  /**
    * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against.
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

