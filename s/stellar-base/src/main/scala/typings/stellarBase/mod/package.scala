package typings.stellarBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.stellarBase.mod.Operation.CreateAccount_
    - typings.stellarBase.mod.Operation.Payment_
    - typings.stellarBase.mod.Operation.PathPaymentStrictReceive_
    - typings.stellarBase.mod.Operation.PathPaymentStrictSend_
    - typings.stellarBase.mod.Operation.CreatePassiveSellOffer_
    - typings.stellarBase.mod.Operation.ManageSellOffer_
    - typings.stellarBase.mod.Operation.ManageBuyOffer_
    - typings.stellarBase.mod.Operation.SetOptions_[typings.stellarBase.mod.SignerOptions]
    - typings.stellarBase.mod.Operation.ChangeTrust_
    - typings.stellarBase.mod.Operation.AllowTrust_
    - typings.stellarBase.mod.Operation.AccountMerge_
    - typings.stellarBase.mod.Operation.Inflation_
    - typings.stellarBase.mod.Operation.ManageData_
    - typings.stellarBase.mod.Operation.BumpSequence_
    - typings.stellarBase.mod.Operation.CreateClaimableBalance_
    - typings.stellarBase.mod.Operation.ClaimClaimableBalance_
    - typings.stellarBase.mod.Operation.BeginSponsoringFutureReserves_
    - typings.stellarBase.mod.Operation.EndSponsoringFutureReserves_
    - typings.stellarBase.mod.Operation.RevokeAccountSponsorship_
    - typings.stellarBase.mod.Operation.RevokeTrustlineSponsorship_
    - typings.stellarBase.mod.Operation.RevokeOfferSponsorship_
    - typings.stellarBase.mod.Operation.RevokeDataSponsorship_
    - typings.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_
    - typings.stellarBase.mod.Operation.RevokeSignerSponsorship_
  */
  type Operation = typings.stellarBase.mod._Operation | typings.stellarBase.mod.Operation.SetOptions_[typings.stellarBase.mod.SignerOptions] | typings.stellarBase.mod.Operation.Inflation_ | typings.stellarBase.mod.Operation.EndSponsoringFutureReserves_
  
  /* Rewritten from type alias, can be one of: 
    - typings.stellarBase.mod.OperationOptions.CreateAccount
    - typings.stellarBase.mod.OperationOptions.Payment
    - typings.stellarBase.mod.OperationOptions.PathPaymentStrictReceive
    - typings.stellarBase.mod.OperationOptions.PathPaymentStrictSend
    - typings.stellarBase.mod.OperationOptions.CreatePassiveSellOffer
    - typings.stellarBase.mod.OperationOptions.ManageSellOffer
    - typings.stellarBase.mod.OperationOptions.ManageBuyOffer
    - typings.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing]
    - typings.stellarBase.mod.OperationOptions.ChangeTrust
    - typings.stellarBase.mod.OperationOptions.AllowTrust
    - typings.stellarBase.mod.OperationOptions.AccountMerge
    - typings.stellarBase.mod.OperationOptions.Inflation
    - typings.stellarBase.mod.OperationOptions.ManageData
    - typings.stellarBase.mod.OperationOptions.BumpSequence
    - typings.stellarBase.mod.OperationOptions.CreateClaimableBalance
    - typings.stellarBase.mod.OperationOptions.ClaimClaimableBalance
    - typings.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves
    - typings.stellarBase.mod.OperationOptions.RevokeAccountSponsorship
    - typings.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship
    - typings.stellarBase.mod.OperationOptions.RevokeOfferSponsorship
    - typings.stellarBase.mod.OperationOptions.RevokeDataSponsorship
    - typings.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship
    - typings.stellarBase.mod.OperationOptions.RevokeSignerSponsorship
  */
  type OperationOptions = typings.stellarBase.mod._OperationOptions | typings.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing] | typings.stellarBase.mod.OperationOptions.Inflation
  
  type AssetType = typings.stellarBase.mod.AssetType.native | typings.stellarBase.mod.AssetType.credit4 | typings.stellarBase.mod.AssetType.credit12
  
  type AuthFlag = typings.stellarBase.mod.AuthFlag.immutable | typings.stellarBase.mod.AuthFlag.required | typings.stellarBase.mod.AuthFlag.revocable
  
  @scala.inline
  def AuthImmutableFlag: typings.stellarBase.stellarBaseNumbers.`4` = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthImmutableFlag").asInstanceOf[typings.stellarBase.stellarBaseNumbers.`4`]
  
  @scala.inline
  def AuthRequiredFlag: typings.stellarBase.stellarBaseNumbers.`1` = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRequiredFlag").asInstanceOf[typings.stellarBase.stellarBaseNumbers.`1`]
  
  @scala.inline
  def AuthRevocableFlag: typings.stellarBase.stellarBaseNumbers.`2` = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRevocableFlag").asInstanceOf[typings.stellarBase.stellarBaseNumbers.`2`]
  
  @scala.inline
  def BASE_FEE: /* "100" */ java.lang.String = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BASE_FEE").asInstanceOf[/* "100" */ java.lang.String]
  
  @scala.inline
  def FastSigning: scala.Boolean = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FastSigning").asInstanceOf[scala.Boolean]
  
  type KeypairType = typings.stellarBase.stellarBaseStrings.ed25519
  
  @scala.inline
  def MemoHash: /* "hash" */ java.lang.String = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoHash").asInstanceOf[/* "hash" */ java.lang.String]
  
  @scala.inline
  def MemoID: /* "id" */ java.lang.String = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoID").asInstanceOf[/* "id" */ java.lang.String]
  
  @scala.inline
  def MemoNone: /* "none" */ java.lang.String = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoNone").asInstanceOf[/* "none" */ java.lang.String]
  
  @scala.inline
  def MemoReturn: /* "return" */ java.lang.String = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoReturn").asInstanceOf[/* "return" */ java.lang.String]
  
  @scala.inline
  def MemoText: /* "text" */ java.lang.String = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoText").asInstanceOf[/* "text" */ java.lang.String]
  
  type MemoType = typings.stellarBase.mod.MemoType.None | typings.stellarBase.mod.MemoType.ID | typings.stellarBase.mod.MemoType.Text | typings.stellarBase.mod.MemoType.Hash | typings.stellarBase.mod.MemoType.Return
  
  type MemoValue = scala.Null | java.lang.String | typings.node.Buffer
  
  type OperationType = typings.stellarBase.mod.OperationType.CreateAccount | typings.stellarBase.mod.OperationType.Payment | typings.stellarBase.mod.OperationType.PathPaymentStrictReceive | typings.stellarBase.mod.OperationType.PathPaymentStrictSend | typings.stellarBase.mod.OperationType.CreatePassiveSellOffer | typings.stellarBase.mod.OperationType.ManageSellOffer | typings.stellarBase.mod.OperationType.ManageBuyOffer | typings.stellarBase.mod.OperationType.SetOptions | typings.stellarBase.mod.OperationType.ChangeTrust | typings.stellarBase.mod.OperationType.AllowTrust | typings.stellarBase.mod.OperationType.AccountMerge | typings.stellarBase.mod.OperationType.Inflation | typings.stellarBase.mod.OperationType.ManageData | typings.stellarBase.mod.OperationType.BumpSequence | typings.stellarBase.mod.OperationType.CreateClaimableBalance | typings.stellarBase.mod.OperationType.ClaimClaimableBalance | typings.stellarBase.mod.OperationType.BeginSponsoringFutureReserves | typings.stellarBase.mod.OperationType.EndSponsoringFutureReserves | typings.stellarBase.mod.OperationType.RevokeSponsorship
  
  @scala.inline
  def TimeoutInfinite: /* 0 */ scala.Double = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TimeoutInfinite").asInstanceOf[/* 0 */ scala.Double]
  
  type TrustLineFlag = typings.stellarBase.mod.TrustLineFlag.deauthorize | typings.stellarBase.mod.TrustLineFlag.authorize | typings.stellarBase.mod.TrustLineFlag.authorizeToMaintainLiabilities
  
  @scala.inline
  def hash(data: typings.node.Buffer): typings.node.Buffer = typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def sign(data: typings.node.Buffer, rawSecret: typings.node.Buffer): typings.node.Buffer = (typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], rawSecret.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def verify(data: typings.node.Buffer, signature: typings.node.Buffer, rawPublicKey: typings.node.Buffer): scala.Boolean = (typings.stellarBase.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(data.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], rawPublicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
