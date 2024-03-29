package typings.spotifyWebPlaybackSdk

import typings.spotifyWebPlaybackSdk.anon.TypeofSpotify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Spotify: TypeofSpotify
  
  def onSpotifyWebPlaybackSDKReady(): Unit
}
object Window {
  
  inline def apply(Spotify: TypeofSpotify, onSpotifyWebPlaybackSDKReady: () => Unit): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify.asInstanceOf[js.Any], onSpotifyWebPlaybackSDKReady = js.Any.fromFunction0(onSpotifyWebPlaybackSDKReady))
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setOnSpotifyWebPlaybackSDKReady(value: () => Unit): Self = StObject.set(x, "onSpotifyWebPlaybackSDKReady", js.Any.fromFunction0(value))
    
    inline def setSpotify(value: TypeofSpotify): Self = StObject.set(x, "Spotify", value.asInstanceOf[js.Any])
  }
}
