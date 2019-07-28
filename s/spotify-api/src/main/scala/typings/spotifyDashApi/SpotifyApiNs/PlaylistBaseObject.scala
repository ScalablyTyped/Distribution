package typings.spotifyDashApi.SpotifyApiNs

import typings.spotifyDashApi.spotifyDashApiStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base Playlist Object. Does not in itself exist in Spotify Web Api,
  * but needs to be made since the tracks types vary in the Full and Simplified versions.
  */
trait PlaylistBaseObject extends js.Object {
  var collaborative: Boolean
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
    `type`: playlist,
    uri: String
  ): PlaylistBaseObject = {
    val __obj = js.Dynamic.literal(collaborative = collaborative, external_urls = external_urls, href = href, id = id, images = images, name = name, owner = owner, public = public, snapshot_id = snapshot_id, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlaylistBaseObject]
  }
}

