package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashSdk.Anon_Amount
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderbookRecord
  extends BaseResponse[scala.Nothing] {
  var asks: js.Array[Anon_Amount]
  var base: Asset
  var bids: js.Array[Anon_Amount]
  var counter: Asset
}

object OrderbookRecord {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    asks: js.Array[Anon_Amount],
    base: Asset,
    bids: js.Array[Anon_Amount],
    counter: Asset
  ): OrderbookRecord = {
    val __obj = js.Dynamic.literal(_links = _links, asks = asks, base = base, bids = bids, counter = counter)
  
    __obj.asInstanceOf[OrderbookRecord]
  }
}

