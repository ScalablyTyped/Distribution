package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputationDescriptor[T /* <: Ractive[T] */] extends StObject {
  
  /**
  	 * Called when Ractive needs to get the computed value. Computations are lazy, so this is only called when a dependency asks for a value.
  	 */
  def get(context: Any, keypath: String): Any
  /**
  	 * Called when Ractive needs to get the computed value. Computations are lazy, so this is only called when a dependency asks for a value.
  	 */
  @JSName("get")
  var get_Original: ComputationFn[T]
  
  /**
  	 * Called when Ractive is asked to set a computed keypath.
  	 */
  var set: js.UndefOr[
    js.ThisFunction3[/* this */ T, /* value */ Any, /* context */ Any, /* keypath */ String, Unit]
  ] = js.undefined
}
object ComputationDescriptor {
  
  inline def apply[T /* <: Ractive[T] */](get: ComputationFn[T]): ComputationDescriptor[T] = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputationDescriptor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputationDescriptor[?], T /* <: Ractive[T] */] (val x: Self & ComputationDescriptor[T]) extends AnyVal {
    
    inline def setGet(value: ComputationFn[T]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: js.ThisFunction3[/* this */ T, /* value */ Any, /* context */ Any, /* keypath */ String, Unit]
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
