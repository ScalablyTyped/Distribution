package typings.std

import typings.std.stdStrings.nfc_
import typings.std.stdStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.ble
  - typings.std.stdStrings.internal
  - typings.std.stdStrings.nfc_
  - typings.std.stdStrings.usb_
*/
trait AuthenticatorTransport extends js.Object

object AuthenticatorTransport {
  @scala.inline
  def ble: typings.std.stdStrings.ble = "ble".asInstanceOf[typings.std.stdStrings.ble]
  @scala.inline
  def internal: typings.std.stdStrings.internal = "internal".asInstanceOf[typings.std.stdStrings.internal]
  @scala.inline
  def nfc: nfc_ = "nfc".asInstanceOf[nfc_]
  @scala.inline
  def usb: usb_ = "usb".asInstanceOf[usb_]
}

