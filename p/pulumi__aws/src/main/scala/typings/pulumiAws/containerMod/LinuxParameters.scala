package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinuxParameters extends StObject {
  
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
  implicit class LinuxParametersMutableBuilder[Self <: LinuxParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: KernelCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setInitProcessEnabled(value: Boolean): Self = StObject.set(x, "initProcessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitProcessEnabledUndefined: Self = StObject.set(x, "initProcessEnabled", js.undefined)
  }
}
