package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRangeOptions
  extends StObject
     with RangeOptions {
  
  var GROUPBY: js.UndefOr[MRangeGroupBy] = js.undefined
}
object MRangeOptions {
  
  inline def apply(): MRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MRangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MRangeOptions] (val x: Self) extends AnyVal {
    
    inline def setGROUPBY(value: MRangeGroupBy): Self = StObject.set(x, "GROUPBY", value.asInstanceOf[js.Any])
    
    inline def setGROUPBYUndefined: Self = StObject.set(x, "GROUPBY", js.undefined)
  }
}
