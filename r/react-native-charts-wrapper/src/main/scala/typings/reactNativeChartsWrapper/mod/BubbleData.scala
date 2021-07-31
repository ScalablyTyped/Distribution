package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[BubbleDataset]] = js.undefined
}
object BubbleData {
  
  @scala.inline
  def apply(): BubbleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleData]
  }
  
  @scala.inline
  implicit class BubbleDataMutableBuilder[Self <: BubbleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSets(value: js.Array[BubbleDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    @scala.inline
    def setDataSetsVarargs(value: BubbleDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
