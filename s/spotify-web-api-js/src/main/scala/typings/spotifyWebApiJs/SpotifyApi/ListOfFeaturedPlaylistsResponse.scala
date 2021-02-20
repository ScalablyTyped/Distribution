package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get a list of featured playlists
  *
  * GET /v1/browse/featured-playlists
  * https://developer.spotify.com/web-api/get-list-featured-playlists/
  */
@js.native
trait ListOfFeaturedPlaylistsResponse extends StObject {
  
  var message: js.UndefOr[String] = js.native
  
  var playlists: PagingObject[PlaylistObjectSimplified] = js.native
}
object ListOfFeaturedPlaylistsResponse {
  
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): ListOfFeaturedPlaylistsResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfFeaturedPlaylistsResponse]
  }
  
  @scala.inline
  implicit class ListOfFeaturedPlaylistsResponseMutableBuilder[Self <: ListOfFeaturedPlaylistsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
  }
}
