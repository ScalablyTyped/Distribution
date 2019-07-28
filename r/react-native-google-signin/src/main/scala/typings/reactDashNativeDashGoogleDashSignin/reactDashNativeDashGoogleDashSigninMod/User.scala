package typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod

import typings.reactDashNativeDashGoogleDashSignin.Anon_Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var accessToken: String | Null
  /**
    * Deprecated
    */
  var accessTokenExpirationDate: Double | Null
  var idToken: String | Null
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Not null only if a valid webClientId and offlineAccess: true was
    * specified in configure().
    */
  var serverAuthCode: String | Null
  var user: Anon_Email
}

object User {
  @scala.inline
  def apply(
    user: Anon_Email,
    accessToken: String = null,
    accessTokenExpirationDate: Int | Double = null,
    idToken: String = null,
    scopes: js.Array[String] = null,
    serverAuthCode: String = null
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

