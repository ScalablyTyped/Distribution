package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterChartProps
  extends StObject
     with BarLineChartBase {
  
  var data: js.UndefOr[ScatterData] = js.undefined
}
object ScatterChartProps {
  
  @scala.inline
  def apply(): ScatterChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterChartProps]
  }
  
  @scala.inline
  implicit class ScatterChartPropsMutableBuilder[Self <: ScatterChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ScatterData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
