package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationResultTr")
@js.native
class OperationResultTr ()
  extends typings.stellarBase.mod.xdr.OperationResultTr
object OperationResultTr {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.accountMerge")
  @js.native
  def accountMerge(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.allowTrust")
  @js.native
  def allowTrust(value: typings.stellarBase.xdrMod.xdr.AllowTrustResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.beginSponsoringFutureReserves")
  @js.native
  def beginSponsoringFutureReserves(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.bumpSequence")
  @js.native
  def bumpSequence(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.changeTrust")
  @js.native
  def changeTrust(value: typings.stellarBase.xdrMod.xdr.ChangeTrustResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.claimClaimableBalance")
  @js.native
  def claimClaimableBalance(value: typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.createAccount")
  @js.native
  def createAccount(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.createClaimableBalance")
  @js.native
  def createClaimableBalance(value: typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.createPassiveSellOffer")
  @js.native
  def createPassiveSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.endSponsoringFutureReserves")
  @js.native
  def endSponsoringFutureReserves(value: typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSImport("stellar-sdk", "xdr.OperationResultTr.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSImport("stellar-sdk", "xdr.OperationResultTr.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.inflation")
  @js.native
  def inflation(value: typings.stellarBase.xdrMod.xdr.InflationResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.manageBuyOffer")
  @js.native
  def manageBuyOffer(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.manageData")
  @js.native
  def manageData(value: typings.stellarBase.xdrMod.xdr.ManageDataResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.manageSellOffer")
  @js.native
  def manageSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.pathPaymentStrictReceive")
  @js.native
  def pathPaymentStrictReceive(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.pathPaymentStrictSend")
  @js.native
  def pathPaymentStrictSend(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.payment")
  @js.native
  def payment(value: typings.stellarBase.xdrMod.xdr.PaymentResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.revokeSponsorship")
  @js.native
  def revokeSponsorship(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.setOptions")
  @js.native
  def setOptions(value: typings.stellarBase.xdrMod.xdr.SetOptionsResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationResultTr.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationResultTr.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResultTr.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationResultTr, io: Buffer): Unit = js.native
}
