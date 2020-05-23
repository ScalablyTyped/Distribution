package typings.reactNativeGoogleSignin.mod

import typings.reactNativeGoogleSignin.anon.Email
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
  var user: Email
}

object User {
  @scala.inline
  def apply(
    user: Email,
    accessToken: String = null,
    accessTokenExpirationDate: Double = null.asInstanceOf[Double],
    idToken: String = null,
    scopes: js.Array[String] = null,
    serverAuthCode: String = null
  ): User = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any], accessToken = accessToken.asInstanceOf[js.Any], accessTokenExpirationDate = accessTokenExpirationDate.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], serverAuthCode = serverAuthCode.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

