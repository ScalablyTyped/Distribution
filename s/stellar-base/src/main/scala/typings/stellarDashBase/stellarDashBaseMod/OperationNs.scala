package typings.stellarDashBase.stellarDashBaseMod

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.AccountMerge
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.AllowTrust
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.BaseOperation
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.BumpSequence
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.ChangeTrust
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.CreateAccount
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.CreatePassiveOffer
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.Inflation
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.ManageData
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.ManageOffer
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.PathPayment
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.Payment
import typings.stellarDashBase.stellarDashBaseMod.OperationNs.SetOptions
import typings.stellarDashBase.stellarDashBaseMod.SignerNs.Ed25519PublicKey
import typings.stellarDashBase.stellarDashBaseMod.SignerNs.PreAuthTx
import typings.stellarDashBase.stellarDashBaseMod.SignerNs.Sha256Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Operation")
@js.native
object OperationNs extends js.Object {
  trait AccountMerge
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.AccountMerge]
       with _Operation {
    var destination: String
  }
  
  trait AllowTrust
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.AllowTrust]
       with _Operation {
    var assetCode: String
    var authorize: js.UndefOr[Boolean] = js.undefined
    var trustor: String
  }
  
  trait BaseOperation[T /* <: OperationType */] extends js.Object {
    var source: js.UndefOr[String] = js.undefined
    var `type`: T
  }
  
  trait BumpSequence
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.BumpSequence]
       with _Operation {
    var bumpTo: String
  }
  
  trait ChangeTrust
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.ChangeTrust]
       with _Operation {
    var limit: String
    var line: Asset
  }
  
  trait CreateAccount
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.CreateAccount]
       with _Operation {
    var destination: String
    var startingBalance: String
  }
  
  trait CreatePassiveOffer
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.CreatePassiveOffer]
       with _Operation {
    var amount: String
    var buying: Asset
    var price: String
    var selling: Asset
  }
  
  trait ManageData
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.ManageData]
       with _Operation {
    var name: String
    var value: Buffer
  }
  
  trait ManageOffer
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.ManageOffer]
       with _Operation {
    var amount: String
    var buying: Asset
    var offerId: String
    var price: String
    var selling: Asset
  }
  
  trait PathPayment
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.PathPayment]
       with _Operation {
    var destAmount: String
    var destAsset: Asset
    var destination: String
    var path: js.Array[Asset]
    var sendAsset: Asset
    var sendMax: String
  }
  
  trait Payment
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.Payment]
       with _Operation {
    var amount: String
    var asset: Asset
    var destination: String
  }
  
  trait SetOptions[T /* <: SignerOptions */]
    extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.SetOptions] {
    var clearFlags: js.UndefOr[AuthFlag] = js.undefined
    var highThreshold: js.UndefOr[Double] = js.undefined
    var homeDomain: js.UndefOr[String] = js.undefined
    var inflationDest: js.UndefOr[String] = js.undefined
    var lowThreshold: js.UndefOr[Double] = js.undefined
    var masterWeight: js.UndefOr[Double] = js.undefined
    var medThreshold: js.UndefOr[Double] = js.undefined
    var setFlags: js.UndefOr[AuthFlag] = js.undefined
    var signer: PreAuthTx | Sha256Hash | Ed25519PublicKey
  }
  
  def accountMerge(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.AccountMerge): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[AccountMerge] = js.native
  def allowTrust(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.AllowTrust): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[AllowTrust] = js.native
  def bumpSequence(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.BumpSequence): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[BumpSequence] = js.native
  def changeTrust(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ChangeTrust): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[ChangeTrust] = js.native
  def createAccount(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.CreateAccount): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[CreateAccount] = js.native
  def createPassiveOffer(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.CreatePassiveOffer): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[CreatePassiveOffer] = js.native
  def fromXDRObject[T /* <: Operation */](xdrOperation: typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[T]): T = js.native
  def inflation(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.Inflation): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[Inflation] = js.native
  def manageData(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ManageData): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[ManageData] = js.native
  def manageOffer(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ManageOffer): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[ManageOffer] = js.native
  def pathPayment(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.PathPayment): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[PathPayment] = js.native
  def payment(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.Payment): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[Payment] = js.native
  def setOptions[T /* <: SignerOptions */](options: typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.SetOptions[T]): typings.stellarDashBase.stellarDashBaseMod.xdrNs.Operation[SetOptions[T]] = js.native
  type Inflation = BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.Inflation]
}

