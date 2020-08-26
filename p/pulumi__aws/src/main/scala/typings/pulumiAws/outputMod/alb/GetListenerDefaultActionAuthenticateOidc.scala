package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionAuthenticateOidc extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[String] = js.native
  var authorizationEndpoint: String = js.native
  var clientId: String = js.native
  var clientSecret: String = js.native
  var issuer: String = js.native
  var onUnauthenticatedRequest: String = js.native
  var scope: String = js.native
  var sessionCookieName: String = js.native
  var sessionTimeout: Double = js.native
  var tokenEndpoint: String = js.native
  var userInfoEndpoint: String = js.native
}

object GetListenerDefaultActionAuthenticateOidc {
  @scala.inline
  def apply(
    authenticationRequestExtraParams: StringDictionary[String],
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
  ): GetListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams.asInstanceOf[js.Any], authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateOidc]
  }
  @scala.inline
  implicit class GetListenerDefaultActionAuthenticateOidcOps[Self <: GetListenerDefaultActionAuthenticateOidc] (val x: Self) extends AnyVal {
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
    def setAuthenticationRequestExtraParams(value: StringDictionary[String]): Self = this.set("authenticationRequestExtraParams", value.asInstanceOf[js.Any])
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
  }
  
}

