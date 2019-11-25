package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get User’s Followed Artists
  * 
  * GET /v1/me/following
  * https://developer.spotify.com/web-api/get-followed-artists/
  */
trait UsersFollowedArtistsResponse extends js.Object {
  var artists: CursorBasedPagingObject[ArtistObjectFull]
}

object UsersFollowedArtistsResponse {
  @scala.inline
  def apply(artists: CursorBasedPagingObject[ArtistObjectFull]): UsersFollowedArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersFollowedArtistsResponse]
  }
}

