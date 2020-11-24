package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerHeaderHistoryEntry extends js.Object {
  
  def ext(): LedgerHeaderHistoryEntryExt = js.native
  def ext(value: LedgerHeaderHistoryEntryExt): LedgerHeaderHistoryEntryExt = js.native
  
  def hash(): Buffer = js.native
  def hash(value: Buffer): Buffer = js.native
  
  def header(): LedgerHeader = js.native
  def header(value: LedgerHeader): LedgerHeader = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
