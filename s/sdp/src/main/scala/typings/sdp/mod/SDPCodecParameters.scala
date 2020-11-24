package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPCodecParameters extends js.Object {
  
  var channels: Double = js.native
  
  var clockRate: Double = js.native
  
  var maxptime: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var numChannels: js.UndefOr[Double] = js.native
  
  var payloadType: Double = js.native
  
  var preferredPayloadType: js.UndefOr[Double] = js.native
}
object SDPCodecParameters {
  
  @scala.inline
  def apply(channels: Double, clockRate: Double, name: String, payloadType: Double): SDPCodecParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPCodecParameters]
  }
  
  @scala.inline
  implicit class SDPCodecParametersOps[Self <: SDPCodecParameters] (val x: Self) extends AnyVal {
    
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
    def setChannels(value: Double): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: Double): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadType(value: Double): Self = this.set("payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxptime(value: Double): Self = this.set("maxptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxptime: Self = this.set("maxptime", js.undefined)
    
    @scala.inline
    def setNumChannels(value: Double): Self = this.set("numChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumChannels: Self = this.set("numChannels", js.undefined)
    
    @scala.inline
    def setPreferredPayloadType(value: Double): Self = this.set("preferredPayloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredPayloadType: Self = this.set("preferredPayloadType", js.undefined)
  }
}
