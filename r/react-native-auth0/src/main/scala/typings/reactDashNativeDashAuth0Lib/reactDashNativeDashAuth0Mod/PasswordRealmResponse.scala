package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRealmResponse extends js.Object {
  var accessToken: java.lang.String
  var expiresIn: scala.Double
  var idToken: java.lang.String
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var scope: java.lang.String
  var tokenType: reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0LibStrings.Bearer
}

object PasswordRealmResponse {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    expiresIn: scala.Double,
    idToken: java.lang.String,
    scope: java.lang.String,
    tokenType: reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0LibStrings.Bearer,
    refreshToken: java.lang.String = null
  ): PasswordRealmResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expiresIn = expiresIn, idToken = idToken, scope = scope, tokenType = tokenType)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[PasswordRealmResponse]
  }
}

