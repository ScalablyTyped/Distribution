package typings.signals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalWrapper[T] extends js.Object {
  
  var Signal: typings.signals.mod.Signal[T] = js.native
}
object SignalWrapper {
  
  @scala.inline
  def apply[T](Signal: Signal[T]): SignalWrapper[T] = {
    val __obj = js.Dynamic.literal(Signal = Signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalWrapper[T]]
  }
  
  @scala.inline
  implicit class SignalWrapperOps[Self <: SignalWrapper[_], T] (val x: Self with SignalWrapper[T]) extends AnyVal {
    
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
    def setSignal(value: Signal[T]): Self = this.set("Signal", value.asInstanceOf[js.Any])
  }
}
