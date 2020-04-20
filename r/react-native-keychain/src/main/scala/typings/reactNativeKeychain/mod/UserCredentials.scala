package typings.reactNativeKeychain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserCredentials extends js.Object {
  var password: String
  var username: String
}

object UserCredentials {
  @scala.inline
  def apply(password: String, username: String): UserCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredentials]
  }
}

