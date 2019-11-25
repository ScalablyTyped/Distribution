package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMsgClientLogonLoginKey extends CMsgClientLogon {
  /**
    * Alternative to password
    */
  var login_key: String
}

object CMsgClientLogonLoginKey {
  @scala.inline
  def apply(
    account_name: String,
    login_key: String,
    auth_code: String = null,
    sha_sentryfile: String = null,
    two_factor_code: String = null
  ): CMsgClientLogonLoginKey = {
    val __obj = js.Dynamic.literal(account_name = account_name.asInstanceOf[js.Any], login_key = login_key.asInstanceOf[js.Any])
    if (auth_code != null) __obj.updateDynamic("auth_code")(auth_code.asInstanceOf[js.Any])
    if (sha_sentryfile != null) __obj.updateDynamic("sha_sentryfile")(sha_sentryfile.asInstanceOf[js.Any])
    if (two_factor_code != null) __obj.updateDynamic("two_factor_code")(two_factor_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogonLoginKey]
  }
}

