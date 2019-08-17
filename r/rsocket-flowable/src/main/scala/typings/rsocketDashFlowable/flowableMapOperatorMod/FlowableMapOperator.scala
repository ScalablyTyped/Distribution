package typings.rsocketDashFlowable.flowableMapOperatorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ trait FlowableMapOperator[T, R] extends js.Object {
  def onComplete(): Unit
  def onError(error: Error): Unit
  def onNext(t: T): Unit
  def onSubscribe(
    subscription: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): Unit
}

object FlowableMapOperator {
  @scala.inline
  def apply[T, R](
    onComplete: () => Unit,
    onError: Error => Unit,
    onNext: T => Unit,
    onSubscribe: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
  ): FlowableMapOperator[T, R] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[FlowableMapOperator[T, R]]
  }
}

