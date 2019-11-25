package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.geolocation
  - typings.std.stdStrings.notifications
  - typings.std.stdStrings.push
  - typings.std.stdStrings.midi
  - typings.std.stdStrings.camera
  - typings.std.stdStrings.microphone
  - typings.std.stdStrings.speaker
  - typings.std.stdStrings.`device-info`
  - typings.std.stdStrings.`background-sync`
  - typings.std.stdStrings.bluetooth
  - typings.std.stdStrings.`persistent-storage`
  - typings.std.stdStrings.`ambient-light-sensor`
  - typings.std.stdStrings.accelerometer
  - typings.std.stdStrings.gyroscope
  - typings.std.stdStrings.magnetometer
  - typings.std.stdStrings.clipboard
*/
trait PermissionName extends js.Object

object PermissionName {
  @scala.inline
  def accelerometer: typings.std.stdStrings.accelerometer = this.cast("accelerometer")
  @scala.inline
  def `ambient-light-sensor`: typings.std.stdStrings.`ambient-light-sensor` = this.cast("ambient-light-sensor")
  @scala.inline
  def `background-sync`: typings.std.stdStrings.`background-sync` = this.cast("background-sync")
  @scala.inline
  def bluetooth: typings.std.stdStrings.bluetooth = this.cast("bluetooth")
  @scala.inline
  def camera: typings.std.stdStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clipboard: typings.std.stdStrings.clipboard = this.cast("clipboard")
  @scala.inline
  def `device-info`: typings.std.stdStrings.`device-info` = this.cast("device-info")
  @scala.inline
  def geolocation: typings.std.stdStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def gyroscope: typings.std.stdStrings.gyroscope = this.cast("gyroscope")
  @scala.inline
  def magnetometer: typings.std.stdStrings.magnetometer = this.cast("magnetometer")
  @scala.inline
  def microphone: typings.std.stdStrings.microphone = this.cast("microphone")
  @scala.inline
  def midi: typings.std.stdStrings.midi = this.cast("midi")
  @scala.inline
  def notifications: typings.std.stdStrings.notifications = this.cast("notifications")
  @scala.inline
  def `persistent-storage`: typings.std.stdStrings.`persistent-storage` = this.cast("persistent-storage")
  @scala.inline
  def push: typings.std.stdStrings.push = this.cast("push")
  @scala.inline
  def speaker: typings.std.stdStrings.speaker = this.cast("speaker")
}

