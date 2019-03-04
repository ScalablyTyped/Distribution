package typings
package atPulumiAwsLib.apigatewayDocumentationPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationPartArgs extends js.Object {
  /**
    * The location of the targeted API entity of the to-be-created documentation part. See below.
    */
  val location: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MethodName]
  /**
    * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
    */
  val properties: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the associated Rest API
    */
  val restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DocumentationPartArgs {
  @scala.inline
  def apply(
    location: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MethodName],
    properties: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): DocumentationPartArgs = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentationPartArgs]
  }
}

