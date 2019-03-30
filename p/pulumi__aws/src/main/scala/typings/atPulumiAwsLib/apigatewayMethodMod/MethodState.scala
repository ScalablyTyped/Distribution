package typings
package atPulumiAwsLib.apigatewayMethodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodState extends js.Object {
  /**
    * Specify if the method requires an API key
    */
  val apiKeyRequired: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
    */
  val authorizationScopes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
    */
  val authorizerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of the API models used for the request's content type
    * where key is the content type (e.g. `application/json`)
    * and value is either `Error`, `Empty` (built-in models) or `aws_api_gateway_model`'s `name`.
    */
  val requestModels: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A map of request query string parameters and headers that should be passed to the integration.
    * For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request
    */
  val requestParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[scala.Boolean]]
    ]
  ] = js.undefined
  /**
    * The ID of a `aws_api_gateway_request_validator`
    */
  val requestValidatorId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The API resource ID
    */
  val resourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]] = js.undefined
}

object MethodState {
  @scala.inline
  def apply(
    apiKeyRequired: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    authorization: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    authorizationScopes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    authorizerId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    requestModels: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    requestParameters: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[scala.Boolean]]
    ] = null,
    requestValidatorId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = null
  ): MethodState = {
    val __obj = js.Dynamic.literal()
    if (apiKeyRequired != null) __obj.updateDynamic("apiKeyRequired")(apiKeyRequired.asInstanceOf[js.Any])
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (authorizationScopes != null) __obj.updateDynamic("authorizationScopes")(authorizationScopes.asInstanceOf[js.Any])
    if (authorizerId != null) __obj.updateDynamic("authorizerId")(authorizerId.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (requestModels != null) __obj.updateDynamic("requestModels")(requestModels.asInstanceOf[js.Any])
    if (requestParameters != null) __obj.updateDynamic("requestParameters")(requestParameters.asInstanceOf[js.Any])
    if (requestValidatorId != null) __obj.updateDynamic("requestValidatorId")(requestValidatorId.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodState]
  }
}

