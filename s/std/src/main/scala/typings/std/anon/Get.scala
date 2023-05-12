package typings.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get[This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */] extends StObject {
  
  /**
    * Gets the current value of the method from the provided object.
    *
    * @example
    * let fn = context.access.get(instance);
    */
  /* standard decorators */
  def get(`object`: This): Value
  
  /**
    * Determines whether an object has a property with the same name as the decorated element.
    */
  /* standard decorators */
  def has(`object`: This): Boolean
}
object Get {
  
  inline def apply[This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */](get: This => Value, has: This => Boolean): Get[This, Value] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Get[This, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Get[?, ?], This, Value /* <: js.ThisFunction1[/* this */ This, /* args */ Any, Any] */] (val x: Self & (Get[This, Value])) extends AnyVal {
    
    inline def setGet(value: This => Value): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: This => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
