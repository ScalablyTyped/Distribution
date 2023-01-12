package typings.spotifyWebPlaybackSdk.Spotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackTrackWindow extends StObject {
  
  var current_track: Track
  
  var next_tracks: js.Array[Track]
  
  var previous_tracks: js.Array[Track]
}
object PlaybackTrackWindow {
  
  inline def apply(current_track: Track, next_tracks: js.Array[Track], previous_tracks: js.Array[Track]): PlaybackTrackWindow = {
    val __obj = js.Dynamic.literal(current_track = current_track.asInstanceOf[js.Any], next_tracks = next_tracks.asInstanceOf[js.Any], previous_tracks = previous_tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackTrackWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackTrackWindow] (val x: Self) extends AnyVal {
    
    inline def setCurrent_track(value: Track): Self = StObject.set(x, "current_track", value.asInstanceOf[js.Any])
    
    inline def setNext_tracks(value: js.Array[Track]): Self = StObject.set(x, "next_tracks", value.asInstanceOf[js.Any])
    
    inline def setNext_tracksVarargs(value: Track*): Self = StObject.set(x, "next_tracks", js.Array(value*))
    
    inline def setPrevious_tracks(value: js.Array[Track]): Self = StObject.set(x, "previous_tracks", value.asInstanceOf[js.Any])
    
    inline def setPrevious_tracksVarargs(value: Track*): Self = StObject.set(x, "previous_tracks", js.Array(value*))
  }
}
