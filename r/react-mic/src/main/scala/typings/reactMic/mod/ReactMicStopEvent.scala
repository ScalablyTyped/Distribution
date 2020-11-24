package typings.reactMic.mod

import typings.reactMic.anon.AudioBitsPerSecond
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactMicStopEvent extends js.Object {
  
  var blob: Blob = js.native
  
  var blobURL: String = js.native
  
  var option: AudioBitsPerSecond = js.native
  
  var startTime: Double = js.native
  
  var stopTime: Double = js.native
}
object ReactMicStopEvent {
  
  @scala.inline
  def apply(blob: Blob, blobURL: String, option: AudioBitsPerSecond, startTime: Double, stopTime: Double): ReactMicStopEvent = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], blobURL = blobURL.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopTime = stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMicStopEvent]
  }
  
  @scala.inline
  implicit class ReactMicStopEventOps[Self <: ReactMicStopEvent] (val x: Self) extends AnyVal {
    
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
    def setBlob(value: Blob): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobURL(value: String): Self = this.set("blobURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: AudioBitsPerSecond): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTime(value: Double): Self = this.set("stopTime", value.asInstanceOf[js.Any])
  }
}
