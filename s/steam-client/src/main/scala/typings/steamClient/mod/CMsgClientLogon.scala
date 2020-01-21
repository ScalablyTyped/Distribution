package typings.steamClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMsgClientLogon extends js.Object {
  /**
    * Your steam login
    */
  var account_name: String
  /**
    * Steam Guard code. Must be valid if provided, otherwise the logon will fail. Note that Steam Guard codes expire after a short while
    */
  var auth_code: js.UndefOr[String] = js.undefined
  /**
    * SHA1 hash of your sentry file.
    * If not provided, Steam will send you a sentry file through the ClientUpdateMachineAuth message
    * (unless a limit for registered sentries is reached? see https://github.com/seishun/node-steam/issues/178).
    * If no Steam Guard code is provided, the hash must be already registered with this account, otherwise it's ignored.
    * This value will be ignored if you enable 2FA.
    */
  var sha_sentryfile: js.UndefOr[String] = js.undefined
  /**
    * Two-factor authentication code provided by the Steam mobile application. You will have to provide this code every time you log in if your account uses 2FA.
    */
  var two_factor_code: js.UndefOr[String] = js.undefined
}

object CMsgClientLogon {
  @scala.inline
  def apply(
    account_name: String,
    auth_code: String = null,
    sha_sentryfile: String = null,
    two_factor_code: String = null
  ): CMsgClientLogon = {
    val __obj = js.Dynamic.literal(account_name = account_name.asInstanceOf[js.Any])
    if (auth_code != null) __obj.updateDynamic("auth_code")(auth_code.asInstanceOf[js.Any])
    if (sha_sentryfile != null) __obj.updateDynamic("sha_sentryfile")(sha_sentryfile.asInstanceOf[js.Any])
    if (two_factor_code != null) __obj.updateDynamic("two_factor_code")(two_factor_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogon]
  }
}

