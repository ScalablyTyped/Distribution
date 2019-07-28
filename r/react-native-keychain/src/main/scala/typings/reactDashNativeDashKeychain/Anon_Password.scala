package typings.reactDashNativeDashKeychain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: String
  var service: String
  var username: String
}

object Anon_Password {
  @scala.inline
  def apply(password: String, service: String, username: String): Anon_Password = {
    val __obj = js.Dynamic.literal(password = password, service = service, username = username)
  
    __obj.asInstanceOf[Anon_Password]
  }
}

