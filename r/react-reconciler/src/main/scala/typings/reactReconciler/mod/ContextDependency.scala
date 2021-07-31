package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// react-reconciler/ReactFiberNewContext
trait ContextDependency[T] extends StObject {
  
  var context: ReactContext[T]
  
  var next: ContextDependency[js.Any] | Null
  
  var observedBits: Double
}
object ContextDependency {
  
  @scala.inline
  def apply[T](context: ReactContext[T], observedBits: Double): ContextDependency[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], observedBits = observedBits.asInstanceOf[js.Any], next = null)
    __obj.asInstanceOf[ContextDependency[T]]
  }
  
  @scala.inline
  implicit class ContextDependencyMutableBuilder[Self <: ContextDependency[?], T] (val x: Self & ContextDependency[T]) extends AnyVal {
    
    @scala.inline
    def setContext(value: ReactContext[T]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ContextDependency[js.Any]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = StObject.set(x, "next", null)
    
    @scala.inline
    def setObservedBits(value: Double): Self = StObject.set(x, "observedBits", value.asInstanceOf[js.Any])
  }
}
