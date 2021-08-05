package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get a categorys playlists
  * 
  * GET /v1/browse/categories/{id}/playlists
  * https://developer.spotify.com/web-api/get-categorys-playlists/
  */
trait CategoryPlaylistsReponse extends StObject {
  
  var playlists: PagingObject[PlaylistObjectSimplified]
}
object CategoryPlaylistsReponse {
  
  inline def apply(playlists: PagingObject[PlaylistObjectSimplified]): CategoryPlaylistsReponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryPlaylistsReponse]
  }
  
  extension [Self <: CategoryPlaylistsReponse](x: Self) {
    
    inline def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
  }
}
