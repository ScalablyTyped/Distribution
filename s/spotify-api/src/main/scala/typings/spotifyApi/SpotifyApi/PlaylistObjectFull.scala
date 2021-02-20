package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.playlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Playlist Object Full
  * [](https://developer.spotify.com/web-api/object-model/#playlist-object-full)
  */
@js.native
trait PlaylistObjectFull extends PlaylistBaseObject {
  
  /**
    * Information about the followers of the playlist.
    */
  var followers: FollowersObject = js.native
  
  /**
    * Information about the tracks of the playlist.
    */
  var tracks: PagingObject[PlaylistTrackObject] = js.native
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
    `type`: playlist,
    uri: String
  ): PlaylistObjectFull = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
