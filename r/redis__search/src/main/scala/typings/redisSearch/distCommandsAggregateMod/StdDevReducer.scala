package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.STDDEV
import typings.redisSearch.distCommandsMod.PropertyName
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StdDevReducer] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
