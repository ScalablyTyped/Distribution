package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinuxParameters extends js.Object {
  
  var capabilities: js.UndefOr[KernelCapabilities] = js.native
  
  var devices: js.UndefOr[js.Array[Device]] = js.native
  
  var initProcessEnabled: js.UndefOr[Boolean] = js.native
}
object LinuxParameters {
  
  @scala.inline
  def apply(): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxParameters]
  }
  
  @scala.inline
  implicit class LinuxParametersOps[Self <: LinuxParameters] (val x: Self) extends AnyVal {
    
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
    def setCapabilities(value: KernelCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[Device]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    
    @scala.inline
    def setInitProcessEnabled(value: Boolean): Self = this.set("initProcessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitProcessEnabled: Self = this.set("initProcessEnabled", js.undefined)
  }
}
