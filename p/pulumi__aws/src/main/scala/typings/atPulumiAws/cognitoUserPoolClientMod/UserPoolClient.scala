package typings.atPulumiAws.cognitoUserPoolClientMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient")
@js.native
class UserPoolClient protected () extends CustomResource {
  /**
    * Create a UserPoolClient resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserPoolClientArgs) = this()
  def this(name: String, args: UserPoolClientArgs, opts: CustomResourceOptions) = this()
  /**
    * List of allowed OAuth flows (code, implicit, client_credentials).
    */
  val allowedOauthFlows: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  val allowedOauthFlowsUserPoolClient: Output[js.UndefOr[Boolean]] = js.native
  /**
    * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
    */
  val allowedOauthScopes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * List of allowed callback URLs for the identity providers.
    */
  val callbackUrls: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The client secret of the user pool client.
    */
  val clientSecret: Output[String] = js.native
  /**
    * The default redirect URI. Must be in the list of callback URLs.
    */
  val defaultRedirectUri: Output[js.UndefOr[String]] = js.native
  /**
    * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH).
    */
  val explicitAuthFlows: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Should an application secret be generated.
    */
  val generateSecret: Output[js.UndefOr[Boolean]] = js.native
  /**
    * List of allowed logout URLs for the identity providers.
    */
  val logoutUrls: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name of the application client.
    */
  val name: Output[String] = js.native
  /**
    * List of user pool attributes the application client can read from.
    */
  val readAttributes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The time limit in days refresh tokens are valid for.
    */
  val refreshTokenValidity: Output[js.UndefOr[Double]] = js.native
  /**
    * List of provider names for the identity providers that are supported on this client.
    */
  val supportedIdentityProviders: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The user pool the client belongs to.
    */
  val userPoolId: Output[String] = js.native
  /**
    * List of user pool attributes the application client can write to.
    */
  val writeAttributes: Output[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient")
@js.native
object UserPoolClient extends js.Object {
  /**
    * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): UserPoolClient = js.native
  def get(name: String, id: Input[ID], state: UserPoolClientState): UserPoolClient = js.native
  def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): UserPoolClient = js.native
  /**
    * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
}

