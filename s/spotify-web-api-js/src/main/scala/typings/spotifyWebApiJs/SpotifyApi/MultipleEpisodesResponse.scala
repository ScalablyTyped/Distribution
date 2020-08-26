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
@js.native
trait MultipleEpisodesResponse extends js.Object {
  var episodes: js.Array[EpisodeObjectFull] = js.native
}

object MultipleEpisodesResponse {
  @scala.inline
  def apply(episodes: js.Array[EpisodeObjectFull]): MultipleEpisodesResponse = {
    val __obj = js.Dynamic.literal(episodes = episodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleEpisodesResponse]
  }
  @scala.inline
  implicit class MultipleEpisodesResponseOps[Self <: MultipleEpisodesResponse] (val x: Self) extends AnyVal {
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
    def setEpisodesVarargs(value: EpisodeObjectFull*): Self = this.set("episodes", js.Array(value :_*))
    @scala.inline
    def setEpisodes(value: js.Array[EpisodeObjectFull]): Self = this.set("episodes", value.asInstanceOf[js.Any])
  }
  
}

