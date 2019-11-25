package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Strings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRealmResponse extends js.Object {
  var accessToken: String
  var expiresIn: Double
  var idToken: String
  var refreshToken: js.UndefOr[String] = js.undefined
  var scope: String
  var tokenType: Bearer
}

object PasswordRealmResponse {
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: Double,
    idToken: String,
    scope: String,
    tokenType: Bearer,
    refreshToken: String = null
  ): PasswordRealmResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRealmResponse]
  }
}

