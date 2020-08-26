package typings.steamClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMsgClientLogonLoginKey extends CMsgClientLogon {
  /**
    * Alternative to password
    */
  var login_key: String = js.native
}

object CMsgClientLogonLoginKey {
  @scala.inline
  def apply(account_name: String, login_key: String): CMsgClientLogonLoginKey = {
    val __obj = js.Dynamic.literal(account_name = account_name.asInstanceOf[js.Any], login_key = login_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogonLoginKey]
  }
  @scala.inline
  implicit class CMsgClientLogonLoginKeyOps[Self <: CMsgClientLogonLoginKey] (val x: Self) extends AnyVal {
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
    def setLogin_key(value: String): Self = this.set("login_key", value.asInstanceOf[js.Any])
  }
  
}

