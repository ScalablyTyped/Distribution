package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.`new`
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.gathering
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.complete
*/
trait RTCIceGatheringState extends js.Object

object RTCIceGatheringState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.reactNativeWebrtc.reactNativeWebrtcStrings.complete = this.cast("complete")
  @scala.inline
  def gathering: typings.reactNativeWebrtc.reactNativeWebrtcStrings.gathering = this.cast("gathering")
  @scala.inline
  def `new`: typings.reactNativeWebrtc.reactNativeWebrtcStrings.`new` = this.cast("new")
}

