package typings.saml20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptionsWithPrint extends ValidationOptions {
  
  var audience: js.UndefOr[js.Any] = js.native
  
  var bypassExpiration: js.UndefOr[Boolean] = js.native
  
  var thumbprint: String = js.native
}
object ValidationOptionsWithPrint {
  
  @scala.inline
  def apply(thumbprint: String): ValidationOptionsWithPrint = {
    val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsWithPrint]
  }
  
  @scala.inline
  implicit class ValidationOptionsWithPrintOps[Self <: ValidationOptionsWithPrint] (val x: Self) extends AnyVal {
    
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
    def setThumbprint(value: String): Self = this.set("thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudience(value: js.Any): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setBypassExpiration(value: Boolean): Self = this.set("bypassExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassExpiration: Self = this.set("bypassExpiration", js.undefined)
  }
}
