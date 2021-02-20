package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerKey extends StObject {
  
  def account(): LedgerKeyAccount = js.native
  def account(value: LedgerKeyAccount): LedgerKeyAccount = js.native
  
  def claimableBalance(): LedgerKeyClaimableBalance = js.native
  def claimableBalance(value: LedgerKeyClaimableBalance): LedgerKeyClaimableBalance = js.native
  
  def data(): LedgerKeyData = js.native
  def data(value: LedgerKeyData): LedgerKeyData = js.native
  
  def offer(): LedgerKeyOffer = js.native
  def offer(value: LedgerKeyOffer): LedgerKeyOffer = js.native
  
  def switch(): LedgerEntryType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def trustLine(): LedgerKeyTrustLine = js.native
  def trustLine(value: LedgerKeyTrustLine): LedgerKeyTrustLine = js.native
  
  def value(): LedgerKeyAccount | LedgerKeyTrustLine | LedgerKeyOffer | LedgerKeyData | LedgerKeyClaimableBalance = js.native
}
