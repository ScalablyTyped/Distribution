package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.AccountMerge
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.AllowTrust
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.BumpSequence
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ChangeTrust
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.CreateAccount
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.CreatePassiveOffer
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.Inflation
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ManageData
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ManageOffer
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.PathPayment
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.Payment
import typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.SetOptions
import typings.stellarDashBase.stellarDashBaseMod.SignerOptions
import typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object OperationNs extends js.Object {
  def accountMerge(options: AccountMerge): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.AccountMerge] = js.native
  def allowTrust(options: AllowTrust): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.AllowTrust] = js.native
  def bumpSequence(options: BumpSequence): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.BumpSequence] = js.native
  def changeTrust(options: ChangeTrust): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.ChangeTrust] = js.native
  def createAccount(options: CreateAccount): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.CreateAccount] = js.native
  def createPassiveOffer(options: CreatePassiveOffer): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.CreatePassiveOffer] = js.native
  def fromXDRObject[T /* <: typings.stellarDashBase.stellarDashBaseMod.Operation */](xdrOperation: Operation[T]): T = js.native
  def inflation(options: Inflation): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.Inflation] = js.native
  def manageData(options: ManageData): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.ManageData] = js.native
  def manageOffer(options: ManageOffer): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.ManageOffer] = js.native
  def pathPayment(options: PathPayment): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.PathPayment] = js.native
  def payment(options: Payment): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.Payment] = js.native
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): Operation[typings.stellarDashBase.stellarDashBaseMod.OperationNs.SetOptions[T]] = js.native
}

