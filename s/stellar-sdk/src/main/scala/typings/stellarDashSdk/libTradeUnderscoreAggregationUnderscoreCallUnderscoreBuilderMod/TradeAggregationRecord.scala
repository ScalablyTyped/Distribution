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
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], base_volume = base_volume.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], counter_volume = counter_volume.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trade_count = trade_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TradeAggregationRecord]
  }
}

