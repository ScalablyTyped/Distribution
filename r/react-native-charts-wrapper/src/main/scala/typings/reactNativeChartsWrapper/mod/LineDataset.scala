package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineDataset
  extends StObject
     with Dataset {
  
  var config: js.UndefOr[LineDatasetConfig] = js.undefined
  
  var values: js.UndefOr[js.Array[Double | LineValue]] = js.undefined
}
object LineDataset {
  
  inline def apply(): LineDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineDataset] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: LineDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setValues(value: js.Array[Double | LineValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Double | LineValue)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
