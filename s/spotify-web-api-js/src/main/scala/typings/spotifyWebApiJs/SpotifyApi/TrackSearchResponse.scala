package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for a track
  * 
  * GET /v1/search?type=track
  * https://developer.spotify.com/web-api/search-item/
  */
trait TrackSearchResponse extends js.Object {
  var tracks: PagingObject[TrackObjectFull]
}

object TrackSearchResponse {
  @scala.inline
  def apply(tracks: PagingObject[TrackObjectFull]): TrackSearchResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackSearchResponse]
  }
}

