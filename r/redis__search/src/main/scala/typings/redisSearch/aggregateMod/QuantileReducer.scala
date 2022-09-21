package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateGroupByReducers.QUANTILE
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantileReducer
  extends StObject
     with GroupByReducer[QUANTILE]
     with _GroupByReducers {
  
  var property: PropertyName
  
  var quantile: Double
}
object QuantileReducer {
  
  inline def apply(property: PropertyName, quantile: Double, `type`: QUANTILE): QuantileReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], quantile = quantile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileReducer]
  }
  
  extension [Self <: QuantileReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setQuantile(value: Double): Self = StObject.set(x, "quantile", value.asInstanceOf[js.Any])
  }
}
