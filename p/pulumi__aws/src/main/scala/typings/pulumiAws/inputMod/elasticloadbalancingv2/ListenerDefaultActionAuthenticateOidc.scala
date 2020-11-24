package typings.pulumiAws.inputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerDefaultActionAuthenticateOidc extends js.Object {
  
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The authorization endpoint of the IdP.
    */
  var authorizationEndpoint: Input[String] = js.native
  
  /**
    * The OAuth 2.0 client identifier.
    */
  var clientId: Input[String] = js.native
  
  /**
    * The OAuth 2.0 client secret.
    */
  var clientSecret: Input[String] = js.native
  
  /**
    * The OIDC issuer identifier of the IdP.
    */
  var issuer: Input[String] = js.native
  
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: js.UndefOr[Input[String]] = js.native
  
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The token endpoint of the IdP.
    */
  var tokenEndpoint: Input[String] = js.native
  
  /**
    * The user info endpoint of the IdP.
    */
  var userInfoEndpoint: Input[String] = js.native
}
object ListenerDefaultActionAuthenticateOidc {
  
  @scala.inline
  def apply(
    authorizationEndpoint: Input[String],
    clientId: Input[String],
    clientSecret: Input[String],
    issuer: Input[String],
    tokenEndpoint: Input[String],
    userInfoEndpoint: Input[String]
  ): ListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
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
    def setAuthorizationEndpoint(value: Input[String]): Self = this.set("authorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: Input[String]): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: Input[String]): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: Input[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpoint(value: Input[String]): Self = this.set("tokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoEndpoint(value: Input[String]): Self = this.set("userInfoEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: Input[StringDictionary[Input[String]]]): Self = this.set("authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationRequestExtraParams: Self = this.set("authenticationRequestExtraParams", js.undefined)
    
    @scala.inline
    def setOnUnauthenticatedRequest(value: Input[String]): Self = this.set("onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnauthenticatedRequest: Self = this.set("onUnauthenticatedRequest", js.undefined)
    
    @scala.inline
    def setScope(value: Input[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSessionCookieName(value: Input[String]): Self = this.set("sessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionCookieName: Self = this.set("sessionCookieName", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Input[Double]): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
  }
}
