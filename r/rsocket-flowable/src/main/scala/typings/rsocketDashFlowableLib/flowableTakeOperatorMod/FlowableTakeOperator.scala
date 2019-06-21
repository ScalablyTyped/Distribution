package typings
package rsocketDashFlowableLib.flowableTakeOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait FlowableTakeOperator[T] extends js.Object {
  def onComplete(): scala.Unit
  def onError(error: stdLib.Error): scala.Unit
  def onNext(t: T): scala.Unit
  def onSubscribe(
    subscription: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): scala.Unit
}

object FlowableTakeOperator {
  @scala.inline
  def apply[T](
    onComplete: () => scala.Unit,
    onError: stdLib.Error => scala.Unit,
    onNext: T => scala.Unit,
    onSubscribe: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any => scala.Unit
  ): FlowableTakeOperator[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[FlowableTakeOperator[T]]
  }
}

