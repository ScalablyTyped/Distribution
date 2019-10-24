package typings.spotifyDashNodeDashApplescript.spotifyDashNodeDashApplescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotifyState extends js.Object {
  var position: Double
  var state: SpotifyPlayingState
  var volume: Double
}

object SpotifyState {
  @scala.inline
  def apply(position: Double, state: SpotifyPlayingState, volume: Double): SpotifyState = {
    val __obj = js.Dynamic.literal(position = position, state = state, volume = volume)
  
    __obj.asInstanceOf[SpotifyState]
  }
}

