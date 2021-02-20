package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.revokeSponsorship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSponsorshipOperationResponse
  extends BaseOperationResponse[
      revokeSponsorship, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.revokeSponsorship
    ] {
  
  var account_id: js.UndefOr[String] = js.native
  
  var claimable_balance_id: js.UndefOr[String] = js.native
  
  var data_account_id: js.UndefOr[String] = js.native
  
  var data_name: js.UndefOr[String] = js.native
  
  var offer_id: js.UndefOr[String] = js.native
  
  var signer_account_id: js.UndefOr[String] = js.native
  
  var signer_key: js.UndefOr[String] = js.native
  
  var trustline_account_id: js.UndefOr[String] = js.native
  
  var trustline_asset: js.UndefOr[String] = js.native
}
object RevokeSponsorshipOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: revokeSponsorship,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.revokeSponsorship
  ): RevokeSponsorshipOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSponsorshipOperationResponse]
  }
  
  @scala.inline
  implicit class RevokeSponsorshipOperationResponseMutableBuilder[Self <: RevokeSponsorshipOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    @scala.inline
    def setClaimable_balance_id(value: String): Self = StObject.set(x, "claimable_balance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimable_balance_idUndefined: Self = StObject.set(x, "claimable_balance_id", js.undefined)
    
    @scala.inline
    def setData_account_id(value: String): Self = StObject.set(x, "data_account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_account_idUndefined: Self = StObject.set(x, "data_account_id", js.undefined)
    
    @scala.inline
    def setData_name(value: String): Self = StObject.set(x, "data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_nameUndefined: Self = StObject.set(x, "data_name", js.undefined)
    
    @scala.inline
    def setOffer_id(value: String): Self = StObject.set(x, "offer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffer_idUndefined: Self = StObject.set(x, "offer_id", js.undefined)
    
    @scala.inline
    def setSigner_account_id(value: String): Self = StObject.set(x, "signer_account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner_account_idUndefined: Self = StObject.set(x, "signer_account_id", js.undefined)
    
    @scala.inline
    def setSigner_key(value: String): Self = StObject.set(x, "signer_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner_keyUndefined: Self = StObject.set(x, "signer_key", js.undefined)
    
    @scala.inline
    def setTrustline_account_id(value: String): Self = StObject.set(x, "trustline_account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustline_account_idUndefined: Self = StObject.set(x, "trustline_account_id", js.undefined)
    
    @scala.inline
    def setTrustline_asset(value: String): Self = StObject.set(x, "trustline_asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustline_assetUndefined: Self = StObject.set(x, "trustline_asset", js.undefined)
  }
}
