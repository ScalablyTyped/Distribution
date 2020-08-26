package typings.pulumiAws.methodMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodState extends js.Object {
  /**
    * Specify if the method requires an API key
    */
  val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: js.UndefOr[Input[String]] = js.native
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
  val httpMethod: js.UndefOr[Input[String]] = js.native
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
  val resourceId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
}

object MethodState {
  @scala.inline
  def apply(): MethodState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodState]
  }
  @scala.inline
  implicit class MethodStateOps[Self <: MethodState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKeyRequired(value: Input[Boolean]): Self = this.set("apiKeyRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKeyRequired: Self = this.set("apiKeyRequired", js.undefined)
    @scala.inline
    def setAuthorization(value: Input[String]): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def setAuthorizationScopesVarargs(value: Input[String]*): Self = this.set("authorizationScopes", js.Array(value :_*))
    @scala.inline
    def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = this.set("authorizationScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationScopes: Self = this.set("authorizationScopes", js.undefined)
    @scala.inline
    def setAuthorizerId(value: Input[String]): Self = this.set("authorizerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerId: Self = this.set("authorizerId", js.undefined)
    @scala.inline
    def setHttpMethod(value: Input[String]): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    @scala.inline
    def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = this.set("requestModels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestModels: Self = this.set("requestModels", js.undefined)
    @scala.inline
    def setRequestParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = this.set("requestParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestParameters: Self = this.set("requestParameters", js.undefined)
    @scala.inline
    def setRequestValidatorId(value: Input[String]): Self = this.set("requestValidatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestValidatorId: Self = this.set("requestValidatorId", js.undefined)
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
  }
  
}

