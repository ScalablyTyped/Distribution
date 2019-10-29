package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.PriceRShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferRecord
  extends BaseResponse[scala.Nothing] {
  var amount: String
  var buying: OfferAsset
  var id: String
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
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    amount: String,
    buying: OfferAsset,
    id: String,
    last_modified_ledger: Double,
    last_modified_time: String,
    paging_token: String,
    price: String,
    price_r: PriceRShorthand,
    seller: String,
    selling: OfferAsset
  ): OfferRecord = {
    val __obj = js.Dynamic.literal(_links = _links, amount = amount, buying = buying, id = id, last_modified_ledger = last_modified_ledger, last_modified_time = last_modified_time, paging_token = paging_token, price = price, price_r = price_r, seller = seller, selling = selling)
  
    __obj.asInstanceOf[OfferRecord]
  }
}

