package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdaptorHandle extends StObject {
  
  /** Called when Ractive needs to retrieve the adapted value. */
  def get(): js.Any = js.native
  
  /** Called when Ractive needs to replace the adapted value e.g. r.set('adapted', {}). */
  def reset(value: js.Any): Unit = js.native
  
  /** Called when Ractive needs to set a property of the adapted value e.g. r.set('adapted.prop', {}). */
  def set(prop: String, value: js.Any): Unit = js.native
  
  /** Called when Ractive no longer needs the adaptor. */
  def teardown(): Unit = js.native
}
object AdaptorHandle {
  
  @scala.inline
  def apply(get: () => js.Any, reset: js.Any => Unit, set: (String, js.Any) => Unit, teardown: () => Unit): AdaptorHandle = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set), teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[AdaptorHandle]
  }
  
  @scala.inline
  implicit class AdaptorHandleMutableBuilder[Self <: AdaptorHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: js.Any => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
  }
}
