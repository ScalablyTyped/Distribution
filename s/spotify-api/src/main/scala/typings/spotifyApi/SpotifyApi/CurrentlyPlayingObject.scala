package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentlyPlayingObject extends StObject {
  
  var context: ContextObject | Null
  
  var device: UserDevice
  
  var is_playing: Boolean
  
  var item: TrackObjectFull | Null
  
  var progress_ms: Double | Null
  
  var timestamp: Double
}
object CurrentlyPlayingObject {
  
  inline def apply(device: UserDevice, is_playing: Boolean, timestamp: Double): CurrentlyPlayingObject = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], is_playing = is_playing.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], context = null, item = null, progress_ms = null)
    __obj.asInstanceOf[CurrentlyPlayingObject]
  }
  
  extension [Self <: CurrentlyPlayingObject](x: Self) {
    
    inline def setContext(value: ContextObject): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setDevice(value: UserDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setIs_playing(value: Boolean): Self = StObject.set(x, "is_playing", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TrackObjectFull): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemNull: Self = StObject.set(x, "item", null)
    
    inline def setProgress_ms(value: Double): Self = StObject.set(x, "progress_ms", value.asInstanceOf[js.Any])
    
    inline def setProgress_msNull: Self = StObject.set(x, "progress_ms", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
