package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Several Artists
  *
  * /v1/artists?ids={ids}
  * https://developer.spotify.com/web-api/get-several-artists/
  */
trait MultipleArtistsResponse extends StObject {
  
  var artists: js.Array[ArtistObjectFull]
}
object MultipleArtistsResponse {
  
  inline def apply(artists: js.Array[ArtistObjectFull]): MultipleArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleArtistsResponse]
  }
  
  extension [Self <: MultipleArtistsResponse](x: Self) {
    
    inline def setArtists(value: js.Array[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsVarargs(value: ArtistObjectFull*): Self = StObject.set(x, "artists", js.Array(value*))
  }
}
