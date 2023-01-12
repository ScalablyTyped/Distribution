package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.SUM
import typings.redisSearch.distCommandsMod.PropertyName
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SumReducer] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
