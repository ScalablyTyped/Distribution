package typings.rcSlider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTooltipContainer extends StObject {
  
  def getTooltipContainer(node: js.Any): js.Any
  
  var handleStyle: js.Array[js.Object]
  
  def tipFormatter(value: Double): Double
}
object GetTooltipContainer {
  
  inline def apply(
    getTooltipContainer: js.Any => js.Any,
    handleStyle: js.Array[js.Object],
    tipFormatter: Double => Double
  ): GetTooltipContainer = {
    val __obj = js.Dynamic.literal(getTooltipContainer = js.Any.fromFunction1(getTooltipContainer), handleStyle = handleStyle.asInstanceOf[js.Any], tipFormatter = js.Any.fromFunction1(tipFormatter))
    __obj.asInstanceOf[GetTooltipContainer]
  }
  
  extension [Self <: GetTooltipContainer](x: Self) {
    
    inline def setGetTooltipContainer(value: js.Any => js.Any): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction1(value))
    
    inline def setHandleStyle(value: js.Array[js.Object]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
    
    inline def setHandleStyleVarargs(value: js.Object*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
    
    inline def setTipFormatter(value: Double => Double): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
  }
}
