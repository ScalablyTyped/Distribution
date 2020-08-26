package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get an Artist’s Top Tracks
  * 
  * GET /v1/artists/{id}/top-tracks
  * https://developer.spotify.com/web-api/get-artists-top-tracks/
  */
@js.native
trait ArtistsTopTracksResponse extends js.Object {
  var tracks: js.Array[TrackObjectFull] = js.native
}

object ArtistsTopTracksResponse {
  @scala.inline
  def apply(tracks: js.Array[TrackObjectFull]): ArtistsTopTracksResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistsTopTracksResponse]
  }
  @scala.inline
  implicit class ArtistsTopTracksResponseOps[Self <: ArtistsTopTracksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTracksVarargs(value: TrackObjectFull*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[TrackObjectFull]): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
  
}

