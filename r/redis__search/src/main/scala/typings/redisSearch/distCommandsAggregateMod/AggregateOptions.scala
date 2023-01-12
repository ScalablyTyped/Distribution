package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsMod.Params
import typings.redisSearch.redisSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateOptions extends StObject {
  
  var DIALECT: js.UndefOr[Double] = js.undefined
  
  var LOAD: js.UndefOr[LoadField | js.Array[LoadField]] = js.undefined
  
  var PARAMS: js.UndefOr[Params] = js.undefined
  
  var STEPS: js.UndefOr[js.Array[GroupByStep | SortStep | ApplyStep | LimitStep | FilterStep]] = js.undefined
  
  var VERBATIM: js.UndefOr[`true`] = js.undefined
}
object AggregateOptions {
  
  inline def apply(): AggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateOptions] (val x: Self) extends AnyVal {
    
    inline def setDIALECT(value: Double): Self = StObject.set(x, "DIALECT", value.asInstanceOf[js.Any])
    
    inline def setDIALECTUndefined: Self = StObject.set(x, "DIALECT", js.undefined)
    
    inline def setLOAD(value: LoadField | js.Array[LoadField]): Self = StObject.set(x, "LOAD", value.asInstanceOf[js.Any])
    
    inline def setLOADUndefined: Self = StObject.set(x, "LOAD", js.undefined)
    
    inline def setLOADVarargs(value: LoadField*): Self = StObject.set(x, "LOAD", js.Array(value*))
    
    inline def setPARAMS(value: Params): Self = StObject.set(x, "PARAMS", value.asInstanceOf[js.Any])
    
    inline def setPARAMSUndefined: Self = StObject.set(x, "PARAMS", js.undefined)
    
    inline def setSTEPS(value: js.Array[GroupByStep | SortStep | ApplyStep | LimitStep | FilterStep]): Self = StObject.set(x, "STEPS", value.asInstanceOf[js.Any])
    
    inline def setSTEPSUndefined: Self = StObject.set(x, "STEPS", js.undefined)
    
    inline def setSTEPSVarargs(value: (GroupByStep | SortStep | ApplyStep | LimitStep | FilterStep)*): Self = StObject.set(x, "STEPS", js.Array(value*))
    
    inline def setVERBATIM(value: `true`): Self = StObject.set(x, "VERBATIM", value.asInstanceOf[js.Any])
    
    inline def setVERBATIMUndefined: Self = StObject.set(x, "VERBATIM", js.undefined)
  }
}
