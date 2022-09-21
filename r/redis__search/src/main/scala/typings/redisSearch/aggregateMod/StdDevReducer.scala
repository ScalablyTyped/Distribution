package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateGroupByReducers.STDDEV
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StdDevReducer
  extends StObject
     with GroupByReducer[STDDEV]
     with _GroupByReducers {
  
  var property: PropertyName
}
object StdDevReducer {
  
  inline def apply(property: PropertyName, `type`: STDDEV): StdDevReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdDevReducer]
  }
  
  extension [Self <: StdDevReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
