package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageOfferOperationResponse
  extends BaseOperationResponse[
      manageOffer, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageOffer
    ] {
  var amount: String
  var buying_asset_code: js.UndefOr[String] = js.undefined
  var buying_asset_issuer: js.UndefOr[String] = js.undefined
  var buying_asset_type: AssetType
  var offer_id: Double | String
  var price: String
  var price_r: PriceR
  var selling_asset_code: js.UndefOr[String] = js.undefined
  var selling_asset_issuer: js.UndefOr[String] = js.undefined
  var selling_asset_type: AssetType
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
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageOffer,
    buying_asset_code: String = null,
    buying_asset_issuer: String = null,
    selling_asset_code: String = null,
    selling_asset_issuer: String = null
  ): ManageOfferOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], buying_asset_type = buying_asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offer_id = offer_id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any], selling_asset_type = selling_asset_type.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (buying_asset_code != null) __obj.updateDynamic("buying_asset_code")(buying_asset_code.asInstanceOf[js.Any])
    if (buying_asset_issuer != null) __obj.updateDynamic("buying_asset_issuer")(buying_asset_issuer.asInstanceOf[js.Any])
    if (selling_asset_code != null) __obj.updateDynamic("selling_asset_code")(selling_asset_code.asInstanceOf[js.Any])
    if (selling_asset_issuer != null) __obj.updateDynamic("selling_asset_issuer")(selling_asset_issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageOfferOperationResponse]
  }
}

