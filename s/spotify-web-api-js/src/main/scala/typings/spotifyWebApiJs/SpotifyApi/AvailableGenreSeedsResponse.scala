package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get available genre seeds
  *
  * GET /v1/recommendations/available-genre-seeds
  * https://developer.spotify.com/web-api/get-recommendations/#available-genre-seeds
  */
@js.native
trait AvailableGenreSeedsResponse extends StObject {
  
  var genres: js.Array[String] = js.native
}
object AvailableGenreSeedsResponse {
  
  @scala.inline
  def apply(genres: js.Array[String]): AvailableGenreSeedsResponse = {
    val __obj = js.Dynamic.literal(genres = genres.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableGenreSeedsResponse]
  }
  
  @scala.inline
  implicit class AvailableGenreSeedsResponseMutableBuilder[Self <: AvailableGenreSeedsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenres(value: js.Array[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value :_*))
  }
}
