package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationExtensionsClientInputs extends js.Object {
  
  var appid: js.UndefOr[java.lang.String] = js.native
  
  var appidExclude: js.UndefOr[java.lang.String] = js.native
  
  var credProps: js.UndefOr[scala.Boolean] = js.native
  
  var uvm: js.UndefOr[scala.Boolean] = js.native
}
object AuthenticationExtensionsClientInputs {
  
  @scala.inline
  def apply(): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
  
  @scala.inline
  implicit class AuthenticationExtensionsClientInputsOps[Self <: AuthenticationExtensionsClientInputs] (val x: Self) extends AnyVal {
    
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
    def setAppid(value: java.lang.String): Self = this.set("appid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppid: Self = this.set("appid", js.undefined)
    
    @scala.inline
    def setAppidExclude(value: java.lang.String): Self = this.set("appidExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppidExclude: Self = this.set("appidExclude", js.undefined)
    
    @scala.inline
    def setCredProps(value: scala.Boolean): Self = this.set("credProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredProps: Self = this.set("credProps", js.undefined)
    
    @scala.inline
    def setUvm(value: scala.Boolean): Self = this.set("uvm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUvm: Self = this.set("uvm", js.undefined)
  }
}
