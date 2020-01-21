package typings.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionAuthenticateOidc extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[js.Any]] = js.native
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
    userInfoEndpoint: String,
    authenticationRequestExtraParams: StringDictionary[js.Any] = null
  ): ListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionAuthenticateOidc]
  }
}

