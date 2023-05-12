package typings.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set[This, Value] extends StObject {
  
  /**
    * Determines whether an object has a property with the same name as the decorated element.
    */
  /* standard decorators */
  def has(`object`: This): Boolean
  
  /**
    * Invokes the setter on the provided object.
    *
    * @example
    * context.access.set(instance, value);
    */
  /* standard decorators */
  def set(`object`: This, value: Value): scala.Unit
}
object Set {
  
  inline def apply[This, Value](has: This => Boolean, set: (This, Value) => scala.Unit): Set[This, Value] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Set[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Set[?, ?], This, Value] (val x: Self & (Set[This, Value])) extends AnyVal {
    
    inline def setHas(value: This => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setSet(value: (This, Value) => scala.Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
