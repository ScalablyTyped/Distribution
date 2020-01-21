package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist Object Full
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistObjectFull extends PlaylistBaseObject {
  var description: String
  var followers: FollowersObject
  var tracks: PagingObject[PlaylistTrackObject]
}

object PlaylistObjectFull {
  @scala.inline
  def apply(
    collaborative: Boolean,
    description: String,
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
    `type`: playlist,
    uri: String
  ): PlaylistObjectFull = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistObjectFull]
  }
}

