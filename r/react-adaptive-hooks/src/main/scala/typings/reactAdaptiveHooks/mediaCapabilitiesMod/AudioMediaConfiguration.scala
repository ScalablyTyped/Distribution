package typings.reactAdaptiveHooks.mediaCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioMediaConfiguration extends js.Object {
  
  var bitrate: Double = js.native
  
  var channels: Double = js.native
  
  var contentType: String = js.native
  
  var samplerate: Double = js.native
}
object AudioMediaConfiguration {
  
  @scala.inline
  def apply(bitrate: Double, channels: Double, contentType: String, samplerate: Double): AudioMediaConfiguration = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], samplerate = samplerate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMediaConfiguration]
  }
  
  @scala.inline
  implicit class AudioMediaConfigurationOps[Self <: AudioMediaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: Double): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplerate(value: Double): Self = this.set("samplerate", value.asInstanceOf[js.Any])
  }
}
