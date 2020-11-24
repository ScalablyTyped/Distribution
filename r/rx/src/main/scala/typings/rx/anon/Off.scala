package typings.rx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Off extends js.Object {
  
  def off(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
  
  def on(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
}
object Off {
  
  @scala.inline
  def apply(
    off: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit
  ): Off = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[Off]
  }
  
  @scala.inline
  implicit class OffOps[Self <: Off] (val x: Self) extends AnyVal {
    
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
    def setOff(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
