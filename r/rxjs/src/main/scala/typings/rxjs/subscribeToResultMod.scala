package typings.rxjs

import typings.rxjs.innerSubscriberMod.InnerSubscriber
import typings.rxjs.outerSubscriberMod.OuterSubscriber
import typings.rxjs.subscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToResultMod {
  
  @JSImport("rxjs/internal/util/subscribeToResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any, outerValue: T): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any, outerValue: T, outerIndex: Double): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any], outerIndex.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](outerSubscriber: OuterSubscriber[T, R], result: js.Any, outerValue: Unit, outerIndex: Double): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any], outerIndex.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
  inline def subscribeToResult[T, R](
    outerSubscriber: OuterSubscriber[T, R],
    result: js.Any,
    outerValue: Unit,
    outerIndex: Unit,
    innerSubscriber: InnerSubscriber[T, R]
  ): js.UndefOr[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToResult")(outerSubscriber.asInstanceOf[js.Any], result.asInstanceOf[js.Any], outerValue.asInstanceOf[js.Any], outerIndex.asInstanceOf[js.Any], innerSubscriber.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Subscription]]
}
