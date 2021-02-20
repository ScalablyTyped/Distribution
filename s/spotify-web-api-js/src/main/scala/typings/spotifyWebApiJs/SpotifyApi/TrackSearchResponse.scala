package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for a track
  *
  * GET /v1/search?type=track
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait TrackSearchResponse extends StObject {
  
  var tracks: PagingObject[TrackObjectFull] = js.native
}
object TrackSearchResponse {
  
  @scala.inline
  def apply(tracks: PagingObject[TrackObjectFull]): TrackSearchResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSearchResponse]
  }
  
  @scala.inline
  implicit class TrackSearchResponseMutableBuilder[Self <: TrackSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: PagingObject[TrackObjectFull]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
