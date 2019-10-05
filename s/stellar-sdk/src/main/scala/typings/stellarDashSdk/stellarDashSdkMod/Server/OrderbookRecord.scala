package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.Anon_Amount
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderbookRecord
  extends BaseResponse[scala.Nothing] {
  var asks: js.Array[Anon_Amount]
  var bids: js.Array[Anon_Amount]
  var buying: typings.stellarDashBase.stellarDashBaseMod.Asset
  var selling: typings.stellarDashBase.stellarDashBaseMod.Asset
}

object OrderbookRecord {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    asks: js.Array[Anon_Amount],
    bids: js.Array[Anon_Amount],
    buying: typings.stellarDashBase.stellarDashBaseMod.Asset,
    selling: typings.stellarDashBase.stellarDashBaseMod.Asset
  ): OrderbookRecord = {
    val __obj = js.Dynamic.literal(_links = _links, asks = asks, bids = bids, buying = buying, selling = selling)
  
    __obj.asInstanceOf[OrderbookRecord]
  }
}

