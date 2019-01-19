package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Operation")
@js.native
object OperationNs extends js.Object {
  trait AccountMerge
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.AccountMerge] {
    var destination: java.lang.String
  }
  
  trait AllowTrust
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.AllowTrust] {
    var assetCode: java.lang.String
    var authorize: js.UndefOr[scala.Boolean]
    var trustor: java.lang.String
  }
  
  trait BaseOperation[T /* <: stellarDashBaseLib.stellarDashBaseMod.OperationType */] extends js.Object {
    var source: js.UndefOr[java.lang.String] = js.undefined
    var `type`: T
  }
  
  trait BumpSequence
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.BumpSequence] {
    var bumpTo: java.lang.String
  }
  
  trait ChangeTrust
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.ChangeTrust] {
    var limit: java.lang.String
    var line: stellarDashBaseLib.stellarDashBaseMod.Asset
  }
  
  trait CreateAccount
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.CreateAccount] {
    var destination: java.lang.String
    var startingBalance: java.lang.String
  }
  
  trait CreatePassiveOffer
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.CreatePassiveOffer] {
    var amount: java.lang.String
    var buying: stellarDashBaseLib.stellarDashBaseMod.Asset
    var price: java.lang.String
    var selling: stellarDashBaseLib.stellarDashBaseMod.Asset
  }
  
  trait Inflation
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.Inflation]
  
  trait ManageData
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.ManageData] {
    var name: java.lang.String
    var value: nodeLib.Buffer
  }
  
  trait ManageOffer
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.ManageOffer] {
    var amount: java.lang.String
    var buying: stellarDashBaseLib.stellarDashBaseMod.Asset
    var offerId: java.lang.String
    var price: java.lang.String
    var selling: stellarDashBaseLib.stellarDashBaseMod.Asset
  }
  
  trait PathPayment
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.PathPayment] {
    var destAmount: java.lang.String
    var destAsset: stellarDashBaseLib.stellarDashBaseMod.Asset
    var destination: java.lang.String
    var path: js.Array[stellarDashBaseLib.stellarDashBaseMod.Asset]
    var sendAsset: stellarDashBaseLib.stellarDashBaseMod.Asset
    var sendMax: java.lang.String
  }
  
  trait Payment
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.Payment] {
    var amount: java.lang.String
    var asset: stellarDashBaseLib.stellarDashBaseMod.Asset
    var destination: java.lang.String
  }
  
  trait SetOptions[T /* <: stellarDashBaseLib.stellarDashBaseMod.SignerOptions */]
    extends BaseOperation[stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.SetOptions] {
    var clearFlags: js.UndefOr[stellarDashBaseLib.stellarDashBaseMod.AuthFlag] = js.undefined
    var highThreshold: js.UndefOr[scala.Double] = js.undefined
    var homeDomain: js.UndefOr[java.lang.String] = js.undefined
    var inflationDest: js.UndefOr[java.lang.String] = js.undefined
    var lowThreshold: js.UndefOr[scala.Double] = js.undefined
    var masterWeight: js.UndefOr[scala.Double] = js.undefined
    var medThreshold: js.UndefOr[scala.Double] = js.undefined
    var setFlags: js.UndefOr[stellarDashBaseLib.stellarDashBaseMod.AuthFlag] = js.undefined
    var signer: stellarDashBaseLib.stellarDashBaseMod.SignerNs.PreAuthTx | stellarDashBaseLib.stellarDashBaseMod.SignerNs.Sha256Hash | stellarDashBaseLib.stellarDashBaseMod.SignerNs.Ed25519PublicKey
  }
  
  def accountMerge(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.AccountMerge): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def allowTrust(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.AllowTrust): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def bumpSequence(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.BumpSequence): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def changeTrust(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ChangeTrust): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def createAccount(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.CreateAccount): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def createPassiveOffer(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.CreatePassiveOffer): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def fromXDRObject[T /* <: stellarDashBaseLib.stellarDashBaseMod.Operation */](xdrOperation: stellarDashBaseLib.stellarDashBaseMod.Operation): T = js.native
  def inflation(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.Inflation): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def manageData(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ManageData): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def manageOffer(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ManageOffer): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def pathPayment(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.PathPayment): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def payment(options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.Payment): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
  def setOptions[T /* <: stellarDashBaseLib.stellarDashBaseMod.SignerOptions */](options: stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.SetOptions[T]): stellarDashBaseLib.stellarDashBaseMod.Operation = js.native
}

