package typings
package atPulumiAwsLib.apigatewayRequestValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestValidatorState extends js.Object {
  /**
    * The name of the request validator
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated Rest API
    */
  val restApi: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]] = js.undefined
  /**
    * Boolean whether to validate request body. Defaults to `false`.
    */
  val validateRequestBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean whether to validate request parameters. Defaults to `false`.
    */
  val validateRequestParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object RequestValidatorState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = null,
    validateRequestBody: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    validateRequestParameters: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): RequestValidatorState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (validateRequestBody != null) __obj.updateDynamic("validateRequestBody")(validateRequestBody.asInstanceOf[js.Any])
    if (validateRequestParameters != null) __obj.updateDynamic("validateRequestParameters")(validateRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestValidatorState]
  }
}

