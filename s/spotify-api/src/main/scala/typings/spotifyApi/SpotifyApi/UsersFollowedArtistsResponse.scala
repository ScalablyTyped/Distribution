package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get User’s Followed Artists
  *
  * GET /v1/me/following
  * https://developer.spotify.com/web-api/get-followed-artists/
  */
trait UsersFollowedArtistsResponse extends StObject {
  
  var artists: CursorBasedPagingObject[ArtistObjectFull]
}
object UsersFollowedArtistsResponse {
  
  inline def apply(artists: CursorBasedPagingObject[ArtistObjectFull]): UsersFollowedArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersFollowedArtistsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsersFollowedArtistsResponse] (val x: Self) extends AnyVal {
    
    inline def setArtists(value: CursorBasedPagingObject[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
  }
}
