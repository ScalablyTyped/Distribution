package typings.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipState extends js.Object {
  
  val displayTooltip: js.Any = js.native
}
object TooltipState {
  
  @scala.inline
  def apply(displayTooltip: js.Any): TooltipState = {
    val __obj = js.Dynamic.literal(displayTooltip = displayTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipState]
  }
  
  @scala.inline
  implicit class TooltipStateOps[Self <: TooltipState] (val x: Self) extends AnyVal {
    
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
    def setDisplayTooltip(value: js.Any): Self = this.set("displayTooltip", value.asInstanceOf[js.Any])
  }
}
