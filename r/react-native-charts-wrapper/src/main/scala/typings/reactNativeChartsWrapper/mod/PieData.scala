package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[PieDataset]] = js.native
}
object PieData {
  
  @scala.inline
  def apply(): PieData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieData]
  }
  
  @scala.inline
  implicit class PieDataMutableBuilder[Self <: PieData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSets(value: js.Array[PieDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    @scala.inline
    def setDataSetsVarargs(value: PieDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
