package typings.reactNativeWebrtc.anon

import typings.reactNativeWebrtc.mod.RTCIceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IceConnectionState extends js.Object {
  
  var iceConnectionState: RTCIceConnectionState = js.native
}
object IceConnectionState {
  
  @scala.inline
  def apply(iceConnectionState: RTCIceConnectionState): IceConnectionState = {
    val __obj = js.Dynamic.literal(iceConnectionState = iceConnectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceConnectionState]
  }
  
  @scala.inline
  implicit class IceConnectionStateOps[Self <: IceConnectionState] (val x: Self) extends AnyVal {
    
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
    def setIceConnectionState(value: RTCIceConnectionState): Self = this.set("iceConnectionState", value.asInstanceOf[js.Any])
  }
}
