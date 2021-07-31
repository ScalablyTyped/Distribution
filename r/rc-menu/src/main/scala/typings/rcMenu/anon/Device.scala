package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var device: Boolean
  
  var ipod: js.Any
  
  var phone: Boolean
  
  var tablet: Boolean
}
object Device {
  
  @scala.inline
  def apply(device: Boolean, ipod: js.Any, phone: Boolean, tablet: Boolean): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], ipod = ipod.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpod(value: js.Any): Self = StObject.set(x, "ipod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
  }
}
