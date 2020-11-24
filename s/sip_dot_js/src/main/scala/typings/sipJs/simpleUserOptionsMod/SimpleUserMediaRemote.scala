package typings.sipJs.simpleUserOptionsMod

import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleUserMediaRemote extends js.Object {
  
  /** The remote audio media stream is attached to this element. */
  var audio: js.UndefOr[HTMLAudioElement] = js.native
  
  /** The remote video media stream is attached to this element. */
  var video: js.UndefOr[HTMLVideoElement] = js.native
}
object SimpleUserMediaRemote {
  
  @scala.inline
  def apply(): SimpleUserMediaRemote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserMediaRemote]
  }
  
  @scala.inline
  implicit class SimpleUserMediaRemoteOps[Self <: SimpleUserMediaRemote] (val x: Self) extends AnyVal {
    
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
    def setAudio(value: HTMLAudioElement): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setVideo(value: HTMLVideoElement): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
