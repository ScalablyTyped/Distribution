package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[LineDataset]] = js.native
}
object LineData {
  
  @scala.inline
  def apply(): LineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineData]
  }
  
  @scala.inline
  implicit class LineDataMutableBuilder[Self <: LineData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSets(value: js.Array[LineDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    @scala.inline
    def setDataSetsVarargs(value: LineDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
