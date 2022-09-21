package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandleStickData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[CandleStickDataset]] = js.undefined
}
object CandleStickData {
  
  inline def apply(): CandleStickData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickData]
  }
  
  extension [Self <: CandleStickData](x: Self) {
    
    inline def setDataSets(value: js.Array[CandleStickDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: CandleStickDataset*): Self = StObject.set(x, "dataSets", js.Array(value*))
  }
}
