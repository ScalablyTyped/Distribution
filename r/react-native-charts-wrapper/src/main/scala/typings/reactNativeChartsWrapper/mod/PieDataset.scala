package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieDataset
  extends StObject
     with Dataset {
  
  var config: js.UndefOr[PieDatasetConfig] = js.undefined
  
  @JSName("label")
  var label_PieDataset: String
  
  var values: js.UndefOr[js.Array[PieValue | Double]] = js.undefined
}
object PieDataset {
  
  inline def apply(label: String): PieDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieDataset] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: PieDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[PieValue | Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (PieValue | Double)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
