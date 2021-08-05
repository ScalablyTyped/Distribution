package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateBlockDeviceMapping extends StObject {
  
  var deviceName: String
  
  var ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb]
  
  var noDevice: String
  
  var virtualName: String
}
object GetLaunchTemplateBlockDeviceMapping {
  
  inline def apply(
    deviceName: String,
    ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb],
    noDevice: String,
    virtualName: String
  ): GetLaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], ebs = ebs.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMapping]
  }
  
  extension [Self <: GetLaunchTemplateBlockDeviceMapping](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setEbs(value: js.Array[GetLaunchTemplateBlockDeviceMappingEb]): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsVarargs(value: GetLaunchTemplateBlockDeviceMappingEb*): Self = StObject.set(x, "ebs", js.Array(value :_*))
    
    inline def setNoDevice(value: String): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    inline def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
