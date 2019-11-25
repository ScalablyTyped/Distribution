package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.allowTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowTrustOperationResponse
  extends BaseOperationResponse[
      allowTrust, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.allowTrust
    ] {
  var asset_code: String
  var asset_issuer: String
  var asset_type: AssetType
  var authorize: Boolean
  var trustee: String
  var trustor: String
}

object AllowTrustOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    asset_code: String,
    asset_issuer: String,
    asset_type: AssetType,
    authorize: Boolean,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    trustee: String,
    trustor: String,
    `type`: allowTrust,
    type_i: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.allowTrust
  ): AllowTrustOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], authorize = authorize.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], trustee = trustee.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrustOperationResponse]
  }
}

