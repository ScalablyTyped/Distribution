package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmiFromInstanceEphemeralBlockDevice extends StObject {
  
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: js.UndefOr[Input[String]] = js.undefined
}
object AmiFromInstanceEphemeralBlockDevice {
  
  inline def apply(): AmiFromInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiFromInstanceEphemeralBlockDevice]
  }
  
  extension [Self <: AmiFromInstanceEphemeralBlockDevice](x: Self) {
    
    inline def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setVirtualName(value: Input[String]): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
