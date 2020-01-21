package typings.spotifyNodeApplescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing
  - typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused
*/
trait SpotifyPlayingState extends js.Object

object SpotifyPlayingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def paused: typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing = this.cast("playing")
}

