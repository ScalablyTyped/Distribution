package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.anon.Direction
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.FIRST_VALUE
import typings.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstValueReducer
  extends StObject
     with GroupByReducer[FIRST_VALUE]
     with _GroupByReducers {
  
  var BY: js.UndefOr[PropertyName | Direction] = js.undefined
  
  var property: PropertyName
}
object FirstValueReducer {
  
  inline def apply(property: PropertyName, `type`: FIRST_VALUE): FirstValueReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstValueReducer]
  }
  
  extension [Self <: FirstValueReducer](x: Self) {
    
    inline def setBY(value: PropertyName | Direction): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
    
    inline def setBYUndefined: Self = StObject.set(x, "BY", js.undefined)
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
