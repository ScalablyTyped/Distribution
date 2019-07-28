package typings.atPulumiAws.apigatewayDocumentationPartMod

import typings.atPulumiAws.Anon_MethodName
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationPartArgs extends js.Object {
  /**
    * The location of the targeted API entity of the to-be-created documentation part. See below.
    */
  val location: Input[Anon_MethodName]
  /**
    * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
    */
  val properties: Input[String]
  /**
    * The ID of the associated Rest API
    */
  val restApiId: Input[String]
}

object DocumentationPartArgs {
  @scala.inline
  def apply(location: Input[Anon_MethodName], properties: Input[String], restApiId: Input[String]): DocumentationPartArgs = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentationPartArgs]
  }
}

