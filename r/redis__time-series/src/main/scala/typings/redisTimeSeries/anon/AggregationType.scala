package typings.redisTimeSeries.anon

import typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationType extends StObject {
  
  var aggregationType: TimeSeriesAggregationType
  
  var key: String
  
  var timeBucket: Double
}
object AggregationType {
  
  inline def apply(aggregationType: TimeSeriesAggregationType, key: String, timeBucket: Double): AggregationType = {
    val __obj = js.Dynamic.literal(aggregationType = aggregationType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeBucket = timeBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationType]
  }
  
  extension [Self <: AggregationType](x: Self) {
    
    inline def setAggregationType(value: TimeSeriesAggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTimeBucket(value: Double): Self = StObject.set(x, "timeBucket", value.asInstanceOf[js.Any])
  }
}
