package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToResult")
@js.native
object subscribeToResult extends js.Object {
  def apply[T, R](outerSubscriber: typings.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R], result: js.Any): js.UndefOr[Subscription] = js.native
  def apply[T, R](
    outerSubscriber: typings.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T
  ): js.UndefOr[Subscription] = js.native
  def apply[T, R](
    outerSubscriber: typings.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double
  ): js.UndefOr[Subscription] = js.native
  def apply[T, R](
    outerSubscriber: typings.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: js.UndefOr[scala.Nothing],
    outerIndex: js.UndefOr[scala.Nothing],
    innerSubscriber: typings.rxjs.internalInnerSubscriberMod.InnerSubscriber[T, R]
  ): js.UndefOr[Subscription] = js.native
}

