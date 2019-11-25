package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for an artist
  * 
  * GET /v1/search?type=artist
  * https://developer.spotify.com/web-api/search-item/
  */
trait ArtistSearchResponse extends js.Object {
  var artists: PagingObject[ArtistObjectFull]
}

object ArtistSearchResponse {
  @scala.inline
  def apply(artists: PagingObject[ArtistObjectFull]): ArtistSearchResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtistSearchResponse]
  }
}

