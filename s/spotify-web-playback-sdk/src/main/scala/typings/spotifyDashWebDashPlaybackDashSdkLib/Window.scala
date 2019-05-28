package typings
package spotifyDashWebDashPlaybackDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Spotify: TypeofSpotify
  def onSpotifyWebPlaybackSDKReady(): scala.Unit
}

object Window {
  @scala.inline
  def apply(Spotify: TypeofSpotify, onSpotifyWebPlaybackSDKReady: () => scala.Unit): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify, onSpotifyWebPlaybackSDKReady = js.Any.fromFunction0(onSpotifyWebPlaybackSDKReady))
  
    __obj.asInstanceOf[Window]
  }
}

