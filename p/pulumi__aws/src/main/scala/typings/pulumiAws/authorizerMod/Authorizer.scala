package typings.pulumiAws.authorizerMod

import typings.pulumiAws.outputMod.apigatewayv2.AuthorizerJwtConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigatewayv2/authorizer", "Authorizer")
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
    * The API identifier.
    */
  val apiId: Output_[String] = js.native
  /**
    * The required credentials as an IAM role for API Gateway to invoke the authorizer.
    * Supported only for `REQUEST` authorizers.
    */
  val authorizerCredentialsArn: Output_[js.UndefOr[String]] = js.native
  /**
    * The authorizer type. Valid values: `JWT`, `REQUEST`.
    * For WebSocket APIs, specify `REQUEST` for a Lambda function using incoming request parameters.
    * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
    */
  val authorizerType: Output_[String] = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI).
    * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invokeArn` attribute of the `aws.lambda.Function` resource.
    * Supported only for `REQUEST` authorizers.
    */
  val authorizerUri: Output_[js.UndefOr[String]] = js.native
  /**
    * The identity sources for which authorization is requested.
    * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
    * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
    */
  val identitySources: Output_[js.Array[String]] = js.native
  /**
    * The configuration of a JWT authorizer. Required for the `JWT` authorizer type.
    * Supported only for HTTP APIs.
    */
  val jwtConfiguration: Output_[js.UndefOr[AuthorizerJwtConfiguration]] = js.native
  /**
    * The name of the authorizer.
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigatewayv2/authorizer", "Authorizer")
@js.native
object Authorizer extends js.Object {
  /**
    * Get an existing Authorizer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Authorizer = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Authorizer = js.native
  def get(name: String, id: Input[ID], state: AuthorizerState): Authorizer = js.native
  def get(name: String, id: Input[ID], state: AuthorizerState, opts: CustomResourceOptions): Authorizer = js.native
  /**
    * Returns true if the given object is an instance of Authorizer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/authorizer.Authorizer */ Boolean = js.native
}

