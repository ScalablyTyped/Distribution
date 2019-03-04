package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsKey extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onUnauthenticatedRequest: java.lang.String
  var scope: java.lang.String
  var sessionCookieName: java.lang.String
  var sessionTimeout: scala.Double
  var userPoolArn: java.lang.String
  var userPoolClientId: java.lang.String
  var userPoolDomain: java.lang.String
}

object Anon_AuthenticationRequestExtraParamsKey {
  @scala.inline
  def apply(
    onUnauthenticatedRequest: java.lang.String,
    scope: java.lang.String,
    sessionCookieName: java.lang.String,
    sessionTimeout: scala.Double,
    userPoolArn: java.lang.String,
    userPoolClientId: java.lang.String,
    userPoolDomain: java.lang.String,
    authenticationRequestExtraParams: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_AuthenticationRequestExtraParamsKey = {
    val __obj = js.Dynamic.literal(onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, userPoolArn = userPoolArn, userPoolClientId = userPoolClientId, userPoolDomain = userPoolDomain)
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams)
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsKey]
  }
}

