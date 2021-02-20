package typings.rcSlider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTooltipContainer extends StObject {
  
  def getTooltipContainer(node: js.Any): js.Any = js.native
  
  var handleStyle: js.Array[js.Object] = js.native
  
  def tipFormatter(value: Double): Double = js.native
}
object GetTooltipContainer {
  
  @scala.inline
  def apply(
    getTooltipContainer: js.Any => js.Any,
    handleStyle: js.Array[js.Object],
    tipFormatter: Double => Double
  ): GetTooltipContainer = {
    val __obj = js.Dynamic.literal(getTooltipContainer = js.Any.fromFunction1(getTooltipContainer), handleStyle = handleStyle.asInstanceOf[js.Any], tipFormatter = js.Any.fromFunction1(tipFormatter))
    __obj.asInstanceOf[GetTooltipContainer]
  }
  
  @scala.inline
  implicit class GetTooltipContainerMutableBuilder[Self <: GetTooltipContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTooltipContainer(value: js.Any => js.Any): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleStyle(value: js.Array[js.Object]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleStyleVarargs(value: js.Object*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
    
    @scala.inline
    def setTipFormatter(value: Double => Double): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
  }
}
