package typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptStrings.playing
  - typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptStrings.paused
*/
trait SpotifyPlayingState extends js.Object

object SpotifyPlayingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def paused: typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptStrings.playing = this.cast("playing")
}

