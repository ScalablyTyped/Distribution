package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.PriceRShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferRecord
  extends BaseResponse[scala.Nothing] {
  var amount: String
  var buying: OfferAsset
  var id: Double | String
  var last_modified_ledger: Double
  var last_modified_time: String
  var paging_token: String
  var price: String
  var price_r: PriceRShorthand
  var seller: String
  var selling: OfferAsset
}

object OfferRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
    amount: String,
    buying: OfferAsset,
    id: Double | String,
    last_modified_ledger: Double,
    last_modified_time: String,
    paging_token: String,
    price: String,
    price_r: PriceRShorthand,
    seller: String,
    selling: OfferAsset
  ): OfferRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_modified_ledger = last_modified_ledger.asInstanceOf[js.Any], last_modified_time = last_modified_time.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OfferRecord]
  }
}

