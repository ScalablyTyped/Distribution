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
  def apply(onSpotifyWebPlaybackSDKReady: js.Function0[scala.Unit]): Window = {
    val __obj = js.Dynamic.literal(onSpotifyWebPlaybackSDKReady = onSpotifyWebPlaybackSDKReady)
  
    __obj.asInstanceOf[Window]
  }
}

