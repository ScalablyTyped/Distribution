package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for an album
  * 
  * GET /v1/search?type=album
  * https://developer.spotify.com/web-api/search-item/
  */
trait AlbumSearchResponse extends StObject {
  
  var albums: PagingObject[AlbumObjectSimplified]
}
object AlbumSearchResponse {
  
  @scala.inline
  def apply(albums: PagingObject[AlbumObjectSimplified]): AlbumSearchResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumSearchResponse]
  }
  
  @scala.inline
  implicit class AlbumSearchResponseMutableBuilder[Self <: AlbumSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbums(value: PagingObject[AlbumObjectSimplified]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
  }
}
