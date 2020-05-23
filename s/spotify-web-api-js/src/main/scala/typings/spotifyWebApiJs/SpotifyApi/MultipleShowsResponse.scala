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
trait MultipleShowsResponse extends js.Object {
  var shows: js.Array[ShowObjectFull]
}

object MultipleShowsResponse {
  @scala.inline
  def apply(shows: js.Array[ShowObjectFull]): MultipleShowsResponse = {
    val __obj = js.Dynamic.literal(shows = shows.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleShowsResponse]
  }
}

