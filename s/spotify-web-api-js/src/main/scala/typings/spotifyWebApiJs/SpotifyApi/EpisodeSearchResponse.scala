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
trait EpisodeSearchResponse extends js.Object {
  var episodes: PagingObject[EpisodeObjectSimplified]
}

object EpisodeSearchResponse {
  @scala.inline
  def apply(episodes: PagingObject[EpisodeObjectSimplified]): EpisodeSearchResponse = {
    val __obj = js.Dynamic.literal(episodes = episodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeSearchResponse]
  }
}

