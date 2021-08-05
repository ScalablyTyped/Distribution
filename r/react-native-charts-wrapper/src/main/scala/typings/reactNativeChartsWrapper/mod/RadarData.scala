package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[RadarDataset]] = js.undefined
  
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}
object RadarData {
  
  inline def apply(): RadarData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarData]
  }
  
  extension [Self <: RadarData](x: Self) {
    
    inline def setDataSets(value: js.Array[RadarDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: RadarDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
