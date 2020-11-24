package typings.reactScroll.scrollEventsMod.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollEvent extends js.Object {
  
  def register(eventName: String, callback: js.Function2[/* to */ String, /* element */ js.Any, Unit]): Unit = js.native
  
  def remove(eventName: String): Unit = js.native
}
object ScrollEvent {
  
  @scala.inline
  def apply(
    register: (String, js.Function2[/* to */ String, /* element */ js.Any, Unit]) => Unit,
    remove: String => Unit
  ): ScrollEvent = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ScrollEvent]
  }
  
  @scala.inline
  implicit class ScrollEventOps[Self <: ScrollEvent] (val x: Self) extends AnyVal {
    
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
    def setRegister(value: (String, js.Function2[/* to */ String, /* element */ js.Any, Unit]) => Unit): Self = this.set("register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
