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

