package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.`new`
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.checking
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.connected
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.completed
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.failed
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.disconnected
  - typings.reactNativeWebrtc.reactNativeWebrtcStrings.closed
*/
trait RTCIceConnectionState extends js.Object

object RTCIceConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checking: typings.reactNativeWebrtc.reactNativeWebrtcStrings.checking = this.cast("checking")
  @scala.inline
  def closed: typings.reactNativeWebrtc.reactNativeWebrtcStrings.closed = this.cast("closed")
  @scala.inline
  def completed: typings.reactNativeWebrtc.reactNativeWebrtcStrings.completed = this.cast("completed")
  @scala.inline
  def connected: typings.reactNativeWebrtc.reactNativeWebrtcStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typings.reactNativeWebrtc.reactNativeWebrtcStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def failed: typings.reactNativeWebrtc.reactNativeWebrtcStrings.failed = this.cast("failed")
  @scala.inline
  def `new`: typings.reactNativeWebrtc.reactNativeWebrtcStrings.`new` = this.cast("new")
}

