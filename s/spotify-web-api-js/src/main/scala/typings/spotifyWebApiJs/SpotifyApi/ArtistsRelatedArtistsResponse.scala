package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get an Artist’s Related Artists
  *
  * GET /v1/artists/{id}/related-artists
  * https://developer.spotify.com/web-api/get-related-artists/
  */
@js.native
trait ArtistsRelatedArtistsResponse extends StObject {
  
  var artists: js.Array[ArtistObjectFull] = js.native
}
object ArtistsRelatedArtistsResponse {
  
  @scala.inline
  def apply(artists: js.Array[ArtistObjectFull]): ArtistsRelatedArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistsRelatedArtistsResponse]
  }
  
  @scala.inline
  implicit class ArtistsRelatedArtistsResponseMutableBuilder[Self <: ArtistsRelatedArtistsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtists(value: js.Array[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistsVarargs(value: ArtistObjectFull*): Self = StObject.set(x, "artists", js.Array(value :_*))
  }
}
