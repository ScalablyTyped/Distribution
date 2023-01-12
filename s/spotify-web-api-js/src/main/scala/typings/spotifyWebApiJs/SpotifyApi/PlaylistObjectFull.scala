package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Playlist Object Full
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistObjectFull
  extends StObject
     with PlaylistBaseObject {
  
  var followers: FollowersObject
  
  var tracks: PagingObject[PlaylistTrackObject]
}
object PlaylistObjectFull {
  
  inline def apply(
    collaborative: Boolean,
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    owner: UserObjectPublic,
    public: Boolean,
    snapshot_id: String,
    tracks: PagingObject[PlaylistTrackObject],
    uri: String
  ): PlaylistObjectFull = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], description = null)
    __obj.updateDynamic("type")("playlist")
    __obj.asInstanceOf[PlaylistObjectFull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaylistObjectFull] (val x: Self) extends AnyVal {
    
    inline def setFollowers(value: FollowersObject): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: PagingObject[PlaylistTrackObject]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
