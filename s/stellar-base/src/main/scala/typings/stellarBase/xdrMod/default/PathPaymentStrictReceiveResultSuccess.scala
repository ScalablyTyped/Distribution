package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Last
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "PathPaymentStrictReceiveResultSuccess")
@js.native
class PathPaymentStrictReceiveResultSuccess protected ()
  extends typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess {
  def this(attributes: Last) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "PathPaymentStrictReceiveResultSuccess")
@js.native
object PathPaymentStrictReceiveResultSuccess extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess, io: Buffer): Unit = js.native
}

