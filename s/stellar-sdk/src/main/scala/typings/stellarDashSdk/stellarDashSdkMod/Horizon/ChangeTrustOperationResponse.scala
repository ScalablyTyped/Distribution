package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit12
import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit4
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.changeTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTrustOperationResponse
  extends BaseOperationResponse[
      changeTrust, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.changeTrust
    ] {
  var asset_code: String
  var asset_issuer: String
  var asset_type: credit4 | credit12
  var limit: String
  var trustee: String
  var trustor: String
}

object ChangeTrustOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
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
    type_i: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.changeTrust
  ): ChangeTrustOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, asset_code = asset_code, asset_issuer = asset_issuer, asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at, id = id, limit = limit, paging_token = paging_token, source_account = source_account, transaction_hash = transaction_hash, trustee = trustee, trustor = trustor, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeTrustOperationResponse]
  }
}

