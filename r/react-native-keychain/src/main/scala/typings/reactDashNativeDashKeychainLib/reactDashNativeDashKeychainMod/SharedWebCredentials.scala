package typings
package reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWebCredentials extends js.Object {
  var password: java.lang.String
  var server: java.lang.String
  var username: java.lang.String
}

object SharedWebCredentials {
  @scala.inline
  def apply(password: java.lang.String, server: java.lang.String, username: java.lang.String): SharedWebCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("server")(server)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SharedWebCredentials]
  }
}

