package typings.pulumiAws.outputMod.opsworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEphemeralBlockDevice extends StObject {
  
  var deviceName: String
  
  var virtualName: String
}
object InstanceEphemeralBlockDevice {
  
  @scala.inline
  def apply(deviceName: String, virtualName: String): InstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class InstanceEphemeralBlockDeviceMutableBuilder[Self <: InstanceEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
