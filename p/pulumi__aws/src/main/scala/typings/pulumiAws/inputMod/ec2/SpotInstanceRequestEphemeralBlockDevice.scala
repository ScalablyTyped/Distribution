package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotInstanceRequestEphemeralBlockDevice extends StObject {
  
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: Input[String]
  
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[Input[String]] = js.undefined
}
object SpotInstanceRequestEphemeralBlockDevice {
  
  inline def apply(deviceName: Input[String]): SpotInstanceRequestEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestEphemeralBlockDevice]
  }
  
  extension [Self <: SpotInstanceRequestEphemeralBlockDevice](x: Self) {
    
    inline def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setNoDevice(value: Input[Boolean]): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    inline def setVirtualName(value: Input[String]): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
