package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.live
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.ended
*/
trait MediaStreamTrackState extends js.Object

object MediaStreamTrackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ended: typings.reactNativeWebrtc.reactNativeWebrtcStrings.ended = this.cast("ended")
  @scala.inline
  def live: typings.reactNativeWebrtc.reactNativeWebrtcStrings.live = this.cast("live")
}

