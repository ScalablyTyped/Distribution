package typings
package atPulumiAwsLib.apigatewayDocumentationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationVersionState extends js.Object {
  /**
    * The description of the API documentation version.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated Rest API
    */
  val restApiId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DocumentationVersionState {
  @scala.inline
  def apply(
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DocumentationVersionState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationVersionState]
  }
}

