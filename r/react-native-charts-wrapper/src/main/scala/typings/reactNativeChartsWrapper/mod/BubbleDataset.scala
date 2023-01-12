package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleDataset
  extends StObject
     with Dataset {
  
  var config: js.UndefOr[BubbleDatasetConfig] = js.undefined
  
  @JSName("label")
  var label_BubbleDataset: String
  
  var values: js.UndefOr[js.Array[BubbleValue]] = js.undefined
}
object BubbleDataset {
  
  inline def apply(label: String): BubbleDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BubbleDataset] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: BubbleDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[BubbleValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: BubbleValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
