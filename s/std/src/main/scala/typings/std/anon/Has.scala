package typings.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Has[This, Value] extends StObject {
  
  /**
    * Invokes the getter on the provided object.
    *
    * @example
    * let value = context.access.get(instance);
    */
  /* standard decorators */
  def get(`object`: This): Value
  
  /**
    * Determines whether an object has a property with the same name as the decorated element.
    */
  /* standard decorators */
  def has(`object`: This): Boolean
}
object Has {
  
  inline def apply[This, Value](get: This => Value, has: This => Boolean): Has[This, Value] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Has[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Has[?, ?], This, Value] (val x: Self & (Has[This, Value])) extends AnyVal {
    
    inline def setGet(value: This => Value): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: This => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
