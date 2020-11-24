package typings.stellarSdk.mod

import typings.stellarBase.mod.Operation.AccountMerge_
import typings.stellarBase.mod.Operation.AllowTrust_
import typings.stellarBase.mod.Operation.BeginSponsoringFutureReserves_
import typings.stellarBase.mod.Operation.BumpSequence_
import typings.stellarBase.mod.Operation.ChangeTrust_
import typings.stellarBase.mod.Operation.ClaimClaimableBalance_
import typings.stellarBase.mod.Operation.CreateAccount_
import typings.stellarBase.mod.Operation.CreateClaimableBalance_
import typings.stellarBase.mod.Operation.CreatePassiveSellOffer_
import typings.stellarBase.mod.Operation.EndSponsoringFutureReserves_
import typings.stellarBase.mod.Operation.Inflation_
import typings.stellarBase.mod.Operation.ManageBuyOffer_
import typings.stellarBase.mod.Operation.ManageData_
import typings.stellarBase.mod.Operation.ManageSellOffer_
import typings.stellarBase.mod.Operation.PathPaymentStrictReceive_
import typings.stellarBase.mod.Operation.PathPaymentStrictSend_
import typings.stellarBase.mod.Operation.Payment_
import typings.stellarBase.mod.Operation.RevokeAccountSponsorship_
import typings.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_
import typings.stellarBase.mod.Operation.RevokeDataSponsorship_
import typings.stellarBase.mod.Operation.RevokeOfferSponsorship_
import typings.stellarBase.mod.Operation.RevokeSignerSponsorship_
import typings.stellarBase.mod.Operation.RevokeTrustlineSponsorship_
import typings.stellarBase.mod.Operation.SetOptions_
import typings.stellarBase.mod.OperationOptions.AccountMerge
import typings.stellarBase.mod.OperationOptions.AllowTrust
import typings.stellarBase.mod.OperationOptions.BaseOptions
import typings.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves
import typings.stellarBase.mod.OperationOptions.BumpSequence
import typings.stellarBase.mod.OperationOptions.ChangeTrust
import typings.stellarBase.mod.OperationOptions.ClaimClaimableBalance
import typings.stellarBase.mod.OperationOptions.CreateAccount
import typings.stellarBase.mod.OperationOptions.CreateClaimableBalance
import typings.stellarBase.mod.OperationOptions.CreatePassiveSellOffer
import typings.stellarBase.mod.OperationOptions.Inflation
import typings.stellarBase.mod.OperationOptions.ManageBuyOffer
import typings.stellarBase.mod.OperationOptions.ManageData
import typings.stellarBase.mod.OperationOptions.ManageSellOffer
import typings.stellarBase.mod.OperationOptions.PathPaymentStrictReceive
import typings.stellarBase.mod.OperationOptions.PathPaymentStrictSend
import typings.stellarBase.mod.OperationOptions.Payment
import typings.stellarBase.mod.OperationOptions.RevokeAccountSponsorship
import typings.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship
import typings.stellarBase.mod.OperationOptions.RevokeDataSponsorship
import typings.stellarBase.mod.OperationOptions.RevokeOfferSponsorship
import typings.stellarBase.mod.OperationOptions.RevokeSignerSponsorship
import typings.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship
import typings.stellarBase.mod.OperationOptions.SetOptions
import typings.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Operation")
@js.native
object Operation extends js.Object {
  
  def accountMerge(options: AccountMerge): typings.stellarBase.xdrMod.default.Operation[AccountMerge_] = js.native
  
  def allowTrust(options: AllowTrust): typings.stellarBase.xdrMod.default.Operation[AllowTrust_] = js.native
  
  def beginSponsoringFutureReserves(options: BeginSponsoringFutureReserves): typings.stellarBase.xdrMod.default.Operation[BeginSponsoringFutureReserves_] = js.native
  
  def bumpSequence(options: BumpSequence): typings.stellarBase.xdrMod.default.Operation[BumpSequence_] = js.native
  
  def changeTrust(options: ChangeTrust): typings.stellarBase.xdrMod.default.Operation[ChangeTrust_] = js.native
  
  def claimClaimableBalance(options: ClaimClaimableBalance): typings.stellarBase.xdrMod.default.Operation[ClaimClaimableBalance_] = js.native
  
  def createAccount(options: CreateAccount): typings.stellarBase.xdrMod.default.Operation[CreateAccount_] = js.native
  
  def createClaimableBalance(options: CreateClaimableBalance): typings.stellarBase.xdrMod.default.Operation[CreateClaimableBalance_] = js.native
  
  def createPassiveSellOffer(options: CreatePassiveSellOffer): typings.stellarBase.xdrMod.default.Operation[CreatePassiveSellOffer_] = js.native
  
  def endSponsoringFutureReserves(options: BaseOptions): typings.stellarBase.xdrMod.default.Operation[EndSponsoringFutureReserves_] = js.native
  
  def fromXDRObject[T /* <: typings.stellarBase.mod.Operation */](xdrOperation: typings.stellarBase.xdrMod.default.Operation[T]): T = js.native
  
  def inflation(options: Inflation): typings.stellarBase.xdrMod.default.Operation[Inflation_] = js.native
  
  def manageBuyOffer(options: ManageBuyOffer): typings.stellarBase.xdrMod.default.Operation[ManageBuyOffer_] = js.native
  
  def manageData(options: ManageData): typings.stellarBase.xdrMod.default.Operation[ManageData_] = js.native
  
  def manageSellOffer(options: ManageSellOffer): typings.stellarBase.xdrMod.default.Operation[ManageSellOffer_] = js.native
  
  def pathPaymentStrictReceive(options: PathPaymentStrictReceive): typings.stellarBase.xdrMod.default.Operation[PathPaymentStrictReceive_] = js.native
  
  def pathPaymentStrictSend(options: PathPaymentStrictSend): typings.stellarBase.xdrMod.default.Operation[PathPaymentStrictSend_] = js.native
  
  def payment(options: Payment): typings.stellarBase.xdrMod.default.Operation[Payment_] = js.native
  
  def revokeAccountSponsorship(options: RevokeAccountSponsorship): typings.stellarBase.xdrMod.default.Operation[RevokeAccountSponsorship_] = js.native
  
  def revokeClaimableBalanceSponsorship(options: RevokeClaimableBalanceSponsorship): typings.stellarBase.xdrMod.default.Operation[RevokeClaimableBalanceSponsorship_] = js.native
  
  def revokeDataSponsorship(options: RevokeDataSponsorship): typings.stellarBase.xdrMod.default.Operation[RevokeDataSponsorship_] = js.native
  
  def revokeOfferSponsorship(options: RevokeOfferSponsorship): typings.stellarBase.xdrMod.default.Operation[RevokeOfferSponsorship_] = js.native
  
  def revokeSignerSponsorship(options: RevokeSignerSponsorship): typings.stellarBase.xdrMod.default.Operation[RevokeSignerSponsorship_] = js.native
  
  def revokeTrustlineSponsorship(options: RevokeTrustlineSponsorship): typings.stellarBase.xdrMod.default.Operation[RevokeTrustlineSponsorship_] = js.native
  
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): typings.stellarBase.xdrMod.default.Operation[SetOptions_[T]] = js.native
}
