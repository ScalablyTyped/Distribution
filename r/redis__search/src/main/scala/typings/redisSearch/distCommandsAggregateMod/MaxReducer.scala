package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MAX
import typings.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxReducer
  extends StObject
     with GroupByReducer[MAX]
     with _GroupByReducers {
  
  var property: PropertyName
}
object MaxReducer {
  
  inline def apply(property: PropertyName, `type`: MAX): MaxReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxReducer]
  }
  
  extension [Self <: MaxReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
