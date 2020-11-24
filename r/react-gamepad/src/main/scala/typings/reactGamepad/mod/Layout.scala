package typings.reactGamepad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends js.Object {
  
  var axis: js.Array[InvertibleAxis | Null] = js.native
  
  var buttonAxis: js.Array[InvertibleAxis | Null] = js.native
  
  var buttons: js.Array[Button | Null] = js.native
}
object Layout {
  
  @scala.inline
  def apply(
    axis: js.Array[InvertibleAxis | Null],
    buttonAxis: js.Array[InvertibleAxis | Null],
    buttons: js.Array[Button | Null]
  ): Layout = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], buttonAxis = buttonAxis.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    
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
    def setAxisVarargs(value: (InvertibleAxis | Null)*): Self = this.set("axis", js.Array(value :_*))
    
    @scala.inline
    def setAxis(value: js.Array[InvertibleAxis | Null]): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonAxisVarargs(value: (InvertibleAxis | Null)*): Self = this.set("buttonAxis", js.Array(value :_*))
    
    @scala.inline
    def setButtonAxis(value: js.Array[InvertibleAxis | Null]): Self = this.set("buttonAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: (Button | Null)*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Button | Null]): Self = this.set("buttons", value.asInstanceOf[js.Any])
  }
}
