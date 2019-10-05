package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.AccountMerge
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.AllowTrust
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.BumpSequence
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ChangeTrust
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.CreateAccount
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.CreatePassiveOffer
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.Inflation
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageData
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageOffer
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPayment
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.Payment
import typings.stellarDashBase.stellarDashBaseMod.OperationOptions.SetOptions
import typings.stellarDashBase.stellarDashBaseMod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object Operation extends js.Object {
  def accountMerge(options: AccountMerge): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.AccountMerge] = js.native
  def allowTrust(options: AllowTrust): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.AllowTrust] = js.native
  def bumpSequence(options: BumpSequence): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.BumpSequence] = js.native
  def changeTrust(options: ChangeTrust): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.ChangeTrust] = js.native
  def createAccount(options: CreateAccount): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.CreateAccount] = js.native
  def createPassiveOffer(options: CreatePassiveOffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.CreatePassiveOffer] = js.native
  def fromXDRObject[T /* <: typings.stellarDashBase.stellarDashBaseMod.Operation */](xdrOperation: typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[T]): T = js.native
  def inflation(options: Inflation): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.Inflation] = js.native
  def manageData(options: ManageData): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.ManageData] = js.native
  def manageOffer(options: ManageOffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.ManageOffer] = js.native
  def pathPayment(options: PathPayment): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.PathPayment] = js.native
  def payment(options: Payment): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.Payment] = js.native
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation.SetOptions[T]] = js.native
}

