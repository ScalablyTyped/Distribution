package typings
package atPulumiAwsLib.cognitoUserPoolClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolClientArgs extends js.Object {
  /**
    * List of allowed OAuth flows (code, implicit, client_credentials).
    */
  val allowedOauthFlows: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  val allowedOauthFlowsUserPoolClient: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
    */
  val allowedOauthScopes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * List of allowed callback URLs for the identity providers.
    */
  val callbackUrls: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The default redirect URI. Must be in the list of callback URLs.
    */
  val defaultRedirectUri: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH).
    */
  val explicitAuthFlows: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Should an application secret be generated.
    */
  val generateSecret: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * List of allowed logout URLs for the identity providers.
    */
  val logoutUrls: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the application client.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of user pool attributes the application client can read from.
    */
  val readAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The time limit in days refresh tokens are valid for.
    */
  val refreshTokenValidity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * List of provider names for the identity providers that are supported on this client.
    */
  val supportedIdentityProviders: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The user pool the client belongs to.
    */
  val userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * List of user pool attributes the application client can write to.
    */
  val writeAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object UserPoolClientArgs {
  @scala.inline
  def apply(
    userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowedOauthFlows: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    allowedOauthFlowsUserPoolClient: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    allowedOauthScopes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    callbackUrls: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    defaultRedirectUri: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    explicitAuthFlows: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    generateSecret: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    logoutUrls: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    readAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    refreshTokenValidity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    supportedIdentityProviders: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    writeAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): UserPoolClientArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userPoolId")(userPoolId.asInstanceOf[js.Any])
    if (allowedOauthFlows != null) __obj.updateDynamic("allowedOauthFlows")(allowedOauthFlows.asInstanceOf[js.Any])
    if (allowedOauthFlowsUserPoolClient != null) __obj.updateDynamic("allowedOauthFlowsUserPoolClient")(allowedOauthFlowsUserPoolClient.asInstanceOf[js.Any])
    if (allowedOauthScopes != null) __obj.updateDynamic("allowedOauthScopes")(allowedOauthScopes.asInstanceOf[js.Any])
    if (callbackUrls != null) __obj.updateDynamic("callbackUrls")(callbackUrls.asInstanceOf[js.Any])
    if (defaultRedirectUri != null) __obj.updateDynamic("defaultRedirectUri")(defaultRedirectUri.asInstanceOf[js.Any])
    if (explicitAuthFlows != null) __obj.updateDynamic("explicitAuthFlows")(explicitAuthFlows.asInstanceOf[js.Any])
    if (generateSecret != null) __obj.updateDynamic("generateSecret")(generateSecret.asInstanceOf[js.Any])
    if (logoutUrls != null) __obj.updateDynamic("logoutUrls")(logoutUrls.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (readAttributes != null) __obj.updateDynamic("readAttributes")(readAttributes.asInstanceOf[js.Any])
    if (refreshTokenValidity != null) __obj.updateDynamic("refreshTokenValidity")(refreshTokenValidity.asInstanceOf[js.Any])
    if (supportedIdentityProviders != null) __obj.updateDynamic("supportedIdentityProviders")(supportedIdentityProviders.asInstanceOf[js.Any])
    if (writeAttributes != null) __obj.updateDynamic("writeAttributes")(writeAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolClientArgs]
  }
}

