package typings.rxjs.internalOuterSubscriberMod

import typings.rxjs.internalInnerSubscriberMod.InnerSubscriber
import typings.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/OuterSubscriber", "OuterSubscriber")
@js.native
class OuterSubscriber[T, R] () extends Subscriber[T] {
  def notifyComplete(innerSub: InnerSubscriber[T, R]): Unit = js.native
  def notifyError(error: js.Any, innerSub: InnerSubscriber[T, R]): Unit = js.native
  def notifyNext(
    outerValue: T,
    innerValue: R,
    outerIndex: Double,
    innerIndex: Double,
    innerSub: InnerSubscriber[T, R]
  ): Unit = js.native
}

