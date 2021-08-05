package typings.spotifyNodeApplescript

import typings.spotifyNodeApplescript.mod.SpotifyPlayingState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyNodeApplescriptStrings {
  
  @js.native
  sealed trait paused
    extends StObject
       with SpotifyPlayingState
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait playing
    extends StObject
       with SpotifyPlayingState
  inline def playing: playing = "playing".asInstanceOf[playing]
}
