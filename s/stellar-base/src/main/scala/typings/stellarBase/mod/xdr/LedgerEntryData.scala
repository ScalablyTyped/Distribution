package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerEntryData")
@js.native
class LedgerEntryData ()
  extends typings.stellarBase.xdrMod.default.LedgerEntryData
object LedgerEntryData {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.account")
  @js.native
  def account(value: typings.stellarBase.xdrMod.xdr.AccountEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.claimableBalance")
  @js.native
  def claimableBalance(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.data")
  @js.native
  def data(value: typings.stellarBase.xdrMod.xdr.DataEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerEntryData): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.offer")
  @js.native
  def offer(value: typings.stellarBase.xdrMod.xdr.OfferEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerEntryData): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.trustline")
  @js.native
  def trustline(value: typings.stellarBase.xdrMod.xdr.TrustLineEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryData.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerEntryData, io: Buffer): Unit = js.native
}
