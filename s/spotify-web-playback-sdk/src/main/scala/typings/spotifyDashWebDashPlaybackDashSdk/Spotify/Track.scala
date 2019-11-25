package typings.spotifyDashWebDashPlaybackDashSdk.Spotify

import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.ad
import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.audio
import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.episode
import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.track
import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var album: Album
  var artists: js.Array[Artist]
  var id: String | Null
  var is_playable: Boolean
  var media_type: audio | video
  var name: String
  var `type`: track | episode | ad
  var uri: String
}

object Track {
  @scala.inline
  def apply(
    album: Album,
    artists: js.Array[Artist],
    is_playable: Boolean,
    media_type: audio | video,
    name: String,
    `type`: track | episode | ad,
    uri: String,
    id: String = null
  ): Track = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
}

