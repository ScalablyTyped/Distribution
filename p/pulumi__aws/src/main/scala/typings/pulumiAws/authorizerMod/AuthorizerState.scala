package typings.pulumiAws.authorizerMod

import typings.pulumiAws.inputMod.apigatewayv2.AuthorizerJwtConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerState extends js.Object {
  /**
    * The API identifier.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The required credentials as an IAM role for API Gateway to invoke the authorizer.
    * Supported only for `REQUEST` authorizers.
    */
  val authorizerCredentialsArn: js.UndefOr[Input[String]] = js.native
  /**
    * The authorizer type. Valid values: `JWT`, `REQUEST`.
    * For WebSocket APIs, specify `REQUEST` for a Lambda function using incoming request parameters.
    * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
    */
  val authorizerType: js.UndefOr[Input[String]] = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI).
    * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invokeArn` attribute of the [`aws.lambda.Function`](https://www.terraform.io/docs/providers/aws/r/lambda_function.html) resource.
    * Supported only for `REQUEST` authorizers.
    */
  val authorizerUri: js.UndefOr[Input[String]] = js.native
  /**
    * The identity sources for which authorization is requested.
    * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
    * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
    */
  val identitySources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The configuration of a JWT authorizer. Required for the `JWT` authorizer type.
    * Supported only for HTTP APIs.
    */
  val jwtConfiguration: js.UndefOr[Input[AuthorizerJwtConfiguration]] = js.native
  /**
    * The name of the authorizer.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object AuthorizerState {
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    authorizerCredentialsArn: Input[String] = null,
    authorizerType: Input[String] = null,
    authorizerUri: Input[String] = null,
    identitySources: Input[js.Array[Input[String]]] = null,
    jwtConfiguration: Input[AuthorizerJwtConfiguration] = null,
    name: Input[String] = null
  ): AuthorizerState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (authorizerCredentialsArn != null) __obj.updateDynamic("authorizerCredentialsArn")(authorizerCredentialsArn.asInstanceOf[js.Any])
    if (authorizerType != null) __obj.updateDynamic("authorizerType")(authorizerType.asInstanceOf[js.Any])
    if (authorizerUri != null) __obj.updateDynamic("authorizerUri")(authorizerUri.asInstanceOf[js.Any])
    if (identitySources != null) __obj.updateDynamic("identitySources")(identitySources.asInstanceOf[js.Any])
    if (jwtConfiguration != null) __obj.updateDynamic("jwtConfiguration")(jwtConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerState]
  }
}

