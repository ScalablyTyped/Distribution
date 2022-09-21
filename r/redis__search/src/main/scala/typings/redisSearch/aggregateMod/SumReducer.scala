package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateGroupByReducers.SUM
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SumReducer
  extends StObject
     with GroupByReducer[SUM]
     with _GroupByReducers {
  
  var property: PropertyName
}
object SumReducer {
  
  inline def apply(property: PropertyName, `type`: SUM): SumReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumReducer]
  }
  
  extension [Self <: SumReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
