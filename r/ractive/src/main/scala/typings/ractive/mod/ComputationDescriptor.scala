package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputationDescriptor[T /* <: Ractive[T] */] extends StObject {
  
  /**
  	 * Called when Ractive needs to get the computed value. Computations are lazy, so this is only called when a dependency asks for a value.
  	 */
  def get(): js.Any
  /**
  	 * Called when Ractive needs to get the computed value. Computations are lazy, so this is only called when a dependency asks for a value.
  	 */
  @JSName("get")
  var get_Original: ComputationFn[T]
  
  /**
  	 * Called when Ractive is asked to set a computed keypath.
  	 */
  var set: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
}
object ComputationDescriptor {
  
  @scala.inline
  def apply[T /* <: Ractive[T] */](get: ComputationFn[T]): ComputationDescriptor[T] = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputationDescriptor[T]]
  }
  
  @scala.inline
  implicit class ComputationDescriptorMutableBuilder[Self <: ComputationDescriptor[?], T /* <: Ractive[T] */] (val x: Self & ComputationDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def setGet(value: ComputationFn[T]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: /* value */ js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
