package typings.redisTimeSeries.distCommandsMod

import typings.redisTimeSeries.anon.BUCKETTIMESTAMP
import typings.redisTimeSeries.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeOptions extends StObject {
  
  var AGGREGATION: js.UndefOr[BUCKETTIMESTAMP] = js.undefined
  
  var ALIGN: js.UndefOr[Timestamp] = js.undefined
  
  var COUNT: js.UndefOr[Double] = js.undefined
  
  var FILTER_BY_TS: js.UndefOr[js.Array[Timestamp]] = js.undefined
  
  var FILTER_BY_VALUE: js.UndefOr[Max] = js.undefined
  
  var LATEST: js.UndefOr[Boolean] = js.undefined
}
object RangeOptions {
  
  inline def apply(): RangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeOptions] (val x: Self) extends AnyVal {
    
    inline def setAGGREGATION(value: BUCKETTIMESTAMP): Self = StObject.set(x, "AGGREGATION", value.asInstanceOf[js.Any])
    
    inline def setAGGREGATIONUndefined: Self = StObject.set(x, "AGGREGATION", js.undefined)
    
    inline def setALIGN(value: Timestamp): Self = StObject.set(x, "ALIGN", value.asInstanceOf[js.Any])
    
    inline def setALIGNUndefined: Self = StObject.set(x, "ALIGN", js.undefined)
    
    inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
    
    inline def setFILTER_BY_TS(value: js.Array[Timestamp]): Self = StObject.set(x, "FILTER_BY_TS", value.asInstanceOf[js.Any])
    
    inline def setFILTER_BY_TSUndefined: Self = StObject.set(x, "FILTER_BY_TS", js.undefined)
    
    inline def setFILTER_BY_TSVarargs(value: Timestamp*): Self = StObject.set(x, "FILTER_BY_TS", js.Array(value*))
    
    inline def setFILTER_BY_VALUE(value: Max): Self = StObject.set(x, "FILTER_BY_VALUE", value.asInstanceOf[js.Any])
    
    inline def setFILTER_BY_VALUEUndefined: Self = StObject.set(x, "FILTER_BY_VALUE", js.undefined)
    
    inline def setLATEST(value: Boolean): Self = StObject.set(x, "LATEST", value.asInstanceOf[js.Any])
    
    inline def setLATESTUndefined: Self = StObject.set(x, "LATEST", js.undefined)
  }
}
