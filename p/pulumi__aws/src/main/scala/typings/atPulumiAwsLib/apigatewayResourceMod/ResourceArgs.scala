package typings
package atPulumiAwsLib.apigatewayResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceArgs extends js.Object {
  /**
    * The ID of the parent API resource
    */
  val parentId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The last path segment of this API resource.
    */
  val pathPart: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
}

object ResourceArgs {
  @scala.inline
  def apply(
    parentId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    pathPart: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  ): ResourceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    __obj.updateDynamic("pathPart")(pathPart.asInstanceOf[js.Any])
    __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceArgs]
  }
}

