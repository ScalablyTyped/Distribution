package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for an artist
  *
  * GET /v1/search?type=artist
  * https://developer.spotify.com/web-api/search-item/
  */
trait ArtistSearchResponse extends StObject {
  
  var artists: PagingObject[ArtistObjectFull]
}
object ArtistSearchResponse {
  
  inline def apply(artists: PagingObject[ArtistObjectFull]): ArtistSearchResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistSearchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtistSearchResponse] (val x: Self) extends AnyVal {
    
    inline def setArtists(value: PagingObject[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
  }
}
