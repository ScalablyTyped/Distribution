package typings
package rsocketDashFlowableLib.flowableMapOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait FlowableMapOperator[T, R] extends js.Object {
  def onComplete(): scala.Unit
  def onError(error: stdLib.Error): scala.Unit
  def onNext(t: T): scala.Unit
  def onSubscribe(
    subscription: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): scala.Unit
}

object FlowableMapOperator {
  @scala.inline
  def apply[T, R](
    onComplete: () => scala.Unit,
    onError: stdLib.Error => scala.Unit,
    onNext: T => scala.Unit,
    onSubscribe: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any => scala.Unit
  ): FlowableMapOperator[T, R] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[FlowableMapOperator[T, R]]
  }
}

