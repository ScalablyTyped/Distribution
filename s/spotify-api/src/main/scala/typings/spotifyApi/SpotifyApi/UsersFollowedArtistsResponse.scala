package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get User’s Followed Artists
  * 
  * GET /v1/me/following
  * https://developer.spotify.com/web-api/get-followed-artists/
  */
@js.native
trait UsersFollowedArtistsResponse extends js.Object {
  
  var artists: CursorBasedPagingObject[ArtistObjectFull] = js.native
}
object UsersFollowedArtistsResponse {
  
  @scala.inline
  def apply(artists: CursorBasedPagingObject[ArtistObjectFull]): UsersFollowedArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersFollowedArtistsResponse]
  }
  
  @scala.inline
  implicit class UsersFollowedArtistsResponseOps[Self <: UsersFollowedArtistsResponse] (val x: Self) extends AnyVal {
    
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
    def setArtists(value: CursorBasedPagingObject[ArtistObjectFull]): Self = this.set("artists", value.asInstanceOf[js.Any])
  }
}
