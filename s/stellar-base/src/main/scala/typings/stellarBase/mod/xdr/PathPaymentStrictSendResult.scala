package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.PathPaymentStrictSendResult")
@js.native
class PathPaymentStrictSendResult ()
  extends typings.stellarBase.xdrMod.default.PathPaymentStrictSendResult

/* static members */
@JSImport("stellar-base", "xdr.PathPaymentStrictSendResult")
@js.native
object PathPaymentStrictSendResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Boolean = js.native
  def pathPaymentStrictSendNoIssuer(value: typings.stellarBase.xdrMod.xdr.Asset): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  def pathPaymentStrictSendSuccess(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult, io: Buffer): Unit = js.native
}

