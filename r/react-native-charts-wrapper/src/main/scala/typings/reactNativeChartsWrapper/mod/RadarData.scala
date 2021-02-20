package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadarData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[RadarDataset]] = js.native
  
  var labels: js.UndefOr[js.Array[String]] = js.native
}
object RadarData {
  
  @scala.inline
  def apply(): RadarData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarData]
  }
  
  @scala.inline
  implicit class RadarDataMutableBuilder[Self <: RadarData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSets(value: js.Array[RadarDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    @scala.inline
    def setDataSetsVarargs(value: RadarDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
