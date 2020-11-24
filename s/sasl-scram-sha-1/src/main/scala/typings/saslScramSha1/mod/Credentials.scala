package typings.saslScramSha1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
  var authzid: js.UndefOr[String] = js.native
  
  var clientKey: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var salt: js.UndefOr[String] = js.native
  
  var saltedPassword: js.UndefOr[String] = js.native
  
  var serverKey: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object Credentials {
  
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    
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
    def setAuthzid(value: String): Self = this.set("authzid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthzid: Self = this.set("authzid", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setSaltedPassword(value: String): Self = this.set("saltedPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltedPassword: Self = this.set("saltedPassword", js.undefined)
    
    @scala.inline
    def setServerKey(value: String): Self = this.set("serverKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerKey: Self = this.set("serverKey", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
