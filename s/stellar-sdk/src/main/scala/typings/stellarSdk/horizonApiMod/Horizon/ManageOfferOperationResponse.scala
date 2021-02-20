package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageOffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageOfferOperationResponse
  extends BaseOperationResponse[
      manageOffer, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageOffer
    ] {
  
  var amount: String = js.native
  
  var buying_asset_code: js.UndefOr[String] = js.native
  
  var buying_asset_issuer: js.UndefOr[String] = js.native
  
  var buying_asset_type: AssetType = js.native
  
  var offer_id: Double | String = js.native
  
  var price: String = js.native
  
  var price_r: PriceR = js.native
  
  var selling_asset_code: js.UndefOr[String] = js.native
  
  var selling_asset_issuer: js.UndefOr[String] = js.native
  
  var selling_asset_type: AssetType = js.native
}
object ManageOfferOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    buying_asset_type: AssetType,
    created_at: String,
    id: String,
    offer_id: Double | String,
    paging_token: String,
    price: String,
    price_r: PriceR,
    selling_asset_type: AssetType,
    source_account: String,
    transaction_hash: String,
    `type`: manageOffer,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageOffer
  ): ManageOfferOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], buying_asset_type = buying_asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offer_id = offer_id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any], selling_asset_type = selling_asset_type.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageOfferOperationResponse]
  }
  
  @scala.inline
  implicit class ManageOfferOperationResponseMutableBuilder[Self <: ManageOfferOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying_asset_code(value: String): Self = StObject.set(x, "buying_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying_asset_codeUndefined: Self = StObject.set(x, "buying_asset_code", js.undefined)
    
    @scala.inline
    def setBuying_asset_issuer(value: String): Self = StObject.set(x, "buying_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying_asset_issuerUndefined: Self = StObject.set(x, "buying_asset_issuer", js.undefined)
    
    @scala.inline
    def setBuying_asset_type(value: AssetType): Self = StObject.set(x, "buying_asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffer_id(value: Double | String): Self = StObject.set(x, "offer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice_r(value: PriceR): Self = StObject.set(x, "price_r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling_asset_code(value: String): Self = StObject.set(x, "selling_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling_asset_codeUndefined: Self = StObject.set(x, "selling_asset_code", js.undefined)
    
    @scala.inline
    def setSelling_asset_issuer(value: String): Self = StObject.set(x, "selling_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling_asset_issuerUndefined: Self = StObject.set(x, "selling_asset_issuer", js.undefined)
    
    @scala.inline
    def setSelling_asset_type(value: AssetType): Self = StObject.set(x, "selling_asset_type", value.asInstanceOf[js.Any])
  }
}
