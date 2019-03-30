package typings
package atPulumiAwsLib.apigatewayMethodResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodResponseState extends js.Object {
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The API resource ID
    */
  val resourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of the API models used for the response's content type
    */
  val responseModels: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A map of response parameters that can be sent to the caller.
    * For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
    * would define that the header `X-Some-Header` can be provided on the response.
    */
  val responseParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[scala.Boolean]]
    ]
  ] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]] = js.undefined
  /**
    * The HTTP status code
    */
  val statusCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object MethodResponseState {
  @scala.inline
  def apply(
    httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    responseModels: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    responseParameters: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[scala.Boolean]]
    ] = null,
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = null,
    statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): MethodResponseState = {
    val __obj = js.Dynamic.literal()
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (responseModels != null) __obj.updateDynamic("responseModels")(responseModels.asInstanceOf[js.Any])
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodResponseState]
  }
}

