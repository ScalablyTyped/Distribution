package typings.atPulumiAws.apigatewayRequestValidatorMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestValidatorArgs extends js.Object {
  /**
    * The name of the request validator
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the associated Rest API
    */
  val restApi: Input[RestApi]
  /**
    * Boolean whether to validate request body. Defaults to `false`.
    */
  val validateRequestBody: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Boolean whether to validate request parameters. Defaults to `false`.
    */
  val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.undefined
}

object RequestValidatorArgs {
  @scala.inline
  def apply(
    restApi: Input[RestApi],
    name: Input[String] = null,
    validateRequestBody: Input[Boolean] = null,
    validateRequestParameters: Input[Boolean] = null
  ): RequestValidatorArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (validateRequestBody != null) __obj.updateDynamic("validateRequestBody")(validateRequestBody.asInstanceOf[js.Any])
    if (validateRequestParameters != null) __obj.updateDynamic("validateRequestParameters")(validateRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestValidatorArgs]
  }
}

