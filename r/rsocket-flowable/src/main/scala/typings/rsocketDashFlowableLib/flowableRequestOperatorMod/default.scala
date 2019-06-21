package typings
package rsocketDashFlowableLib.flowableRequestOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable/FlowableRequestOperator", JSImport.Default)
@js.native
class default[T] protected () extends FlowableRequestOperator[T] {
  def this(subscriber: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscriber<T> */ js.Any, toRequest: scala.Double) = this()
  /* CompleteClass */
  override def onComplete(): scala.Unit = js.native
  /* CompleteClass */
  override def onError(error: stdLib.Error): scala.Unit = js.native
  /* CompleteClass */
  override def onNext(t: T): scala.Unit = js.native
  /* CompleteClass */
  override def onSubscribe(
    subscription: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): scala.Unit = js.native
}

