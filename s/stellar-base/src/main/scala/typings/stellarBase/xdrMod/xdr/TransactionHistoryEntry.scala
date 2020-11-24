package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionHistoryEntry extends js.Object {
  
  def ext(): TransactionHistoryEntryExt = js.native
  def ext(value: TransactionHistoryEntryExt): TransactionHistoryEntryExt = js.native
  
  def ledgerSeq(): Double = js.native
  def ledgerSeq(value: Double): Double = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def txSet(): TransactionSet = js.native
  def txSet(value: TransactionSet): TransactionSet = js.native
}
