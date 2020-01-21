package typings.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssetType = typings.stellarBase.mod.AssetType.native | typings.stellarBase.mod.AssetType.credit4 | typings.stellarBase.mod.AssetType.credit12
  type AuthFlag = typings.stellarBase.mod.AuthFlag.immutable | typings.stellarBase.mod.AuthFlag.required | typings.stellarBase.mod.AuthFlag.revocable
  type KeypairType = typings.stellarBase.stellarBaseStrings.ed25519
  type MemoType = typings.stellarBase.mod.MemoType.None | typings.stellarBase.mod.MemoType.ID | typings.stellarBase.mod.MemoType.Text | typings.stellarBase.mod.MemoType.Hash | typings.stellarBase.mod.MemoType.Return
  type MemoValue = scala.Null | java.lang.String | typings.node.Buffer
  type Operation = typings.stellarBase.mod.Operation.CreateAccount_ | typings.stellarBase.mod.Operation.Payment_ | typings.stellarBase.mod.Operation.PathPaymentStrictReceive_ | typings.stellarBase.mod.Operation.PathPaymentStrictSend_ | typings.stellarBase.mod.Operation.CreatePassiveSellOffer_ | typings.stellarBase.mod.Operation.ManageSellOffer_ | typings.stellarBase.mod.Operation.ManageBuyOffer_ | typings.stellarBase.mod.Operation.SetOptions_[typings.stellarBase.mod.SignerOptions] | typings.stellarBase.mod.Operation.ChangeTrust_ | typings.stellarBase.mod.Operation.AllowTrust_ | typings.stellarBase.mod.Operation.AccountMerge_ | typings.stellarBase.mod.Operation.Inflation_ | typings.stellarBase.mod.Operation.ManageData_ | typings.stellarBase.mod.Operation.BumpSequence_
  type OperationOptions = typings.stellarBase.mod.OperationOptions.CreateAccount | typings.stellarBase.mod.OperationOptions.Payment | typings.stellarBase.mod.OperationOptions.PathPaymentStrictReceive | typings.stellarBase.mod.OperationOptions.PathPaymentStrictSend | typings.stellarBase.mod.OperationOptions.CreatePassiveSellOffer | typings.stellarBase.mod.OperationOptions.ManageSellOffer | typings.stellarBase.mod.OperationOptions.ManageBuyOffer | typings.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing] | typings.stellarBase.mod.OperationOptions.ChangeTrust | typings.stellarBase.mod.OperationOptions.AllowTrust | typings.stellarBase.mod.OperationOptions.AccountMerge | typings.stellarBase.mod.OperationOptions.Inflation | typings.stellarBase.mod.OperationOptions.ManageData | typings.stellarBase.mod.OperationOptions.BumpSequence
  type OperationType = typings.stellarBase.mod.OperationType.CreateAccount | typings.stellarBase.mod.OperationType.Payment | typings.stellarBase.mod.OperationType.PathPaymentStrictReceive | typings.stellarBase.mod.OperationType.PathPaymentStrictSend | typings.stellarBase.mod.OperationType.CreatePassiveSellOffer | typings.stellarBase.mod.OperationType.ManageSellOffer | typings.stellarBase.mod.OperationType.ManageBuyOffer | typings.stellarBase.mod.OperationType.SetOptions | typings.stellarBase.mod.OperationType.ChangeTrust | typings.stellarBase.mod.OperationType.AllowTrust | typings.stellarBase.mod.OperationType.AccountMerge | typings.stellarBase.mod.OperationType.Inflation | typings.stellarBase.mod.OperationType.ManageData | typings.stellarBase.mod.OperationType.BumpSequence
  type Signer = typings.stellarBase.mod.Signer.Ed25519PublicKey | typings.stellarBase.mod.Signer.Sha256Hash | typings.stellarBase.mod.Signer.PreAuthTx
  type SignerOptions = typings.stellarBase.mod.SignerOptions.Ed25519PublicKey | typings.stellarBase.mod.SignerOptions.Sha256Hash | typings.stellarBase.mod.SignerOptions.PreAuthTx
  type TransactionBuilder = typings.stellarBase.mod.TransactionBuilder_
}
