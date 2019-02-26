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

