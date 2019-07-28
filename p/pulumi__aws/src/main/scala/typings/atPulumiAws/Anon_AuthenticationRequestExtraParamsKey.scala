package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsKey extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onUnauthenticatedRequest: String
  var scope: String
  var sessionCookieName: String
  var sessionTimeout: Double
  var userPoolArn: String
  var userPoolClientId: String
  var userPoolDomain: String
}

object Anon_AuthenticationRequestExtraParamsKey {
  @scala.inline
  def apply(
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String,
    authenticationRequestExtraParams: StringDictionary[js.Any] = null
  ): Anon_AuthenticationRequestExtraParamsKey = {
    val __obj = js.Dynamic.literal(onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, userPoolArn = userPoolArn, userPoolClientId = userPoolClientId, userPoolDomain = userPoolDomain)
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams)
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsKey]
  }
}

