package typings
package saslDashPlainLib.saslDashPlainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var username: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String, authzid: java.lang.String = null): Credentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (authzid != null) __obj.updateDynamic("authzid")(authzid)
    __obj.asInstanceOf[Credentials]
  }
}

