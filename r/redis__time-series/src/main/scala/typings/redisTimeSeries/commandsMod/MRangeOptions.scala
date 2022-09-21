package typings.redisTimeSeries.commandsMod

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
  
  extension [Self <: MRangeOptions](x: Self) {
    
    inline def setGROUPBY(value: MRangeGroupBy): Self = StObject.set(x, "GROUPBY", value.asInstanceOf[js.Any])
    
    inline def setGROUPBYUndefined: Self = StObject.set(x, "GROUPBY", js.undefined)
  }
}
