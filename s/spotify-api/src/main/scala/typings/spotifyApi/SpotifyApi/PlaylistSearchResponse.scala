package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for a playlist
  * 
  * GET /v1/search?type=playlist
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait PlaylistSearchResponse extends js.Object {
  
  var playlists: PagingObject[PlaylistObjectSimplified] = js.native
}
object PlaylistSearchResponse {
  
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): PlaylistSearchResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSearchResponse]
  }
  
  @scala.inline
  implicit class PlaylistSearchResponseOps[Self <: PlaylistSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = this.set("playlists", value.asInstanceOf[js.Any])
  }
}
