package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMEventTarget extends StObject {
  
  def addEventListener(`type`: String, listener: js.Function1[/* e */ Any, Any], useCapture: Boolean): Unit
  
  def removeEventListener(`type`: String, listener: js.Function1[/* e */ Any, Any], useCapture: Boolean): Unit
}
object DOMEventTarget {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* e */ Any, Any], Boolean) => Unit,
    removeEventListener: (String, js.Function1[/* e */ Any, Any], Boolean) => Unit
  ): DOMEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[DOMEventTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMEventTarget] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (String, js.Function1[/* e */ Any, Any], Boolean) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* e */ Any, Any], Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
  }
}
