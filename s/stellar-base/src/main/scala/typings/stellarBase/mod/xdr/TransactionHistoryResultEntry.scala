package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.TxResultSet
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.TransactionHistoryResultEntry")
@js.native
class TransactionHistoryResultEntry protected ()
  extends typings.stellarBase.xdrMod.default.TransactionHistoryResultEntry {
  def this(attributes: TxResultSet) = this()
}
object TransactionHistoryResultEntry {
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionHistoryResultEntry.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry, io: Buffer): Unit = js.native
}
