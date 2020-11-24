package typings.spotifyNodeApplescript

import typings.spotifyNodeApplescript.mod.SpotifyPlayingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyNodeApplescriptStrings {
  
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait paused extends SpotifyPlayingState
  
  @js.native
  sealed trait playing extends SpotifyPlayingState
}
