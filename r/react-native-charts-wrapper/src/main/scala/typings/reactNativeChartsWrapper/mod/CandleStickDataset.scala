package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandleStickDataset
  extends StObject
     with Dataset {
  
  var config: js.UndefOr[CandleStickDatasetConfig] = js.undefined
  
  @JSName("label")
  var label_CandleStickDataset: String
  
  var values: js.UndefOr[js.Array[CandleStickValue]] = js.undefined
}
object CandleStickDataset {
  
  @scala.inline
  def apply(label: String): CandleStickDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickDataset]
  }
  
  @scala.inline
  implicit class CandleStickDatasetMutableBuilder[Self <: CandleStickDataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: CandleStickDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[CandleStickValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CandleStickValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
