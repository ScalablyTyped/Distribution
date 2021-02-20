package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleDataset extends Dataset {
  
  var config: js.UndefOr[BubbleDatasetConfig] = js.native
  
  @JSName("label")
  var label_BubbleDataset: String = js.native
  
  var values: js.UndefOr[js.Array[BubbleValue]] = js.native
}
object BubbleDataset {
  
  @scala.inline
  def apply(label: String): BubbleDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleDataset]
  }
  
  @scala.inline
  implicit class BubbleDatasetMutableBuilder[Self <: BubbleDataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: BubbleDatasetConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[BubbleValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: BubbleValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
