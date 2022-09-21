package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountDistinctishReducer
  extends StObject
     with GroupByReducer[COUNT_DISTINCTISH]
     with _GroupByReducers {
  
  var property: PropertyName
}
object CountDistinctishReducer {
  
  inline def apply(property: PropertyName, `type`: COUNT_DISTINCTISH): CountDistinctishReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountDistinctishReducer]
  }
  
  extension [Self <: CountDistinctishReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
