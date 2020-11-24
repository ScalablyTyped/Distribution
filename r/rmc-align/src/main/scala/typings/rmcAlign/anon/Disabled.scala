package typings.rmcAlign.anon

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends js.Object {
  
  var disabled: Boolean = js.native
  
  var monitorBufferTime: Double = js.native
  
  var monitorWindowResize: Boolean = js.native
  
  def onAlign(): Unit = js.native
  
  def target(): Window = js.native
}
object Disabled {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    monitorBufferTime: Double,
    monitorWindowResize: Boolean,
    onAlign: () => Unit,
    target: () => Window
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], monitorBufferTime = monitorBufferTime.asInstanceOf[js.Any], monitorWindowResize = monitorWindowResize.asInstanceOf[js.Any], onAlign = js.Any.fromFunction0(onAlign), target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorBufferTime(value: Double): Self = this.set("monitorBufferTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorWindowResize(value: Boolean): Self = this.set("monitorWindowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAlign(value: () => Unit): Self = this.set("onAlign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: () => Window): Self = this.set("target", js.Any.fromFunction0(value))
  }
}
