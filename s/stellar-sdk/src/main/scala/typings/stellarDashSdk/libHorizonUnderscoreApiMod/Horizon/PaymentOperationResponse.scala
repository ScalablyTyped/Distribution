package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.payment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentOperationResponse
  extends BaseOperationResponse[
      payment, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.payment
    ] {
  var amount: String
  var asset_code: js.UndefOr[String] = js.undefined
  var asset_issuer: js.UndefOr[String] = js.undefined
  var asset_type: AssetType
  var from: String
  var to: String
}

object PaymentOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    amount: String,
    asset_type: AssetType,
    created_at: String,
    from: String,
    id: String,
    paging_token: String,
    source_account: String,
    to: String,
    transaction_hash: String,
    `type`: payment,
    type_i: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.payment,
    asset_code: String = null,
    asset_issuer: String = null
  ): PaymentOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, amount = amount, asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at, from = from, id = id, paging_token = paging_token, source_account = source_account, to = to, transaction_hash = transaction_hash, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    if (asset_code != null) __obj.updateDynamic("asset_code")(asset_code)
    if (asset_issuer != null) __obj.updateDynamic("asset_issuer")(asset_issuer)
    __obj.asInstanceOf[PaymentOperationResponse]
  }
}

