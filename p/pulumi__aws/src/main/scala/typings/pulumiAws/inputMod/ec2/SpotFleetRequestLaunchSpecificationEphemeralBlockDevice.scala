package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchSpecificationEphemeralBlockDevice extends StObject {
  
  var deviceName: Input[String] = js.native
  
  var virtualName: Input[String] = js.native
}
object SpotFleetRequestLaunchSpecificationEphemeralBlockDevice {
  
  @scala.inline
  def apply(deviceName: Input[String], virtualName: Input[String]): SpotFleetRequestLaunchSpecificationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceMutableBuilder[Self <: SpotFleetRequestLaunchSpecificationEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualName(value: Input[String]): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
