package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPMediaStreamId extends js.Object {
  
  var stream: String = js.native
  
  var track: String = js.native
}
object SDPMediaStreamId {
  
  @scala.inline
  def apply(stream: String, track: String): SDPMediaStreamId = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMediaStreamId]
  }
  
  @scala.inline
  implicit class SDPMediaStreamIdOps[Self <: SDPMediaStreamId] (val x: Self) extends AnyVal {
    
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
    def setStream(value: String): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
  }
}
