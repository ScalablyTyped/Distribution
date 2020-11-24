package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerEntryExtensionV1 extends js.Object {
  
  def ext(): LedgerEntryExtensionV1Ext = js.native
  def ext(value: LedgerEntryExtensionV1Ext): LedgerEntryExtensionV1Ext = js.native
  
  def sponsoringId(): SponsorshipDescriptor = js.native
  def sponsoringId(value: SponsorshipDescriptor): SponsorshipDescriptor = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
