package typings.atPulumiAws.apigatewayAuthorizerMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/authorizer", "Authorizer")
@js.native
class Authorizer protected () extends CustomResource {
  /**
    * Create a Authorizer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AuthorizerArgs) = this()
  def this(name: String, args: AuthorizerArgs, opts: CustomResourceOptions) = this()
  /**
    * The credentials required for the authorizer.
    * To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
    */
  val authorizerCredentials: Output[js.UndefOr[String]] = js.native
  /**
    * The TTL of cached authorizer results in seconds.
    * Defaults to `300`.
    */
  val authorizerResultTtlInSeconds: Output[js.UndefOr[Double]] = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI).
    * This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
    * e.g. `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
    */
  val authorizerUri: Output[js.UndefOr[String]] = js.native
  /**
    * The source of the identity in an incoming request.
    * Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g. `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
    */
  val identitySource: Output[js.UndefOr[String]] = js.native
  /**
    * A validation expression for the incoming identity.
    * For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched
    * against this expression, and will proceed if the token matches. If the token doesn't match,
    * the client receives a 401 Unauthorized response.
    */
  val identityValidationExpression: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the authorizer
    */
  val name: Output[String] = js.native
  /**
    * A list of the Amazon Cognito user pool ARNs.
    * Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
    */
  val providerArns: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Output[RestApi] = js.native
  /**
    * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
    * Defaults to `TOKEN`.
    */
  val `type`: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/authorizer", "Authorizer")
@js.native
object Authorizer extends js.Object {
  /**
    * Get an existing Authorizer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Authorizer = js.native
  def get(name: String, id: Input[ID], state: AuthorizerState): Authorizer = js.native
  def get(name: String, id: Input[ID], state: AuthorizerState, opts: CustomResourceOptions): Authorizer = js.native
  /**
    * Returns true if the given object is an instance of Authorizer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/authorizer.Authorizer */ Boolean = js.native
}

