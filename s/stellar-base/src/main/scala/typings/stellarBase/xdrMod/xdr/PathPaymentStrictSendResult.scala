package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathPaymentStrictSendResult extends js.Object {
  def noIssuer(): Asset = js.native
  def noIssuer(value: Asset): Asset = js.native
  def success(): PathPaymentStrictSendResultSuccess = js.native
  def success(value: PathPaymentStrictSendResultSuccess): PathPaymentStrictSendResultSuccess = js.native
  def switch(): PathPaymentStrictSendResultCode = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def value(): PathPaymentStrictSendResultSuccess | Asset = js.native
}

