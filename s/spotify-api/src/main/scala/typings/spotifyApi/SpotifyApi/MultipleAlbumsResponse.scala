package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Several Albums
  * 
  * GET /v1/albums?ids={ids}
  * https://developer.spotify.com/web-api/get-several-albums/ 
  */
@js.native
trait MultipleAlbumsResponse extends js.Object {
  
  var albums: js.Array[AlbumObjectFull] = js.native
}
object MultipleAlbumsResponse {
  
  @scala.inline
  def apply(albums: js.Array[AlbumObjectFull]): MultipleAlbumsResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAlbumsResponse]
  }
  
  @scala.inline
  implicit class MultipleAlbumsResponseOps[Self <: MultipleAlbumsResponse] (val x: Self) extends AnyVal {
    
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
    def setAlbumsVarargs(value: AlbumObjectFull*): Self = this.set("albums", js.Array(value :_*))
    
    @scala.inline
    def setAlbums(value: js.Array[AlbumObjectFull]): Self = this.set("albums", value.asInstanceOf[js.Any])
  }
}
