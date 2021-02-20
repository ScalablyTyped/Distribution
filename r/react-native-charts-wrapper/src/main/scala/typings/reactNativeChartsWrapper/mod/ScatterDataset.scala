package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterDataset extends Dataset {
  
  var config: js.UndefOr[ScatterDatasetConfig] = js.native
  
  @JSName("label")
  var label_ScatterDataset: String = js.native
  
  var values: js.UndefOr[js.Array[LineValue | Double]] = js.native
}
object ScatterDataset {
  
  @scala.inline
  def apply(label: String): ScatterDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterDataset]
  }
  
  @scala.inline
  implicit class ScatterDatasetMutableBuilder[Self <: ScatterDataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ScatterDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[LineValue | Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (LineValue | Double)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
