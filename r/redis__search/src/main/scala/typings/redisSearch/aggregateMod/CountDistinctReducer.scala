package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCT
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountDistinctReducer
  extends StObject
     with GroupByReducer[COUNT_DISTINCT]
     with _GroupByReducers {
  
  var property: PropertyName
}
object CountDistinctReducer {
  
  inline def apply(property: PropertyName, `type`: COUNT_DISTINCT): CountDistinctReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountDistinctReducer]
  }
  
  extension [Self <: CountDistinctReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
