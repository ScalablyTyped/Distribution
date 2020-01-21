package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarBase.mod.AssetType
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.payment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentOperationResponse
  extends BaseOperationResponse[payment, typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.payment] {
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
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
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
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.payment,
    asset_code: String = null,
    asset_issuer: String = null
  ): PaymentOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asset_code != null) __obj.updateDynamic("asset_code")(asset_code.asInstanceOf[js.Any])
    if (asset_issuer != null) __obj.updateDynamic("asset_issuer")(asset_issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOperationResponse]
  }
}

