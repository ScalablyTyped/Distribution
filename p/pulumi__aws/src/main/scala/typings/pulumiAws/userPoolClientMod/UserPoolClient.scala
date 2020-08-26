package typings.pulumiAws.userPoolClientMod

import typings.pulumiAws.outputMod.cognito.UserPoolClientAnalyticsConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val allowedOauthFlows: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  val allowedOauthFlowsUserPoolClient: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
    */
  val allowedOauthScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
    */
  val analyticsConfiguration: Output_[js.UndefOr[UserPoolClientAnalyticsConfiguration]] = js.native
  /**
    * List of allowed callback URLs for the identity providers.
    */
  val callbackUrls: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The client secret of the user pool client.
    */
  val clientSecret: Output_[String] = js.native
  /**
    * The default redirect URI. Must be in the list of callback URLs.
    */
  val defaultRedirectUri: Output_[js.UndefOr[String]] = js.native
  /**
    * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
    */
  val explicitAuthFlows: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Should an application secret be generated.
    */
  val generateSecret: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * List of allowed logout URLs for the identity providers.
    */
  val logoutUrls: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name of the application client.
    */
  val name: Output_[String] = js.native
  /**
    * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
    */
  val preventUserExistenceErrors: Output_[String] = js.native
  /**
    * List of user pool attributes the application client can read from.
    */
  val readAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The time limit in days refresh tokens are valid for.
    */
  val refreshTokenValidity: Output_[js.UndefOr[Double]] = js.native
  /**
    * List of provider names for the identity providers that are supported on this client.
    */
  val supportedIdentityProviders: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The user pool the client belongs to.
    */
  val userPoolId: Output_[String] = js.native
  /**
    * List of user pool attributes the application client can write to.
    */
  val writeAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): UserPoolClient = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserPoolClient = js.native
  def get(name: String, id: Input[ID], state: UserPoolClientState): UserPoolClient = js.native
  def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): UserPoolClient = js.native
  /**
    * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
}

