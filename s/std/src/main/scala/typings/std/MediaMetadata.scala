package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata) */
trait MediaMetadata extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/album) */
  /* standard dom */
  var album: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/artist) */
  /* standard dom */
  var artist: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/artwork) */
  /* standard dom */
  var artwork: js.Array[MediaImage]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/title) */
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
