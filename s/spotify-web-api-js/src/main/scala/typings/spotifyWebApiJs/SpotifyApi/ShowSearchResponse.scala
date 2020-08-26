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
@js.native
trait ShowSearchResponse extends js.Object {
  var shows: PagingObject[ShowObjectSimplified] = js.native
}

object ShowSearchResponse {
  @scala.inline
  def apply(shows: PagingObject[ShowObjectSimplified]): ShowSearchResponse = {
    val __obj = js.Dynamic.literal(shows = shows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowSearchResponse]
  }
  @scala.inline
  implicit class ShowSearchResponseOps[Self <: ShowSearchResponse] (val x: Self) extends AnyVal {
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
    def setShows(value: PagingObject[ShowObjectSimplified]): Self = this.set("shows", value.asInstanceOf[js.Any])
  }
  
}

