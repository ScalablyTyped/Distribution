package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base Playlist Object. Does not in itself exist in Spotify Web Api,
  * but needs to be made since the tracks types vary in the Full and Simplified versions.
  */
trait PlaylistBaseObject extends js.Object {
  var collaborative: scala.Boolean
  var external_urls: ExternalUrlObject
  var href: java.lang.String
  var id: java.lang.String
  var images: js.Array[ImageObject]
  var name: java.lang.String
  var owner: UserObjectPublic
  var public: scala.Boolean
  var snapshot_id: java.lang.String
  var `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.playlist
  var uri: java.lang.String
}

object PlaylistBaseObject {
  @scala.inline
  def apply(
    collaborative: scala.Boolean,
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    images: js.Array[ImageObject],
    name: java.lang.String,
    owner: UserObjectPublic,
    public: scala.Boolean,
    snapshot_id: java.lang.String,
    `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.playlist,
    uri: java.lang.String
  ): PlaylistBaseObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("collaborative")(collaborative)
    __obj.updateDynamic("external_urls")(external_urls)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("public")(public)
    __obj.updateDynamic("snapshot_id")(snapshot_id)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[PlaylistBaseObject]
  }
}

