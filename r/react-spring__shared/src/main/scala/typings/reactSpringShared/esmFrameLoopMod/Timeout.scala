package typings.reactSpringShared.esmFrameLoopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeout extends js.Object {
  
  def cancel(): Unit = js.native
  
  def handler(): Unit = js.native
  
  var time: Double = js.native
}
object Timeout {
  
  @scala.inline
  def apply(cancel: () => Unit, handler: () => Unit, time: Double): Timeout = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), handler = js.Any.fromFunction0(handler), time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  
  @scala.inline
  implicit class TimeoutOps[Self <: Timeout] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandler(value: () => Unit): Self = this.set("handler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
