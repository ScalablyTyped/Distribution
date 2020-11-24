package typings.sipJs.simpleUserOptionsMod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleUserMediaLocal extends js.Object {
  
  /** The local video media stream is attached to this element. */
  var video: js.UndefOr[HTMLVideoElement] = js.native
}
object SimpleUserMediaLocal {
  
  @scala.inline
  def apply(): SimpleUserMediaLocal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserMediaLocal]
  }
  
  @scala.inline
  implicit class SimpleUserMediaLocalOps[Self <: SimpleUserMediaLocal] (val x: Self) extends AnyVal {
    
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
    def setVideo(value: HTMLVideoElement): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
