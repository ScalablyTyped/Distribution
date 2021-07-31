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
  
  @scala.inline
  def apply(artists: js.Array[ArtistObjectFull]): MultipleArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleArtistsResponse]
  }
  
  @scala.inline
  implicit class MultipleArtistsResponseMutableBuilder[Self <: MultipleArtistsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtists(value: js.Array[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistsVarargs(value: ArtistObjectFull*): Self = StObject.set(x, "artists", js.Array(value :_*))
  }
}
