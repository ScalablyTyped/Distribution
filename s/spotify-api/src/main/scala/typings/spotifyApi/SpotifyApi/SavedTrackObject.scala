package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait SavedTrackObject extends StObject {
  
  var added_at: String
  
  var track: TrackObjectFull
}
object SavedTrackObject {
  
  inline def apply(added_at: String, track: TrackObjectFull): SavedTrackObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedTrackObject]
  }
  
  extension [Self <: SavedTrackObject](x: Self) {
    
    inline def setAdded_at(value: String): Self = StObject.set(x, "added_at", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: TrackObjectFull): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
