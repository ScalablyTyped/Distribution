package typings
package rxjsLib.internalOuterSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/OuterSubscriber", "OuterSubscriber")
@js.native
class OuterSubscriber[T, R] ()
  extends rxjsLib.internalSubscriberMod.Subscriber[T] {
  def notifyComplete(innerSub: rxjsLib.internalInnerSubscriberMod.InnerSubscriber[T, R]): scala.Unit = js.native
  def notifyError(error: js.Any, innerSub: rxjsLib.internalInnerSubscriberMod.InnerSubscriber[T, R]): scala.Unit = js.native
  def notifyNext(
    outerValue: T,
    innerValue: R,
    outerIndex: scala.Double,
    innerIndex: scala.Double,
    innerSub: rxjsLib.internalInnerSubscriberMod.InnerSubscriber[T, R]
  ): scala.Unit = js.native
}

