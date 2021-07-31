package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Playlist Object Simplified
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistObjectSimplified
  extends StObject
     with PlaylistBaseObject {
  
  var tracks: Href
}
object PlaylistObjectSimplified {
  
  @scala.inline
  def apply(
    collaborative: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    owner: UserObjectPublic,
    public: Boolean,
    snapshot_id: String,
    tracks: Href,
    uri: String
  ): PlaylistObjectSimplified = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], description = null)
    __obj.updateDynamic("type")("playlist")
    __obj.asInstanceOf[PlaylistObjectSimplified]
  }
  
  @scala.inline
  implicit class PlaylistObjectSimplifiedMutableBuilder[Self <: PlaylistObjectSimplified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: Href): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
