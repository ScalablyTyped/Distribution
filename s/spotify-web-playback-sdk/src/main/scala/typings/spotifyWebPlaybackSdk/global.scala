package typings.spotifyWebPlaybackSdk

import typings.spotifyWebPlaybackSdk.Spotify.PlayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Spotify {
    
    /* was `typeof SpotifyPlayer` */
    @JSGlobal("Spotify.Player")
    @js.native
    class Player protected ()
      extends StObject
         with typings.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer {
      def this(options: PlayerInit) = this()
    }
    
    @JSGlobal("Spotify.SpotifyPlayer")
    @js.native
    class SpotifyPlayer protected ()
      extends StObject
         with typings.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer {
      def this(options: PlayerInit) = this()
    }
  }
}
