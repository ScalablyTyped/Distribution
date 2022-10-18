package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TOLIST
import typings.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToListReducer
  extends StObject
     with GroupByReducer[TOLIST]
     with _GroupByReducers {
  
  var property: PropertyName
}
object ToListReducer {
  
  inline def apply(property: PropertyName, `type`: TOLIST): ToListReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToListReducer]
  }
  
  extension [Self <: ToListReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
