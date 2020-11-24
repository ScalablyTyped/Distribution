package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.revokeSponsorship
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
  implicit class RevokeSponsorshipOperationResponseOps[Self <: RevokeSponsorshipOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount_id(value: String): Self = this.set("account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount_id: Self = this.set("account_id", js.undefined)
    
    @scala.inline
    def setClaimable_balance_id(value: String): Self = this.set("claimable_balance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimable_balance_id: Self = this.set("claimable_balance_id", js.undefined)
    
    @scala.inline
    def setData_account_id(value: String): Self = this.set("data_account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_account_id: Self = this.set("data_account_id", js.undefined)
    
    @scala.inline
    def setData_name(value: String): Self = this.set("data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_name: Self = this.set("data_name", js.undefined)
    
    @scala.inline
    def setOffer_id(value: String): Self = this.set("offer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffer_id: Self = this.set("offer_id", js.undefined)
    
    @scala.inline
    def setSigner_account_id(value: String): Self = this.set("signer_account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner_account_id: Self = this.set("signer_account_id", js.undefined)
    
    @scala.inline
    def setSigner_key(value: String): Self = this.set("signer_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner_key: Self = this.set("signer_key", js.undefined)
    
    @scala.inline
    def setTrustline_account_id(value: String): Self = this.set("trustline_account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustline_account_id: Self = this.set("trustline_account_id", js.undefined)
    
    @scala.inline
    def setTrustline_asset(value: String): Self = this.set("trustline_asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustline_asset: Self = this.set("trustline_asset", js.undefined)
  }
}
