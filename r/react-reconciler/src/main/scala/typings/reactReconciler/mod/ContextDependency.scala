package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextDependency[T] extends StObject {
  
  var context: ReactContext[T]
  
  var next: ContextDependency[Any] | Null
  
  var observedBits: Double
}
object ContextDependency {
  
  inline def apply[T](context: ReactContext[T], observedBits: Double): ContextDependency[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], observedBits = observedBits.asInstanceOf[js.Any], next = null)
    __obj.asInstanceOf[ContextDependency[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextDependency[?], T] (val x: Self & ContextDependency[T]) extends AnyVal {
    
    inline def setContext(value: ReactContext[T]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ContextDependency[Any]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setObservedBits(value: Double): Self = StObject.set(x, "observedBits", value.asInstanceOf[js.Any])
  }
}
