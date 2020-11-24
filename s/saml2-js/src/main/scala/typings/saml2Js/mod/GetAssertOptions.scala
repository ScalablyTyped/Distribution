package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssertOptions extends js.Object {
  
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  
  var request_body: js.UndefOr[js.Any] = js.native
}
object GetAssertOptions {
  
  @scala.inline
  def apply(): GetAssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssertOptions]
  }
  
  @scala.inline
  implicit class GetAssertOptionsOps[Self <: GetAssertOptions] (val x: Self) extends AnyVal {
    
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
    def setRequest_body(value: js.Any): Self = this.set("request_body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_body: Self = this.set("request_body", js.undefined)
  }
}
