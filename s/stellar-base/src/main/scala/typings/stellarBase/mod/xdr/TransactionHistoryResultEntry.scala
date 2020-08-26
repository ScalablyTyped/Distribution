package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.TxResultSet
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.TransactionHistoryResultEntry")
@js.native
class TransactionHistoryResultEntry protected ()
  extends typings.stellarBase.xdrMod.default.TransactionHistoryResultEntry {
  def this(attributes: TxResultSet) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.TransactionHistoryResultEntry")
@js.native
object TransactionHistoryResultEntry extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry, io: Buffer): Unit = js.native
}

