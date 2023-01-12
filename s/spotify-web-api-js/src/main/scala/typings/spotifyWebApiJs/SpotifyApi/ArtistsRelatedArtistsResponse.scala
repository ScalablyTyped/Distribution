package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get an Artist’s Related Artists
  *
  * GET /v1/artists/{id}/related-artists
  * https://developer.spotify.com/web-api/get-related-artists/
  */
trait ArtistsRelatedArtistsResponse extends StObject {
  
  var artists: js.Array[ArtistObjectFull]
}
object ArtistsRelatedArtistsResponse {
  
  inline def apply(artists: js.Array[ArtistObjectFull]): ArtistsRelatedArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistsRelatedArtistsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtistsRelatedArtistsResponse] (val x: Self) extends AnyVal {
    
    inline def setArtists(value: js.Array[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsVarargs(value: ArtistObjectFull*): Self = StObject.set(x, "artists", js.Array(value*))
  }
}
