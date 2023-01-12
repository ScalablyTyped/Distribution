package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Several Shows
  *
  * GET /v1/shows?ids={ids}
  * https://developer.spotify.com/documentation/web-api/reference/shows/get-several-shows/
  */
trait MultipleShowsResponse extends StObject {
  
  var shows: js.Array[ShowObjectSimplified]
}
object MultipleShowsResponse {
  
  inline def apply(shows: js.Array[ShowObjectSimplified]): MultipleShowsResponse = {
    val __obj = js.Dynamic.literal(shows = shows.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleShowsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipleShowsResponse] (val x: Self) extends AnyVal {
    
    inline def setShows(value: js.Array[ShowObjectSimplified]): Self = StObject.set(x, "shows", value.asInstanceOf[js.Any])
    
    inline def setShowsVarargs(value: ShowObjectSimplified*): Self = StObject.set(x, "shows", js.Array(value*))
  }
}
