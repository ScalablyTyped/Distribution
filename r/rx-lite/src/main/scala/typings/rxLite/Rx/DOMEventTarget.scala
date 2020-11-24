package typings.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMEventTarget extends js.Object {
  
  def addEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit = js.native
  
  def removeEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit = js.native
}
object DOMEventTarget {
  
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit,
    removeEventListener: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit
  ): DOMEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[DOMEventTarget]
  }
  
  @scala.inline
  implicit class DOMEventTargetOps[Self <: DOMEventTarget] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit): Self = this.set("addEventListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction3(value))
  }
}
