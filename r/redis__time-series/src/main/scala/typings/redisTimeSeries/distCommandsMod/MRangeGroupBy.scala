package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRangeGroupBy extends StObject {
  
  var label: String
  
  var reducer: TimeSeriesReducers
}
object MRangeGroupBy {
  
  inline def apply(label: String, reducer: TimeSeriesReducers): MRangeGroupBy = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], reducer = reducer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRangeGroupBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MRangeGroupBy] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setReducer(value: TimeSeriesReducers): Self = StObject.set(x, "reducer", value.asInstanceOf[js.Any])
  }
}
