package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for a playlist
  *
  * GET /v1/search?type=playlist
  * https://developer.spotify.com/web-api/search-item/
  */
trait PlaylistSearchResponse extends StObject {
  
  var playlists: PagingObject[PlaylistObjectSimplified]
}
object PlaylistSearchResponse {
  
  inline def apply(playlists: PagingObject[PlaylistObjectSimplified]): PlaylistSearchResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSearchResponse]
  }
  
  extension [Self <: PlaylistSearchResponse](x: Self) {
    
    inline def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
  }
}
