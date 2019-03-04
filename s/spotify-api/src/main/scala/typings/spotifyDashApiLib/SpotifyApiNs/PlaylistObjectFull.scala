package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist Object Full
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistObjectFull extends PlaylistBaseObject {
  var description: java.lang.String
  var followers: FollowersObject
  var tracks: PagingObject[PlaylistTrackObject]
}

object PlaylistObjectFull {
  @scala.inline
  def apply(
    collaborative: scala.Boolean,
    description: java.lang.String,
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    href: java.lang.String,
    id: java.lang.String,
    images: js.Array[ImageObject],
    name: java.lang.String,
    owner: UserObjectPublic,
    public: scala.Boolean,
    snapshot_id: java.lang.String,
    tracks: PagingObject[PlaylistTrackObject],
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.playlist,
    uri: java.lang.String
  ): PlaylistObjectFull = {
    val __obj = js.Dynamic.literal(collaborative = collaborative, description = description, external_urls = external_urls, followers = followers, href = href, id = id, images = images, name = name, owner = owner, public = public, snapshot_id = snapshot_id, tracks = tracks, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlaylistObjectFull]
  }
}

