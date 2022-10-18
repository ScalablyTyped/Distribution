package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MIN
import typings.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinReducer
  extends StObject
     with GroupByReducer[MIN]
     with _GroupByReducers {
  
  var property: PropertyName
}
object MinReducer {
  
  inline def apply(property: PropertyName, `type`: MIN): MinReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinReducer]
  }
  
  extension [Self <: MinReducer](x: Self) {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
