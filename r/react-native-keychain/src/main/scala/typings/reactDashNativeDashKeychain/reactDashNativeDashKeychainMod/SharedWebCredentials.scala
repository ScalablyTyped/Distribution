package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWebCredentials extends js.Object {
  var password: String
  var server: String
  var username: String
}

object SharedWebCredentials {
  @scala.inline
  def apply(password: String, server: String, username: String): SharedWebCredentials = {
    val __obj = js.Dynamic.literal(password = password, server = server, username = username)
  
    __obj.asInstanceOf[SharedWebCredentials]
  }
}

