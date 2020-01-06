package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionAuthenticateOidc extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[js.Any] = js.native
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
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams.asInstanceOf[js.Any], authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateOidc]
  }
}

