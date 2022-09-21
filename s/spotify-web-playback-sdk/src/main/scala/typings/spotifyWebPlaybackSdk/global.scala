package typings.spotifyWebPlaybackSdk

import typings.spotifyWebPlaybackSdk.Spotify.PlayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Spotify {
    
    @JSGlobal("Spotify.Player")
    @js.native
    open class Player protected ()
      extends StObject
         with typings.spotifyWebPlaybackSdk.Spotify.Player {
      def this(options: PlayerInit) = this()
    }
  }
}
