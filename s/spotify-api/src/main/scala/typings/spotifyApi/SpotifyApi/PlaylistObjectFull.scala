package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist Object Full
  * [](https://developer.spotify.com/web-api/object-model/#playlist-object-full)
  */
trait PlaylistObjectFull extends PlaylistBaseObject {
  /**
    * The playlist description. Only returned for modified, verified playlists, otherwise null.
    */
  var description: String | Null
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
    `type`: playlist,
    uri: String,
    description: String = null,
    public: js.UndefOr[Boolean] = js.undefined
  ): PlaylistObjectFull = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistObjectFull]
  }
}

