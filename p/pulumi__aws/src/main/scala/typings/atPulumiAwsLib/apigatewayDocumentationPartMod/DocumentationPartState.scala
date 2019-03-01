package typings
package atPulumiAwsLib.apigatewayDocumentationPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationPartState extends js.Object {
  /**
    * The location of the targeted API entity of the to-be-created documentation part. See below.
    */
  val location: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MethodName]] = js.undefined
  /**
    * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
    */
  val properties: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated Rest API
    */
  val restApiId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DocumentationPartState {
  @scala.inline
  def apply(
    location: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MethodName] = null,
    properties: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DocumentationPartState = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationPartState]
  }
}

