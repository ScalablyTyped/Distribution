package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceEphemeralBlockDevice extends StObject {
  
  /**
    * The physical name of the device.
    */
  var deviceName: String = js.native
  
  /**
    * Whether the specified device included in the device mapping was suppressed or not (Boolean).
    */
  var noDevice: js.UndefOr[Boolean] = js.native
  
  /**
    * The virtual device name.
    */
  var virtualName: js.UndefOr[String] = js.native
}
object GetInstanceEphemeralBlockDevice {
  
  @scala.inline
  def apply(deviceName: String): GetInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class GetInstanceEphemeralBlockDeviceMutableBuilder[Self <: GetInstanceEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDevice(value: Boolean): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
