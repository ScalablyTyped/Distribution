package typings
package reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserCredentials extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object UserCredentials {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): UserCredentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[UserCredentials]
  }
}

