package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.geolocation
  - typings.puppeteer.puppeteerStrings.midi
  - typings.puppeteer.puppeteerStrings.`midi-sysex`
  - typings.puppeteer.puppeteerStrings.notifications
  - typings.puppeteer.puppeteerStrings.push
  - typings.puppeteer.puppeteerStrings.camera
  - typings.puppeteer.puppeteerStrings.microphone
  - typings.puppeteer.puppeteerStrings.`background-sync`
  - typings.puppeteer.puppeteerStrings.`ambient-light-sensor`
  - typings.puppeteer.puppeteerStrings.accelerometer
  - typings.puppeteer.puppeteerStrings.gyroscope
  - typings.puppeteer.puppeteerStrings.magnetometer
  - typings.puppeteer.puppeteerStrings.`accessibility-events`
  - typings.puppeteer.puppeteerStrings.`clipboard-read`
  - typings.puppeteer.puppeteerStrings.`clipboard-write`
  - typings.puppeteer.puppeteerStrings.`payment-handler`
*/
trait Permission extends js.Object

object Permission {
  @scala.inline
  def accelerometer: typings.puppeteer.puppeteerStrings.accelerometer = this.cast("accelerometer")
  @scala.inline
  def `accessibility-events`: typings.puppeteer.puppeteerStrings.`accessibility-events` = this.cast("accessibility-events")
  @scala.inline
  def `ambient-light-sensor`: typings.puppeteer.puppeteerStrings.`ambient-light-sensor` = this.cast("ambient-light-sensor")
  @scala.inline
  def `background-sync`: typings.puppeteer.puppeteerStrings.`background-sync` = this.cast("background-sync")
  @scala.inline
  def camera: typings.puppeteer.puppeteerStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `clipboard-read`: typings.puppeteer.puppeteerStrings.`clipboard-read` = this.cast("clipboard-read")
  @scala.inline
  def `clipboard-write`: typings.puppeteer.puppeteerStrings.`clipboard-write` = this.cast("clipboard-write")
  @scala.inline
  def geolocation: typings.puppeteer.puppeteerStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def gyroscope: typings.puppeteer.puppeteerStrings.gyroscope = this.cast("gyroscope")
  @scala.inline
  def magnetometer: typings.puppeteer.puppeteerStrings.magnetometer = this.cast("magnetometer")
  @scala.inline
  def microphone: typings.puppeteer.puppeteerStrings.microphone = this.cast("microphone")
  @scala.inline
  def midi: typings.puppeteer.puppeteerStrings.midi = this.cast("midi")
  @scala.inline
  def `midi-sysex`: typings.puppeteer.puppeteerStrings.`midi-sysex` = this.cast("midi-sysex")
  @scala.inline
  def notifications: typings.puppeteer.puppeteerStrings.notifications = this.cast("notifications")
  @scala.inline
  def `payment-handler`: typings.puppeteer.puppeteerStrings.`payment-handler` = this.cast("payment-handler")
  @scala.inline
  def push: typings.puppeteer.puppeteerStrings.push = this.cast("push")
}

