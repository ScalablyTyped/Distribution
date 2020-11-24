package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationExtensionsClientOutputs extends js.Object {
  
  var appid: js.UndefOr[scala.Boolean] = js.native
  
  var credProps: js.UndefOr[CredentialPropertiesOutput] = js.native
  
  var uvm: js.UndefOr[UvmEntries] = js.native
}
object AuthenticationExtensionsClientOutputs {
  
  @scala.inline
  def apply(): AuthenticationExtensionsClientOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientOutputs]
  }
  
  @scala.inline
  implicit class AuthenticationExtensionsClientOutputsOps[Self <: AuthenticationExtensionsClientOutputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppid(value: scala.Boolean): Self = this.set("appid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppid: Self = this.set("appid", js.undefined)
    
    @scala.inline
    def setCredProps(value: CredentialPropertiesOutput): Self = this.set("credProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredProps: Self = this.set("credProps", js.undefined)
    
    @scala.inline
    def setUvmVarargs(value: UvmEntry*): Self = this.set("uvm", js.Array(value :_*))
    
    @scala.inline
    def setUvm(value: UvmEntries): Self = this.set("uvm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUvm: Self = this.set("uvm", js.undefined)
  }
}
