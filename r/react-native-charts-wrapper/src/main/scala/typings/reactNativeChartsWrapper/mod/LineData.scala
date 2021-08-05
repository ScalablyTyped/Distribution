package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[LineDataset]] = js.undefined
}
object LineData {
  
  inline def apply(): LineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineData]
  }
  
  extension [Self <: LineData](x: Self) {
    
    inline def setDataSets(value: js.Array[LineDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: LineDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
