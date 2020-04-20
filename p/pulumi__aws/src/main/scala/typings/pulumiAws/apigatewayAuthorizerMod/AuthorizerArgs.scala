package typings.pulumiAws.apigatewayAuthorizerMod

import typings.pulumiAws.restApiMod.RestApi
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
  def apply(
    restApi: Input[String | RestApi],
    authorizerCredentials: Input[String] = null,
    authorizerResultTtlInSeconds: Input[Double] = null,
    authorizerUri: Input[String] = null,
    identitySource: Input[String] = null,
    identityValidationExpression: Input[String] = null,
    name: Input[String] = null,
    providerArns: Input[js.Array[Input[String]]] = null,
    `type`: Input[String] = null
  ): AuthorizerArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
    if (authorizerCredentials != null) __obj.updateDynamic("authorizerCredentials")(authorizerCredentials.asInstanceOf[js.Any])
    if (authorizerResultTtlInSeconds != null) __obj.updateDynamic("authorizerResultTtlInSeconds")(authorizerResultTtlInSeconds.asInstanceOf[js.Any])
    if (authorizerUri != null) __obj.updateDynamic("authorizerUri")(authorizerUri.asInstanceOf[js.Any])
    if (identitySource != null) __obj.updateDynamic("identitySource")(identitySource.asInstanceOf[js.Any])
    if (identityValidationExpression != null) __obj.updateDynamic("identityValidationExpression")(identityValidationExpression.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (providerArns != null) __obj.updateDynamic("providerArns")(providerArns.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerArgs]
  }
}

