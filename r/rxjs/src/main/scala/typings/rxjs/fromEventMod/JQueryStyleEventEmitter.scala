package typings.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStyleEventEmitter
  extends EventTargetLike[js.Any] {
  
  def off(eventName: String, handler: js.Function): Unit = js.native
  
  def on(eventName: String, handler: js.Function): Unit = js.native
}
object JQueryStyleEventEmitter {
  
  @scala.inline
  def apply(off: (String, js.Function) => Unit, on: (String, js.Function) => Unit): JQueryStyleEventEmitter = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[JQueryStyleEventEmitter]
  }
  
  @scala.inline
  implicit class JQueryStyleEventEmitterOps[Self <: JQueryStyleEventEmitter] (val x: Self) extends AnyVal {
    
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
    def setOff(value: (String, js.Function) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
