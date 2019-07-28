package typings.atPulumiAws.cognitoUserPoolClientMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolClientState extends js.Object {
  /**
    * List of allowed OAuth flows (code, implicit, client_credentials).
    */
  val allowedOauthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  val allowedOauthFlowsUserPoolClient: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
    */
  val allowedOauthScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of allowed callback URLs for the identity providers.
    */
  val callbackUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The client secret of the user pool client.
    */
  val clientSecret: js.UndefOr[Input[String]] = js.undefined
  /**
    * The default redirect URI. Must be in the list of callback URLs.
    */
  val defaultRedirectUri: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH).
    */
  val explicitAuthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Should an application secret be generated.
    */
  val generateSecret: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of allowed logout URLs for the identity providers.
    */
  val logoutUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The name of the application client.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of user pool attributes the application client can read from.
    */
  val readAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The time limit in days refresh tokens are valid for.
    */
  val refreshTokenValidity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * List of provider names for the identity providers that are supported on this client.
    */
  val supportedIdentityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The user pool the client belongs to.
    */
  val userPoolId: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of user pool attributes the application client can write to.
    */
  val writeAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object UserPoolClientState {
  @scala.inline
  def apply(
    allowedOauthFlows: Input[js.Array[Input[String]]] = null,
    allowedOauthFlowsUserPoolClient: Input[Boolean] = null,
    allowedOauthScopes: Input[js.Array[Input[String]]] = null,
    callbackUrls: Input[js.Array[Input[String]]] = null,
    clientSecret: Input[String] = null,
    defaultRedirectUri: Input[String] = null,
    explicitAuthFlows: Input[js.Array[Input[String]]] = null,
    generateSecret: Input[Boolean] = null,
    logoutUrls: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    readAttributes: Input[js.Array[Input[String]]] = null,
    refreshTokenValidity: Input[Double] = null,
    supportedIdentityProviders: Input[js.Array[Input[String]]] = null,
    userPoolId: Input[String] = null,
    writeAttributes: Input[js.Array[Input[String]]] = null
  ): UserPoolClientState = {
    val __obj = js.Dynamic.literal()
    if (allowedOauthFlows != null) __obj.updateDynamic("allowedOauthFlows")(allowedOauthFlows.asInstanceOf[js.Any])
    if (allowedOauthFlowsUserPoolClient != null) __obj.updateDynamic("allowedOauthFlowsUserPoolClient")(allowedOauthFlowsUserPoolClient.asInstanceOf[js.Any])
    if (allowedOauthScopes != null) __obj.updateDynamic("allowedOauthScopes")(allowedOauthScopes.asInstanceOf[js.Any])
    if (callbackUrls != null) __obj.updateDynamic("callbackUrls")(callbackUrls.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (defaultRedirectUri != null) __obj.updateDynamic("defaultRedirectUri")(defaultRedirectUri.asInstanceOf[js.Any])
    if (explicitAuthFlows != null) __obj.updateDynamic("explicitAuthFlows")(explicitAuthFlows.asInstanceOf[js.Any])
    if (generateSecret != null) __obj.updateDynamic("generateSecret")(generateSecret.asInstanceOf[js.Any])
    if (logoutUrls != null) __obj.updateDynamic("logoutUrls")(logoutUrls.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (readAttributes != null) __obj.updateDynamic("readAttributes")(readAttributes.asInstanceOf[js.Any])
    if (refreshTokenValidity != null) __obj.updateDynamic("refreshTokenValidity")(refreshTokenValidity.asInstanceOf[js.Any])
    if (supportedIdentityProviders != null) __obj.updateDynamic("supportedIdentityProviders")(supportedIdentityProviders.asInstanceOf[js.Any])
    if (userPoolId != null) __obj.updateDynamic("userPoolId")(userPoolId.asInstanceOf[js.Any])
    if (writeAttributes != null) __obj.updateDynamic("writeAttributes")(writeAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolClientState]
  }
}

