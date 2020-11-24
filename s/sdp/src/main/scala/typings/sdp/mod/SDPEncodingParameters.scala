package typings.sdp.mod

import typings.sdp.anon.Mechanism
import typings.sdp.anon.Ssrc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPEncodingParameters extends js.Object {
  
  var codecPayloadType: js.UndefOr[Double] = js.native
  
  var fec: js.UndefOr[Mechanism] = js.native
  
  var rtx: js.UndefOr[Ssrc] = js.native
  
  var ssrc: Double = js.native
}
object SDPEncodingParameters {
  
  @scala.inline
  def apply(ssrc: Double): SDPEncodingParameters = {
    val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPEncodingParameters]
  }
  
  @scala.inline
  implicit class SDPEncodingParametersOps[Self <: SDPEncodingParameters] (val x: Self) extends AnyVal {
    
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
    def setSsrc(value: Double): Self = this.set("ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecPayloadType(value: Double): Self = this.set("codecPayloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecPayloadType: Self = this.set("codecPayloadType", js.undefined)
    
    @scala.inline
    def setFec(value: Mechanism): Self = this.set("fec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFec: Self = this.set("fec", js.undefined)
    
    @scala.inline
    def setRtx(value: Ssrc): Self = this.set("rtx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtx: Self = this.set("rtx", js.undefined)
  }
}
