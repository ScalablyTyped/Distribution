package typings.steam.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogonOptions extends js.Object {
  var accountName: String
  var authCode: js.UndefOr[String] = js.undefined
  var password: String
  var shaSentryfile: js.UndefOr[String] = js.undefined
}

object LogonOptions {
  @scala.inline
  def apply(accountName: String, password: String, authCode: String = null, shaSentryfile: String = null): LogonOptions = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    if (authCode != null) __obj.updateDynamic("authCode")(authCode.asInstanceOf[js.Any])
    if (shaSentryfile != null) __obj.updateDynamic("shaSentryfile")(shaSentryfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogonOptions]
  }
}

