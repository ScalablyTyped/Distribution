package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[PieDataset]] = js.undefined
}
object PieData {
  
  inline def apply(): PieData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieData]
  }
  
  extension [Self <: PieData](x: Self) {
    
    inline def setDataSets(value: js.Array[PieDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: PieDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
