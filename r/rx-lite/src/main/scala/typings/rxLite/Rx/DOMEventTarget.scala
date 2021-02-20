package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMEventTarget extends StObject {
  
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
  implicit class DOMEventTargetMutableBuilder[Self <: DOMEventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
  }
}
