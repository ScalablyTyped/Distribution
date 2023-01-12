package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaMetadata extends StObject {
  
  /* standard dom */
  var album: java.lang.String
  
  /* standard dom */
  var artist: java.lang.String
  
  /* standard dom */
  var artwork: js.Array[MediaImage]
  
  /* standard dom */
  var title: java.lang.String
}
object MediaMetadata {
  
  inline def apply(
    album: java.lang.String,
    artist: java.lang.String,
    artwork: js.Array[MediaImage],
    title: java.lang.String
  ): MediaMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaMetadata] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: java.lang.String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setArtist(value: java.lang.String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtwork(value: js.Array[MediaImage]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setArtworkVarargs(value: MediaImage*): Self = StObject.set(x, "artwork", js.Array(value*))
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
