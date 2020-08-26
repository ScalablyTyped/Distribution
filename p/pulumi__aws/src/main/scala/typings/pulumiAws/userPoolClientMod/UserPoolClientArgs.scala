package typings.pulumiAws.userPoolClientMod

import typings.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolClientArgs extends js.Object {
  /**
    * List of allowed OAuth flows (code, implicit, client_credentials).
    */
  val allowedOauthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  val allowedOauthFlowsUserPoolClient: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
    */
  val allowedOauthScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
    */
  val analyticsConfiguration: js.UndefOr[Input[UserPoolClientAnalyticsConfiguration]] = js.native
  /**
    * List of allowed callback URLs for the identity providers.
    */
  val callbackUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The default redirect URI. Must be in the list of callback URLs.
    */
  val defaultRedirectUri: js.UndefOr[Input[String]] = js.native
  /**
    * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
    */
  val explicitAuthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Should an application secret be generated.
    */
  val generateSecret: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of allowed logout URLs for the identity providers.
    */
  val logoutUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the application client.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
    */
  val preventUserExistenceErrors: js.UndefOr[Input[String]] = js.native
  /**
    * List of user pool attributes the application client can read from.
    */
  val readAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The time limit in days refresh tokens are valid for.
    */
  val refreshTokenValidity: js.UndefOr[Input[Double]] = js.native
  /**
    * List of provider names for the identity providers that are supported on this client.
    */
  val supportedIdentityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The user pool the client belongs to.
    */
  val userPoolId: Input[String] = js.native
  /**
    * List of user pool attributes the application client can write to.
    */
  val writeAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object UserPoolClientArgs {
  @scala.inline
  def apply(userPoolId: Input[String]): UserPoolClientArgs = {
    val __obj = js.Dynamic.literal(userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolClientArgs]
  }
  @scala.inline
  implicit class UserPoolClientArgsOps[Self <: UserPoolClientArgs] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedOauthFlowsVarargs(value: Input[String]*): Self = this.set("allowedOauthFlows", js.Array(value :_*))
    @scala.inline
    def setAllowedOauthFlows(value: Input[js.Array[Input[String]]]): Self = this.set("allowedOauthFlows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedOauthFlows: Self = this.set("allowedOauthFlows", js.undefined)
    @scala.inline
    def setAllowedOauthFlowsUserPoolClient(value: Input[Boolean]): Self = this.set("allowedOauthFlowsUserPoolClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedOauthFlowsUserPoolClient: Self = this.set("allowedOauthFlowsUserPoolClient", js.undefined)
    @scala.inline
    def setAllowedOauthScopesVarargs(value: Input[String]*): Self = this.set("allowedOauthScopes", js.Array(value :_*))
    @scala.inline
    def setAllowedOauthScopes(value: Input[js.Array[Input[String]]]): Self = this.set("allowedOauthScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedOauthScopes: Self = this.set("allowedOauthScopes", js.undefined)
    @scala.inline
    def setAnalyticsConfiguration(value: Input[UserPoolClientAnalyticsConfiguration]): Self = this.set("analyticsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsConfiguration: Self = this.set("analyticsConfiguration", js.undefined)
    @scala.inline
    def setCallbackUrlsVarargs(value: Input[String]*): Self = this.set("callbackUrls", js.Array(value :_*))
    @scala.inline
    def setCallbackUrls(value: Input[js.Array[Input[String]]]): Self = this.set("callbackUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackUrls: Self = this.set("callbackUrls", js.undefined)
    @scala.inline
    def setDefaultRedirectUri(value: Input[String]): Self = this.set("defaultRedirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRedirectUri: Self = this.set("defaultRedirectUri", js.undefined)
    @scala.inline
    def setExplicitAuthFlowsVarargs(value: Input[String]*): Self = this.set("explicitAuthFlows", js.Array(value :_*))
    @scala.inline
    def setExplicitAuthFlows(value: Input[js.Array[Input[String]]]): Self = this.set("explicitAuthFlows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitAuthFlows: Self = this.set("explicitAuthFlows", js.undefined)
    @scala.inline
    def setGenerateSecret(value: Input[Boolean]): Self = this.set("generateSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateSecret: Self = this.set("generateSecret", js.undefined)
    @scala.inline
    def setLogoutUrlsVarargs(value: Input[String]*): Self = this.set("logoutUrls", js.Array(value :_*))
    @scala.inline
    def setLogoutUrls(value: Input[js.Array[Input[String]]]): Self = this.set("logoutUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoutUrls: Self = this.set("logoutUrls", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPreventUserExistenceErrors(value: Input[String]): Self = this.set("preventUserExistenceErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventUserExistenceErrors: Self = this.set("preventUserExistenceErrors", js.undefined)
    @scala.inline
    def setReadAttributesVarargs(value: Input[String]*): Self = this.set("readAttributes", js.Array(value :_*))
    @scala.inline
    def setReadAttributes(value: Input[js.Array[Input[String]]]): Self = this.set("readAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadAttributes: Self = this.set("readAttributes", js.undefined)
    @scala.inline
    def setRefreshTokenValidity(value: Input[Double]): Self = this.set("refreshTokenValidity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshTokenValidity: Self = this.set("refreshTokenValidity", js.undefined)
    @scala.inline
    def setSupportedIdentityProvidersVarargs(value: Input[String]*): Self = this.set("supportedIdentityProviders", js.Array(value :_*))
    @scala.inline
    def setSupportedIdentityProviders(value: Input[js.Array[Input[String]]]): Self = this.set("supportedIdentityProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedIdentityProviders: Self = this.set("supportedIdentityProviders", js.undefined)
    @scala.inline
    def setWriteAttributesVarargs(value: Input[String]*): Self = this.set("writeAttributes", js.Array(value :_*))
    @scala.inline
    def setWriteAttributes(value: Input[js.Array[Input[String]]]): Self = this.set("writeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteAttributes: Self = this.set("writeAttributes", js.undefined)
  }
  
}

