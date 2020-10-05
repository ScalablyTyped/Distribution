package typings.rxjs

import typings.rxjs.innerSubscriberMod.InnerSubscriber
import typings.rxjs.outerSubscriberMod.OuterSubscriber
import typings.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/util/subscribeToResult", JSImport.Namespace)
@js.native
object subscribeToResultMod extends js.Object {
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
  def subscribeToResult[T, R](
    outerSubscriber: OuterSubscriber[T, R],
    result: js.Any,
    outerValue: js.UndefOr[scala.Nothing],
    outerIndex: Double
  ): js.UndefOr[Subscription] = js.native
}

