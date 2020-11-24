package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSponsorshipOp extends js.Object {
  
  def ledgerKey(): LedgerKey = js.native
  def ledgerKey(value: LedgerKey): LedgerKey = js.native
  
  def signer(): RevokeSponsorshipOpSigner = js.native
  def signer(value: RevokeSponsorshipOpSigner): RevokeSponsorshipOpSigner = js.native
  
  def switch(): RevokeSponsorshipType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): LedgerKey | RevokeSponsorshipOpSigner = js.native
}
