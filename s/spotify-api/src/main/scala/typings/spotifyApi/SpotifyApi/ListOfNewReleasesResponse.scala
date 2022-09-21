package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get a list of new releases
  *
  * GET /v1/browse/new-releases
  * https://developer.spotify.com/web-api/get-list-new-releases/
  */
trait ListOfNewReleasesResponse extends StObject {
  
  var albums: PagingObject[AlbumObjectSimplified]
  
  var message: js.UndefOr[String] = js.undefined
}
object ListOfNewReleasesResponse {
  
  inline def apply(albums: PagingObject[AlbumObjectSimplified]): ListOfNewReleasesResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfNewReleasesResponse]
  }
  
  extension [Self <: ListOfNewReleasesResponse](x: Self) {
    
    inline def setAlbums(value: PagingObject[AlbumObjectSimplified]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
