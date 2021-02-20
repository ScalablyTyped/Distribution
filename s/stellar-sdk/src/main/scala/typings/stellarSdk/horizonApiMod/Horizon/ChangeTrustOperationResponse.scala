package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType.credit12
import typings.stellarBase.mod.AssetType.credit4
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.changeTrust
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeTrustOperationResponse
  extends BaseOperationResponse[
      changeTrust, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.changeTrust
    ] {
  
  var asset_code: String = js.native
  
  var asset_issuer: String = js.native
  
  var asset_type: credit4 | credit12 = js.native
  
  var limit: String = js.native
  
  var trustee: String = js.native
  
  var trustor: String = js.native
}
object ChangeTrustOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    asset_code: String,
    asset_issuer: String,
    asset_type: credit4 | credit12,
    created_at: String,
    id: String,
    limit: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    trustee: String,
    trustor: String,
    `type`: changeTrust,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.changeTrust
  ): ChangeTrustOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], trustee = trustee.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrustOperationResponse]
  }
  
  @scala.inline
  implicit class ChangeTrustOperationResponseMutableBuilder[Self <: ChangeTrustOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_type(value: credit4 | credit12): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustee(value: String): Self = StObject.set(x, "trustee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustor(value: String): Self = StObject.set(x, "trustor", value.asInstanceOf[js.Any])
  }
}
