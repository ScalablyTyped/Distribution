package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMsgClientLogonLoginKey extends CMsgClientLogon {
  /**
    * Alternative to password
    */
  var login_key: java.lang.String
}

object CMsgClientLogonLoginKey {
  @scala.inline
  def apply(
    account_name: java.lang.String,
    login_key: java.lang.String,
    auth_code: java.lang.String = null,
    sha_sentryfile: java.lang.String = null,
    two_factor_code: java.lang.String = null
  ): CMsgClientLogonLoginKey = {
    val __obj = js.Dynamic.literal(account_name = account_name, login_key = login_key)
    if (auth_code != null) __obj.updateDynamic("auth_code")(auth_code)
    if (sha_sentryfile != null) __obj.updateDynamic("sha_sentryfile")(sha_sentryfile)
    if (two_factor_code != null) __obj.updateDynamic("two_factor_code")(two_factor_code)
    __obj.asInstanceOf[CMsgClientLogonLoginKey]
  }
}

