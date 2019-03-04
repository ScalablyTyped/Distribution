package typings
package atPulumiAwsLib.apigatewayDocumentationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationVersionArgs extends js.Object {
  /**
    * The description of the API documentation version.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated Rest API
    */
  val restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DocumentationVersionArgs {
  @scala.inline
  def apply(
    restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DocumentationVersionArgs = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationVersionArgs]
  }
}

