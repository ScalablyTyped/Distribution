package typings.spotifyDashApi.SpotifyApi

import typings.spotifyDashApi.spotifyDashApiStrings.playlist
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
    val __obj = js.Dynamic.literal(collaborative = collaborative, description = description, external_urls = external_urls, followers = followers, href = href, id = id, images = images, name = name, owner = owner, public = public, snapshot_id = snapshot_id, tracks = tracks, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlaylistObjectFull]
  }
}

