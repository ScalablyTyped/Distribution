package typings.realm.Realm.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payload sent when authenticating using the [Email/Password Provider](https://docs.mongodb.com/realm/authentication/email-password/).
  */
@js.native
trait EmailPasswordPayload extends js.Object {
  
  /**
    * The end-users password.
    */
  var password: String = js.native
  
  /**
    * The end-users username.
    * Note: This currently has to be an email.
    */
  var username: String = js.native
}
object EmailPasswordPayload {
  
  @scala.inline
  def apply(password: String, username: String): EmailPasswordPayload = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailPasswordPayload]
  }
  
  @scala.inline
  implicit class EmailPasswordPayloadOps[Self <: EmailPasswordPayload] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
