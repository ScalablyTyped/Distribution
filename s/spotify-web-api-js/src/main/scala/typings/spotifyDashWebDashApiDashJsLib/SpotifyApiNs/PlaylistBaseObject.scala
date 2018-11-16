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

