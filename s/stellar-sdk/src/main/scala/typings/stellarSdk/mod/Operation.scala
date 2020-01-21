package typings.stellarSdk.mod

import typings.stellarBase.mod.Operation.AccountMerge_
import typings.stellarBase.mod.Operation.AllowTrust_
import typings.stellarBase.mod.Operation.BumpSequence_
import typings.stellarBase.mod.Operation.ChangeTrust_
import typings.stellarBase.mod.Operation.CreateAccount_
import typings.stellarBase.mod.Operation.CreatePassiveSellOffer_
import typings.stellarBase.mod.Operation.Inflation_
import typings.stellarBase.mod.Operation.ManageBuyOffer_
import typings.stellarBase.mod.Operation.ManageData_
import typings.stellarBase.mod.Operation.ManageSellOffer_
import typings.stellarBase.mod.Operation.PathPaymentStrictReceive_
import typings.stellarBase.mod.Operation.PathPaymentStrictSend_
import typings.stellarBase.mod.Operation.Payment_
import typings.stellarBase.mod.Operation.SetOptions_
import typings.stellarBase.mod.OperationOptions.AccountMerge
import typings.stellarBase.mod.OperationOptions.AllowTrust
import typings.stellarBase.mod.OperationOptions.BumpSequence
import typings.stellarBase.mod.OperationOptions.ChangeTrust
import typings.stellarBase.mod.OperationOptions.CreateAccount
import typings.stellarBase.mod.OperationOptions.CreatePassiveSellOffer
import typings.stellarBase.mod.OperationOptions.Inflation
import typings.stellarBase.mod.OperationOptions.ManageBuyOffer
import typings.stellarBase.mod.OperationOptions.ManageData
import typings.stellarBase.mod.OperationOptions.ManageSellOffer
import typings.stellarBase.mod.OperationOptions.PathPaymentStrictReceive
import typings.stellarBase.mod.OperationOptions.PathPaymentStrictSend
import typings.stellarBase.mod.OperationOptions.Payment
import typings.stellarBase.mod.OperationOptions.SetOptions
import typings.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object Operation extends js.Object {
  def accountMerge(options: AccountMerge): typings.stellarBase.mod.xdr.Operation[AccountMerge_] = js.native
  def allowTrust(options: AllowTrust): typings.stellarBase.mod.xdr.Operation[AllowTrust_] = js.native
  def bumpSequence(options: BumpSequence): typings.stellarBase.mod.xdr.Operation[BumpSequence_] = js.native
  def changeTrust(options: ChangeTrust): typings.stellarBase.mod.xdr.Operation[ChangeTrust_] = js.native
  def createAccount(options: CreateAccount): typings.stellarBase.mod.xdr.Operation[CreateAccount_] = js.native
  def createPassiveSellOffer(options: CreatePassiveSellOffer): typings.stellarBase.mod.xdr.Operation[CreatePassiveSellOffer_] = js.native
  def fromXDRObject[T /* <: typings.stellarBase.mod.Operation */](xdrOperation: typings.stellarBase.mod.xdr.Operation[T]): T = js.native
  def inflation(options: Inflation): typings.stellarBase.mod.xdr.Operation[Inflation_] = js.native
  def manageBuyOffer(options: ManageBuyOffer): typings.stellarBase.mod.xdr.Operation[ManageBuyOffer_] = js.native
  def manageData(options: ManageData): typings.stellarBase.mod.xdr.Operation[ManageData_] = js.native
  def manageSellOffer(options: ManageSellOffer): typings.stellarBase.mod.xdr.Operation[ManageSellOffer_] = js.native
  def pathPayment(options: PathPaymentStrictReceive): typings.stellarBase.mod.xdr.Operation[PathPaymentStrictReceive_] = js.native
  def pathPaymentStrictReceive(options: PathPaymentStrictReceive): typings.stellarBase.mod.xdr.Operation[PathPaymentStrictReceive_] = js.native
  def pathPaymentStrictSend(options: PathPaymentStrictSend): typings.stellarBase.mod.xdr.Operation[PathPaymentStrictSend_] = js.native
  def payment(options: Payment): typings.stellarBase.mod.xdr.Operation[Payment_] = js.native
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): typings.stellarBase.mod.xdr.Operation[SetOptions_[T]] = js.native
}

