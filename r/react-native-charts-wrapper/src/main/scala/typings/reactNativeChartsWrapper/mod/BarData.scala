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
  
  inline def apply(): BarData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarData] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: BarWidth): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDataSets(value: js.Array[BarDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: BarDataset*): Self = StObject.set(x, "dataSets", js.Array(value*))
  }
}
