package typings
package reactDashNativeDashKeychainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: java.lang.String
  var service: java.lang.String
  var username: java.lang.String
}

object Anon_Password {
  @scala.inline
  def apply(password: java.lang.String, service: java.lang.String, username: java.lang.String): Anon_Password = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Password]
  }
}

