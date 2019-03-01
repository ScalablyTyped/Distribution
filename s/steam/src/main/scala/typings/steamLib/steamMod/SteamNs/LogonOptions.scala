package typings
package steamLib.steamMod.SteamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogonOptions extends js.Object {
  var accountName: java.lang.String
  var authCode: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var shaSentryfile: js.UndefOr[java.lang.String] = js.undefined
}

object LogonOptions {
  @scala.inline
  def apply(
    accountName: java.lang.String,
    password: java.lang.String,
    authCode: java.lang.String = null,
    shaSentryfile: java.lang.String = null
  ): LogonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountName")(accountName)
    __obj.updateDynamic("password")(password)
    if (authCode != null) __obj.updateDynamic("authCode")(authCode)
    if (shaSentryfile != null) __obj.updateDynamic("shaSentryfile")(shaSentryfile)
    __obj.asInstanceOf[LogonOptions]
  }
}

