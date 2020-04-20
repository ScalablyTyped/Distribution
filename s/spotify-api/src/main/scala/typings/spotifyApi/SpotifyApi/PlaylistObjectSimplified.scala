package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.AnonHref
import typings.spotifyApi.spotifyApiStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist Object Simplified
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistObjectSimplified extends PlaylistBaseObject {
  var tracks: AnonHref
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
    snapshot_id: String,
    tracks: AnonHref,
    `type`: playlist,
    uri: String,
    public: js.UndefOr[Boolean] = js.undefined
  ): PlaylistObjectSimplified = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistObjectSimplified]
  }
}

