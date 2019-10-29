package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.createPassiveOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassiveOfferOperationResponse
  extends BaseOperationResponse[
      createPassiveOffer, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.createPassiveOffer
    ] {
  var amount: String
  var buying_asset_code: js.UndefOr[String] = js.undefined
  var buying_asset_issuer: js.UndefOr[String] = js.undefined
  var buying_asset_type: AssetType
  var offer_id: Double
  var price: String
  var price_r: PriceR
  var selling_asset_code: js.UndefOr[String] = js.undefined
  var selling_asset_issuer: js.UndefOr[String] = js.undefined
  var selling_asset_type: AssetType
}

object PassiveOfferOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    amount: String,
    buying_asset_type: AssetType,
    created_at: String,
    id: String,
    offer_id: Double,
    paging_token: String,
    price: String,
    price_r: PriceR,
    selling_asset_type: AssetType,
    source_account: String,
    transaction_hash: String,
    `type`: createPassiveOffer,
    type_i: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.createPassiveOffer,
    buying_asset_code: String = null,
    buying_asset_issuer: String = null,
    selling_asset_code: String = null,
    selling_asset_issuer: String = null
  ): PassiveOfferOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, amount = amount, buying_asset_type = buying_asset_type.asInstanceOf[js.Any], created_at = created_at, id = id, offer_id = offer_id, paging_token = paging_token, price = price, price_r = price_r, selling_asset_type = selling_asset_type.asInstanceOf[js.Any], source_account = source_account, transaction_hash = transaction_hash, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    if (buying_asset_code != null) __obj.updateDynamic("buying_asset_code")(buying_asset_code)
    if (buying_asset_issuer != null) __obj.updateDynamic("buying_asset_issuer")(buying_asset_issuer)
    if (selling_asset_code != null) __obj.updateDynamic("selling_asset_code")(selling_asset_code)
    if (selling_asset_issuer != null) __obj.updateDynamic("selling_asset_issuer")(selling_asset_issuer)
    __obj.asInstanceOf[PassiveOfferOperationResponse]
  }
}

