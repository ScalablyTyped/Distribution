package typings
package reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var accessToken: java.lang.String | scala.Null
  /**
    * Deprecated
    */
  var accessTokenExpirationDate: scala.Double | scala.Null
  var idToken: java.lang.String | scala.Null
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Not null only if a valid webClientId and offlineAccess: true was
    * specified in configure().
    */
  var serverAuthCode: java.lang.String | scala.Null
  var user: reactDashNativeDashGoogleDashSigninLib.Anon_Email
}

object User {
  @scala.inline
  def apply(
    user: reactDashNativeDashGoogleDashSigninLib.Anon_Email,
    accessToken: java.lang.String = null,
    accessTokenExpirationDate: scala.Int | scala.Double = null,
    idToken: java.lang.String = null,
    scopes: js.Array[java.lang.String] = null,
    serverAuthCode: java.lang.String = null
  ): User = {
    val __obj = js.Dynamic.literal(user = user)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (accessTokenExpirationDate != null) __obj.updateDynamic("accessTokenExpirationDate")(accessTokenExpirationDate.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (serverAuthCode != null) __obj.updateDynamic("serverAuthCode")(serverAuthCode)
    __obj.asInstanceOf[User]
  }
}

