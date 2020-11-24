package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentlyPlayingObject extends js.Object {
  
  var context: ContextObject | Null = js.native
  
  var device: UserDevice = js.native
  
  var is_playing: Boolean = js.native
  
  var item: TrackObjectFull | Null = js.native
  
  var progress_ms: Double | Null = js.native
  
  var timestamp: Double = js.native
}
object CurrentlyPlayingObject {
  
  @scala.inline
  def apply(device: UserDevice, is_playing: Boolean, timestamp: Double): CurrentlyPlayingObject = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], is_playing = is_playing.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentlyPlayingObject]
  }
  
  @scala.inline
  implicit class CurrentlyPlayingObjectOps[Self <: CurrentlyPlayingObject] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: UserDevice): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_playing(value: Boolean): Self = this.set("is_playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: ContextObject): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    
    @scala.inline
    def setItem(value: TrackObjectFull): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNull: Self = this.set("item", null)
    
    @scala.inline
    def setProgress_ms(value: Double): Self = this.set("progress_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress_msNull: Self = this.set("progress_ms", null)
  }
}
