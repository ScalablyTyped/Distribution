package typings.rcSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTooltipContainer extends js.Object {
  
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
  implicit class GetTooltipContainerOps[Self <: GetTooltipContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetTooltipContainer(value: js.Any => js.Any): Self = this.set("getTooltipContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleStyleVarargs(value: js.Object*): Self = this.set("handleStyle", js.Array(value :_*))
    
    @scala.inline
    def setHandleStyle(value: js.Array[js.Object]): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipFormatter(value: Double => Double): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
  }
}
