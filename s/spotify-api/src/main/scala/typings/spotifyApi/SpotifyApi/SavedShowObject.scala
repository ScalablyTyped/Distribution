package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saved Show Object
  * [saved show object](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-show-object)
  */
trait SavedShowObject extends StObject {
  
  /**
    * The date and time the show was saved.
    */
  var added_at: String
  
  /**
    * Information about the show.
    */
  var show: ShowObjectSimplified
}
object SavedShowObject {
  
  inline def apply(added_at: String, show: ShowObjectSimplified): SavedShowObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedShowObject]
  }
  
  extension [Self <: SavedShowObject](x: Self) {
    
    inline def setAdded_at(value: String): Self = StObject.set(x, "added_at", value.asInstanceOf[js.Any])
    
    inline def setShow(value: ShowObjectSimplified): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
