package typings.saslDashScramDashShaDash1.saslDashScramDashShaDash1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[String] = js.undefined
  var clientKey: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var salt: js.UndefOr[String] = js.undefined
  var saltedPassword: js.UndefOr[String] = js.undefined
  var serverKey: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    authzid: String = null,
    clientKey: String = null,
    password: String = null,
    salt: String = null,
    saltedPassword: String = null,
    serverKey: String = null,
    username: String = null
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

