package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base Playlist Object. Does not in itself exist in Spotify Web Api,
  * but needs to be made since the tracks types vary in the Full and Simplified versions.
  */
trait PlaylistBaseObject extends ContextObject {
  /**
    * Returns `true` if context is not search and the owner allows other users to modify the playlist.
    * Otherwise returns `false`.
    */
  var collaborative: Boolean
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the playlist.
    */
  var id: String
  /**
    * Images for the playlist. The array may be empty or contain up to three images.
    * The images are returned by size in descending order.
    * See [Working with Playlists](https://developer.spotify.com/documentation/general/guides/working-with-playlists/).
    * Note: If returned, the source URL for the image (`url`) is temporary and will expire in less than a day.
    */
  var images: js.Array[ImageObject]
  /**
    * The name of the playlist.
    */
  var name: String
  /**
    * The user who owns the playlist.
    */
  var owner: UserObjectPublic
  /**
    * The playlist’s public/private status:
    * `true` the playlist is public,
    * `false` the playlist is private,
    * or `null` the playlist status is not relevant.
    */
  var public: Boolean | Null
  /**
    * The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version:
    * see [Remove tracks from a playlist](https://developer.spotify.com/documentation/web-api/reference/playlists/remove-tracks-playlist/).
    */
  var snapshot_id: String
  @JSName("type")
  var type_PlaylistBaseObject: playlist
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
    snapshot_id: String,
    `type`: playlist,
    uri: String,
    public: js.UndefOr[Boolean] = js.undefined
  ): PlaylistBaseObject = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistBaseObject]
  }
}

