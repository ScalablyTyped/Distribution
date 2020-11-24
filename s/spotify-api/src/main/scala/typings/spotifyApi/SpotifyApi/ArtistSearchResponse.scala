package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for an artist
  * 
  * GET /v1/search?type=artist
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait ArtistSearchResponse extends js.Object {
  
  var artists: PagingObject[ArtistObjectFull] = js.native
}
object ArtistSearchResponse {
  
  @scala.inline
  def apply(artists: PagingObject[ArtistObjectFull]): ArtistSearchResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistSearchResponse]
  }
  
  @scala.inline
  implicit class ArtistSearchResponseOps[Self <: ArtistSearchResponse] (val x: Self) extends AnyVal {
    
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
    def setArtists(value: PagingObject[ArtistObjectFull]): Self = this.set("artists", value.asInstanceOf[js.Any])
  }
}
