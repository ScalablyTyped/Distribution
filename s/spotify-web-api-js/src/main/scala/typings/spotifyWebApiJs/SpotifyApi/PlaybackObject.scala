package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackObject extends StObject {
  
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
  implicit class PlaybackObjectMutableBuilder[Self <: PlaybackObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepeat_state(value: PlaybackRepeatState): Self = StObject.set(x, "repeat_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffle_state(value: Boolean): Self = StObject.set(x, "shuffle_state", value.asInstanceOf[js.Any])
  }
}
