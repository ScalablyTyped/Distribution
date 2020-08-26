package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.TransactionExt")
@js.native
class TransactionExt ()
  extends typings.stellarBase.mod.xdr.TransactionExt

/* static members */
@JSImport("stellar-sdk", "xdr.TransactionExt")
@js.native
object TransactionExt extends js.Object {
  def `0`(): typings.stellarBase.xdrMod.xdr.TransactionExt = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionExt = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionExt): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionExt = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionExt): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionExt, io: Buffer): Unit = js.native
}

