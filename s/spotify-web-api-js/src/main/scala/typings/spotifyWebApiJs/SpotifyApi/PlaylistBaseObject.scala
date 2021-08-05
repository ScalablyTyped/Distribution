package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.playlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base Playlist Object. Does not in itself exist in Spotify Web Api,
  * but needs to be made since the tracks types vary in the Full and Simplified versions.
  */
trait PlaylistBaseObject extends StObject {
  
  var collaborative: Boolean
  
  var description: String | Null
  
  var external_urls: ExternalUrlObject
  
  var href: String
  
  var id: String
  
  var images: js.Array[ImageObject]
  
  var name: String
  
  var owner: UserObjectPublic
  
  var public: Boolean
  
  var snapshot_id: String
  
  var `type`: playlist
  
  var uri: String
}
object PlaylistBaseObject {
  
  inline def apply(
    collaborative: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    owner: UserObjectPublic,
    public: Boolean,
    snapshot_id: String,
    uri: String
  ): PlaylistBaseObject = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], description = null)
    __obj.updateDynamic("type")("playlist")
    __obj.asInstanceOf[PlaylistBaseObject]
  }
  
  extension [Self <: PlaylistBaseObject](x: Self) {
    
    inline def setCollaborative(value: Boolean): Self = StObject.set(x, "collaborative", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: UserObjectPublic): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: String): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: playlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
