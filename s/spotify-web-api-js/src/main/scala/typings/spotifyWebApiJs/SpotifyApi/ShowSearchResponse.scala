package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for a show
  *
  * GET /v1/search?type=show
  * https://developer.spotify.com/web-api/search-item/
  */
trait ShowSearchResponse extends js.Object {
  var shows: PagingObject[ShowObjectSimplified]
}

object ShowSearchResponse {
  @scala.inline
  def apply(shows: PagingObject[ShowObjectSimplified]): ShowSearchResponse = {
    val __obj = js.Dynamic.literal(shows = shows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowSearchResponse]
  }
}

