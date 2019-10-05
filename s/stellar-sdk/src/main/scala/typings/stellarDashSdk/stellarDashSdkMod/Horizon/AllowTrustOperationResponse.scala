package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.allowTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowTrustOperationResponse
  extends BaseOperationResponse[
      allowTrust, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.allowTrust
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
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
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
    type_i: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.allowTrust
  ): AllowTrustOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, asset_code = asset_code, asset_issuer = asset_issuer, asset_type = asset_type.asInstanceOf[js.Any], authorize = authorize, created_at = created_at, id = id, paging_token = paging_token, source_account = source_account, transaction_hash = transaction_hash, trustee = trustee, trustor = trustor, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AllowTrustOperationResponse]
  }
}

