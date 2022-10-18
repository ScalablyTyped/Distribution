package typings.redisTimeSeries.anon

import typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType
import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCREATERULE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(
    sourceKey: String,
    destinationKey: String,
    aggregationType: TimeSeriesAggregationType,
    timeBucket: Double
  ): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCREATERULE {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (String, String, TimeSeriesAggregationType, Double) => js.Array[String],
    transformReply: () => OK
  ): TypeofCREATERULE = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction4(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCREATERULE]
  }
  
  extension [Self <: TypeofCREATERULE](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, String, TimeSeriesAggregationType, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction4(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
