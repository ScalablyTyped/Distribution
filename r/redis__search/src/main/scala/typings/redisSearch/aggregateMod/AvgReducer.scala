package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateGroupByReducers.AVG
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvgReducer
  extends StObject
     with GroupByReducer[AVG]
     with _GroupByReducers {
  
  var property: PropertyName
}
object AvgReducer {
  
  inline def apply(property: PropertyName, `type`: AVG): AvgReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvgReducer]
  }
  
  extension [Self <: AvgReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
