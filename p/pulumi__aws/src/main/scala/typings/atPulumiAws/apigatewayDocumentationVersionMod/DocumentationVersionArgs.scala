package typings.atPulumiAws.apigatewayDocumentationVersionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationVersionArgs extends js.Object {
  /**
    * The description of the API documentation version.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: Input[String] = js.native
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: Input[String] = js.native
}

object DocumentationVersionArgs {
  @scala.inline
  def apply(restApiId: Input[String], version: Input[String], description: Input[String] = null): DocumentationVersionArgs = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationVersionArgs]
  }
}

