package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get Several Shows
  *
  * /v1/shows?ids={ids}
  * https://developer.spotify.com/documentation/web-api/reference/shows/get-several-shows/
  */
@js.native
trait MultipleShowsResponse extends js.Object {
  var shows: js.Array[ShowObjectFull] = js.native
}

object MultipleShowsResponse {
  @scala.inline
  def apply(shows: js.Array[ShowObjectFull]): MultipleShowsResponse = {
    val __obj = js.Dynamic.literal(shows = shows.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleShowsResponse]
  }
  @scala.inline
  implicit class MultipleShowsResponseOps[Self <: MultipleShowsResponse] (val x: Self) extends AnyVal {
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
    def setShowsVarargs(value: ShowObjectFull*): Self = this.set("shows", js.Array(value :_*))
    @scala.inline
    def setShows(value: js.Array[ShowObjectFull]): Self = this.set("shows", value.asInstanceOf[js.Any])
  }
  
}

