package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object OperationNs extends js.Object {
  trait AccountMerge extends Operation {
    var destination: java.lang.String
  }
  
  trait AccountMergeOptions extends js.Object {
    var destination: java.lang.String
    var source: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait AllowTrust extends Operation {
    var assetCode: java.lang.String
    var authorize: scala.Boolean
    var trustor: java.lang.String
  }
  
  trait AllowTrustOptions extends js.Object {
    var assetCode: java.lang.String
    var authorize: scala.Boolean
    var source: js.UndefOr[java.lang.String] = js.undefined
    var trustor: java.lang.String
  }
  
  @js.native
  sealed trait AuthFlags extends js.Object
  
  trait BumpSequence extends Operation {
    var bumpTo: java.lang.String
  }
  
  trait BumpSequenceOptions extends js.Object {
    var bumpTo: java.lang.String
    var source: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ChangeTrust extends Operation {
    var limit: java.lang.String | scala.Double
    var line: stellarDashSdkLib.stellarDashSdkMod.Asset
  }
  
  trait ChangeTrustOptions extends js.Object {
    var asset: stellarDashSdkLib.stellarDashSdkMod.Asset
    var limit: js.UndefOr[java.lang.String] = js.undefined
    var source: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateAccount extends Operation {
    var destination: java.lang.String
    @JSName("source")
    var source_CreateAccount: java.lang.String
    var startingBalance: java.lang.String | scala.Double
  }
  
  trait CreateAccountOptions extends js.Object {
    var destination: java.lang.String
    var source: js.UndefOr[java.lang.String] = js.undefined
    var startingBalance: java.lang.String
  }
  
  trait CreatePassiveOffer extends Operation {
    var amount: java.lang.String | scala.Double
    var buying: stellarDashSdkLib.stellarDashSdkMod.Asset
    var price: java.lang.String | scala.Double
    var selling: stellarDashSdkLib.stellarDashSdkMod.Asset
  }
  
  trait CreatePassiveOfferOptions extends js.Object {
    var amount: java.lang.String
    var buying: stellarDashSdkLib.stellarDashSdkMod.Asset
    var price: scala.Double | java.lang.String | js.Object
    var selling: stellarDashSdkLib.stellarDashSdkMod.Asset
    var source: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Inflation extends Operation
  
  trait ManageData extends Operation {
    var name: java.lang.String
    var value: nodeLib.Buffer
  }
  
  trait ManageDataOptions extends js.Object {
    var name: java.lang.String
    var source: js.UndefOr[java.lang.String] = js.undefined
    var value: java.lang.String | nodeLib.Buffer
  }
  
  trait ManageOffer extends Operation {
    var amount: java.lang.String | scala.Double
    var buying: stellarDashSdkLib.stellarDashSdkMod.Asset
    var offerId: java.lang.String
    var price: java.lang.String | scala.Double
    var selling: stellarDashSdkLib.stellarDashSdkMod.Asset
  }
  
  trait ManageOfferOptions extends CreatePassiveOfferOptions {
    var offerId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  trait Operation extends js.Object {
    var source: java.lang.String | scala.Null
    var `type`: stellarDashSdkLib.stellarDashSdkMod.OperationType
  }
  
  trait PathPayment extends Operation {
    var destAmount: java.lang.String | scala.Double
    var destAsset: stellarDashSdkLib.stellarDashSdkMod.Asset
    var destination: java.lang.String
    var path: js.Array[stellarDashSdkLib.stellarDashSdkMod.Asset]
    var sendAsset: stellarDashSdkLib.stellarDashSdkMod.Asset
    var sendMax: java.lang.String | scala.Double
  }
  
  trait PathPaymentOptions extends js.Object {
    var destAmount: java.lang.String
    var destAsset: stellarDashSdkLib.stellarDashSdkMod.Asset
    var destination: java.lang.String
    var path: js.Array[stellarDashSdkLib.stellarDashSdkMod.Asset]
    var sendAsset: stellarDashSdkLib.stellarDashSdkMod.Asset
    var sendMax: java.lang.String
    var source: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Payment extends Operation {
    var amount: java.lang.String | scala.Double
    var asset: stellarDashSdkLib.stellarDashSdkMod.Asset
    var destination: java.lang.String
  }
  
  trait PaymentOptions extends js.Object {
    var amount: java.lang.String
    var asset: stellarDashSdkLib.stellarDashSdkMod.Asset
    var destination: java.lang.String
    var source: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait SetOptions extends Operation {
    var clearFlags: js.UndefOr[AuthFlags] = js.undefined
    var highThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var homeDomain: js.UndefOr[java.lang.String] = js.undefined
    var inflationDest: js.UndefOr[java.lang.String] = js.undefined
    var lowThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var masterWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var medThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var setFlags: js.UndefOr[AuthFlags] = js.undefined
    var signer: js.UndefOr[Signer] = js.undefined
  }
  
  trait SetOptionsOptions extends js.Object {
    var clearFlags: js.UndefOr[AuthFlags] = js.undefined
    var highThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var homeDomain: js.UndefOr[java.lang.String] = js.undefined
    var inflationDest: js.UndefOr[java.lang.String] = js.undefined
    var lowThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var masterWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var medThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var setFlags: js.UndefOr[AuthFlags] = js.undefined
    var signer: js.UndefOr[Signer] = js.undefined
    var source: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Signer extends js.Object {
    var ed25519PublicKey: js.UndefOr[java.lang.String] = js.undefined
    var preAuthTx: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
    var sha256Hash: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
    var weight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  def accountMerge(options: AccountMergeOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[AccountMerge] = js.native
  def allowTrust(options: AllowTrustOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[AllowTrust] = js.native
  def bumpSequence(options: BumpSequenceOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[BumpSequence] = js.native
  def changeTrust(options: ChangeTrustOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[ChangeTrust] = js.native
  def createAccount(options: CreateAccountOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[CreateAccount] = js.native
  def createPassiveOffer(options: CreatePassiveOfferOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[CreatePassiveOffer] = js.native
  def fromXDRObject[T /* <: Operation */](xdrOperation: stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[T]): T = js.native
  def inflation(options: stellarDashSdkLib.Anon_Source): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[Inflation] = js.native
  def manageData(options: ManageDataOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[ManageData] = js.native
  def manageOffer(options: ManageOfferOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[ManageOffer] = js.native
  def pathPayment(options: PathPaymentOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[PathPayment] = js.native
  def payment(options: PaymentOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[Payment] = js.native
  def setOptions(options: SetOptionsOptions): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[SetOptions] = js.native
  /*
    * Required = 1 << 0
    * Revocable = 1 << 1
    * Immutable = 1 << 2
    */
  @js.native
  object AuthFlags extends js.Object {
    @js.native
    sealed trait Immutable
      extends stellarDashSdkLib.stellarDashSdkMod.OperationNs.AuthFlags
    
    @js.native
    sealed trait Required
      extends stellarDashSdkLib.stellarDashSdkMod.OperationNs.AuthFlags
    
    @js.native
    sealed trait Revocable
      extends stellarDashSdkLib.stellarDashSdkMod.OperationNs.AuthFlags
    
    /* 4 */ val Immutable: Immutable with scala.Double = js.native
    /* 1 */ val Required: Required with scala.Double = js.native
    /* 2 */ val Revocable: Revocable with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[stellarDashSdkLib.stellarDashSdkMod.OperationNs.AuthFlags with scala.Double] = js.native
  }
  
}

