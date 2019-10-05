package typings.atPulumiAws.typesOutputMod.alb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerDefaultActionAuthenticateCognito extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[js.Any]
  var onUnauthenticatedRequest: String
  var scope: String
  var sessionCookieName: String
  var sessionTimeout: Double
  var userPoolArn: String
  var userPoolClientId: String
  var userPoolDomain: String
}

object GetListenerDefaultActionAuthenticateCognito {
  @scala.inline
  def apply(
    authenticationRequestExtraParams: StringDictionary[js.Any],
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String
  ): GetListenerDefaultActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams, onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, userPoolArn = userPoolArn, userPoolClientId = userPoolClientId, userPoolDomain = userPoolDomain)
  
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateCognito]
  }
}

