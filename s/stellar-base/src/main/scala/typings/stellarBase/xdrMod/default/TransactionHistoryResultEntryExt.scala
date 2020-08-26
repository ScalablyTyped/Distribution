package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TransactionHistoryResultEntryExt")
@js.native
class TransactionHistoryResultEntryExt ()
  extends typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt

/* static members */
@JSImport("stellar-base/types/xdr", "TransactionHistoryResultEntryExt")
@js.native
object TransactionHistoryResultEntryExt extends js.Object {
  def `0`(): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt, io: Buffer): Unit = js.native
}

