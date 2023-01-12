package typings.spotifyWebPlaybackSdk.Spotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackContextTrack
  extends StObject
     with Entity {
  
  var artists: js.Array[Entity]
  
  var content_type: String
  
  var estimated_duration: Double
  
  var group: Entity
  
  var images: js.Array[Image]
  
  var uid: String
}
object PlaybackContextTrack {
  
  inline def apply(
    artists: js.Array[Entity],
    content_type: String,
    estimated_duration: Double,
    group: Entity,
    images: js.Array[Image],
    name: String,
    uid: String,
    uri: String,
    url: String
  ): PlaybackContextTrack = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], estimated_duration = estimated_duration.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackContextTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackContextTrack] (val x: Self) extends AnyVal {
    
    inline def setArtists(value: js.Array[Entity]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsVarargs(value: Entity*): Self = StObject.set(x, "artists", js.Array(value*))
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setEstimated_duration(value: Double): Self = StObject.set(x, "estimated_duration", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Entity): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
