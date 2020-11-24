package typings.reactstrap.tooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipChildrenRenderProps extends js.Object {
  
  def scheduleUpdate(): Unit = js.native
}
object TooltipChildrenRenderProps {
  
  @scala.inline
  def apply(scheduleUpdate: () => Unit): TooltipChildrenRenderProps = {
    val __obj = js.Dynamic.literal(scheduleUpdate = js.Any.fromFunction0(scheduleUpdate))
    __obj.asInstanceOf[TooltipChildrenRenderProps]
  }
  
  @scala.inline
  implicit class TooltipChildrenRenderPropsOps[Self <: TooltipChildrenRenderProps] (val x: Self) extends AnyVal {
    
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
    def setScheduleUpdate(value: () => Unit): Self = this.set("scheduleUpdate", js.Any.fromFunction0(value))
  }
}
