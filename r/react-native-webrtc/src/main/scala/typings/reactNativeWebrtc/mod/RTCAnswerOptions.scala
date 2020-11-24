package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCAnswerOptions extends js.Object {
  
  var voiceActivityDetection: js.UndefOr[Boolean] = js.native
}
object RTCAnswerOptions {
  
  @scala.inline
  def apply(): RTCAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCAnswerOptions]
  }
  
  @scala.inline
  implicit class RTCAnswerOptionsOps[Self <: RTCAnswerOptions] (val x: Self) extends AnyVal {
    
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
    def setVoiceActivityDetection(value: Boolean): Self = this.set("voiceActivityDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceActivityDetection: Self = this.set("voiceActivityDetection", js.undefined)
  }
}
