package typings.smtpServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMTPServerAuthenticationResponse extends js.Object {
  
  /**
    * an object to return if XOAUTH2 authentication failed (do not set the error object in this case).
    * This value is serialized to JSON and base64 encoded automatically, so you can just return the object
    */
  var data: js.UndefOr[js.Object] = js.native
  
  /**
    * can be any value - if this is set then the user is considered logged in
    * and this value is used later with the session data to identify the user.
    * If this value is empty, then the authentication is considered failed
    */
  var user: js.UndefOr[js.Any] = js.native
}
object SMTPServerAuthenticationResponse {
  
  @scala.inline
  def apply(): SMTPServerAuthenticationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMTPServerAuthenticationResponse]
  }
  
  @scala.inline
  implicit class SMTPServerAuthenticationResponseOps[Self <: SMTPServerAuthenticationResponse] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setUser(value: js.Any): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
