package typings.spotifyNodeApplescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotifyState extends js.Object {
  
  var position: Double = js.native
  
  var state: SpotifyPlayingState = js.native
  
  var volume: Double = js.native
}
object SpotifyState {
  
  @scala.inline
  def apply(position: Double, state: SpotifyPlayingState, volume: Double): SpotifyState = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotifyState]
  }
  
  @scala.inline
  implicit class SpotifyStateOps[Self <: SpotifyState] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SpotifyPlayingState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
