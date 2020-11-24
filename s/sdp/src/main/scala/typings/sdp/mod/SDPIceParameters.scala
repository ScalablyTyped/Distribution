package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPIceParameters extends js.Object {
  
  var iceLite: js.UndefOr[Boolean] = js.native
  
  var password: String = js.native
  
  var usernameFragment: String = js.native
}
object SDPIceParameters {
  
  @scala.inline
  def apply(password: String, usernameFragment: String): SDPIceParameters = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], usernameFragment = usernameFragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPIceParameters]
  }
  
  @scala.inline
  implicit class SDPIceParametersOps[Self <: SDPIceParameters] (val x: Self) extends AnyVal {
    
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
    def setUsernameFragment(value: String): Self = this.set("usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceLite(value: Boolean): Self = this.set("iceLite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceLite: Self = this.set("iceLite", js.undefined)
  }
}
