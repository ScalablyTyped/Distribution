package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarDataset extends Dataset {
  
  var config: js.UndefOr[BarDatasetConfig] = js.native
  
  var values: js.UndefOr[js.Array[BarValue | Double | js.Array[Double]]] = js.native
}
object BarDataset {
  
  @scala.inline
  def apply(): BarDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarDataset]
  }
  
  @scala.inline
  implicit class BarDatasetMutableBuilder[Self <: BarDataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: BarDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[BarValue | Double | js.Array[Double]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (BarValue | Double | js.Array[Double])*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
