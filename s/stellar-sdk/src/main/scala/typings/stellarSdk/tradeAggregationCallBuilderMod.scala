package typings.stellarSdk

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tradeAggregationCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/trade_aggregation_call_builder", "TradeAggregationCallBuilder")
  @js.native
  class TradeAggregationCallBuilder protected () extends CallBuilder[CollectionPage[TradeAggregationRecord]] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any,
      base: Asset,
      counter: Asset,
      start_time: Double,
      end_time: Double,
      resolution: Double,
      offset: Double
    ) = this()
    
    var isValidOffset: js.Any = js.native
    
    var isValidResolution: js.Any = js.native
  }
  
  @js.native
  trait TradeAggregationRecord
    extends BaseResponse[scala.Nothing] {
    
    var avg: String = js.native
    
    var base_volume: String = js.native
    
    var close: String = js.native
    
    var counter_volume: String = js.native
    
    var high: String = js.native
    
    var low: String = js.native
    
    var open: String = js.native
    
    var timestamp: Double | String = js.native
    
    var trade_count: Double | String = js.native
  }
  object TradeAggregationRecord {
    
    @scala.inline
    def apply(
      _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
      */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
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
    
    @scala.inline
    implicit class TradeAggregationRecordMutableBuilder[Self <: TradeAggregationRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvg(value: String): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_volume(value: String): Self = StObject.set(x, "base_volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounter_volume(value: String): Self = StObject.set(x, "counter_volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double | String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrade_count(value: Double | String): Self = StObject.set(x, "trade_count", value.asInstanceOf[js.Any])
    }
  }
}
