package typings.redisTimeSeries.anon

import typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType
import typings.redisTimeSeries.commandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeBucket extends StObject {
  
  var timeBucket: Timestamp
  
  var `type`: TimeSeriesAggregationType
}
object TimeBucket {
  
  inline def apply(timeBucket: Timestamp, `type`: TimeSeriesAggregationType): TimeBucket = {
    val __obj = js.Dynamic.literal(timeBucket = timeBucket.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBucket]
  }
  
  extension [Self <: TimeBucket](x: Self) {
    
    inline def setTimeBucket(value: Timestamp): Self = StObject.set(x, "timeBucket", value.asInstanceOf[js.Any])
    
    inline def setType(value: TimeSeriesAggregationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
