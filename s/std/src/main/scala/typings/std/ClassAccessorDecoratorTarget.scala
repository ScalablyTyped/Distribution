package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the target provided to class `accessor` field decorators.
  * @template This The `this` type to which the target applies.
  * @template Value The property type for the class `accessor` field.
  */
trait ClassAccessorDecoratorTarget[This, Value] extends StObject {
  
  /**
    * Invokes the getter that was defined prior to decorator application.
    *
    * @example
    * let value = target.get.call(instance);
    */
  /* standard decorators */
  def get(): Value
  
  /**
    * Invokes the setter that was defined prior to decorator application.
    *
    * @example
    * target.set.call(instance, value);
    */
  /* standard decorators */
  def set(value: Value): Unit
}
object ClassAccessorDecoratorTarget {
  
  inline def apply[This, Value](get: () => Value, set: Value => Unit): ClassAccessorDecoratorTarget[This, Value] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ClassAccessorDecoratorTarget[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassAccessorDecoratorTarget[?, ?], This, Value] (val x: Self & (ClassAccessorDecoratorTarget[This, Value])) extends AnyVal {
    
    inline def setGet(value: () => Value): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: Value => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
