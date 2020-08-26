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
@js.native
trait MultipleTracksResponse extends js.Object {
  var tracks: js.Array[TrackObjectFull] = js.native
}

object MultipleTracksResponse {
  @scala.inline
  def apply(tracks: js.Array[TrackObjectFull]): MultipleTracksResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleTracksResponse]
  }
  @scala.inline
  implicit class MultipleTracksResponseOps[Self <: MultipleTracksResponse] (val x: Self) extends AnyVal {
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

