package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchConfigurationEphemeralBlockDevice extends StObject {
  
  /**
    * The Name of the device.
    */
  var deviceName: String
  
  /**
    * The Virtual Name of the device.
    */
  var virtualName: String
}
object GetLaunchConfigurationEphemeralBlockDevice {
  
  inline def apply(deviceName: String, virtualName: String): GetLaunchConfigurationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationEphemeralBlockDevice]
  }
  
  extension [Self <: GetLaunchConfigurationEphemeralBlockDevice](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
