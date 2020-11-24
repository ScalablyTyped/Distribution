package typings.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AssetType = typings.stellarBase.mod.AssetType.native | typings.stellarBase.mod.AssetType.credit4 | typings.stellarBase.mod.AssetType.credit12
  
  type AuthFlag = typings.stellarBase.mod.AuthFlag.immutable | typings.stellarBase.mod.AuthFlag.required | typings.stellarBase.mod.AuthFlag.revocable
  
  type KeypairType = typings.stellarBase.stellarBaseStrings.ed25519
  
  type MemoType = typings.stellarBase.mod.MemoType.None | typings.stellarBase.mod.MemoType.ID | typings.stellarBase.mod.MemoType.Text | typings.stellarBase.mod.MemoType.Hash | typings.stellarBase.mod.MemoType.Return
  
  type MemoValue = scala.Null | java.lang.String | typings.node.Buffer
  
  type Operation = typings.stellarBase.mod.Operation.CreateAccount_ | typings.stellarBase.mod.Operation.Payment_ | typings.stellarBase.mod.Operation.PathPaymentStrictReceive_ | typings.stellarBase.mod.Operation.PathPaymentStrictSend_ | typings.stellarBase.mod.Operation.CreatePassiveSellOffer_ | typings.stellarBase.mod.Operation.ManageSellOffer_ | typings.stellarBase.mod.Operation.ManageBuyOffer_ | typings.stellarBase.mod.Operation.SetOptions_[typings.stellarBase.mod.SignerOptions] | typings.stellarBase.mod.Operation.ChangeTrust_ | typings.stellarBase.mod.Operation.AllowTrust_ | typings.stellarBase.mod.Operation.AccountMerge_ | typings.stellarBase.mod.Operation.Inflation_ | typings.stellarBase.mod.Operation.ManageData_ | typings.stellarBase.mod.Operation.BumpSequence_ | typings.stellarBase.mod.Operation.CreateClaimableBalance_ | typings.stellarBase.mod.Operation.ClaimClaimableBalance_ | typings.stellarBase.mod.Operation.BeginSponsoringFutureReserves_ | typings.stellarBase.mod.Operation.EndSponsoringFutureReserves_ | typings.stellarBase.mod.Operation.RevokeAccountSponsorship_ | typings.stellarBase.mod.Operation.RevokeTrustlineSponsorship_ | typings.stellarBase.mod.Operation.RevokeOfferSponsorship_ | typings.stellarBase.mod.Operation.RevokeDataSponsorship_ | typings.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_ | typings.stellarBase.mod.Operation.RevokeSignerSponsorship_
  
  type OperationOptions = typings.stellarBase.mod.OperationOptions.CreateAccount | typings.stellarBase.mod.OperationOptions.Payment | typings.stellarBase.mod.OperationOptions.PathPaymentStrictReceive | typings.stellarBase.mod.OperationOptions.PathPaymentStrictSend | typings.stellarBase.mod.OperationOptions.CreatePassiveSellOffer | typings.stellarBase.mod.OperationOptions.ManageSellOffer | typings.stellarBase.mod.OperationOptions.ManageBuyOffer | typings.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing] | typings.stellarBase.mod.OperationOptions.ChangeTrust | typings.stellarBase.mod.OperationOptions.AllowTrust | typings.stellarBase.mod.OperationOptions.AccountMerge | typings.stellarBase.mod.OperationOptions.Inflation | typings.stellarBase.mod.OperationOptions.ManageData | typings.stellarBase.mod.OperationOptions.BumpSequence | typings.stellarBase.mod.OperationOptions.CreateClaimableBalance | typings.stellarBase.mod.OperationOptions.ClaimClaimableBalance | typings.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves | typings.stellarBase.mod.OperationOptions.RevokeAccountSponsorship | typings.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship | typings.stellarBase.mod.OperationOptions.RevokeOfferSponsorship | typings.stellarBase.mod.OperationOptions.RevokeDataSponsorship | typings.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship | typings.stellarBase.mod.OperationOptions.RevokeSignerSponsorship
  
  type OperationType = typings.stellarBase.mod.OperationType.CreateAccount | typings.stellarBase.mod.OperationType.Payment | typings.stellarBase.mod.OperationType.PathPaymentStrictReceive | typings.stellarBase.mod.OperationType.PathPaymentStrictSend | typings.stellarBase.mod.OperationType.CreatePassiveSellOffer | typings.stellarBase.mod.OperationType.ManageSellOffer | typings.stellarBase.mod.OperationType.ManageBuyOffer | typings.stellarBase.mod.OperationType.SetOptions | typings.stellarBase.mod.OperationType.ChangeTrust | typings.stellarBase.mod.OperationType.AllowTrust | typings.stellarBase.mod.OperationType.AccountMerge | typings.stellarBase.mod.OperationType.Inflation | typings.stellarBase.mod.OperationType.ManageData | typings.stellarBase.mod.OperationType.BumpSequence | typings.stellarBase.mod.OperationType.CreateClaimableBalance | typings.stellarBase.mod.OperationType.ClaimClaimableBalance | typings.stellarBase.mod.OperationType.BeginSponsoringFutureReserves | typings.stellarBase.mod.OperationType.EndSponsoringFutureReserves | typings.stellarBase.mod.OperationType.RevokeSponsorship
  
  type Signer = typings.stellarBase.mod.Signer.Ed25519PublicKey | typings.stellarBase.mod.Signer.Sha256Hash | typings.stellarBase.mod.Signer.PreAuthTx
  
  type SignerKeyOptions = typings.stellarBase.mod.SignerKeyOptions.Ed25519PublicKey | typings.stellarBase.mod.SignerKeyOptions.Sha256Hash | typings.stellarBase.mod.SignerKeyOptions.PreAuthTx
  
  type SignerOptions = typings.stellarBase.mod.SignerOptions.Ed25519PublicKey | typings.stellarBase.mod.SignerOptions.Sha256Hash | typings.stellarBase.mod.SignerOptions.PreAuthTx
  
  type TransactionBuilder = typings.stellarBase.mod.TransactionBuilder_
  
  type TrustLineFlag = typings.stellarBase.mod.TrustLineFlag.deauthorize | typings.stellarBase.mod.TrustLineFlag.authorize | typings.stellarBase.mod.TrustLineFlag.authorizeToMaintainLiabilities
}
