package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLogoutRequestUrlOptions extends js.Object {
  
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  
  var name_id: js.UndefOr[String] = js.native
  
  var relay_state: js.UndefOr[String] = js.native
  
  var session_index: js.UndefOr[String] = js.native
  
  var sign_get_request: js.UndefOr[Boolean] = js.native
}
object CreateLogoutRequestUrlOptions {
  
  @scala.inline
  def apply(): CreateLogoutRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLogoutRequestUrlOptions]
  }
  
  @scala.inline
  implicit class CreateLogoutRequestUrlOptionsOps[Self <: CreateLogoutRequestUrlOptions] (val x: Self) extends AnyVal {
    
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
    def setAllow_unencrypted_assertion(value: Boolean): Self = this.set("allow_unencrypted_assertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_unencrypted_assertion: Self = this.set("allow_unencrypted_assertion", js.undefined)
    
    @scala.inline
    def setName_id(value: String): Self = this.set("name_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName_id: Self = this.set("name_id", js.undefined)
    
    @scala.inline
    def setRelay_state(value: String): Self = this.set("relay_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelay_state: Self = this.set("relay_state", js.undefined)
    
    @scala.inline
    def setSession_index(value: String): Self = this.set("session_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession_index: Self = this.set("session_index", js.undefined)
    
    @scala.inline
    def setSign_get_request(value: Boolean): Self = this.set("sign_get_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign_get_request: Self = this.set("sign_get_request", js.undefined)
  }
}
