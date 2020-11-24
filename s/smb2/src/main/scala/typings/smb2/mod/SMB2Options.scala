package typings.smb2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMB2Options extends js.Object {
  
  var autoCloseTimeout: js.UndefOr[Double] = js.native
  
  var domain: String = js.native
  
  var packetConcurrency: js.UndefOr[Double] = js.native
  
  var password: String = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var share: String = js.native
  
  var username: String = js.native
}
object SMB2Options {
  
  @scala.inline
  def apply(domain: String, password: String, share: String, username: String): SMB2Options = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMB2Options]
  }
  
  @scala.inline
  implicit class SMB2OptionsOps[Self <: SMB2Options] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare(value: String): Self = this.set("share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseTimeout(value: Double): Self = this.set("autoCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseTimeout: Self = this.set("autoCloseTimeout", js.undefined)
    
    @scala.inline
    def setPacketConcurrency(value: Double): Self = this.set("packetConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketConcurrency: Self = this.set("packetConcurrency", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
