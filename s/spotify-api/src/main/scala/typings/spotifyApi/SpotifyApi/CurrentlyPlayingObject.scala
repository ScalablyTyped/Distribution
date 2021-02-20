package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentlyPlayingObject extends StObject {
  
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
  implicit class CurrentlyPlayingObjectMutableBuilder[Self <: CurrentlyPlayingObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: ContextObject): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setDevice(value: UserDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_playing(value: Boolean): Self = StObject.set(x, "is_playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: TrackObjectFull): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNull: Self = StObject.set(x, "item", null)
    
    @scala.inline
    def setProgress_ms(value: Double): Self = StObject.set(x, "progress_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress_msNull: Self = StObject.set(x, "progress_ms", null)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
