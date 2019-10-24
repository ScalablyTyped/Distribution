package typings.spotifyDashNodeDashApplescript

import typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptMod.SpotifyPlayingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object spotifyDashNodeDashApplescriptStrings {
  @js.native
  sealed trait paused extends SpotifyPlayingState
  
  @js.native
  sealed trait playing extends SpotifyPlayingState
  
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
}

