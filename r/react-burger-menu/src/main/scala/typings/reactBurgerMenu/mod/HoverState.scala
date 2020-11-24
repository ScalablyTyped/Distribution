package typings.reactBurgerMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverState extends js.Object {
  
  var isMouseIn: Boolean = js.native
}
object HoverState {
  
  @scala.inline
  def apply(isMouseIn: Boolean): HoverState = {
    val __obj = js.Dynamic.literal(isMouseIn = isMouseIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverState]
  }
  
  @scala.inline
  implicit class HoverStateOps[Self <: HoverState] (val x: Self) extends AnyVal {
    
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
    def setIsMouseIn(value: Boolean): Self = this.set("isMouseIn", value.asInstanceOf[js.Any])
  }
}
