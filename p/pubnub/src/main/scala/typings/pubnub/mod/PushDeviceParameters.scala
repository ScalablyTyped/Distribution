package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushDeviceParameters extends js.Object {
  
  var device: String = js.native
  
  var pushGateway: String = js.native
}
object PushDeviceParameters {
  
  @scala.inline
  def apply(device: String, pushGateway: String): PushDeviceParameters = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushDeviceParameters]
  }
  
  @scala.inline
  implicit class PushDeviceParametersOps[Self <: PushDeviceParameters] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushGateway(value: String): Self = this.set("pushGateway", value.asInstanceOf[js.Any])
  }
}
