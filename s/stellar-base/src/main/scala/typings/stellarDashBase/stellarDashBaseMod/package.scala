package typings.stellarDashBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashBaseMod {
  import typings.node.Buffer
  import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.credit12
  import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.credit4
  import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.native
  import typings.stellarDashBase.stellarDashBaseMod.AuthFlagNs.required
  import typings.stellarDashBase.stellarDashBaseMod.AuthFlagNs.revocable
  import typings.stellarDashBase.stellarDashBaseMod.AuthFlagNs.rmmutable
  import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.Hash
  import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.ID
  import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.None
  import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.Return
  import typings.stellarDashBase.stellarDashBaseMod.MemoTypeNs.Text
  import typings.stellarDashBase.stellarDashBaseMod.OperationNs.Inflation
  import typings.stellarDashBase.stellarDashBaseMod.OperationNs.SetOptions
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.AccountMerge
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.AllowTrust
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.BumpSequence
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.ChangeTrust
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.CreateAccount
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.CreatePassiveOffer
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.ManageData
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.ManageOffer
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.PathPayment
  import typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.Payment
  import typings.stellarDashBase.stellarDashBaseStrings.ed25519

  type AssetType = native | credit4 | credit12
  type AuthFlag = required | revocable | rmmutable
  type KeypairType = ed25519
  type MemoType = None | ID | Text | Hash | Return
  type MemoValue = Null | String | Buffer
  /* Rewritten from type alias, can be one of: 
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.CreateAccount
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.Payment
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.PathPayment
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.CreatePassiveOffer
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.ManageOffer
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.SetOptions[typings.stellarDashBase.stellarDashBaseMod.SignerOptions]
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.ChangeTrust
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.AllowTrust
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.AccountMerge
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.Inflation
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.ManageData
    - typings.stellarDashBase.stellarDashBaseMod.OperationNs.BumpSequence
  */
  type Operation = _Operation | SetOptions[SignerOptions] | Inflation
  /* Rewritten from type alias, can be one of: 
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.CreateAccount
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.Payment
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.PathPayment
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.CreatePassiveOffer
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ManageOffer
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.SetOptions[scala.Nothing]
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ChangeTrust
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.AllowTrust
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.AccountMerge
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.Inflation
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.ManageData
    - typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.BumpSequence
  */
  type OperationOptions = _OperationOptions | typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.SetOptions[scala.Nothing] | typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs.Inflation
  type OperationType = CreateAccount | Payment | PathPayment | CreatePassiveOffer | ManageOffer | typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.SetOptions | ChangeTrust | AllowTrust | AccountMerge | typings.stellarDashBase.stellarDashBaseMod.OperationTypeNs.Inflation | ManageData | BumpSequence
}
