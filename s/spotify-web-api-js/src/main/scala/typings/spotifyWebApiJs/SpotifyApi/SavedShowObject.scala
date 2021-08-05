package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saved Show Object
  * [](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-show-object)
  */
trait SavedShowObject extends StObject {
  
  var added_at: String
  
  var album: ShowObjectFull
}
object SavedShowObject {
  
  inline def apply(added_at: String, album: ShowObjectFull): SavedShowObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], album = album.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedShowObject]
  }
  
  extension [Self <: SavedShowObject](x: Self) {
    
    inline def setAdded_at(value: String): Self = StObject.set(x, "added_at", value.asInstanceOf[js.Any])
    
    inline def setAlbum(value: ShowObjectFull): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
  }
}
