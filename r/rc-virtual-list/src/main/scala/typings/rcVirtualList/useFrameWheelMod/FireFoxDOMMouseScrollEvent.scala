package typings.rcVirtualList.useFrameWheelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FireFoxDOMMouseScrollEvent extends js.Object {
  
  var detail: Double = js.native
  
  var preventDefault: js.Function = js.native
}
object FireFoxDOMMouseScrollEvent {
  
  @scala.inline
  def apply(detail: Double, preventDefault: js.Function): FireFoxDOMMouseScrollEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[FireFoxDOMMouseScrollEvent]
  }
  
  @scala.inline
  implicit class FireFoxDOMMouseScrollEventOps[Self <: FireFoxDOMMouseScrollEvent] (val x: Self) extends AnyVal {
    
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
    def setDetail(value: Double): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
  }
}
