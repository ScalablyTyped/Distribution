package typings
package rsocketDashFlowableLib.flowableProcessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any
- Dropped any
- Dropped any */ @js.native
trait FlowableProcessor[T, R] extends js.Object {
  def cancel(): scala.Unit = js.native
  def map[S](fn: js.Function1[/* a */ R, S]): js.Any = js.native
  def onComplete(): scala.Unit = js.native
  def onError(error: stdLib.Error): scala.Unit = js.native
  def onNext(t: T): scala.Unit = js.native
  def onSubscribe(
    subscription: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): scala.Unit = js.native
  def request(n: scala.Double): scala.Unit = js.native
  def subscribe(): scala.Unit = js.native
  def subscribe(
    subscriber: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscriber<R> */ _
    ]
  ): scala.Unit = js.native
}

