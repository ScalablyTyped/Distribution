package typings.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHas[This, Value] extends StObject {
  
  /**
    * Gets the value of the field on the provided object.
    */
  /* standard decorators */
  def get(`object`: This): Value
  
  /**
    * Determines whether an object has a property with the same name as the decorated element.
    */
  /* standard decorators */
  def has(`object`: This): Boolean
  
  /**
    * Sets the value of the field on the provided object.
    */
  /* standard decorators */
  def set(`object`: This, value: Value): scala.Unit
}
object GetHas {
  
  inline def apply[This, Value](get: This => Value, has: This => Boolean, set: (This, Value) => scala.Unit): GetHas[This, Value] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[GetHas[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHas[?, ?], This, Value] (val x: Self & (GetHas[This, Value])) extends AnyVal {
    
    inline def setGet(value: This => Value): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: This => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setSet(value: (This, Value) => scala.Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
