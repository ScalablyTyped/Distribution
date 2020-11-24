package typings.pulumiAws.authorizerMod

import typings.pulumiAws.inputMod.apigatewayv2.AuthorizerJwtConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
    * Valid values: `1.0`, `2.0`.
    */
  val authorizerPayloadFormatVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
    * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
    * Supported only for HTTP API Lambda authorizers.
    */
  val authorizerResultTtlInSeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The authorizer type. Valid values: `JWT`, `REQUEST`.
    * Specify `REQUEST` for a Lambda function using incoming request parameters.
    * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
    */
  val authorizerType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The authorizer's Uniform Resource Identifier (URI).
    * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invokeArn` attribute of the `aws.lambda.Function` resource.
    * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
    */
  val authorizerUri: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
    * Supported only for HTTP APIs.
    */
  val enableSimpleResponses: js.UndefOr[Input[Boolean]] = js.native
  
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
    * The name of the authorizer. Must be between 1 and 128 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object AuthorizerState {
  
  @scala.inline
  def apply(): AuthorizerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerState]
  }
  
  @scala.inline
  implicit class AuthorizerStateOps[Self <: AuthorizerState] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiId: Self = this.set("apiId", js.undefined)
    
    @scala.inline
    def setAuthorizerCredentialsArn(value: Input[String]): Self = this.set("authorizerCredentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerCredentialsArn: Self = this.set("authorizerCredentialsArn", js.undefined)
    
    @scala.inline
    def setAuthorizerPayloadFormatVersion(value: Input[String]): Self = this.set("authorizerPayloadFormatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerPayloadFormatVersion: Self = this.set("authorizerPayloadFormatVersion", js.undefined)
    
    @scala.inline
    def setAuthorizerResultTtlInSeconds(value: Input[Double]): Self = this.set("authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerResultTtlInSeconds: Self = this.set("authorizerResultTtlInSeconds", js.undefined)
    
    @scala.inline
    def setAuthorizerType(value: Input[String]): Self = this.set("authorizerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerType: Self = this.set("authorizerType", js.undefined)
    
    @scala.inline
    def setAuthorizerUri(value: Input[String]): Self = this.set("authorizerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerUri: Self = this.set("authorizerUri", js.undefined)
    
    @scala.inline
    def setEnableSimpleResponses(value: Input[Boolean]): Self = this.set("enableSimpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSimpleResponses: Self = this.set("enableSimpleResponses", js.undefined)
    
    @scala.inline
    def setIdentitySourcesVarargs(value: Input[String]*): Self = this.set("identitySources", js.Array(value :_*))
    
    @scala.inline
    def setIdentitySources(value: Input[js.Array[Input[String]]]): Self = this.set("identitySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentitySources: Self = this.set("identitySources", js.undefined)
    
    @scala.inline
    def setJwtConfiguration(value: Input[AuthorizerJwtConfiguration]): Self = this.set("jwtConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtConfiguration: Self = this.set("jwtConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
