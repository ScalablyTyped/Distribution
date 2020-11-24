package typings.steam.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogonOptions extends js.Object {
  
  var accountName: String = js.native
  
  var authCode: js.UndefOr[String] = js.native
  
  var password: String = js.native
  
  var shaSentryfile: js.UndefOr[String] = js.native
}
object LogonOptions {
  
  @scala.inline
  def apply(accountName: String, password: String): LogonOptions = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogonOptions]
  }
  
  @scala.inline
  implicit class LogonOptionsOps[Self <: LogonOptions] (val x: Self) extends AnyVal {
    
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthCode(value: String): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthCode: Self = this.set("authCode", js.undefined)
    
    @scala.inline
    def setShaSentryfile(value: String): Self = this.set("shaSentryfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShaSentryfile: Self = this.set("shaSentryfile", js.undefined)
  }
}
