package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackObject extends js.Object {
  
  var repeat_state: PlaybackRepeatState = js.native
  
  var shuffle_state: Boolean = js.native
}
object PlaybackObject {
  
  @scala.inline
  def apply(repeat_state: PlaybackRepeatState, shuffle_state: Boolean): PlaybackObject = {
    val __obj = js.Dynamic.literal(repeat_state = repeat_state.asInstanceOf[js.Any], shuffle_state = shuffle_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackObject]
  }
  
  @scala.inline
  implicit class PlaybackObjectOps[Self <: PlaybackObject] (val x: Self) extends AnyVal {
    
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
    def setRepeat_state(value: PlaybackRepeatState): Self = this.set("repeat_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffle_state(value: Boolean): Self = this.set("shuffle_state", value.asInstanceOf[js.Any])
  }
}
