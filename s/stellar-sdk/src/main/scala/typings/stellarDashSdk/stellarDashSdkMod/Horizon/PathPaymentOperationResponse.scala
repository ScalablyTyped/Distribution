package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.pathPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPaymentOperationResponse
  extends BaseOperationResponse[
      pathPayment, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.pathPayment
    ] {
  var amount: String
  var asset_code: js.UndefOr[String] = js.undefined
  var asset_issuer: js.UndefOr[String] = js.undefined
  var asset_type: AssetType
  var from: String
  var source_amount: String
  var source_asset_code: js.UndefOr[String] = js.undefined
  var source_asset_issuer: js.UndefOr[String] = js.undefined
  var source_asset_type: AssetType
  var source_max: String
  var to: String
}

object PathPaymentOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    amount: String,
    asset_type: AssetType,
    created_at: String,
    from: String,
    id: String,
    paging_token: String,
    source_account: String,
    source_amount: String,
    source_asset_type: AssetType,
    source_max: String,
    to: String,
    transaction_hash: String,
    `type`: pathPayment,
    type_i: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.pathPayment,
    asset_code: String = null,
    asset_issuer: String = null,
    source_asset_code: String = null,
    source_asset_issuer: String = null
  ): PathPaymentOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, amount = amount, asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at, from = from, id = id, paging_token = paging_token, source_account = source_account, source_amount = source_amount, source_asset_type = source_asset_type.asInstanceOf[js.Any], source_max = source_max, to = to, transaction_hash = transaction_hash, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    if (asset_code != null) __obj.updateDynamic("asset_code")(asset_code)
    if (asset_issuer != null) __obj.updateDynamic("asset_issuer")(asset_issuer)
    if (source_asset_code != null) __obj.updateDynamic("source_asset_code")(source_asset_code)
    if (source_asset_issuer != null) __obj.updateDynamic("source_asset_issuer")(source_asset_issuer)
    __obj.asInstanceOf[PathPaymentOperationResponse]
  }
}

