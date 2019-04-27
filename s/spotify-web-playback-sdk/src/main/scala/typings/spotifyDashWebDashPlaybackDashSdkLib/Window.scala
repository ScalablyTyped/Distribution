package typings
package spotifyDashWebDashPlaybackDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Spotify: Anon_Options
  def onSpotifyWebPlaybackSDKReady(): scala.Unit
}

object Window {
  @scala.inline
  def apply(Spotify: Anon_Options, onSpotifyWebPlaybackSDKReady: () => scala.Unit): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify, onSpotifyWebPlaybackSDKReady = js.Any.fromFunction0(onSpotifyWebPlaybackSDKReady))
  
    __obj.asInstanceOf[Window]
  }
}

