package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchSpecificationEphemeralBlockDevice extends StObject {
  
  var deviceName: String
  
  var virtualName: String
}
object SpotFleetRequestLaunchSpecificationEphemeralBlockDevice {
  
  inline def apply(deviceName: String, virtualName: String): SpotFleetRequestLaunchSpecificationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]
  }
  
  extension [Self <: SpotFleetRequestLaunchSpecificationEphemeralBlockDevice](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
