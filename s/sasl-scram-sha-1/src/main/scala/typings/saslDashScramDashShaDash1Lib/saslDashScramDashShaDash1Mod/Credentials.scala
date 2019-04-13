package typings
package saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[java.lang.String] = js.undefined
  var clientKey: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var salt: js.UndefOr[java.lang.String] = js.undefined
  var saltedPassword: js.UndefOr[java.lang.String] = js.undefined
  var serverKey: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    authzid: java.lang.String = null,
    clientKey: java.lang.String = null,
    password: java.lang.String = null,
    salt: java.lang.String = null,
    saltedPassword: java.lang.String = null,
    serverKey: java.lang.String = null,
    username: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (authzid != null) __obj.updateDynamic("authzid")(authzid)
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey)
    if (password != null) __obj.updateDynamic("password")(password)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    if (saltedPassword != null) __obj.updateDynamic("saltedPassword")(saltedPassword)
    if (serverKey != null) __obj.updateDynamic("serverKey")(serverKey)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Credentials]
  }
}

