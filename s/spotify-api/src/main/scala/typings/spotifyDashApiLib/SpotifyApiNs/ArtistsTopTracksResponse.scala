package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get an Artist’s Top Tracks
  * 
  * GET /v1/artists/{id}/top-tracks
  * https://developer.spotify.com/web-api/get-artists-top-tracks/
  */
trait ArtistsTopTracksResponse extends js.Object {
  var tracks: js.Array[TrackObjectFull]
}

object ArtistsTopTracksResponse {
  @scala.inline
  def apply(tracks: js.Array[TrackObjectFull]): ArtistsTopTracksResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks)
  
    __obj.asInstanceOf[ArtistsTopTracksResponse]
  }
}

