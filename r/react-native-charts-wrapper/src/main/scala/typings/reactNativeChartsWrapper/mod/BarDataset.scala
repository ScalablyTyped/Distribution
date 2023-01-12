package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarDataset
  extends StObject
     with Dataset {
  
  var config: js.UndefOr[BarDatasetConfig] = js.undefined
  
  var values: js.UndefOr[js.Array[BarValue | Double | js.Array[Double]]] = js.undefined
}
object BarDataset {
  
  inline def apply(): BarDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarDataset] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: BarDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setValues(value: js.Array[BarValue | Double | js.Array[Double]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (BarValue | Double | js.Array[Double])*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
