package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationResultTr")
@js.native
class OperationResultTr ()
  extends typings.stellarBase.mod.xdr.OperationResultTr
/* static members */
@JSImport("stellar-sdk", "xdr.OperationResultTr")
@js.native
object OperationResultTr extends js.Object {
  
  def accountMerge(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def allowTrust(value: typings.stellarBase.xdrMod.xdr.AllowTrustResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def beginSponsoringFutureReserves(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def bumpSequence(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def changeTrust(value: typings.stellarBase.xdrMod.xdr.ChangeTrustResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def claimClaimableBalance(value: typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def createAccount(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def createClaimableBalance(value: typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def createPassiveSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def endSponsoringFutureReserves(value: typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def inflation(value: typings.stellarBase.xdrMod.xdr.InflationResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): Boolean = js.native
  
  def manageBuyOffer(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def manageData(value: typings.stellarBase.xdrMod.xdr.ManageDataResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def manageSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def pathPaymentStrictReceive(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def pathPaymentStrictSend(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def payment(value: typings.stellarBase.xdrMod.xdr.PaymentResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def revokeSponsorship(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def setOptions(value: typings.stellarBase.xdrMod.xdr.SetOptionsResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.OperationResultTr, io: Buffer): Unit = js.native
}
