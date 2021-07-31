package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Several Episodes
  *
  * /v1/episodes?ids={ids}
  * https://developer.spotify.com/documentation/web-api/reference/episodes/get-several-episodes/
  */
trait MultipleEpisodesResponse extends StObject {
  
  var episodes: js.Array[EpisodeObjectFull]
}
object MultipleEpisodesResponse {
  
  @scala.inline
  def apply(episodes: js.Array[EpisodeObjectFull]): MultipleEpisodesResponse = {
    val __obj = js.Dynamic.literal(episodes = episodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleEpisodesResponse]
  }
  
  @scala.inline
  implicit class MultipleEpisodesResponseMutableBuilder[Self <: MultipleEpisodesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpisodes(value: js.Array[EpisodeObjectFull]): Self = StObject.set(x, "episodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodesVarargs(value: EpisodeObjectFull*): Self = StObject.set(x, "episodes", js.Array(value :_*))
  }
}
