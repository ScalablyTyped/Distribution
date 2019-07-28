package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParams extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[js.Any]
  var onUnauthenticatedRequest: String
  var scope: String
  var sessionCookieName: String
  var sessionTimeout: Double
  var userPoolArn: String
  var userPoolClientId: String
  var userPoolDomain: String
}

object Anon_AuthenticationRequestExtraParams {
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
  ): Anon_AuthenticationRequestExtraParams = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams, onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, userPoolArn = userPoolArn, userPoolClientId = userPoolClientId, userPoolDomain = userPoolDomain)
  
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParams]
  }
}

