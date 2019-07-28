package typings.spotifyDashApi.SpotifyApiNs

import typings.spotifyDashApi.Anon_Href
import typings.spotifyDashApi.spotifyDashApiStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist Object Simplified
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistObjectSimplified extends PlaylistBaseObject {
  var tracks: Anon_Href
}

object PlaylistObjectSimplified {
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
    tracks: Anon_Href,
    `type`: playlist,
    uri: String
  ): PlaylistObjectSimplified = {
    val __obj = js.Dynamic.literal(collaborative = collaborative, external_urls = external_urls, href = href, id = id, images = images, name = name, owner = owner, public = public, snapshot_id = snapshot_id, tracks = tracks, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlaylistObjectSimplified]
  }
}

