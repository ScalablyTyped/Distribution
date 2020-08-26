package typings.pulumiAws.documentationPartMod

import typings.pulumiAws.inputMod.apigateway.DocumentationPartLocation
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationPartArgs extends js.Object {
  /**
    * The location of the targeted API entity of the to-be-created documentation part. See below.
    */
  val location: Input[DocumentationPartLocation] = js.native
  /**
    * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
    */
  val properties: Input[String] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: Input[String] = js.native
}

object DocumentationPartArgs {
  @scala.inline
  def apply(location: Input[DocumentationPartLocation], properties: Input[String], restApiId: Input[String]): DocumentationPartArgs = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationPartArgs]
  }
  @scala.inline
  implicit class DocumentationPartArgsOps[Self <: DocumentationPartArgs] (val x: Self) extends AnyVal {
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
    def setLocation(value: Input[DocumentationPartLocation]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: Input[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: Input[String]): Self = this.set("restApiId", value.asInstanceOf[js.Any])
  }
  
}

