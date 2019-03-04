package typings
package atPulumiAwsLib.apigatewayModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArgs extends js.Object {
  /**
    * The content type of the model
    */
  val contentType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The description of the model
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the model
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * The schema of the model in a JSON form
    */
  val schema: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ModelArgs {
  @scala.inline
  def apply(
    contentType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    schema: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ModelArgs = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArgs]
  }
}

