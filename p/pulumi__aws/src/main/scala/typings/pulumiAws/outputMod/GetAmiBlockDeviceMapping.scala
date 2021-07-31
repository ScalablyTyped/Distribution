package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAmiBlockDeviceMapping extends StObject {
  
  var deviceName: String
  
  var ebs: StringDictionary[String]
  
  var noDevice: String
  
  var virtualName: String
}
object GetAmiBlockDeviceMapping {
  
  @scala.inline
  def apply(deviceName: String, ebs: StringDictionary[String], noDevice: String, virtualName: String): GetAmiBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], ebs = ebs.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiBlockDeviceMapping]
  }
  
  @scala.inline
  implicit class GetAmiBlockDeviceMappingMutableBuilder[Self <: GetAmiBlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbs(value: StringDictionary[String]): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDevice(value: String): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
