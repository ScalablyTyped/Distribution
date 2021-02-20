package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
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
trait UsersFollowedArtistsResponse extends StObject {
  
  var artists: CursorBasedPagingObject[ArtistObjectFull] = js.native
}
object UsersFollowedArtistsResponse {
  
  @scala.inline
  def apply(artists: CursorBasedPagingObject[ArtistObjectFull]): UsersFollowedArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersFollowedArtistsResponse]
  }
  
  @scala.inline
  implicit class UsersFollowedArtistsResponseMutableBuilder[Self <: UsersFollowedArtistsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtists(value: CursorBasedPagingObject[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
  }
}
