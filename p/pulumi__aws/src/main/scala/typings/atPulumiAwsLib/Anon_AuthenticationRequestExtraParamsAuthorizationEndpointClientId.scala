package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var authorizationEndpoint: java.lang.String
  var clientId: java.lang.String
  var clientSecret: java.lang.String
  var issuer: java.lang.String
  var onUnauthenticatedRequest: java.lang.String
  var scope: java.lang.String
  var sessionCookieName: java.lang.String
  var sessionTimeout: scala.Double
  var tokenEndpoint: java.lang.String
  var userInfoEndpoint: java.lang.String
}

object Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId {
  @scala.inline
  def apply(
    authorizationEndpoint: java.lang.String,
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    issuer: java.lang.String,
    onUnauthenticatedRequest: java.lang.String,
    scope: java.lang.String,
    sessionCookieName: java.lang.String,
    sessionTimeout: scala.Double,
    tokenEndpoint: java.lang.String,
    userInfoEndpoint: java.lang.String,
    authenticationRequestExtraParams: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint, clientId = clientId, clientSecret = clientSecret, issuer = issuer, onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, tokenEndpoint = tokenEndpoint, userInfoEndpoint = userInfoEndpoint)
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams)
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId]
  }
}

