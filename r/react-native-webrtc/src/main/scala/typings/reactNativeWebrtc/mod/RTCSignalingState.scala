package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.stable
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-local-offer`
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-remote-offer`
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-local-pranswer`
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-remote-pranswer`
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.closed
*/
trait RTCSignalingState extends js.Object

object RTCSignalingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.reactNativeWebrtc.reactNativeWebrtcStrings.closed = this.cast("closed")
  @scala.inline
  def `have-local-offer`: typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-local-offer` = this.cast("have-local-offer")
  @scala.inline
  def `have-local-pranswer`: typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-local-pranswer` = this.cast("have-local-pranswer")
  @scala.inline
  def `have-remote-offer`: typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-remote-offer` = this.cast("have-remote-offer")
  @scala.inline
  def `have-remote-pranswer`: typings.reactNativeWebrtc.reactNativeWebrtcStrings.`have-remote-pranswer` = this.cast("have-remote-pranswer")
  @scala.inline
  def stable: typings.reactNativeWebrtc.reactNativeWebrtcStrings.stable = this.cast("stable")
}

