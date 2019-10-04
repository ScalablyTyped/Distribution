package typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleActionAuthenticateOidc extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The authorization endpoint of the IdP.
    */
  var authorizationEndpoint: String
  /**
    * The OAuth 2.0 client identifier.
    */
  var clientId: String
  /**
    * The OAuth 2.0 client secret.
    */
  var clientSecret: String
  /**
    * The OIDC issuer identifier of the IdP.
    */
  var issuer: String
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: String
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: String
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: String
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: Double
  /**
    * The token endpoint of the IdP.
    */
  var tokenEndpoint: String
  /**
    * The user info endpoint of the IdP.
    */
  var userInfoEndpoint: String
}

object ListenerRuleActionAuthenticateOidc {
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
  ): ListenerRuleActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint, clientId = clientId, clientSecret = clientSecret, issuer = issuer, onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, tokenEndpoint = tokenEndpoint, userInfoEndpoint = userInfoEndpoint)
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams)
    __obj.asInstanceOf[ListenerRuleActionAuthenticateOidc]
  }
}

