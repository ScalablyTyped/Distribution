package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationEphemeralBlockDevice extends StObject {
  
  var deviceName: Input[String]
  
  var virtualName: Input[String]
}
object LaunchConfigurationEphemeralBlockDevice {
  
  inline def apply(deviceName: Input[String], virtualName: Input[String]): LaunchConfigurationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationEphemeralBlockDevice]
  }
  
  extension [Self <: LaunchConfigurationEphemeralBlockDevice](x: Self) {
    
    inline def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setVirtualName(value: Input[String]): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
