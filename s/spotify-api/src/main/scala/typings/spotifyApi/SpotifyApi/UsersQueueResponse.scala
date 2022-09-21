package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the list of objects that make up the user's queue.
  *
  * GET /v1/me/player/queue
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/get-queue
  */
trait UsersQueueResponse extends StObject {
  
  var currently_playing: TrackObjectFull | EpisodeObjectFull
  
  var queue: js.Array[TrackObjectFull | EpisodeObjectFull]
}
object UsersQueueResponse {
  
  inline def apply(
    currently_playing: TrackObjectFull | EpisodeObjectFull,
    queue: js.Array[TrackObjectFull | EpisodeObjectFull]
  ): UsersQueueResponse = {
    val __obj = js.Dynamic.literal(currently_playing = currently_playing.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersQueueResponse]
  }
  
  extension [Self <: UsersQueueResponse](x: Self) {
    
    inline def setCurrently_playing(value: TrackObjectFull | EpisodeObjectFull): Self = StObject.set(x, "currently_playing", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: js.Array[TrackObjectFull | EpisodeObjectFull]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueVarargs(value: (TrackObjectFull | EpisodeObjectFull)*): Self = StObject.set(x, "queue", js.Array(value*))
  }
}
