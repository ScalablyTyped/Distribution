package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for a episode
  *
  * GET /v1/search?type=episode
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait EpisodeSearchResponse extends js.Object {
  var episodes: PagingObject[EpisodeObjectSimplified] = js.native
}

object EpisodeSearchResponse {
  @scala.inline
  def apply(episodes: PagingObject[EpisodeObjectSimplified]): EpisodeSearchResponse = {
    val __obj = js.Dynamic.literal(episodes = episodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeSearchResponse]
  }
  @scala.inline
  implicit class EpisodeSearchResponseOps[Self <: EpisodeSearchResponse] (val x: Self) extends AnyVal {
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
    def setEpisodes(value: PagingObject[EpisodeObjectSimplified]): Self = this.set("episodes", value.asInstanceOf[js.Any])
  }
  
}

