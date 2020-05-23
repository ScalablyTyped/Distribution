package typings.spotifyWebPlaybackSdk

import typings.spotifyWebPlaybackSdk.anon.TypeofSpotify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Spotify: TypeofSpotify
  def onSpotifyWebPlaybackSDKReady(): Unit
}

object Window {
  @scala.inline
  def apply(Spotify: TypeofSpotify, onSpotifyWebPlaybackSDKReady: () => Unit): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify.asInstanceOf[js.Any], onSpotifyWebPlaybackSDKReady = js.Any.fromFunction0(onSpotifyWebPlaybackSDKReady))
    __obj.asInstanceOf[Window]
  }
}

