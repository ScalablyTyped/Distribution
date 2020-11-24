package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// react-reconciler/ReactFiberNewContext
@js.native
trait ContextDependency[T] extends js.Object {
  
  var context: ReactContext[T] = js.native
  
  var next: ContextDependency[_] | Null = js.native
  
  var observedBits: Double = js.native
}
object ContextDependency {
  
  @scala.inline
  def apply[T](context: ReactContext[T], observedBits: Double): ContextDependency[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], observedBits = observedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextDependency[T]]
  }
  
  @scala.inline
  implicit class ContextDependencyOps[Self <: ContextDependency[_], T] (val x: Self with ContextDependency[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: ReactContext[T]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedBits(value: Double): Self = this.set("observedBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ContextDependency[_]): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
  }
}
