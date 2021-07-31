package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Playlist Object Full
  * [](https://developer.spotify.com/web-api/object-model/#playlist-object-full)
  */
trait PlaylistObjectFull
  extends StObject
     with PlaylistBaseObject {
  
  /**
    * Information about the followers of the playlist.
    */
  var followers: FollowersObject
  
  /**
    * Information about the tracks of the playlist.
    */
  var tracks: PagingObject[PlaylistTrackObject]
}
object PlaylistObjectFull {
  
  @scala.inline
  def apply(
    collaborative: Boolean,
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    owner: UserObjectPublic,
    snapshot_id: String,
    tracks: PagingObject[PlaylistTrackObject],
    uri: String
  ): PlaylistObjectFull = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], description = null, public = null)
    __obj.updateDynamic("type")("playlist")
    __obj.asInstanceOf[PlaylistObjectFull]
  }
  
  @scala.inline
  implicit class PlaylistObjectFullMutableBuilder[Self <: PlaylistObjectFull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowers(value: FollowersObject): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracks(value: PagingObject[PlaylistTrackObject]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
