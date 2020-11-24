package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLogoutResponseUrlOptions extends js.Object {
  
  var in_response_to: js.UndefOr[String] = js.native
  
  var relay_state: js.UndefOr[String] = js.native
  
  var sign_get_request: js.UndefOr[Boolean] = js.native
}
object CreateLogoutResponseUrlOptions {
  
  @scala.inline
  def apply(): CreateLogoutResponseUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLogoutResponseUrlOptions]
  }
  
  @scala.inline
  implicit class CreateLogoutResponseUrlOptionsOps[Self <: CreateLogoutResponseUrlOptions] (val x: Self) extends AnyVal {
    
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
    def setIn_response_to(value: String): Self = this.set("in_response_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_response_to: Self = this.set("in_response_to", js.undefined)
    
    @scala.inline
    def setRelay_state(value: String): Self = this.set("relay_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelay_state: Self = this.set("relay_state", js.undefined)
    
    @scala.inline
    def setSign_get_request(value: Boolean): Self = this.set("sign_get_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign_get_request: Self = this.set("sign_get_request", js.undefined)
  }
}
