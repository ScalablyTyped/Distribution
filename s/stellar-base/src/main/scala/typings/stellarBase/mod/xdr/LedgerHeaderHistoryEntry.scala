package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntry")
@js.native
class LedgerHeaderHistoryEntry protected ()
  extends typings.stellarBase.xdrMod.default.LedgerHeaderHistoryEntry {
  def this(attributes: typings.stellarBase.anon.Hash) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntry")
@js.native
object LedgerHeaderHistoryEntry extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry, io: Buffer): Unit = js.native
}

