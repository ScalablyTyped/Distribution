package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmiFromInstanceEphemeralBlockDevice extends js.Object {
  
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: js.UndefOr[Input[String]] = js.native
}
object AmiFromInstanceEphemeralBlockDevice {
  
  @scala.inline
  def apply(): AmiFromInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiFromInstanceEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class AmiFromInstanceEphemeralBlockDeviceOps[Self <: AmiFromInstanceEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceName(value: Input[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setVirtualName(value: Input[String]): Self = this.set("virtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualName: Self = this.set("virtualName", js.undefined)
  }
}
