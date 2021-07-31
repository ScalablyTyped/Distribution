package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmiFromInstanceEphemeralBlockDevice extends StObject {
  
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: String
  
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: String
}
object AmiFromInstanceEphemeralBlockDevice {
  
  @scala.inline
  def apply(deviceName: String, virtualName: String): AmiFromInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class AmiFromInstanceEphemeralBlockDeviceMutableBuilder[Self <: AmiFromInstanceEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
