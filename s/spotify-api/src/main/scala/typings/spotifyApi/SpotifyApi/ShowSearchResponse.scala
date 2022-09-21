package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for a show
  *
  * GET /v1/search?type=show
  * https://developer.spotify.com/web-api/search-item/
  */
trait ShowSearchResponse extends StObject {
  
  var shows: PagingObject[ShowObjectSimplified]
}
object ShowSearchResponse {
  
  inline def apply(shows: PagingObject[ShowObjectSimplified]): ShowSearchResponse = {
    val __obj = js.Dynamic.literal(shows = shows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowSearchResponse]
  }
  
  extension [Self <: ShowSearchResponse](x: Self) {
    
    inline def setShows(value: PagingObject[ShowObjectSimplified]): Self = StObject.set(x, "shows", value.asInstanceOf[js.Any])
  }
}
