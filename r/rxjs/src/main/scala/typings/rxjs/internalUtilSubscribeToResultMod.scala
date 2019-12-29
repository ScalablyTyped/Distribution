package typings.rxjs

import typings.rxjs.internalInnerSubscriberMod.InnerSubscriber
import typings.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typings.rxjs.internalSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToResult", JSImport.Namespace)
@js.native
object internalUtilSubscribeToResultMod extends js.Object {
  def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any): js.UndefOr[Subscription] = js.native
  def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any, outerValue: T): js.UndefOr[Subscription] = js.native
  def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any, outerValue: T, outerIndex: Double): js.UndefOr[Subscription] = js.native
  def subscribeToResult[T, R](
    outerSubscriber: OuterSubscriber[T, R],
    result: js.Any,
    outerValue: js.UndefOr[scala.Nothing],
    outerIndex: js.UndefOr[scala.Nothing],
    innerSubscriber: InnerSubscriber[T, R]
  ): js.UndefOr[Subscription] = js.native
}

