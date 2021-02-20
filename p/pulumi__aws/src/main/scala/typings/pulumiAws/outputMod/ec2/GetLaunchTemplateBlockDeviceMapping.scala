package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateBlockDeviceMapping extends StObject {
  
  var deviceName: String = js.native
  
  var ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb] = js.native
  
  var noDevice: String = js.native
  
  var virtualName: String = js.native
}
object GetLaunchTemplateBlockDeviceMapping {
  
  @scala.inline
  def apply(
    deviceName: String,
    ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb],
    noDevice: String,
    virtualName: String
  ): GetLaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], ebs = ebs.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMapping]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateBlockDeviceMappingMutableBuilder[Self <: GetLaunchTemplateBlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbs(value: js.Array[GetLaunchTemplateBlockDeviceMappingEb]): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsVarargs(value: GetLaunchTemplateBlockDeviceMappingEb*): Self = StObject.set(x, "ebs", js.Array(value :_*))
    
    @scala.inline
    def setNoDevice(value: String): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
