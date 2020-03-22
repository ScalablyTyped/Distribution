package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarBase.mod.AssetType
import typings.stellarSdk.AnonAssetcode
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPaymentStrictSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPaymentStrictSendOperationResponse
  extends BaseOperationResponse[
      pathPaymentStrictSend, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPaymentStrictSend
    ] {
  var amount: String
  var asset_code: js.UndefOr[String] = js.undefined
  var asset_issuer: js.UndefOr[String] = js.undefined
  var asset_type: AssetType
  var destination_min: String
  var from: String
  var path: js.Array[AnonAssetcode]
  var source_amount: String
  var source_asset_code: js.UndefOr[String] = js.undefined
  var source_asset_issuer: js.UndefOr[String] = js.undefined
  var source_asset_type: AssetType
  var to: String
}

object PathPaymentStrictSendOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
    amount: String,
    asset_type: AssetType,
    created_at: String,
    destination_min: String,
    from: String,
    id: String,
    paging_token: String,
    path: js.Array[AnonAssetcode],
    source_account: String,
    source_amount: String,
    source_asset_type: AssetType,
    to: String,
    transaction_hash: String,
    `type`: pathPaymentStrictSend,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPaymentStrictSend,
    asset_code: String = null,
    asset_issuer: String = null,
    source_asset_code: String = null,
    source_asset_issuer: String = null
  ): PathPaymentStrictSendOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], destination_min = destination_min.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], source_amount = source_amount.asInstanceOf[js.Any], source_asset_type = source_asset_type.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asset_code != null) __obj.updateDynamic("asset_code")(asset_code.asInstanceOf[js.Any])
    if (asset_issuer != null) __obj.updateDynamic("asset_issuer")(asset_issuer.asInstanceOf[js.Any])
    if (source_asset_code != null) __obj.updateDynamic("source_asset_code")(source_asset_code.asInstanceOf[js.Any])
    if (source_asset_issuer != null) __obj.updateDynamic("source_asset_issuer")(source_asset_issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSendOperationResponse]
  }
}

