package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptorHandle extends StObject {
  
  /** Called when Ractive needs to retrieve the adapted value. */
  def get(): Any
  
  /** Called when Ractive needs to replace the adapted value e.g. r.set('adapted', {}). */
  def reset(value: Any): Unit
  
  /** Called when Ractive needs to set a property of the adapted value e.g. r.set('adapted.prop', {}). */
  def set(prop: String, value: Any): Unit
  
  /** Called when Ractive no longer needs the adaptor. */
  def teardown(): Unit
}
object AdaptorHandle {
  
  inline def apply(get: () => Any, reset: Any => Unit, set: (String, Any) => Unit, teardown: () => Unit): AdaptorHandle = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set), teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[AdaptorHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdaptorHandle] (val x: Self) extends AnyVal {
    
    inline def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setReset(value: Any => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
  }
}
