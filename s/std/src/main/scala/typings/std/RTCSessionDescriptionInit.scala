package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSessionDescriptionInit extends js.Object {
  
  var sdp: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[RTCSdpType] = js.native
}
object RTCSessionDescriptionInit {
  
  @scala.inline
  def apply(): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
  
  @scala.inline
  implicit class RTCSessionDescriptionInitOps[Self <: RTCSessionDescriptionInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSdp(value: java.lang.String): Self = this.set("sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdp: Self = this.set("sdp", js.undefined)
    
    @scala.inline
    def setType(value: RTCSdpType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
