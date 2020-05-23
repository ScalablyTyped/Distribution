package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get Several Episodes
  *
  * /v1/episodes?ids={ids}
  * https://developer.spotify.com/documentation/web-api/reference/episodes/get-several-episodes/
  */
trait MultipleEpisodesResponse extends js.Object {
  var episodes: js.Array[EpisodeObjectFull]
}

object MultipleEpisodesResponse {
  @scala.inline
  def apply(episodes: js.Array[EpisodeObjectFull]): MultipleEpisodesResponse = {
    val __obj = js.Dynamic.literal(episodes = episodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleEpisodesResponse]
  }
}

