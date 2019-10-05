package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.PriceR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferRecord
  extends BaseResponse[scala.Nothing] {
  var amount: String
  var buying: typings.stellarDashBase.stellarDashBaseMod.Asset
  var id: String
  var paging_token: String
  var price: String
  var price_r: PriceR
  var seller: js.UndefOr[CallFunction[AccountRecord]] = js.undefined
  var seller_attr: String
  var selling: typings.stellarDashBase.stellarDashBaseMod.Asset
}

object OfferRecord {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    amount: String,
    buying: typings.stellarDashBase.stellarDashBaseMod.Asset,
    id: String,
    paging_token: String,
    price: String,
    price_r: PriceR,
    seller_attr: String,
    selling: typings.stellarDashBase.stellarDashBaseMod.Asset,
    seller: () => js.Promise[AccountRecord] = null
  ): OfferRecord = {
    val __obj = js.Dynamic.literal(_links = _links, amount = amount, buying = buying, id = id, paging_token = paging_token, price = price, price_r = price_r, seller_attr = seller_attr, selling = selling)
    if (seller != null) __obj.updateDynamic("seller")(js.Any.fromFunction0(seller))
    __obj.asInstanceOf[OfferRecord]
  }
}

