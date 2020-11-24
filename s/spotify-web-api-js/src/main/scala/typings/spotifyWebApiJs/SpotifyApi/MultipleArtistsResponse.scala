package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Several Artists
  *
  * /v1/artists?ids={ids}
  * https://developer.spotify.com/web-api/get-several-artists/
  */
@js.native
trait MultipleArtistsResponse extends js.Object {
  
  var artists: js.Array[ArtistObjectFull] = js.native
}
object MultipleArtistsResponse {
  
  @scala.inline
  def apply(artists: js.Array[ArtistObjectFull]): MultipleArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleArtistsResponse]
  }
  
  @scala.inline
  implicit class MultipleArtistsResponseOps[Self <: MultipleArtistsResponse] (val x: Self) extends AnyVal {
    
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
    def setArtistsVarargs(value: ArtistObjectFull*): Self = this.set("artists", js.Array(value :_*))
    
    @scala.inline
    def setArtists(value: js.Array[ArtistObjectFull]): Self = this.set("artists", value.asInstanceOf[js.Any])
  }
}
