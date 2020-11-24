package typings.spotifyWebPlaybackSdk

import typings.spotifyWebPlaybackSdk.anon.TypeofSpotify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var Spotify: TypeofSpotify = js.native
  
  def onSpotifyWebPlaybackSDKReady(): Unit = js.native
}
object Window {
  
  @scala.inline
  def apply(Spotify: TypeofSpotify, onSpotifyWebPlaybackSDKReady: () => Unit): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify.asInstanceOf[js.Any], onSpotifyWebPlaybackSDKReady = js.Any.fromFunction0(onSpotifyWebPlaybackSDKReady))
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpotify(value: TypeofSpotify): Self = this.set("Spotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSpotifyWebPlaybackSDKReady(value: () => Unit): Self = this.set("onSpotifyWebPlaybackSDKReady", js.Any.fromFunction0(value))
  }
}
