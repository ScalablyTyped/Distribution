package typings.sipml.SIPml.Session

import typings.sipml.anon.Audio
import typings.sipml.anon.Events
import typings.sipml.anon.MaxHeight
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var audio_remote: js.UndefOr[HTMLElement] = js.native
  
  var bandwidth: js.UndefOr[Audio] = js.native
  
  var events_listener: js.UndefOr[Events] = js.native
  
  var expires: js.UndefOr[Double] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var sip_caps: js.UndefOr[js.Array[js.Object]] = js.native
  
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.native
  
  var video_local: js.UndefOr[HTMLElement] = js.native
  
  var video_remote: js.UndefOr[HTMLElement] = js.native
  
  var video_size: js.UndefOr[MaxHeight] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setAudio_remote(value: HTMLElement): Self = this.set("audio_remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio_remote: Self = this.set("audio_remote", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Audio): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setEvents_listener(value: Events): Self = this.set("events_listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents_listener: Self = this.set("events_listener", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setSip_capsVarargs(value: js.Object*): Self = this.set("sip_caps", js.Array(value :_*))
    
    @scala.inline
    def setSip_caps(value: js.Array[js.Object]): Self = this.set("sip_caps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSip_caps: Self = this.set("sip_caps", js.undefined)
    
    @scala.inline
    def setSip_headersVarargs(value: js.Object*): Self = this.set("sip_headers", js.Array(value :_*))
    
    @scala.inline
    def setSip_headers(value: js.Array[js.Object]): Self = this.set("sip_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSip_headers: Self = this.set("sip_headers", js.undefined)
    
    @scala.inline
    def setVideo_local(value: HTMLElement): Self = this.set("video_local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_local: Self = this.set("video_local", js.undefined)
    
    @scala.inline
    def setVideo_remote(value: HTMLElement): Self = this.set("video_remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_remote: Self = this.set("video_remote", js.undefined)
    
    @scala.inline
    def setVideo_size(value: MaxHeight): Self = this.set("video_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_size: Self = this.set("video_size", js.undefined)
  }
}
