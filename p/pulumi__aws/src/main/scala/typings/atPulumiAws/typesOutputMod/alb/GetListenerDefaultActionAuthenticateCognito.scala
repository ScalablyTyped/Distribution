package typings.atPulumiAws.typesOutputMod.alb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionAuthenticateCognito extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[js.Any] = js.native
  var onUnauthenticatedRequest: String = js.native
  var scope: String = js.native
  var sessionCookieName: String = js.native
  var sessionTimeout: Double = js.native
  var userPoolArn: String = js.native
  var userPoolClientId: String = js.native
  var userPoolDomain: String = js.native
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
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateCognito]
  }
}

