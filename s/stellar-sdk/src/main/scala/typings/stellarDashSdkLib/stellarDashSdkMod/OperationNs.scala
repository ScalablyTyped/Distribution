package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object OperationNs extends js.Object {
  def accountMerge(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.AccountMerge): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.AccountMerge] = js.native
  def allowTrust(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.AllowTrust): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.AllowTrust] = js.native
  def bumpSequence(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.BumpSequence): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.BumpSequence] = js.native
  def changeTrust(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ChangeTrust): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.ChangeTrust] = js.native
  def createAccount(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.CreateAccount): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.CreateAccount] = js.native
  def createPassiveOffer(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.CreatePassiveOffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.CreatePassiveOffer] = js.native
  def fromXDRObject[T /* <: stellarDashBaseLib.stellarDashBaseMod.Operation */](xdrOperation: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[T]): T = js.native
  def inflation(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.Inflation): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.Inflation] = js.native
  def manageData(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ManageData): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.ManageData] = js.native
  def manageOffer(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ManageOffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.ManageOffer] = js.native
  def pathPayment(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.PathPayment): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.PathPayment] = js.native
  def payment(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.Payment): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.Payment] = js.native
  def setOptions[T /* <: stellarDashBaseLib.stellarDashBaseMod.SignerOptions */](options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.SetOptions[T]): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.OperationNs.SetOptions[T]] = js.native
}

