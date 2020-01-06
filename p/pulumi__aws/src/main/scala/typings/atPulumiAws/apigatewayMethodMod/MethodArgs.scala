package typings.atPulumiAws.apigatewayMethodMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodArgs extends js.Object {
  /**
    * Specify if the method requires an API key
    */
  val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: Input[String] = js.native
  /**
    * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
    */
  val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
    */
  val authorizerId: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Input[String] = js.native
  /**
    * A map of the API models used for the request's content type
    * where key is the content type (e.g. `application/json`)
    * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
    */
  val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
    * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
    */
  val requestParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.native
  /**
    * The ID of a `aws.apigateway.RequestValidator`
    */
  val requestValidatorId: js.UndefOr[Input[String]] = js.native
  /**
    * The API resource ID
    */
  val resourceId: Input[String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[RestApi] = js.native
}

object MethodArgs {
  @scala.inline
  def apply(
    authorization: Input[String],
    httpMethod: Input[String],
    resourceId: Input[String],
    restApi: Input[RestApi],
    apiKeyRequired: Input[Boolean] = null,
    authorizationScopes: Input[js.Array[Input[String]]] = null,
    authorizerId: Input[String] = null,
    requestModels: Input[StringDictionary[Input[String]]] = null,
    requestParameters: Input[StringDictionary[Input[Boolean]]] = null,
    requestValidatorId: Input[String] = null
  ): MethodArgs = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    if (apiKeyRequired != null) __obj.updateDynamic("apiKeyRequired")(apiKeyRequired.asInstanceOf[js.Any])
    if (authorizationScopes != null) __obj.updateDynamic("authorizationScopes")(authorizationScopes.asInstanceOf[js.Any])
    if (authorizerId != null) __obj.updateDynamic("authorizerId")(authorizerId.asInstanceOf[js.Any])
    if (requestModels != null) __obj.updateDynamic("requestModels")(requestModels.asInstanceOf[js.Any])
    if (requestParameters != null) __obj.updateDynamic("requestParameters")(requestParameters.asInstanceOf[js.Any])
    if (requestValidatorId != null) __obj.updateDynamic("requestValidatorId")(requestValidatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodArgs]
  }
}

