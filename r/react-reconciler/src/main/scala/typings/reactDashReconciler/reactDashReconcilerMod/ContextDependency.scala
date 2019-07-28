package typings.reactDashReconciler.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactFiberNewContext
trait ContextDependency[T] extends js.Object {
  var context: ReactContext[T]
  var next: ContextDependency[_] | Null
  var observedBits: Double
}

object ContextDependency {
  @scala.inline
  def apply[T](context: ReactContext[T], observedBits: Double, next: ContextDependency[_] = null): ContextDependency[T] = {
    val __obj = js.Dynamic.literal(context = context, observedBits = observedBits)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[ContextDependency[T]]
  }
}

