package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinuxParameters extends StObject {
  
  var capabilities: js.UndefOr[KernelCapabilities] = js.undefined
  
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  
  var initProcessEnabled: js.UndefOr[Boolean] = js.undefined
}
object LinuxParameters {
  
  inline def apply(): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxParameters]
  }
  
  extension [Self <: LinuxParameters](x: Self) {
    
    inline def setCapabilities(value: KernelCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    inline def setInitProcessEnabled(value: Boolean): Self = StObject.set(x, "initProcessEnabled", value.asInstanceOf[js.Any])
    
    inline def setInitProcessEnabledUndefined: Self = StObject.set(x, "initProcessEnabled", js.undefined)
  }
}
