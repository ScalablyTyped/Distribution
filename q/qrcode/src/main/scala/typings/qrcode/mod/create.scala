package typings.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qrcode", "create")
@js.native
object create extends js.Object {
  def apply(text: String, options: QRCodeOptions): QRCode = js.native
  def apply(text: js.Array[QRCodeSegment], options: QRCodeOptions): QRCode = js.native
}

