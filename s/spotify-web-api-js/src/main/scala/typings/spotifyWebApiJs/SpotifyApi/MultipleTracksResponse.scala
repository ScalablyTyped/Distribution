package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get multiple tracks
  * 
  * GET /v1/tracks?ids={ids}
  * https://developer.spotify.com/web-api/get-several-tracks/
  */
trait MultipleTracksResponse extends js.Object {
  var tracks: js.Array[TrackObjectFull]
}

object MultipleTracksResponse {
  @scala.inline
  def apply(tracks: js.Array[TrackObjectFull]): MultipleTracksResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleTracksResponse]
  }
}

