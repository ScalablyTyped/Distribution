package typings.rsocketDashFlowable.flowableRequestOperatorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable/FlowableRequestOperator", JSImport.Default)
@js.native
class default[T] protected () extends FlowableRequestOperator[T] {
  def this(
    subscriber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ js.Any,
    toRequest: Double
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

