package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterData extends StObject {
  
  var dataSets: js.Array[ScatterDataset]
}
object ScatterData {
  
  @scala.inline
  def apply(dataSets: js.Array[ScatterDataset]): ScatterData = {
    val __obj = js.Dynamic.literal(dataSets = dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterData]
  }
  
  @scala.inline
  implicit class ScatterDataMutableBuilder[Self <: ScatterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSets(value: js.Array[ScatterDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsVarargs(value: ScatterDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
