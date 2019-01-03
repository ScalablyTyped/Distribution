package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object OperationNs extends js.Object {
  def accountMerge(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AccountMergeOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AccountMerge] = js.native
  def allowTrust(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AllowTrustOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AllowTrust] = js.native
  def bumpSequence(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.BumpSequenceOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.BumpSequence] = js.native
  def changeTrust(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ChangeTrustOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ChangeTrust] = js.native
  def createAccount(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.CreateAccountOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.CreateAccount] = js.native
  def createPassiveOffer(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.CreatePassiveOfferOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.CreatePassiveOffer] = js.native
  def fromXDRObject[T /* <: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Operation */](xdrOperation: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[T]): T = js.native
  def inflation(options: stellarDashSdkLib.Anon_Source): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Inflation] = js.native
  def manageData(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ManageDataOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ManageData] = js.native
  def manageOffer(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ManageOfferOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ManageOffer] = js.native
  def pathPayment(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.PathPaymentOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.PathPayment] = js.native
  def payment(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.PaymentOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Payment] = js.native
  def setOptions(options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.SetOptionsOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.SetOptions] = js.native
  /*
    * Required = 1 << 0
    * Revocable = 1 << 1
    * Immutable = 1 << 2
    */
  @js.native
  object AuthFlags extends js.Object {
    /* 4 */ val Immutable: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags.Immutable with scala.Double = js.native
    /* 1 */ val Required: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags.Required with scala.Double = js.native
    /* 2 */ val Revocable: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags.Revocable with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags with scala.Double
      ] = js.native
  }
  
  type AuthFlags = stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags
}

