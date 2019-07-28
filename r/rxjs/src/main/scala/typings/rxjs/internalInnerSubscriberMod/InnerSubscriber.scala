package typings.rxjs.internalInnerSubscriberMod

import typings.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typings.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/InnerSubscriber", "InnerSubscriber")
@js.native
class InnerSubscriber[T, R] protected () extends Subscriber[R] {
  def this(parent: OuterSubscriber[T, R], outerValue: T, outerIndex: Double) = this()
  var index: js.Any = js.native
  var outerIndex: Double = js.native
  var outerValue: T = js.native
  var parent: js.Any = js.native
}

