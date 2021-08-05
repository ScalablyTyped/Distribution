package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterDataset
  extends StObject
     with Dataset {
  
  var config: js.UndefOr[ScatterDatasetConfig] = js.undefined
  
  @JSName("label")
  var label_ScatterDataset: String
  
  var values: js.UndefOr[js.Array[LineValue | Double]] = js.undefined
}
object ScatterDataset {
  
  inline def apply(label: String): ScatterDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterDataset]
  }
  
  extension [Self <: ScatterDataset](x: Self) {
    
    inline def setConfig(value: ScatterDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[LineValue | Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (LineValue | Double)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
