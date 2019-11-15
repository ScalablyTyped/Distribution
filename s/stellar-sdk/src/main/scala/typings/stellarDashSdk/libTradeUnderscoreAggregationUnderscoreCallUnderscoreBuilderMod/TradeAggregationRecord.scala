package typings.stellarDashSdk.libTradeUnderscoreAggregationUnderscoreCallUnderscoreBuilderMod

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TradeAggregationRecord
  extends BaseResponse[scala.Nothing] {
  var avg: String
  var base_volume: String
  var close: String
  var counter_volume: String
  var high: String
  var low: String
  var open: String
  var timestamp: Double | String
  var trade_count: Double | String
}

object TradeAggregationRecord {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    avg: String,
    base_volume: String,
    close: String,
    counter_volume: String,
    high: String,
    low: String,
    open: String,
    timestamp: Double | String,
    trade_count: Double | String
  ): TradeAggregationRecord = {
    val __obj = js.Dynamic.literal(_links = _links, avg = avg, base_volume = base_volume, close = close, counter_volume = counter_volume, high = high, low = low, open = open, timestamp = timestamp.asInstanceOf[js.Any], trade_count = trade_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TradeAggregationRecord]
  }
}

