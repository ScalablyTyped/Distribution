package typings
package atPulumiAwsLib.cognitoUserPoolClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient")
@js.native
class UserPoolClient protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UserPoolClient resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: UserPoolClientArgs) = this()
  def this(name: java.lang.String, args: UserPoolClientArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * List of allowed OAuth flows (code, implicit, client_credentials).
    */
  val allowedOauthFlows: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  val allowedOauthFlowsUserPoolClient: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
    */
  val allowedOauthScopes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * List of allowed callback URLs for the identity providers.
    */
  val callbackUrls: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The client secret of the user pool client.
    */
  val clientSecret: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The default redirect URI. Must be in the list of callback URLs.
    */
  val defaultRedirectUri: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH).
    */
  val explicitAuthFlows: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Should an application secret be generated.
    */
  val generateSecret: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * List of allowed logout URLs for the identity providers.
    */
  val logoutUrls: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The name of the application client.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of user pool attributes the application client can read from.
    */
  val readAttributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The time limit in days refresh tokens are valid for.
    */
  val refreshTokenValidity: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * List of provider names for the identity providers that are supported on this client.
    */
  val supportedIdentityProviders: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The user pool the client belongs to.
    */
  val userPoolId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of user pool attributes the application client can write to.
    */
  val writeAttributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClient = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClientState
  ): atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClient = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClientState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClient = js.native
  /**
    * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ scala.Boolean = js.native
}

