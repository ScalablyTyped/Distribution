package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createPassiveOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassiveOfferOperationResponse
  extends BaseOperationResponse[
      createPassiveOffer, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createPassiveOffer
    ] {
  var amount: String = js.native
  var buying_asset_code: js.UndefOr[String] = js.native
  var buying_asset_issuer: js.UndefOr[String] = js.native
  var buying_asset_type: AssetType = js.native
  var offer_id: Double | String = js.native
  var price: String = js.native
  var price_r: PriceR = js.native
  var selling_asset_code: js.UndefOr[String] = js.native
  var selling_asset_issuer: js.UndefOr[String] = js.native
  var selling_asset_type: AssetType = js.native
}

object PassiveOfferOperationResponse {
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
    `type`: createPassiveOffer,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createPassiveOffer
  ): PassiveOfferOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], buying_asset_type = buying_asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offer_id = offer_id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any], selling_asset_type = selling_asset_type.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassiveOfferOperationResponse]
  }
  @scala.inline
  implicit class PassiveOfferOperationResponseOps[Self <: PassiveOfferOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuying_asset_type(value: AssetType): Self = this.set("buying_asset_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffer_id(value: Double | String): Self = this.set("offer_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice_r(value: PriceR): Self = this.set("price_r", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelling_asset_type(value: AssetType): Self = this.set("selling_asset_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuying_asset_code(value: String): Self = this.set("buying_asset_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuying_asset_code: Self = this.set("buying_asset_code", js.undefined)
    @scala.inline
    def setBuying_asset_issuer(value: String): Self = this.set("buying_asset_issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuying_asset_issuer: Self = this.set("buying_asset_issuer", js.undefined)
    @scala.inline
    def setSelling_asset_code(value: String): Self = this.set("selling_asset_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelling_asset_code: Self = this.set("selling_asset_code", js.undefined)
    @scala.inline
    def setSelling_asset_issuer(value: String): Self = this.set("selling_asset_issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelling_asset_issuer: Self = this.set("selling_asset_issuer", js.undefined)
  }
  
}

