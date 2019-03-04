package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var album: Album
  var artists: js.Array[Artist]
  var id: java.lang.String | scala.Null
  var is_playable: scala.Boolean
  var media_type: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.audio | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.video
  var name: java.lang.String
  var `type`: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.track | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.episode | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.ad
  var uri: java.lang.String
}

object Track {
  @scala.inline
  def apply(
    album: Album,
    artists: js.Array[Artist],
    is_playable: scala.Boolean,
    media_type: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.audio | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.video,
    name: java.lang.String,
    `type`: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.track | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.episode | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.ad,
    uri: java.lang.String,
    id: java.lang.String = null
  ): Track = {
    val __obj = js.Dynamic.literal(album = album, artists = artists, is_playable = is_playable, media_type = media_type.asInstanceOf[js.Any], name = name, uri = uri)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Track]
  }
}

