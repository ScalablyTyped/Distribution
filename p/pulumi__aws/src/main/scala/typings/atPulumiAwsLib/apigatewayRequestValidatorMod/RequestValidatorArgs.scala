package typings
package atPulumiAwsLib.apigatewayRequestValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestValidatorArgs extends js.Object {
  /**
    * The name of the request validator
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated Rest API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * Boolean whether to validate request body. Defaults to `false`.
    */
  val validateRequestBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean whether to validate request parameters. Defaults to `false`.
    */
  val validateRequestParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object RequestValidatorArgs {
  @scala.inline
  def apply(
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    validateRequestBody: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    validateRequestParameters: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): RequestValidatorArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (validateRequestBody != null) __obj.updateDynamic("validateRequestBody")(validateRequestBody.asInstanceOf[js.Any])
    if (validateRequestParameters != null) __obj.updateDynamic("validateRequestParameters")(validateRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestValidatorArgs]
  }
}

