package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarDataset
  extends StObject
     with Dataset {
  
  var config: js.UndefOr[RadarDatasetConfig] = js.undefined
  
  @JSName("label")
  var label_RadarDataset: String
  
  var values: js.UndefOr[js.Array[Value | Double]] = js.undefined
}
object RadarDataset {
  
  @scala.inline
  def apply(label: String): RadarDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarDataset]
  }
  
  @scala.inline
  implicit class RadarDatasetMutableBuilder[Self <: RadarDataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: RadarDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[Value | Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (Value | Double)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
