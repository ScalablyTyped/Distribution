package typings.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qrcode.qrcodeStrings.low
  - typings.qrcode.qrcodeStrings.medium
  - typings.qrcode.qrcodeStrings.quartile
  - typings.qrcode.qrcodeStrings.high
  - typings.qrcode.qrcodeStrings.L
  - typings.qrcode.qrcodeStrings.M
  - typings.qrcode.qrcodeStrings.Q
  - typings.qrcode.qrcodeStrings.H
*/
trait QRCodeErrorCorrectionLevel extends js.Object

object QRCodeErrorCorrectionLevel {
  @scala.inline
  def H: typings.qrcode.qrcodeStrings.H = this.cast("H")
  @scala.inline
  def L: typings.qrcode.qrcodeStrings.L = this.cast("L")
  @scala.inline
  def M: typings.qrcode.qrcodeStrings.M = this.cast("M")
  @scala.inline
  def Q: typings.qrcode.qrcodeStrings.Q = this.cast("Q")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.qrcode.qrcodeStrings.high = this.cast("high")
  @scala.inline
  def low: typings.qrcode.qrcodeStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.qrcode.qrcodeStrings.medium = this.cast("medium")
  @scala.inline
  def quartile: typings.qrcode.qrcodeStrings.quartile = this.cast("quartile")
}

