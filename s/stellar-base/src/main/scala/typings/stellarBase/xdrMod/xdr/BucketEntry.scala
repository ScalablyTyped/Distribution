package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketEntry extends js.Object {
  
  def deadEntry(): LedgerKey = js.native
  def deadEntry(value: LedgerKey): LedgerKey = js.native
  
  def liveEntry(): LedgerEntry = js.native
  def liveEntry(value: LedgerEntry): LedgerEntry = js.native
  
  def metaEntry(): BucketMetadata = js.native
  def metaEntry(value: BucketMetadata): BucketMetadata = js.native
  
  def switch(): BucketEntryType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): LedgerEntry | LedgerKey | BucketMetadata = js.native
}
