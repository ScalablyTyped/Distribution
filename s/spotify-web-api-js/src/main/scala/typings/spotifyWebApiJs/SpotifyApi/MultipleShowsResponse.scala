package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Several Shows
  *
  * /v1/shows?ids={ids}
  * https://developer.spotify.com/documentation/web-api/reference/shows/get-several-shows/
  */
@js.native
trait MultipleShowsResponse extends StObject {
  
  var shows: js.Array[ShowObjectFull] = js.native
}
object MultipleShowsResponse {
  
  @scala.inline
  def apply(shows: js.Array[ShowObjectFull]): MultipleShowsResponse = {
    val __obj = js.Dynamic.literal(shows = shows.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleShowsResponse]
  }
  
  @scala.inline
  implicit class MultipleShowsResponseMutableBuilder[Self <: MultipleShowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShows(value: js.Array[ShowObjectFull]): Self = StObject.set(x, "shows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsVarargs(value: ShowObjectFull*): Self = StObject.set(x, "shows", js.Array(value :_*))
  }
}
