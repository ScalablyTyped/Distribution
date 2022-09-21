package typings.spotifyWebPlaybackSdk.Spotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackContext extends StObject {
  
  var metadata: PlaybackContextMetadata | Null
  
  var uri: String | Null
}
object PlaybackContext {
  
  inline def apply(): PlaybackContext = {
    val __obj = js.Dynamic.literal(metadata = null, uri = null)
    __obj.asInstanceOf[PlaybackContext]
  }
  
  extension [Self <: PlaybackContext](x: Self) {
    
    inline def setMetadata(value: PlaybackContextMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
  }
}
