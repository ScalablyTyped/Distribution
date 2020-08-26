package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionAuthenticateOidc extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The authorization endpoint of the IdP.
    */
  var authorizationEndpoint: String = js.native
  /**
    * The OAuth 2.0 client identifier.
    */
  var clientId: String = js.native
  /**
    * The OAuth 2.0 client secret.
    */
  var clientSecret: String = js.native
  /**
    * The OIDC issuer identifier of the IdP.
    */
  var issuer: String = js.native
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: String = js.native
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: String = js.native
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: String = js.native
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: Double = js.native
  /**
    * The token endpoint of the IdP.
    */
  var tokenEndpoint: String = js.native
  /**
    * The user info endpoint of the IdP.
    */
  var userInfoEndpoint: String = js.native
}

object ListenerDefaultActionAuthenticateOidc {
  @scala.inline
  def apply(
    authorizationEndpoint: String,
    clientId: String,
    clientSecret: String,
    issuer: String,
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    tokenEndpoint: String,
    userInfoEndpoint: String
  ): ListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionAuthenticateOidc]
  }
  @scala.inline
  implicit class ListenerDefaultActionAuthenticateOidcOps[Self <: ListenerDefaultActionAuthenticateOidc] (val x: Self) extends AnyVal {
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
    def setAuthorizationEndpoint(value: String): Self = this.set("authorizationEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnUnauthenticatedRequest(value: String): Self = this.set("onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionCookieName(value: String): Self = this.set("sessionCookieName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenEndpoint(value: String): Self = this.set("tokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfoEndpoint(value: String): Self = this.set("userInfoEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationRequestExtraParams(value: StringDictionary[String]): Self = this.set("authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationRequestExtraParams: Self = this.set("authenticationRequestExtraParams", js.undefined)
  }
  
}

