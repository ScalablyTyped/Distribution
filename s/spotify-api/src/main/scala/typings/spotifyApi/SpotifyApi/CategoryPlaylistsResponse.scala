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
trait CategoryPlaylistsResponse extends StObject {
  
  var playlists: PagingObject[PlaylistObjectSimplified]
}
object CategoryPlaylistsResponse {
  
  inline def apply(playlists: PagingObject[PlaylistObjectSimplified]): CategoryPlaylistsResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryPlaylistsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryPlaylistsResponse] (val x: Self) extends AnyVal {
    
    inline def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
  }
}
