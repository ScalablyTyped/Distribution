package typings.pulumiAws.apigatewayAuthorizerMod

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerArgs extends js.Object {
  /**
    * The credentials required for the authorizer.
    * To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
    */
  val authorizerCredentials: js.UndefOr[Input[String]] = js.native
  /**
    * The TTL of cached authorizer results in seconds.
    * Defaults to `300`.
    */
  val authorizerResultTtlInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI).
    * This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
    * e.g. `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
    */
  val authorizerUri: js.UndefOr[Input[String]] = js.native
  /**
    * The source of the identity in an incoming request.
    * Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g. `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
    */
  val identitySource: js.UndefOr[Input[String]] = js.native
  /**
    * A validation expression for the incoming identity.
    * For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched
    * against this expression, and will proceed if the token matches. If the token doesn't match,
    * the client receives a 401 Unauthorized response.
    */
  val identityValidationExpression: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the authorizer
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the Amazon Cognito user pool ARNs.
    * Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
    */
  val providerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
    * Defaults to `TOKEN`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object AuthorizerArgs {
  @scala.inline
  def apply(restApi: Input[String | RestApi]): AuthorizerArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerArgs]
  }
  @scala.inline
  implicit class AuthorizerArgsOps[Self <: AuthorizerArgs] (val x: Self) extends AnyVal {
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
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizerCredentials(value: Input[String]): Self = this.set("authorizerCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerCredentials: Self = this.set("authorizerCredentials", js.undefined)
    @scala.inline
    def setAuthorizerResultTtlInSeconds(value: Input[Double]): Self = this.set("authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerResultTtlInSeconds: Self = this.set("authorizerResultTtlInSeconds", js.undefined)
    @scala.inline
    def setAuthorizerUri(value: Input[String]): Self = this.set("authorizerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerUri: Self = this.set("authorizerUri", js.undefined)
    @scala.inline
    def setIdentitySource(value: Input[String]): Self = this.set("identitySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentitySource: Self = this.set("identitySource", js.undefined)
    @scala.inline
    def setIdentityValidationExpression(value: Input[String]): Self = this.set("identityValidationExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityValidationExpression: Self = this.set("identityValidationExpression", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProviderArnsVarargs(value: Input[String]*): Self = this.set("providerArns", js.Array(value :_*))
    @scala.inline
    def setProviderArns(value: Input[js.Array[Input[String]]]): Self = this.set("providerArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderArns: Self = this.set("providerArns", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

