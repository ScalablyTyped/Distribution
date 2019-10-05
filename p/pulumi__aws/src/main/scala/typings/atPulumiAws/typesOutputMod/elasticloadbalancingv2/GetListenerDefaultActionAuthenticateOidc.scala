package typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerDefaultActionAuthenticateOidc extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[js.Any]
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

object GetListenerDefaultActionAuthenticateOidc {
  @scala.inline
  def apply(
    authenticationRequestExtraParams: StringDictionary[js.Any],
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
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams, authorizationEndpoint = authorizationEndpoint, clientId = clientId, clientSecret = clientSecret, issuer = issuer, onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, tokenEndpoint = tokenEndpoint, userInfoEndpoint = userInfoEndpoint)
  
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateOidc]
  }
}

