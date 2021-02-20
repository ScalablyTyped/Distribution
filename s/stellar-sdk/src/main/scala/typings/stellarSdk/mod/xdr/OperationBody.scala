package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationBody")
@js.native
class OperationBody ()
  extends typings.stellarBase.mod.xdr.OperationBody
object OperationBody {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.accountMerge")
  @js.native
  def accountMerge(value: typings.stellarBase.xdrMod.xdr.MuxedAccount): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.allowTrust")
  @js.native
  def allowTrust(value: typings.stellarBase.xdrMod.xdr.AllowTrustOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.beginSponsoringFutureReserves")
  @js.native
  def beginSponsoringFutureReserves(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.bumpSequence")
  @js.native
  def bumpSequence(value: typings.stellarBase.xdrMod.xdr.BumpSequenceOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.changeTrust")
  @js.native
  def changeTrust(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.claimClaimableBalance")
  @js.native
  def claimClaimableBalance(value: typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.createAccount")
  @js.native
  def createAccount(value: typings.stellarBase.xdrMod.xdr.CreateAccountOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.createClaimableBalance")
  @js.native
  def createClaimableBalance(value: typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.createPassiveSellOffer")
  @js.native
  def createPassiveSellOffer(value: typings.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.endSponsoringFutureReserves")
  @js.native
  def endSponsoringFutureReserves(): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSImport("stellar-sdk", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSImport("stellar-sdk", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.inflation")
  @js.native
  def inflation(): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationBody): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.manageBuyOffer")
  @js.native
  def manageBuyOffer(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.manageData")
  @js.native
  def manageData(value: typings.stellarBase.xdrMod.xdr.ManageDataOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.manageSellOffer")
  @js.native
  def manageSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.pathPaymentStrictReceive")
  @js.native
  def pathPaymentStrictReceive(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.pathPaymentStrictSend")
  @js.native
  def pathPaymentStrictSend(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.payment")
  @js.native
  def payment(value: typings.stellarBase.xdrMod.xdr.PaymentOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.revokeSponsorship")
  @js.native
  def revokeSponsorship(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.setOptions")
  @js.native
  def setOptions(value: typings.stellarBase.xdrMod.xdr.SetOptionsOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationBody): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationBody.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationBody, io: Buffer): Unit = js.native
}
