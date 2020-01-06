package typings.atPulumiAws.apigatewayDocumentationPartMod

import typings.atPulumiAws.typesInputMod.apigateway.DocumentationPartLocation
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationPartState extends js.Object {
  /**
    * The location of the targeted API entity of the to-be-created documentation part. See below.
    */
  val location: js.UndefOr[Input[DocumentationPartLocation]] = js.native
  /**
    * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
    */
  val properties: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: js.UndefOr[Input[String]] = js.native
}

object DocumentationPartState {
  @scala.inline
  def apply(
    location: Input[DocumentationPartLocation] = null,
    properties: Input[String] = null,
    restApiId: Input[String] = null
  ): DocumentationPartState = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationPartState]
  }
}

