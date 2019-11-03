package typings.stellarDashBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashBaseMod {
  import typings.node.Buffer
  import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit12
  import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit4
  import typings.stellarDashBase.stellarDashBaseMod.AssetType.native
  import typings.stellarDashBase.stellarDashBaseMod.AuthFlag.immutable
  import typings.stellarDashBase.stellarDashBaseMod.AuthFlag.required
  import typings.stellarDashBase.stellarDashBaseMod.AuthFlag.revocable
  import typings.stellarDashBase.stellarDashBaseMod.MemoType.Hash
  import typings.stellarDashBase.stellarDashBaseMod.MemoType.ID
  import typings.stellarDashBase.stellarDashBaseMod.MemoType.None
  import typings.stellarDashBase.stellarDashBaseMod.MemoType.Return
  import typings.stellarDashBase.stellarDashBaseMod.MemoType.Text
  import typings.stellarDashBase.stellarDashBaseMod.Operation.AccountMerge
  import typings.stellarDashBase.stellarDashBaseMod.Operation.AllowTrust
  import typings.stellarDashBase.stellarDashBaseMod.Operation.BumpSequence
  import typings.stellarDashBase.stellarDashBaseMod.Operation.ChangeTrust
  import typings.stellarDashBase.stellarDashBaseMod.Operation.CreateAccount
  import typings.stellarDashBase.stellarDashBaseMod.Operation.CreatePassiveSellOffer
  import typings.stellarDashBase.stellarDashBaseMod.Operation.Inflation
  import typings.stellarDashBase.stellarDashBaseMod.Operation.ManageBuyOffer
  import typings.stellarDashBase.stellarDashBaseMod.Operation.ManageData
  import typings.stellarDashBase.stellarDashBaseMod.Operation.ManageSellOffer
  import typings.stellarDashBase.stellarDashBaseMod.Operation.PathPaymentStrictReceive
  import typings.stellarDashBase.stellarDashBaseMod.Operation.PathPaymentStrictSend
  import typings.stellarDashBase.stellarDashBaseMod.Operation.Payment
  import typings.stellarDashBase.stellarDashBaseMod.Operation.SetOptions
  import typings.stellarDashBase.stellarDashBaseMod.Signer.Ed25519PublicKey
  import typings.stellarDashBase.stellarDashBaseMod.Signer.PreAuthTx
  import typings.stellarDashBase.stellarDashBaseMod.Signer.Sha256Hash
  import typings.stellarDashBase.stellarDashBaseStrings.ed25519

  type AssetType = native | credit4 | credit12
  type AuthFlag = immutable | required | revocable
  type KeypairType = ed25519
  type MemoType = None | ID | Text | Hash | Return
  type MemoValue = Null | String | Buffer
  type Operation = CreateAccount | Payment | PathPaymentStrictReceive | PathPaymentStrictSend | CreatePassiveSellOffer | ManageSellOffer | ManageBuyOffer | SetOptions[SignerOptions] | ChangeTrust | AllowTrust | AccountMerge | Inflation | ManageData | BumpSequence
  type OperationOptions = typings.stellarDashBase.stellarDashBaseMod.OperationOptions.CreateAccount | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.Payment | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictReceive | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictSend | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.CreatePassiveSellOffer | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageSellOffer | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageBuyOffer | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.SetOptions[scala.Nothing] | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ChangeTrust | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.AllowTrust | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.AccountMerge | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.Inflation | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageData | typings.stellarDashBase.stellarDashBaseMod.OperationOptions.BumpSequence
  type OperationType = typings.stellarDashBase.stellarDashBaseMod.OperationType.CreateAccount | typings.stellarDashBase.stellarDashBaseMod.OperationType.Payment | typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictReceive | typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictSend | typings.stellarDashBase.stellarDashBaseMod.OperationType.CreatePassiveSellOffer | typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageSellOffer | typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageBuyOffer | typings.stellarDashBase.stellarDashBaseMod.OperationType.SetOptions | typings.stellarDashBase.stellarDashBaseMod.OperationType.ChangeTrust | typings.stellarDashBase.stellarDashBaseMod.OperationType.AllowTrust | typings.stellarDashBase.stellarDashBaseMod.OperationType.AccountMerge | typings.stellarDashBase.stellarDashBaseMod.OperationType.Inflation | typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageData | typings.stellarDashBase.stellarDashBaseMod.OperationType.BumpSequence
  type Signer = Ed25519PublicKey | Sha256Hash | PreAuthTx
  type SignerOptions = typings.stellarDashBase.stellarDashBaseMod.SignerOptions.Ed25519PublicKey | typings.stellarDashBase.stellarDashBaseMod.SignerOptions.Sha256Hash | typings.stellarDashBase.stellarDashBaseMod.SignerOptions.PreAuthTx
  type TransactionBuilder = TransactionBuilder_
}
