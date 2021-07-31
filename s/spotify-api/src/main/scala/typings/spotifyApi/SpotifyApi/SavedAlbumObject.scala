package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait SavedAlbumObject extends StObject {
  
  var added_at: String
  
  var album: AlbumObjectFull
}
object SavedAlbumObject {
  
  @scala.inline
  def apply(added_at: String, album: AlbumObjectFull): SavedAlbumObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], album = album.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedAlbumObject]
  }
  
  @scala.inline
  implicit class SavedAlbumObjectMutableBuilder[Self <: SavedAlbumObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded_at(value: String): Self = StObject.set(x, "added_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbum(value: AlbumObjectFull): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
  }
}
