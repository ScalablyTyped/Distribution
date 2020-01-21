package typings.rsocketFlowable.flowableMapOperatorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable/FlowableMapOperator", JSImport.Default)
@js.native
class default[T, R] protected () extends FlowableMapOperator[T, R] {
  def this(
    subscriber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<R> */ js.Any,
    fn: js.Function1[/* t */ T, R]
  ) = this()
  /* CompleteClass */
  override def onComplete(): Unit = js.native
  /* CompleteClass */
  override def onError(error: Error): Unit = js.native
  /* CompleteClass */
  override def onNext(t: T): Unit = js.native
  /* CompleteClass */
  override def onSubscribe(
    subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): Unit = js.native
}

