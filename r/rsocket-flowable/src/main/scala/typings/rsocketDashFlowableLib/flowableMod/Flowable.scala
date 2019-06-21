package typings
package rsocketDashFlowableLib.flowableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Flowable[T] extends js.Object {
  def lift[R](
    onSubscribeLift: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscriber<R> */ /* subscriber */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscriber<T> */ _
    ]
  ): Flowable[R] = js.native
  def map[R](fn: js.Function1[/* data */ T, R]): Flowable[R] = js.native
  def subscribe(): scala.Unit = js.native
  def subscribe(subscriberOrCallback: js.Function1[/* a */ T, scala.Unit]): scala.Unit = js.native
  def subscribe(
    subscriberOrCallback: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscriber<T> */ _
    ]
  ): scala.Unit = js.native
  def take(toTake: scala.Double): Flowable[T] = js.native
}

