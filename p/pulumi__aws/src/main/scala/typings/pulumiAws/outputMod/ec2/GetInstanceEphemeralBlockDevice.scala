package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceEphemeralBlockDevice extends StObject {
  
  /**
    * The physical name of the device.
    */
  var deviceName: String
  
  /**
    * Whether the specified device included in the device mapping was suppressed or not (Boolean).
    */
  var noDevice: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The virtual device name.
    */
  var virtualName: js.UndefOr[String] = js.undefined
}
object GetInstanceEphemeralBlockDevice {
  
  inline def apply(deviceName: String): GetInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceEphemeralBlockDevice]
  }
  
  extension [Self <: GetInstanceEphemeralBlockDevice](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setNoDevice(value: Boolean): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    inline def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
