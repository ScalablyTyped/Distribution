package typings.steamClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMsgClientLogon extends js.Object {
  /**
    * Your steam login
    */
  var account_name: String = js.native
  /**
    * Steam Guard code. Must be valid if provided, otherwise the logon will fail. Note that Steam Guard codes expire after a short while
    */
  var auth_code: js.UndefOr[String] = js.native
  /**
    * SHA1 hash of your sentry file.
    * If not provided, Steam will send you a sentry file through the ClientUpdateMachineAuth message
    * (unless a limit for registered sentries is reached? see https://github.com/seishun/node-steam/issues/178).
    * If no Steam Guard code is provided, the hash must be already registered with this account, otherwise it's ignored.
    * This value will be ignored if you enable 2FA.
    */
  var sha_sentryfile: js.UndefOr[String] = js.native
  /**
    * Two-factor authentication code provided by the Steam mobile application. You will have to provide this code every time you log in if your account uses 2FA.
    */
  var two_factor_code: js.UndefOr[String] = js.native
}

object CMsgClientLogon {
  @scala.inline
  def apply(account_name: String): CMsgClientLogon = {
    val __obj = js.Dynamic.literal(account_name = account_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogon]
  }
  @scala.inline
  implicit class CMsgClientLogonOps[Self <: CMsgClientLogon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount_name(value: String): Self = this.set("account_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth_code(value: String): Self = this.set("auth_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_code: Self = this.set("auth_code", js.undefined)
    @scala.inline
    def setSha_sentryfile(value: String): Self = this.set("sha_sentryfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha_sentryfile: Self = this.set("sha_sentryfile", js.undefined)
    @scala.inline
    def setTwo_factor_code(value: String): Self = this.set("two_factor_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwo_factor_code: Self = this.set("two_factor_code", js.undefined)
  }
  
}

