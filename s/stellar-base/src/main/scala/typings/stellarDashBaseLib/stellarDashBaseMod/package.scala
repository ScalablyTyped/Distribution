package typings
package stellarDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashBaseMod {
  type AssetType = stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.native | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit4 | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit12
  type AuthFlag = stellarDashBaseLib.stellarDashBaseMod.AuthFlagNs.required | stellarDashBaseLib.stellarDashBaseMod.AuthFlagNs.revocable | stellarDashBaseLib.stellarDashBaseMod.AuthFlagNs.rmmutable
  type KeypairType = stellarDashBaseLib.stellarDashBaseLibStrings.ed25519
  type MemoType = stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.None | stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.ID | stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Text | stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Hash | stellarDashBaseLib.stellarDashBaseMod.MemoTypeNs.Return
  type MemoValue = scala.Null | java.lang.String | nodeLib.Buffer
  /* Rewritten from type alias, can be one of: 
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.CreateAccount
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.Payment
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.PathPayment
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.CreatePassiveOffer
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.ManageOffer
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.SetOptions[SignerOptions]
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.ChangeTrust
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.AllowTrust
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.AccountMerge
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.Inflation
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.ManageData
    - stellarDashBaseLib.stellarDashBaseMod.OperationNs.BumpSequence
  */
  type Operation = _Operation | stellarDashBaseLib.stellarDashBaseMod.OperationNs.SetOptions[SignerOptions] | stellarDashBaseLib.stellarDashBaseMod.OperationNs.Inflation
  /* Rewritten from type alias, can be one of: 
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.CreateAccount
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.Payment
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.PathPayment
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.CreatePassiveOffer
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ManageOffer
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.SetOptions[scala.Nothing]
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ChangeTrust
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.AllowTrust
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.AccountMerge
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.Inflation
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.ManageData
    - stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.BumpSequence
  */
  type OperationOptions = _OperationOptions | stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.SetOptions[scala.Nothing] | stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs.Inflation
  type OperationType = stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.CreateAccount | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.Payment | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.PathPayment | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.CreatePassiveOffer | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.ManageOffer | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.SetOptions | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.ChangeTrust | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.AllowTrust | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.AccountMerge | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.Inflation | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.ManageData | stellarDashBaseLib.stellarDashBaseMod.OperationTypeNs.BumpSequence
}
