package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for a episode
  *
  * GET /v1/search?type=episode
  * https://developer.spotify.com/web-api/search-item/
  */
trait EpisodeSearchResponse extends StObject {
  
  var episodes: PagingObject[EpisodeObjectSimplified]
}
object EpisodeSearchResponse {
  
  inline def apply(episodes: PagingObject[EpisodeObjectSimplified]): EpisodeSearchResponse = {
    val __obj = js.Dynamic.literal(episodes = episodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeSearchResponse]
  }
  
  extension [Self <: EpisodeSearchResponse](x: Self) {
    
    inline def setEpisodes(value: PagingObject[EpisodeObjectSimplified]): Self = StObject.set(x, "episodes", value.asInstanceOf[js.Any])
  }
}
