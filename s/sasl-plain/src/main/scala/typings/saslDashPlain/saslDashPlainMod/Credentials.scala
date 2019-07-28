package typings.saslDashPlain.saslDashPlainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[String] = js.undefined
  var password: String
  var username: String
}

object Credentials {
  @scala.inline
  def apply(password: String, username: String, authzid: String = null): Credentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (authzid != null) __obj.updateDynamic("authzid")(authzid)
    __obj.asInstanceOf[Credentials]
  }
}

