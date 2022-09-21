package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Play History Object
  * [](https://developer.spotify.com/web-api/web-api-personalization-endpoints/get-recently-played/#play-history-object)
  */
trait PlayHistoryObject extends StObject {
  
  var context: ContextObject
  
  var played_at: String
  
  var track: TrackObjectFull
}
object PlayHistoryObject {
  
  inline def apply(context: ContextObject, played_at: String, track: TrackObjectFull): PlayHistoryObject = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], played_at = played_at.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayHistoryObject]
  }
  
  extension [Self <: PlayHistoryObject](x: Self) {
    
    inline def setContext(value: ContextObject): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setPlayed_at(value: String): Self = StObject.set(x, "played_at", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: TrackObjectFull): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
