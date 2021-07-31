package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationEphemeralBlockDevice extends StObject {
  
  var deviceName: String
  
  var virtualName: String
}
object LaunchConfigurationEphemeralBlockDevice {
  
  @scala.inline
  def apply(deviceName: String, virtualName: String): LaunchConfigurationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class LaunchConfigurationEphemeralBlockDeviceMutableBuilder[Self <: LaunchConfigurationEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
