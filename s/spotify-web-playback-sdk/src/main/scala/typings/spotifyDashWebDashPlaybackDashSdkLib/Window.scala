package typings
package spotifyDashWebDashPlaybackDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def onSpotifyWebPlaybackSDKReady(): scala.Unit
}

object Window {
  @scala.inline
  def apply(onSpotifyWebPlaybackSDKReady: () => scala.Unit): Window = {
    val __obj = js.Dynamic.literal(onSpotifyWebPlaybackSDKReady = js.Any.fromFunction0(onSpotifyWebPlaybackSDKReady))
  
    __obj.asInstanceOf[Window]
  }
}

