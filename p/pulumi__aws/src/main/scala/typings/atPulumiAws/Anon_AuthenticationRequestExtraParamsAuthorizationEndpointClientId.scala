package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var authorizationEndpoint: String
  var clientId: String
  var clientSecret: String
  var issuer: String
  var onUnauthenticatedRequest: String
  var scope: String
  var sessionCookieName: String
  var sessionTimeout: Double
  var tokenEndpoint: String
  var userInfoEndpoint: String
}

object Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId {
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
  ): Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint, clientId = clientId, clientSecret = clientSecret, issuer = issuer, onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, tokenEndpoint = tokenEndpoint, userInfoEndpoint = userInfoEndpoint)
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams)
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId]
  }
}

