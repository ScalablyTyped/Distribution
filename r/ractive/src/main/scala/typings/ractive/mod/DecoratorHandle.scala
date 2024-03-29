package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecoratorHandle extends StObject {
  
  /**
  	 * Called when any downstream template from the element will be updated.
  	 */
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
  	 * Called when the decorator is being removed from its element.
  	 */
  def teardown(): Unit
  
  /**
  	 * Called when any arguments passed to the decorator update. If no update function is supplied, then the decorator will be torn down and recreated when the decorator arguments update.j
  	 */
  var update: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
}
object DecoratorHandle {
  
  inline def apply(teardown: () => Unit): DecoratorHandle = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[DecoratorHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecoratorHandle] (val x: Self) extends AnyVal {
    
    inline def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
    
    inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    inline def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: /* repeated */ Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
