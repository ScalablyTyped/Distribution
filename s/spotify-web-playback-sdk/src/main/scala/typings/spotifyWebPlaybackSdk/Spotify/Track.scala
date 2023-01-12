package typings.spotifyWebPlaybackSdk.Spotify

import typings.spotifyWebPlaybackSdk.anon.Id
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ad
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.audio
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.episode
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.track
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  var album: Album
  
  var artists: js.Array[Entity]
  
  var duration_ms: Double
  
  var id: String | Null
  
  var is_playable: Boolean
  
  var linked_from: Id
  
  var media_type: audio | video
  
  var name: String
  
  var track_type: audio | video
  
  var `type`: track | episode | ad
  
  var uid: String
  
  var uri: String
}
object Track {
  
  inline def apply(
    album: Album,
    artists: js.Array[Entity],
    duration_ms: Double,
    is_playable: Boolean,
    linked_from: Id,
    media_type: audio | video,
    name: String,
    track_type: audio | video,
    `type`: track | episode | ad,
    uid: String,
    uri: String
  ): Track = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], linked_from = linked_from.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track_type = track_type.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: Album): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setArtists(value: js.Array[Entity]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsVarargs(value: Entity*): Self = StObject.set(x, "artists", js.Array(value*))
    
    inline def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIs_playable(value: Boolean): Self = StObject.set(x, "is_playable", value.asInstanceOf[js.Any])
    
    inline def setLinked_from(value: Id): Self = StObject.set(x, "linked_from", value.asInstanceOf[js.Any])
    
    inline def setMedia_type(value: audio | video): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTrack_type(value: audio | video): Self = StObject.set(x, "track_type", value.asInstanceOf[js.Any])
    
    inline def setType(value: track | episode | ad): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
