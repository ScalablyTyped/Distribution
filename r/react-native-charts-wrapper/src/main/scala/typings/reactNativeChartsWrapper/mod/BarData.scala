package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.BarWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarData extends StObject {
  
  var config: js.UndefOr[BarWidth] = js.undefined
  
  var dataSets: js.UndefOr[js.Array[BarDataset]] = js.undefined
}
object BarData {
  
  @scala.inline
  def apply(): BarData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarData]
  }
  
  @scala.inline
  implicit class BarDataMutableBuilder[Self <: BarData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: BarWidth): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDataSets(value: js.Array[BarDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    @scala.inline
    def setDataSetsVarargs(value: BarDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
